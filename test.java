import java.util.*;
public class test {

    public static void main(String[] args) {
        int n = 18;
        int coins[] = {7,5,1};
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int numCoins = rec(n,coins,dp);
        System.out.println(numCoins);

        for(int i : dp) {
            System.out.println(i);
        }
    }

    static int rec(int n, int coins[],int dp[]) {
        if(n==0) return 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++) {
            
            if(n-coins[i]>=0) {
                if(dp[n]!=-1) return dp[n];
                int currAns = 1+rec(n-coins[i], coins,dp);
                ans = Math.min(ans, currAns);
            }
        }
        return dp[n] = ans;


    }

    
    

    
}
