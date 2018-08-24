class TwoThread implements Runnable{
	Thread t;
	TwoThread(){
		t=new Thread(this,"DemoThread");
		System.out.println("ChildThread is :"+t);
		t.start();
	}

	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("ChildThread "+i);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e){
			System.out.println("ChildThread interrupted");
		}

		System.out.println("leaving ChildThread");

	} 
}

public class Thread2Demo{
	public static void main(String[] args) {
		new TwoThread();
		try{
			for(int i=5;i>0;i--){
				System.out.println("main thread :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread interrupted");
		}
		System.out.println("existing main thread ");
	}
}