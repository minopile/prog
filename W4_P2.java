import java.util.Scanner;
import java.io.*;

public
class W4_P2 {
public
    static void main(String[] args)
    {

        Scanner box = new Scanner(System.in);
        final int N = box.nextInt();
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = box.nextInt();
        }

        int m = 0, c = 0;
        for (int i = 0; i < N; i++) {
            if (c == 0) 
            	{
            		m = input[i];
                	c = 1;
            }
            else if (input[i] == m)
                c++;
            else
                c--;
        }

c=0;//set counter =0 to check m is valid  majority
        for (int i=0; i<N; i++) {
        	if(input[i]==m) ++c;
        }
    if(c>N/2)
        System.out.print(1);
    else System.out.print(0);

 
    }
}