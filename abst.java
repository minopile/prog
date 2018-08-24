abstract class A{
	abstract void callme();
	void callmetoo(){
		System.out.println("call me twicee");

	}

}
class B extends A{

	void callme(){
		System.out.println("callling from Bs");
	}
}


public class abst{
	public static void main(String args[]){
B b1=new B();
b1.callmetoo();
	}

}