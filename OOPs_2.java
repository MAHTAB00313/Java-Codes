
class Square {
    int side;

    public void periMeter() {
        System.out.println(4*side+"cm");
    } 
    public void area() {
        System.out.println(side*side+ "cm^2");
    }
}


public class OOPs_2 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.side = 5;
        s1.periMeter();
        s1.area();
    }
}
