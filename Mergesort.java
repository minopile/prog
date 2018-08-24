import java.io.*;
import java.util.Scanner;

public class Mergesort{
	static void swap(int[] arr, int left, int right){
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}

	public static void combine(int[] arr, int left, int mid, int right){
		int n1=mid-left+1;
		int n2=right-mid;
		int[] tempL=new int[n1];
		int[] tempR= new int[n2];
		
		for (int i=0;i< n1; i++) {
			tempL[i]=arr[left+i];
		}
		for (int i=0;i< n2; i++) {
			tempR[i]=arr[mid+i+1];
		}

		int k=left;

		int i=0,j=0;
		while(i<n1 && j<n2){
			if(tempL[i]<=tempR[j]) { arr[k]=tempL[i]; i++;}
			else { arr[k]=tempR[j]; j++;}
			k++;

		}

		while(i<n1) arr[k++]=tempL[i++];
		while(j<n2) arr[k++]=tempR[j++];	



	}

	public static void msort(int[] arr, int left, int right){
		if(left>=right) return;
		int mid=(left+right)/2;

		msort(arr,left,mid);
		msort(arr,mid+1,right);

		combine(arr, left, mid, right);

	}


	public static void main(String[] args) {

		Scanner box= new Scanner(System.in);
		final int N=box.nextInt();
		int[] input= new int[N];

		for (int i=0; i<N; i++) {
			input[i]=box.nextInt();
		}

		msort(input,0,N-1);

		for (int i=0; i<N; i++) {
			System.out.print("  "+input[i]);
		}

	}
}