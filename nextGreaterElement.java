import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,12,17,4,3,6};
        int[] res = new int[arr.length];

        // Next greater element
        // for(int i=n-1;i>=0;i--) {

        //     while(st.size()>0 && arr[i]>st.peek()) {
        //         st.pop();
        //     }

        //     if(st.size() == 0) res[i] = -1;
        //     else res[i] = st.peek();

        //     st.push(arr[i]);

        // }


    // Pre greater
    // for(int i=1;i<n;i++) {

    //     while(st.size()>0 && arr[i]>st.peek()) {
    //         st.pop();
    //     }

    //     if(st.size()==0) res[i] = -1;
    //     else res[i] = st.peek();

    //     st.push(arr[i]);
    // }


         // Next smallest element
        // for(int i=n-1;i>=0;i--) {

        //     while(st.size()>0 && arr[i]<st.peek()) {
        //         st.pop();
        //     }

        //     if(st.size() == 0) res[i] = -1;
        //     else res[i] = st.peek();

        //     st.push(arr[i]);

        // }

        // pre Smallest
        //  for(int i=0;i<n;i++) {

        //     while(st.size()>0 && arr[i]<st.peek()) {
        //         st.pop();
        //     }

        //     if(st.size() == 0) res[i] = -1;
        //     else res[i] = st.peek();

        //     st.push(arr[i]);

        // }



        // revision next greater element

        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        for(int i=n-1;i>=0;i--) {

            while(st.size()>0 && st.peek()<arr[i]) st.pop();

            if(st.size()==0) res[i] =-1;
            else res[i] = st.peek();

            st.push(arr[i]);
        }

 

            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
                System.out.println();
            for(int i=0;i<res.length;i++) {
                System.out.print(res[i]+" ");
            }



    }

}




















// Input  {42,68, 735, 101, 770, 525, 279, 559, 563 ,465, 106, 146 ,82, 28, 362, 492, 596, 743, 28 ,637, 392, 205, 703, 154, 293, 383, 622, 317, 519, 696, 648, 127, 372, 339, 270, 713, 68, 700, 236 ,295 ,704 ,612, 123};



// 1 2 1 4 1 1 3 4 1 1 2 1 1 5 7 12 13 1 2 1 1 5 1 2 3 4 1 2 7 1 1 2 1 1 18 1 2 1 2 5 1 1 there
// 1 2 1 4 1 1 3 4 1 1 2 1 1 5 7 12 13 1 2 1 1 5 1 2 3 4 1 2 7 1 1 2 1 1 18 1 2 1 2 5 1 1 mine
