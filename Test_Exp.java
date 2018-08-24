public class Test_Exp{
	public static void main(String[] args) {
		int a,d=0;
		try{
			a=10/d;
			System.out.println("this will not be printed");
		}
		catch(ArithmeticException e){
			System.out.println("Divide by ZERO error");
		}
		System.out.println("after catch");
	}
}