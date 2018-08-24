public class puppy{
	public int puppy_age;
	 
	public void set_age(int x){
		puppy_age=x;
	}
	public void disp_age(){
		System.out.print(puppy_age+'\n');
	}
	
	public puppy(String colour){
		System.out.print(colour);
	}
	
	public static void main(String[] args){
		puppy tom=new puppy("blue");
		tom.set_age(42);
		tom.disp_age();
	}
	
}