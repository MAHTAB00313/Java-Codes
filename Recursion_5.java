public class Recursion_5 {
   public static int arrMax(int arr[],int idx) {
    if(idx == arr.length-1) {
        return arr[idx];
    }
      int n_1 = arrMax(arr, idx+1);
      return Math.max(arr[idx], n_1);
    
   }
    public static void main(String[] args) {
    

        int arr[] = {2,3,5,23,7238,432,7238};
        System.out.println(arrMax(arr, 0));
        












    }
}