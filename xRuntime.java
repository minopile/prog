class xRuntime{
	public static void main(String[] args) throws Exception {
		Runtime r= Runtime.getRuntime();

	    //Runtime.getRuntime().exec("Terminal");//will open a new notepad  

		Runtime.getRuntime().exec("shutdown -r -t 0");



		System.out.println("total memory : "+r.totalMemory());
		System.out.println("free memory : "+r.freeMemory());
		
		for(int i=0;i<10000;i++){
			new xRuntime();
		}

		System.out.println("freeMemory after 1000 instances "+r.freeMemory());
		System.gc();

		System.out.println("freeMemory after gc() "+r.freeMemory());
	}
}