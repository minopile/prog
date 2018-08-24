class Q{
	int n;
	 public void put(int s){
		this.n=s;
		System.out.println("Put "+n);
	} 
	 public int get(){
		System.out.println("Got "+ n);
		return n;
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
		int i=0;
		while(true){
			q.get();
		}
	}
}

class ThreadComm{
	public static void main(String[] args) {
		Q q= new Q();
		new Producer(q);
		new Producer(q);
		System.out.println("press Ctrl+C to stop"); 
	}
}