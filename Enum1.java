import java.util.Vector;
import java.util.Enumeration;

enum Apple {
	aaa(100),bbb(200);
	private int price;

	Apple(int p ){ price=p;}
	int getPrice(){
		return price;
	}

}



class Enum1{
	public static void main(String[] args) {
		Apple ap=Apple.aaa;
		for(Apple a: Apple.values())
		System.out.println(a.getPrice());
	}
}