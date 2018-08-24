
class Stack {

    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("stack is full");
        } else {
            stack[++tos] = item;
        }

    }

    int pop() {
        if (tos == -1) {
            System.out.println("stack empty");
            return 0;
        } else 
            return stack[tos--];
        
    }

}

class StackTest{
public static void main(String args[]){
    
    Stack mystack1=new Stack();
    Stack mystack2=new Stack();
    for (int i=0;i<10;i++)    mystack1.push(i);
    for (int i=10;i<20;i++)   mystack2.push(i);
    
    for (int i=0;i<10;i++)    System.out.println(mystack1.pop());
    for (int i=0;i<10;i++)    System.out.println(mystack2.pop());    
    
    
}


}