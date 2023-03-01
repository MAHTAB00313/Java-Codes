
class Recursion {

    public static void printMul(int n, int k) {
        if(k==1) {
            System.out.println(n);
            return;
        }

        printMul(n, k-1);

        System.out.println(n*k);
        
    }
    public static void main (String arrgs[]) {
    int n = 20;
    int k =10;

    printMul(n, k);
        


    }
}