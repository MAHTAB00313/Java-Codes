import java.util.*;
public class prorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(15);
        arr.add(1);
        arr.add(9);
        arr.add(11);
        int k=3;

        System.out.println(arr);
        
        for(int i=0;i<arr.size();i++) {

            if(pq.size()==k) {

                if(arr.get(i)> pq.peek()) {
                    pq.poll();
                    pq.add(arr.get(i));
                }
                continue;
            }
            pq.add(arr.get(i));
        }

        System.out.println(pq.peek());


    }
}
