import java.io.*;
import java.util.Scanner;
public class W2_P5{
	public static void main(String[] args){
		Scanner box=new Scanner(System.in);

		long N=box.nextLong();
		long M=box.nextLong();
		long num1=0,num2=1,current,period=0;

		while(true){
			++period;
			current=num1%M;
			num1=num2%M;
			num2=(num1+current)%M;
			if(num1==0&&num2==1) break;

		}
	//System.out.println("possible period of B is "+period);


long N_period=N%period;
num1=0;
num2=1;
if(N_period==0||N_period==1){
	 System.out.println(N_period);
	return;}

while(N_period>1){
	N_period--;
    current=num1%M;
	num1=num2%M;
		num2=(num1+current)%M;
	
}

//System.out.println("Possible reminder  is "+num2);
System.out.println(num2);

//		box.close();

	}
}