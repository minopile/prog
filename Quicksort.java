import java.util.Scanner;
import java.io.*;

public class Quicksort{
	static int counter=0;

	static void swap(int[] arr, int left, int right){
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		if(arr[left]<arr[right])
		++counter;
	}

	public static void qsort(int[] arr, int left, int right, int N){
		if(left>=right) return;

		int part=qpart(arr,left,right,N);
		qsort(arr,left,part-1,N);
		qsort(arr,part+1,right,N);
	}

	public static int qpart(int[] arr, int left, int right, int N){
	
		int highstart=left-1,pivot=right;
		int pivotval=arr[pivot];

		for(int iter=left;iter<right;iter++){
			if(arr[iter]<=pivotval) {
				swap(arr,++highstart,iter);
			}
		}

		swap(arr,++highstart,pivot);

		return highstart;

	}

	public static void main(String[] args) {
		Scanner box= new Scanner(System.in);
		 final int N=box.nextInt();
		int[] input= new int[N];

		for (int i=0; i<N; i++) {
			input[i]=box.nextInt();
		}

		qsort(input,0,N-1,N);

//		int a = qpart(input,0,N-1);

		for (int i=0; i<N; i++) {
			System.out.print(input[i]+" ");
		}

		System.out.println("\npossible counter  :"+ counter);



	}
}