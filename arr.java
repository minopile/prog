


class arr{
    public static void passbyref(String[] x){
            x[0]="hello";
    }
    
     public static void main(String args[]){
        String[] A={"red","green","yellow","blue"};
        System.out.println(A[0]);
        arr.passbyref(A);
        System.out.println(A[0]);
         
      }
}