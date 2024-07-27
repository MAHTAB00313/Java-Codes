import java.util.*;

public class fracKnapSac {
    public static void main(String[] args) {
        int price[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 40;

        double ratio[][] = new double[price.length][2];
        // 0-> idx . 1-> ratio;

        for(int i=0;i<price.length;i++) {
            ratio[i][0] = i;
            ratio[i][1] = price[i]/ (double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W, profit = 0;
        
        for(int i=ratio.length-1;i>=0;i--) {
            int idx = (int) ratio[i][0];
            if(capacity>=weight[idx]) {
                profit += price[idx];
                capacity = capacity-weight[idx];
            }
            else {
                profit  +=  ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }

        System.out.println(profit);






    }
    
}
