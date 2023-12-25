public class stackImplementationLinklist {

 public static class Node{
        Node head;
        Node next;
        int val;

        Node(int data) {
            this.val = data;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if(size==0) {
                System.out.println("Stack is Emppty!!!");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }

        int size() {
            return size;
        }

        void peek() {
            System.out.println("Peeked value: "+head.val);
        }

        // display 
        void display() {
            displayrec(head);
            System.out.println();
        }
        void displayrec(Node h) { 
            if(h==null) return;
            
            displayrec(h.next);
            System.out.print(h.val + " ");
        }
        
    }





    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(2);
        st.push(45);
        st.push(9);

        st.display();

        st.push(32);
        st.display();
        st.pop();
        st.display();
        System.out.println("Size: " + st.size());

        st.peek();
        
        
    }
}
