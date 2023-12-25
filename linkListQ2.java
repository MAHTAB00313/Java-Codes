public class linkListQ2 {
    public static class Node{
        Node n;
        int val;
        Node head;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node nthNode(Node head, int idx) {
        Node slow =head;
        Node fast = head;

        for(int i=1; i<=idx;i++) {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static Node nthNode2(Node head, int idx) {
        Node slow =head;
        Node fast = head;

        for(int i=1; i<=idx;i++) {
            fast = fast.next;
        }

        if(fast == null) {
            head = head.next;
            return head;
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;

    }

   public static void display(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();

    }



    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println(nthNode(a, 1).val);
        display(a);

       a =  nthNode2(a, 5);
        display(a);
        
    }
    
}
