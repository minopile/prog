class NewThread extends Thread{
	NewThread(){
		super("Demo");
		System.out.println("Child Thread is :"+this);
		this.start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("In cildThread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("cildThread interrupted");
		}
		System.out.println("existing child thread");
	}
}

class ThreadDemo3{
	public static void main(String[] args) {
		new NewThread();
		try{for(int i=5;i>0;i--){
			System.out.println("mainThread: "+i);
			Thread.sleep(1000);
		}
	}

		catch(InterruptedException e){
			System.out.println("mainThread interrupted");
		}
		System.out.println("existing mainThread");
	}
}