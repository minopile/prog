import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class W3_P3{

	public static void main(String[] args) {
		Scanner box=new Scanner(System.in);

		final int N=box.nextInt();

		int[] value=new int[N];
		int[] weight=new int[N];
		
		for(int i=0;i<N;i++){
			value[i]=box.nextInt();
		}

		for(int i=0;i<N;i++){
			weight[i]=box.nextInt();
		}

		Arrays.sort(value);
		Arrays.sort(weight);
		int sum=0;
		for(int i=0;i<N;i++){
			sum+=value[i]*weight[i];
		}

		System.out.println(sum);


		
	}
}
			

			
		
