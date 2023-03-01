public class Recursion_6_i {

    static void findIdx(int arr[], int x, int idx) {

        if(idx>=arr.length) {
            return;
        }

        if(arr[idx]==x) {
            System.out.println(idx);
        }
        findIdx(arr, x, idx+1);



    }




    // static boolean findX(int arr[], int idx,int x) {
    //     if(idx >= arr.length) {
    //         return false;
    //     }
    //     if(arr[idx]==x) {
    //         return true;
    //     } 

    //     if(findX(arr, idx+1, x)) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    
    // }
    public static void main(String[] args) {
        int arr[] = {2,1,3, 3,9,3};
        

        findIdx(arr, 3, 0);






        // if(findX(arr, 0, 3)) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }

    }
}
