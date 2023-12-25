// import java.util.Array;
public class stackImplementationArray {

    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if(isFull()) {
                System.out.println("Stack is Full!!");
                return;
            }
           
            arr[idx] = x;
            idx++;
        }

        int pop() {
            if(idx == 0 ) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void peek() {
            if(idx == 0 ) {
                System.out.println("Stack is Empty!!");
                return;
            }
            System.out.println(arr[idx-1]);
        }

        void display() {
            if(idx == 0 ) {
                System.out.println("Stack is Empty!!");
                return;
            }

            for(int i=0;i<idx;i++) {
                System.out.print(arr[i]+ " ");
            }  
            System.out.println();  
        }

        boolean isEmpty() {
            if(idx == 0) return true;
           else return false;
        }

        int size() {
            return idx;
        }

        boolean isFull() {
            if(arr.length == size()) return true;
            else return false;
        }

        int capacity() {
            return arr.length;
        }

    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(2);
        st.display();
        System.out.println("Size of Stack: "+st.size());
        st.push(4);
        st.display();
        System.out.println("Size of Stack: "+st.size());
        st.push(23);
        st.display();
        System.out.println("Size of Stack: "+st.size());

        System.out.println(st.pop());
        st.display();

        st.peek();

        st.display();
        System.out.println(st.isEmpty());

        st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();

        System.out.println(st.isEmpty());

        System.out.println("Size of Stack: "+st.size());

        st.push(32);
        st.push(42);
        st.push(31);
        st.push(32);
        st.push(42);
        st.push(31);
        st.push(32);
        st.push(42);
        st.push(31);

        System.out.println(st.isFull());

        
    }
    
}
