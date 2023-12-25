public class LLQ3 {
    public static class Node{
        Node head; 
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    
    public static int size(Node head) {
        if(head == null) {
            return 0;
        }
        int count =0;
        while(head != null) {
            count++;
            head = head.next;
        }

        return count;

    }

    public static Node commonNode(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        int n = size(head1) - size(head2);

        for(int i=1; i<=n;i++) {
            temp1 = temp1.next;
        }

        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;

    }


    

    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);

        a.next = b; 
        b.next = c; 
        c.next = d; 
        d.next = e; 
        
        Node  x = new Node(3);
        Node y = new Node(9);
        x.next = y;
        y.next = d;

        // System.out.println(size(a));
        // System.out.println(size(x));
        Node j = commonNode(a, x);
        System.out.println(j.data);
        



        
        
    }
    
}
