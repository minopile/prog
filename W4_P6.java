import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class W4_P6{

	static float dist(int x,int y){
		return (float)Math.sqrt(x*x+y*y);
	}
	static float min(float a, float b){
		return a<b?a:b;
	}


	static void swap(int[] xin, int left, int right,int[] yin){
		int temp=xin[left];
		xin[left]=xin[right];
		xin[right]=temp;
		temp=yin[left];
		yin[left]=yin[right];
		yin[right]=temp;
	}

	public static void qsort(int[] xin,  int[] yin,int left, int right, int N){
		if(left>=right) return;

		int part=qpart(xin,yin,left,right,N);
		qsort(xin,yin,left,part-1,N);
		qsort(xin,yin,part+1,right,N);
	}

	public static int qpart(int[] xin,  int[] yin,int left, int right, int N){
	
		int highstart=left-1,pivot=right;
		int pivotval=xin[pivot];

		for(int iter=left;iter<right;iter++){
			if(xin[iter]<=pivotval) {
				swap(xin,++highstart,iter,yin);
			}
		}

		swap(xin,++highstart,pivot,yin);

		return highstart;

	}
//****************************************************************************

	public static float mindis(int[] xin, int[] yin, int left, int right, int N){
		
		if(left<right){
			float d=0;
		int mid=(left+right)/2;
		float d1= mindis(xin,yin,left,mid-1,N);
		float d2= mindis(xin,yin,mid+1,right,N);

		d=d1<d2?d1:d2;
		int rl=0;

		while(true){
			++rl;
			if(xin[mid]-xin[mid-rl]>d) break;
		}
		rl--;

		int rr=0;
		while(true){
			++rr;
			if(xin[mid+rr]-xin[mid]>d) break;
		}
		rr--;
		int striplen=rr+rl;

		int[] stripx=new int[striplen];
		int[] stripy=new int[striplen];


		for(int i=mid-rl, j=0;i<mid+rr;i++){
			stripx[j++]=xin[i];
			stripy[j++]=yin[i];
		}


		qsort(stripy,stripx,0,striplen-1,striplen);
		
		for(int i=0;i<striplen;i++){
			for(int j=i+1;j<=(i+6)&&j<striplen;j++){
				d=min(d,dist(stripx[j],stripy[j]));
			}
		}


		return d;


		}
		return 10000;
			}




	public static void main(String[] args) {
		Scanner box= new Scanner(System.in);
		final int N=box.nextInt();
		int[] xin= new int[N];
		int[] yin= new int[N];


		for (int i=0; i<N; i++) {
			xin[i]=box.nextInt();
			yin[i]=box.nextInt();
		}

		qsort(xin,yin,0,N-1,N);

		for (int i=0; i<N; i++) {
			System.out.println("(x,y)=:" +xin[i]+" "+yin[i]);
		}

		System.out.println(mindis(xin,yin,0,N-1,N));


	}

}