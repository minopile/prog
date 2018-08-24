class NewThread implements Runnable{
	Thread t;
	String name;
	NewThread(String S){
		name=S;
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("inside thread : "+name+" "+ i);
				t.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Error! existing child thread ");
		}
	}
}

class ThreadDemo5{
	public static void main(String[] args) {
		NewThread ob1=new NewThread("One");
		NewThread ob2=new NewThread("Two");
		NewThread ob3= new NewThread("Three");
		System.out.println("Thread One is alive"+ob1.t.isAlive());
		System.out.println("Thread Two is alive"+ob2.t.isAlive());
		System.out.println("Thread Three is alive"+ob3.t.isAlive());

/*		try{
			System.out.println("waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();

		}
		catch(InterruptedException e){
			System.out.println("main is Interrupted");
		}

*/		System.out.println("Thread One is alive"+ob1.t.isAlive());
		System.out.println("Thread Two is alive"+ob2.t.isAlive());
		System.out.println("Thread Three is alive"+ob3.t.isAlive());

		System.out.println("main thread existed");


	}
}