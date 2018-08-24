public class ThrowsDemo{
	static void ThrowOne() throws IllegalAccessException{
		System.out.println("inside throwone method");
		try{throw new IllegalAccessException("demo");}

		catch(IllegalAccessException e){
			System.out.println("Inside static catch"+e);
		}
		|


	
	public static void main(String[] args) {
		try{
			ThrowOne();
		}
		catch(IllegalAccessException e){
			System.out.println("Inside main catch");
		}
	}
}