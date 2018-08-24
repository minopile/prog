import java .util.Scanner;
import java.io.*;

public class W3_P4{
	public static void main(String[] args) {
		final int N;
		int start1,end1,start2,end2;
		Scanner box = new Scanner(System.in);

		N=box.nextInt();
		int[] start=new int[N];
		int[] end=new int[N];

for(int i=0;i<N;i++){
start[i]=box.nextInt();
end[i]=box.nextInt();
}

int[] end2=end.clone();

for(int i=0;i<N;i++){
	if(start[i]<end2[0]&&end2[0]<end[i]){
		start[i]=0;
		end[i]=0;
	}
}
for(int i



	}
}