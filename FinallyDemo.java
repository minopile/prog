public class FinallyDemo{

	static void finalpro() {
		try{
		throw new IllegalAccessException("demo");
	}
		finally{
			System.out.println("by the order of final ...");
		}
	}

	public static void main(String[] args) {
		try{
			finalpro();
		}
		catch(IllegalAccessException e){
			
		}

		
	}
}