import java.io.*;
import java.util.Scanner;

public class W4_P4{

	public static int combine(int[] arr, int left, int mid, int right){
		int counter=0;
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

		while(i<n1&&j<n2){
			if(tempL[i]<=tempR[j]) { arr[k]=tempL[i++];}
			else {
				arr[k]=tempR[j++]; 
			    counter+=(n1-i);
			}
			k++;


		}

		while(i<n1) arr[k++]=tempL[i++];
		while(j<n2) arr[k++]=tempR[j++];
		//System.out.println("counter in recusri "+counter);

	return counter;



	}

	public static int msort(int[] arr, int left, int right){
		int counter=0;
		if(left<right){
		int mid=(left+right)/2;

		counter= msort(arr,left,mid);
		counter+=msort(arr,mid+1,right);
		counter+=combine(arr, left, mid, right);
		
	}
	return counter;

	}


	public static void main(String[] args) {

		Scanner box= new Scanner(System.in);
		final int N=box.nextInt();
		int[] input= new int[N];

		for (int i=0; i<N; i++) {
			input[i]=box.nextInt();
		}

		int counter = msort(input,0,N-1)
		;

		/*
		for (int i=0; i<N; i++) {
			System.out.print("  "+input[i]);
		}
		*/

		System.out.println(counter);

	}
}