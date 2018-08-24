 class MyExep extends Exception {
	private int detail;
	MyExep(int a){
		detail=a;
	}
	public String toString() {
		return "Myexception ["+detail+"]";
	}
}


class ExepDemo {
	static void compute(int a) throws MyExep {
		if(a>10) throw new MyExep(a);
		System.out.println("Normal Exit");
	} 
	public static void main(String[] args) {
		try{
			compute(9);
			compute(19);
		}

		catch(MyExep e){
			System.out.println("caught me"+e);
		}

	}
}

