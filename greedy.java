import java.util.*;

public class greedy {

    //class for Max job Q
    public static class Job{
        int id;
        int profit;
        int deadLine;

        public Job(int i, int d, int p) {
            id = i;
            deadLine = d;
            profit = p;
        }
    }


    public static void main(String[] args) {
        /* 
        // max chain
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length;i++) {
            if(pairs[i][0]>chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println(chainLen);
        */

        /*
        //Indian coin 
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 1059;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length;i++) {
            
            if (coins[i]<=amount) {
                while (coins[i]<=amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
            
        }

        System.out.println(count);

        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i) + " ");
        } */

        /*
        // Max jobs

        int jobInfo[][] = {{4,20}, {1,10}, {1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);

        int time =0;
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i=0; i<jobs.size();i++) {
            Job curr = jobs.get(i);
            if(curr.deadLine>time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq.size());
        int totalProfit = 0;
        for(int i=0;i<seq.size();i++) {
            System.out.print("job " + seq.get(i) + " ");
            totalProfit += jobInfo[seq.get(i)][1];
        }
        System.out.println();
        System.out.println("Profit = " + totalProfit);
         */

        

        /*Chocola Problem** */
        Integer []costHor = {4,1,2};
        Integer []costVer = {2,1,3,1,4};

        Arrays.sort(costHor, Comparator.reverseOrder());
        Arrays.sort(costVer, Comparator.reverseOrder());

        int hi = 0, vi = 0;
        int hp = 1, vp = 1;
        int cost=0;

        while (hi<costHor.length && vi < costVer.length) {
            
            if(costVer[vi]<=costHor[hi]) { // horizontal cut
                cost += (costHor[hi] * vp);
                hp++;
                hi++;
            } 
            else {//vertical cut
                cost += (costVer[vi] * hp);
                vp++;
                vi++;
            }
        }

        while (hi<costHor.length) { //left horizontal cut
            cost += (costHor[hi] * vp);
            hp++;
            hi++;
        }

        while (vi<costVer.length) { //left horizontal cut
            cost += (costVer[vi] * hp);
            vp++;
            vi++;
        }

        System.out.println( cost);
        



    }
}
