import java.io.*;
import java.util.Scanner;
public class GCD{
	public static void main(String[] args){
		Scanner box=new Scanner(System.in);
		int N1=box.nextInt();
		int N2=box.nextInt();
		while(N1!=0&&N2!=0){
			if(N1>N2){
				N1=N1%N2;
			}
			else{
				N2=N2%N1;
			}
		}
		System.out.println(N1+N2);


	}
}