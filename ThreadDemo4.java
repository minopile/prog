class NewThread implements Runnable{
	Thread t;
	String name;
	NewThread(String givenname){
		name=givenname;
		t=new Thread(this,name);
		t.start();
	}

	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+" "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("caught error in child "+name);
		}
		System.out.println("existing "+name);
	}
}

class ThreadDemo4{
	public static void main(String[] args) {
		new NewThread("one");
		new NewThread("two");
		new NewThread("three");

		try{
			Thread.sleep(10000);
			for (int i=5; i>0; i--) {
				System.out.println("inside main "+ i);
			}
		}
		catch(InterruptedException e){
			System.out.println("main Interrupted");
		}
		System.out.println("existing main");
	}
}