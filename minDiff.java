import java.util.Arrays;

public class minDiff {
    public static void main(String[] args) {
        int A[] = {3,1,2};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minVal = 0;

        for(int i=0;i<A.length;i++) {
            minVal += Math.abs(A[i]-B[i]);
        }

        System.out.println(minVal);




    }
}
