
import java.io.*;
import java.util.Scanner;
public class W2_P7{
	private static long digitsumFib(long N){
		long num1=0, num2=1, current;
		while(N>0){
			N--;
			current=num1;
				num1=num2;
			num2=(num2+current)%10;
		}
		return num1-1;
	}


	public static void main(String[] args){
		Scanner box=new Scanner(System.in);
		long N1=box.nextLong();	
		long N2=box.nextLong();
		long val=digitsumFib(N2+2)-digitsumFib(N1+1);
		System.out.println((val+10)%10);

		//box.close();

	}
}