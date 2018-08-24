import java.io.*;
import java.util.Scanner;


public class W3_P5{
	public static void main(String[] args) {
		Scanner box=new Scanner(System.in);
		int N=box.nextInt();
		int P1=0,EQ=0;
		while(EQ <=N){
			P1++;
			EQ=(P1+1)*P1/2;
		}

		P1--;
		System.out.println(P1);

		EQ=(P1-1)*P1/2;
		for (int i=1; i<P1; i++) {
			System.out.print(i+" ");
		}
		System.out.print(N-EQ);


	}

}