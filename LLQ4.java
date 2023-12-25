public class LLQ4 {

    public static class Node {
        Node head;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static Node delMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void display(Node head) {

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a = new Node(01);
        Node b = new Node(22);
        Node c = new Node(23);
        Node d = new Node(24);
        Node e = new Node(49);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);

        a = delMid(a);

        display(a);



        
    }
}
