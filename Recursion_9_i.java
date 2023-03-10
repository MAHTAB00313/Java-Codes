/* There are N stones, numbered 0,1,2,...N-1. For each i(0<=i<N), the height of stone i is hi.
There is a Frog who is initially on stone 0. He will repeat the following action some number of times to reach stone N-1:

If the Frog is currently on stone i, jump to stone i+1 or stone i+2.
Here a cost of |hi-hj| is incurred, where j is the stone to land on.

Find the mimimum possible total cost incurred before the Frog reaches stone N.
Input n=4
arr[] = {10,30,40,20}
Output
30
*/
public class Recursion_9_i {
    static int best(int[] h,int n, int idx) {
    // base case
    if(idx==n-1) {
       return 0;
    }

    int op1 = Math.abs(h[idx] - h[idx+1]) + best(h, n, idx+1);
    if(idx== n-2) {
        return op1;
    }
    int op2 = Math.abs(h[idx] - h[idx+2]) + best(h, n, idx+2);
    if(op1<op2) {
        return op1;
    } else {
        return op2;
    }

   // return Math.min(op1, op2);
}
    public static void main(String[] args) {
        int[] h = {10,30,40,20};
        System.out.println(best(h, h.length, 0));

    }
}
