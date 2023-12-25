public class QCycle {

    public static class Node {
        Node head;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static void display(Node head) {
        while(head!=null) {
            System.out.print(head.data + " ");
            head =  head.next;
        }

        System.out.println();
    }

    public static boolean cycle(Node head) {
        Node slow = head;
        Node fast = head;
        // Node temp = head;
        if(head == null) return false;
        else if(head.next == null) return false;

        while(fast!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) return true;

        }

        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(01);
        Node b = new Node(22);
        Node c = new Node(23);
        Node d = new Node(24);
        Node e = new Node(49);

        // a.next = b; 
        // b.next = c;
        // c.next = d;
        // d.next = e;


        if(cycle(a)) {
            System.out.println("Cycle is present in LinkList");
        } 
        else {
            System.out.println("Cycle is not present in LinkList");
        }









        
    }
    
}
