public class Linklist {

  public static  class Node{
        Node head;
        Node tail;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linklist{
        Node head = null;
        Node tail = null;
        int size=0;


        void addFirst(int data) {

            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                size++;
                return;
            }

            newNode.next = head;
            head = newNode;
            size++;
        }

        void addLast(int data) {
            Node newNode  = new Node(data);
            Node temp = head;
            if(temp == null) {
                head = newNode;
                size++;
                return;
            }

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            tail = newNode;

            size++;
        }

        void display() {
            Node temp = head;
            if(head == null) {
                return;
            }

            while(temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }

    }


    public static void main(String args[]) {

        linklist ll = new linklist();

        ll.addFirst(2);
        ll.addFirst(4);
        ll.display();
        System.out.println(ll.head.data);

        ll.addLast(5);
        ll.display();
        System.out.println(ll.tail.data);

        System.out.println(ll.size);

    }
    
}
