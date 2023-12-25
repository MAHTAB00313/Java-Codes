import java.util.ArrayDeque;

public class BasicSTL {

    public static class Node{
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
     }


     public static class queueLL{
        Node head=null;
        Node temp = null;
        int size = 0;

        void add(int x) {
            Node newNode = new Node(x);
          if(size == 0) {
            head = newNode;
            temp = head;
            size++;
          }  
          else {
          temp.next = newNode;
          temp = temp.next;
          size++;
          }
        }

        int remove() {
            if(size == 0) {
                System.out.println("Queue is Empty!!");
                return -1;
            }

            int value = head.val;
            head = head.next;
            size--;
            return value;
        }

        int peek() {
            if(size == 0) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return head.val;
        }

        void display() {
            Node temp = head;

            while(temp!=null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

     }
   
    
    
    public static void main(String[] args) {

        queueLL q = new queueLL();

        q.add(2);
        q.add(4);
        q.add(1);
        q.display();
        
        System.out.println(q.peek());
        System.out.println("size is "+ q.size());


        q.remove();
        q.display();

        System.out.println("size is"+ q.size());


        
    }
}
