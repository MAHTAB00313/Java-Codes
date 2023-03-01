public class Recursion_5_ii {
    static int calSum_arr(int arr[], int idx) {

        if(idx == arr.length) {
            return 0;
        }
        int sum = calSum_arr(arr, idx+1);
        return arr[idx] + sum;
    }
    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(calSum_arr(arr, 0));
        
    }
}
