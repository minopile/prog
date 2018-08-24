import java.util.Random;

public class Test_Exp2{
	public static void main(String[] args) {
		Random r=new Random();
		int a=0,b,c;
		int[] d={3,5};
		for(int i=0;i<100;i++){

			c=r.nextInt();
			try{
			b=args.length;
			a=12345/b;
			d[b]=c;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			a=0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("a value :"+a);

		}

	}
}