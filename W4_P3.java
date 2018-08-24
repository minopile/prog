import java.io.*;
import java.util.Scanner;

public class W4_P3{
	static void swap(int[] arr, int left, int right){
		int temp=arr[left]; 
		arr[left]=arr[right];
		arr[right]=temp;
	}

	public static void qsort(int[] arr, int left, int right){
		if(left>=right) return;
		int low=left;
		int high=right;
		int i=low;
		int piv=arr[right];
		while(i<=high){
			if(arr[i]<piv){
				swap(arr,low,i);
				low++;i++;				 
				}

			if(arr[i]>piv) {swap(arr,i,high--);}
			else i++; 
		}

		qsort(arr, left,low-1);
		qsort(arr, high+1, right);
	} 


	public static void main(String[] args) {

		Scanner box= new Scanner(System.in);
		final int N=box.nextInt();
		int[] input= new int[N];

		for (int i=0; i<N; i++) {
			input[i]=box.nextInt();
		}

		qsort(input,0,N-1);

		for (int i=0; i<N; i++) {
		System.out.print(input[i]+" ");
		}




	}
}