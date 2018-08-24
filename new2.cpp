

#include "opencv2\highgui\highgui.hpp"
#include "opencv2\objdetect\objdetect.hpp"
#include "opencv2\imgproc\imgproc.hpp"
#include <iostream>

using namespace cv;
using namespace std;

int main(int argc, const char** argv)
{
	//store all the input video files in the same folder as the code
	//create a VideoCapture object of the input Video file
	VideoCapture cap("E:\\saiproject\\VideoPart\\data\\myVid1.mp4");
	//VideoCapture cap(0);
	//if video cannot be opened, exit program
	if (!cap.isOpened())
	{
		return -1;
	}

	//create CascadeClassifier objects for mouth and face
	CascadeClassifier face, mouth;

	//store all the haar cascade .xml filesin the same folder as the code
	//Load the respective .xml files
	face.load("E:\\saiproject\\VideoPart\\cascades\\haarcascade_frontalface_default.xml");
	//face.load("haarcascade_frontalface_alt2.xml");//another cascade for face detection
	mouth.load("E:\\saiproject\\VideoPart\\cascades\\haarcascade_mcs_mouth.xml");
	//mouth.load("Mouth.xml");//Another cascade for mouth detection
	//mouth.load("Mouth2.xml");//Another cascade for mouth detection


	namedWindow("MyVideo", CV_WINDOW_AUTOSIZE);
	Mat frame, grayframe, testframe;
	int frN = 0, wp = 0, bp = 0;
	double frR = 1.0 / 30;//frame rate is the invese of frames-per-second(fps), which is 30fps
	double time;
	while (1)
	{
		//read every frame of the video, one by one
		cap.read(frame);//the frame is stored in the variable 'frame'

		//display appropriate message if a frame cannot be loaded
		if (frame.empty())
		{
			printf("error in loading");
			continue;
		}
		//Keep a count on the number of frames
		frN++;

		//time at which the frame occurs = frame rate x the number of the frame
		time = frR*frN;

		vector< Rect > faces;
		//convert the frame to grayscale image
		cvtColor(frame, grayframe, CV_BGR2GRAY);

		//perform histogram equalization, for better identification accuracy
		equalizeHist(grayframe, testframe);

		//detect all faces in the image
		face.detectMultiScale(testframe, faces, 1.1, 3, 0 | CV_HAAR_SCALE_IMAGE, Size(30, 30));

		//start extracting each of the detected face
		for (int i = 0; i<faces.size(); i++)
		{
			//draw a rectangle around each face
			rectangle(frame, faces[i], Scalar(255, 0, 0), 1, 8, 0);

			//store the detected face
			Mat face = frame(faces[i]);

			vector <Rect> mouthi;

			//create a copy of the face
			Mat face2 = face.clone();

			//we will focus on only the lower region of the face, since that is where mouth is present
			//we will basically blacken or whiten a certain upper region of the face depending upon a factor f
			//we will then run the mouth cascade. Thus, the possibility of false mouth detection is reduced
			double f = 0.63;
			int term = face.rows*f;
			for (int ii = 0; ii<term; ii++)
			{
				for (int jj = 0; jj<(face.cols) * 3; jj++)
				{
					face2.at<uchar>(ii, jj) = 255;//255 is the pixel value for white and 0 is the pixel value for black
				}
			}

			//detect the mouth in a particular face
			mouth.detectMultiScale(face2, mouthi, 1.1, 3, 0 | CV_HAAR_SCALE_IMAGE, Size(30, 30));
			for (int k = 0; k<mouthi.size(); k++)
			{
				Point pt1(mouthi[0].x + faces[i].x, mouthi[0].y + faces[i].y);
				Point pt2(pt1.x + mouthi[0].width, pt1.y + mouthi[0].height);

				//draws a RED rectangle around the mouth region
				rectangle(frame, pt1, pt2, Scalar(0, 0, 255), 1, 8, 0);

				//extract only the mouth region and store it in 'roi'
				Rect R(pt1, pt2);
				Mat roi = frame(R);

				//create an HSV image of the mouth region
				Mat roiHSV;
				cvtColor(roi, roiHSV, CV_BGR2HSV);

				//we will convert the mouth region into a binary image, in which pixels inside the mouth will be white and the remaining pixels will be black
				Mat roiBin;

				wp = bp = 0;

				//get a grayscale image, since RGB and HSV are 3 channel matrices whereas Binary and GrayScale images are 1 channel matrices
				cvtColor(roi, roiBin, CV_BGR2GRAY);

				/*
				Now we perform LIP DETECTION
				Lip Detection is carried out using Colour Filtering.
				this is done by finding those pixels that carry the colours of the lips, as compared to those of the skin or the inside of a mouth.
				These were experimentally found to lie in:-
				Hue (on a scale of 0 to 180): 0 – 12 & 142 – 180
				Saturation (on a scale of 0 to 255): 25 – 100
				Intensity (on a scale of 0 to 255): 25 – 190
				*/
				
				Vec3b pixel;
				for (int ii = 0; ii<roi.rows; ii++)
				{
					for (int jj = 0; jj<roi.cols; jj++)
					{
						pixel = roiHSV.at<Vec3b>(ii, jj);
						int H = pixel[0];
						int S = pixel[1];
						int V = pixel[2];
						if (((H>141) || (H<13)) && ((S>24) && (S<100)) && ((V>24) && (V<191)))
						{
							roiBin.at<uchar>(ii, jj) = 255;
							wp++;
						}
						else
						{
							bp++;
							roiBin.at<uchar>(ii, jj) = 0;
						}
					}
				}

				//Display the frame number and the time elapsed
				cout << "Time" << time << "s\nFrame No. " << frN << "\n\n" << endl;

				//display the RGB, HSV and Binary images of the mouth region
				namedWindow("Mouth RGB", CV_WINDOW_AUTOSIZE);
				imshow("Mouth RGB", roi);
				namedWindow("Mouth HSV", CV_WINDOW_AUTOSIZE);
				imshow("Mouth HSV", roiHSV);;
				namedWindow("Mouth BIN", CV_WINDOW_AUTOSIZE);
				imshow("Mouth BIN", roiBin);
			}

		}
		imshow("MyVideo", frame);
		if (waitKey(30) == 27)
			break;

	}

	return 0;

}