import java.io.*;
import java.util.Scanner;
public class W2_P4{
	public static void main(String[] args){
		Scanner box=new Scanner(System.in);
		long N1=box.nextInt();
		long N2=box.nextInt();
		long n1=N1;
		long n2=N2;

		//long product=N1*N2;
		while(N1!=0&&N2!=0){
			if(N1>N2){
				N1=N1%N2;
			}
			else{
				N2=N2%N1;
			}
		}
		System.out.println((n1/(N1+N2))*n2);


	}
}