import java.util.Stack;
public class removeConsSeqns {
   public static int[] remove(int[] arr) {
    Stack<Integer> st = new Stack<>();

    int n = arr.length;

        for(int i=0;i<n;i++) {
            if(st.size()==0 || arr[i] != st.peek() ) st.push(arr[i]);

            else if(st.peek() == arr[i] ) { //skip
             if(i==n-1 || st.peek()!=arr[i+1]) st.pop();
            }
        }

        int[] resArr = new int[st.size()];

        for(int i=resArr.length-1;i>=0;i--) {
            resArr[i] = st.pop();
        }

        return resArr;
   }
        
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,5,2,2,3,2,2};

       int[] res =  remove(arr);

        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        } 
    }
}
