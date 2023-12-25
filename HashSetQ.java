import java.util.*;

public class HashSetQ {

    static int maxSize(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        int max_len =0;

        for(int i=0;i<arr.length;i++) {
            int currNum = arr[i];

            if(s.contains(currNum)) {
                s.remove(currNum);
            } else {
                s.add(currNum);
                max_len = Math.max(max_len, s.size());
            }
        }

        return max_len;
    }





    public static void main(String[] args) {
        int[] arr = {2,1,1,3,2,3};

        System.out.println(maxSize(arr));
        

    }
}
