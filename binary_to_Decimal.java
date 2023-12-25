public class binary_to_Decimal {
    public static void main(String[] args) {
        int n = 10;
        int ans =0;
        int pow = 1;

        while(n>0) {
            
            int unit_dig = n%2;
            ans += (unit_dig*pow);
            n /= 2;
            pow *= 10;
        }

        System.out.println(ans);

    }
}
