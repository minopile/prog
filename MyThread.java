public class MyThread implements Runnable{
	public void run(){
		System.out.println("Hello from Thread");

	}
	public static void main(String[] args) {
		MyThread T1=new MyThread();
		T1.start();
		
	}
}