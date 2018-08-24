//implementing inter Thread communication with wait(), notify()
class Q{
	int n;
	boolean valueset=false;

		synchronized  int get(){
		while(!valueset)
		try{
			wait();			
		}
		catch (InterruptedException e){
			System.out.println("Caught exeption in Q_GET_WAIT");
		}
		System.out.println("Got "+ n);
		valueset=false;
		notify();
		return n;
	}


	synchronized  void put(int s){
		while(valueset)
		try{
			wait();			
		}
		catch (InterruptedException e){
			System.out.println("Caught exeption in Q_PUT_WAIT()");
		}
		this.n=s;
		valueset=true;
		System.out.println("Put "+n);
		notify();

	} 



}



class Producer implements Runnable{
	Q q;

	Producer(Q q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
		}
	}

}

class Consumer implements Runnable{
	Q q;
	Consumer (Q q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run(){
		while(true){
			q.get();
		}
	}
}

class ThreadComm_1{
	public static void main(String[] args) {
		Q q= new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("press Ctrl+C to stop"); 
	}
}