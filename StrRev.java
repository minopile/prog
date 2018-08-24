public class StrRev{

	void swap(String x,int i,int j){

		char a=x[i];
		x[i]=x[j];
		x[j]=a;
	}

	public static void main(String[] args){
		String S="Hello world how are you";
		int size=S.length;
		int i=0,j=S.length;
		char[] CH=S.toCharArray();
		while(i<j) {this.swap(S,i,j);
			i++;j--;
		}
	}



}