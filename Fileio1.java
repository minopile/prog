import  java.io.*;

class Fileio
{
	public static void main(String[] args) throws IOException{
		FileInputStream fin;
		int i;
		
		try{
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException e){
			System.out.println("FileNotFoundException "+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException"+e);
			return;
		}


		do{
			i=fin.read();
			if(i!=-1) System.out.print((char)i);
		}
		while(i!=-1);

		fin.close();
	}
}