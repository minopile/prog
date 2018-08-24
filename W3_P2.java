import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class W3_P2{
	public static double min(double A,double B){
		return A<B? A:B;
	}
	public static void main(String[] args) {
		Scanner box=new Scanner(System.in);

		final int N=box.nextInt();
		double WEIGHT=box.nextDouble();

		double[] value=new double[N];
		double[] weight=new double[N];
		double[] rate=new double[N];
		
		for(int i=0;i<N;i++){
			value[i]=box.nextInt();
			weight[i]=box.nextInt();
			rate[i]=value[i]/weight[i];
		}
		
		double[] rate2=rate.clone();
		Arrays.sort(rate);
		
		double sum=0;
		double VALUE=0;
		for (int i=N-1;i>=0;i--){
			if(sum>=WEIGHT) break;
			for(int j=0;j<N;j++){
				if(rate[i]==rate2[j]){
					double weightadd=min(weight[j],WEIGHT-sum);
					sum+=weightadd;

					VALUE+=weightadd*rate2[j];
					rate2[j]=0;
				}
				}
			}

			System.out.println(VALUE);

			
		
		}
				
	}
