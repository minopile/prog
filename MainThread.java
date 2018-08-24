class MainThread{
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("main thread found  "+t);
		t.setName("SunFlower");
		System.out.println("after name changed  "+t);
		try{for(int i=5;i>0;i--){
			System.out.println(i);
			Thread.sleep(1000);
		}

	}
	catch(InterruptedException e){
		System.out.println("main thread interrpted");
	}

	}
}