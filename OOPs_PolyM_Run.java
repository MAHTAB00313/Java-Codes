             /* Run Time Polymorphism ->  Method Overriding
               Method overriding is when one of the methods in the super class 
               is redefined in the sub-class. In this case, the signature of 
               the method remains the same.
            */
class shape {
    void draw() {
        System.out.println("Can't say the shape");
    }
}
class square extends shape {
    void draw() {
        System.out.println("Shape is Square");
    }
}
public class OOPs_PolyM_Run {
    public static void main(String[] args) {
        shape s1 = new square();
        s1.draw();
    }
}