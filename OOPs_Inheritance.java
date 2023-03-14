class Shape {
    String colour;
}
// Single Level Inheritance
class Rectangle extends Shape {
    public void prntInfo(int l, int h) {
        System.out.println("----Rectangle---- ");
        System.out.println("Color: "+colour);
        System.out.println("Perimeter: "+2*(l+h));
    }
}

// Mlti Level Inheritance
class Square extends Rectangle {
    public void prntArea(int a) {
        System.out.println("----Square---- ");
        System.out.println("Color: "+colour);
        System.out.println("Area: "+a*a);
    }
}
public class OOPs_Inheritance {
    public static void main(String[] args) {
        
        Rectangle R1 = new Rectangle();
        R1.colour = "Black";
        R1.prntInfo(4,2);

        Square S1 = new Square();
        S1.colour = "Blue";
        S1.prntArea(2);
    }
}
