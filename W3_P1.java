import java.util.Scanner;
import java.io.*;
public class W3_P1{
public static void main(String[] args) {
Scanner box=new Scanner(System.in);
long n=box.nextLong(); 

long sum,temp;
temp=n%10;
sum=n/10+temp%5+temp/5;
System.out.println(sum);
}
}
