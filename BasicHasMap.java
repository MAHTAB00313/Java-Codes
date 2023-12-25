import java.util.*;

public class BasicHasMap {
    public static void main(String[] args) {
        /*
        Map<Integer, Integer> mp = new HashMap<>();
       
         
        mp.put("Mahtab", 19);
        mp.put("Aman", 23);
        mp.put("faisal", 20);
        mp.put("faiz", 21);



        // mp.remove("Mahtab");

        // System.out.println(mp.get("Aman"));

        // System.out.println(mp.containsKey("Mahtab"));

        // System.out.println(mp.keySet());

        // System.out.println(mp.values());

        // System.out.println(mp.entrySet());


        // for(var key : mp.keySet()){
        //     System.out.printf("%s age is %d\n",key, mp.get(key));
        // }


            //Ques Arr
            int[] arr = {1,4,2,2,2,2,2,2,1,3,1};


       

        for(int i=0;i<arr.length;i++) {

           if(!mp.containsKey(arr[i])) {
                mp.putIfAbsent(arr[i], 1);
           }
           else {
                int x = mp.get(arr[i]);
                 x++;
                mp.put(arr[i], x);
           }

        }

        System.out.println(mp);

        int maxFreq = 0, ele = 0;

        for(var key : mp.keySet()) {
            if(maxFreq< mp.get(key)) {
                maxFreq = mp.get(key);
                ele = key;
            } 
        }


        System.out.printf("%d is max the freq of %d ",maxFreq, ele);
    */


    Map<Integer, Integer> h = new HashMap<>();

    h.put(3, 5);
    h.put(3, 5);
    h.put(3, 6);
    h.put(2, 5);
    h.put(2, 5);
    System.out.println(h.get(3));





    }

    
}
