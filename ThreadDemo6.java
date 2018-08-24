class NewThread implements Runnable{
	Thread t;
	private  volatile boolean running=true;
	long click=0;

	NewThread(int p){
		t=new Thread(this);
		t.setPriority(p);
	}

	public void run(){
		while(running)
			click++;
	}
	public void start(){
		t.start();
	}

	public void stop(){
		running=false;
	}

}
class ThreadDemo6{
	public static void main(String[] args) {
		NewThread high=new NewThread(Thread.NORM_PRIORITY+2);
		NewThread low= new NewThread(Thread.NORM_PRIORITY-2);

		high.start();
		low.start();

		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println("Caught error in Main");
		}

		high.stop();
		low.stop();

		try{
			high.t.join();
			low.t.join();
		}
		catch(InterruptedException e){
			System.out.println("caught exception in threads");
		}
		System.out.println("count of high is: "+high.click);
		System.out.println("count of low is: "+low.click);
		
	}
}