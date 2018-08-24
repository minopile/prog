import java.io.*;
import java.util.Scanner;
public class Fibb2{
	public static void main(String[] args){
		Scanner box=new Scanner(System.in);
		int N=box.nextInt();
		int num1=0,num2=1,current;
		while(N>0){
			N--;
			current=num1%10;
			num1=num2%10;
			num2=(num2+current)%10;
		}
		System.out.println(num1);

//		box.close();

	}
}