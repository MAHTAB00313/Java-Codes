                /*Compile Time Polymerphism */
public class OOPs_PolyM_Comp {
    void add() {
        int a=20,b=30;
        int c = a+b;
        System.out.println(c);
    }
    void add(int x,int y) {
        int c = x+y;
        System.out.println(c);
    }
    void add(int p, double q) {
        double c = p+q;
        System.out.println(c);
    }
    public static void main(String[] args) {
    OOPs_PolyM_Comp n1 = new OOPs_PolyM_Comp();
    n1.add();
    n1.add(22,33);
    n1.add(34,23.34);
    }
}
