class Box {

    int width, breadth, height;

    Box(Box x) {
        width = x.width;
        height = x.height;
        breadth = x.breadth;
    }

    Box(int i, int j, int k) {
        width = i;
        height = j;
        breadth = k;
    }

    Box(int x) {
        width = breadth = height = x;
    }

    Box() {
        width = breadth = height = -1;
    }

    int volume() {
        return width * height * breadth;
    }
    
}

class Xbox extends Box {

    int weight;

    Xbox(int a, int b, int c, int d) {
        width = a;
        height = b;
        breadth = c;
        weight = d;

    }

}

public class Test {
    public static void main(String args[]){
    Box cube=Box(10);
    Box notcube=Box(10,20,30);
    
    
    
    }

}
