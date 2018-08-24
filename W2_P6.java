import java.io.*;
import java.util.Scanner;
public class W2_P6{
	public static void main(String[] args){
		Scanner box=new Scanner(System.in);
		long N=box.nextLong();
		N=N+2;
		long num1=0,num2=1,current;
		while(N>0){
			N--;
			current=num1;
			num1=num2;
			num2=(num2+current)%10;
//			System.out.println(num1);

		}
		num1=(num1+9)%10;
		System.out.println(num1);
//		box.close();

	}
}