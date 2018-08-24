import java.util.Scanner;
import java.io.*;

public class W4_P1{

public static int binsearch(int[] arr, int left,int right,int data){
int mid=(left+right)/2;
if (left>right) return -1;
if(arr[mid]==data) return mid;
if(arr[mid]>data) 
	right=mid-1;
else left=mid+1;
return binsearch(arr,left,right,data);
	}



	public static void main(String[] args) {
	
	Scanner box= new Scanner(System.in);
	final int N=box.nextInt();
	final int T= box.nextInt();

	int[] input= new int[N];
	int[] test = new int[T];



	for (int i=0; i<N; i++) {
		input[i]=box.nextInt();
	}

	

	for (int i=0; i<T; i++) {
		test[i]=box.nextInt();
	}




for(int t=0;t<T;t++){

	int data=test[t];
	int left=0,right=N-1;
	while(left<=right){
		int mid=(left+right)/2;
		if(input[mid]==data)
		{
			System.out.print(mid+" ");
			break;
		}
		if(input[mid]<data)
			left=mid+1;
		else right=mid-1;
	}

	if(left>right) System.out.print(-1+" ");
}

	}

}