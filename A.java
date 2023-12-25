public  class A{

   public static class Node {
      Node head;
      Node next;
      int data;

      Node(int val) {
         this.data = val;
      }

   }

   public static class Stack{

      Node head= null;
      int size = 0;
      void push(int x) {
         Node newNode = new Node(x);
         newNode.next = head;
         head = newNode;
         size++;
      }

      int peek() {
         if(size==0) {
            System.out.println("Stack is Empty!!");
            return 0;
         }
         return head.data;
      }


      int pop() {
         if(size==0) {
            System.out.println("Stack is Empty!!");
            return 0;
         }
         int val = head.data;
         head = head.next;
         size--;
         return val;
      }

      int size() {
         return size;
      }

     private void displayrec(Node h) {
         if(h==null) {
            return;
         }
         
         displayrec(h.next);
         System.out.print(h.data+" ");

      }

      void display() {
         if(head==null) {
            System.out.println("Stack is Empty");
            return;
         }

         displayrec(head);
         System.out.println();


      }










   }



   public static void main(String[] args) {

      Stack st = new Stack();

      st.push(10);
      st.push(20);
      st.display();
      st.pop();
      st.display();
      
   }
}