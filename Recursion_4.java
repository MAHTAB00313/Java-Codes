public class Recursion_4 {
    static int GCD(int x, int y) {
        int a =x;
        int b = y;
        if(y==0) {
            return x;
        }
        return (a*b)/GCD(y, x%y);
        
    }
    public static void main(String[] args) {
       System.out.println(GCD(3,2));
    }
}
