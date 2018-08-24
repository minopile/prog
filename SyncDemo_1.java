class Callme{
	/* Callme:- a normal class with a call method (with sleep)*/
        void call(String msg){  //synchorised keyword 
	 	System.out.print("["+msg);
	 	try{
	 		Thread.sleep(1000);
	 	}
	 	catch(InterruptedException e){
	 		System.out.println("Callme Interrupted"+ e);
	 	}

	 	System.out.println("]");
	 }
}

class Caller implements Runnable{
	/* thread+ calling call() of Calleme{} class from Thread's run() */
	Callme target;
	String messsage;
	Thread t;
	public Caller(Callme targ, String msg ){
		messsage=msg;
		target=targ;
		t=new Thread(this);
		t.start();
	}
	public void run(){
		synchronized(target){
		target.call(messsage);
	}
}
}

class SyncDemo_1{
	public static void main(String[] args) {
		Callme target=new Callme();
		Caller ob1 = new Caller(target,"ONE");
		Caller ob2 = new Caller(target,"TWO");
		Caller ob3 = new Caller(target,"THREE"); 
		Caller ob4 = new Caller(target,"FOUR"); 

		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			ob4.t.join();
		}
		catch(InterruptedException e){
			System.out.println("main Interrupted"+e);
		}
	}
}