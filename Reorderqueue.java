import java.util.*;

public class Reorderqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);

        int n = q.size()/2;

       for(int i=0;i<n;i++) {
            st.push(q.remove());
       }


       for(int i=0;i<n;i++) {
            q.add(st.pop());
       }


       for(int i=0;i<n;i++) {
        st.push(q.remove());
       }

       for(int i=0;i<n;i++) {
            q.add(st.pop());
            q.add(q.remove());
       }

       System.out.println(q);

       n = q.size();
       for(int i=0;i<n;i++) {
            st.add(q.remove());
       }

       for(int i=0;i<n;i++) {
        q.add(st.pop());
       }



        

        System.out.println(q);



    }
}
