import java.io.*;

class FileCopy{
	public static void main(String[] args) throws IOException{
		FileInputStream fin;
		FileOutputStream fout;
		int i;
//		File file=new File(args[1]);

		try{
			try{
				fin=new FileInputStream(args[0]);
			}
			catch(FileNotFoundException e){
				System.out.println("FIle not found"+e);
				return;
			}
			try{
				fout=new FileOutputStream(args[1]);
			}
			catch(FileNotFoundException e){
				System.out.println("FileNotFound"+e);
				return;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array errar"+e);
			return;
		}
		try{

		do{
			i=fin.read();
			if(i!=-1)
			fout.write(i);
		}
		while(i!=-1);
	}
	catch(IOException e){
		System.out.println("File Io error"+e);
	}

	fin.close();
	fout.close();

	}
}