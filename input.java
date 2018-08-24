import java.util.*;
public class input{
   public static void main(String[] args){
     
   //   Scanner S =new Scanner(System.in);
   //   String data=S.nextLine();
  String  data="We promptly judged antique ivory buckles for the next prize";
    int[] arr=new int[256];
       
   for(int i=0;i<data.length();i++){
   arr[data[i]]=1;
   
   }
   
   for(int i='a';i<='Z';i++){
   if(!(arr[i]==1&&(i<='z'||i>='A')))
   {System.out.println("false");
   break;} 
   }
   
   
   } 

}