import java.io.*;

class Javaio1{
	public static void main(String[] args) throws IOException {
		char c;
		InputStreamReader in = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(in);

		System.out.println("Enter characters, 'q' to Quit.");
		do{c=(char) br.read();
			System.out.println(c);
		}
		while(c!='q');

	}
}