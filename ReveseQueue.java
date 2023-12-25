import java.util.*;

public class ReveseQueue {



    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> ref = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int k = 5;

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

       for(int i=1;i<=k;i++) {
            st.push(q.remove());
       }

       for(int i=0;i<q.size();i++) {
            ref.add(q.remove());
       }

       System.out.println(st);

       while(st.size()!=0) {
        q.add(st.pop());
       }

       for(int i=0;i<ref.size();i++) {
            q.add(ref.remove());
       }

        

        System.out.println(q);




    }
}
