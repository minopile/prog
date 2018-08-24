import java.io.*;
import java.util.*;

public class pangram {

    public static void main(String[] args) {
       
        String str;
        Scanner S=new Scanner (System.in);
        str=S.nextLine();
        int len=str.length();
        int[] arr=new int[256];
       for (int i=0;i<len;i++){
           arr[str.charAt(i)]=1;
           }
        boolean val=true;
        for(int i=(int)'a';i<=(int)'z';i++){
            if(arr[i]==0) val=false; 
        }
        for(int i=(int)'A';i<=(int)'Z';i++){
            if(arr[i]==0) val=false; 
        }
        
        if(val==false )System.out.println("not panagram");
        else System.out.println("anagram");
        
    }
}