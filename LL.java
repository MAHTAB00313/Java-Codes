// class LL {
//     Node head;

//     class Node {
//         String data;
//         Node next;
       

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }

//     }

//     // add First
//     public void addFirst(String data) {
//         Node newNode = new Node(data);

//         if(head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // add last

//     public void addLast(String data) {
//         Node newNode = new Node(data);

//         if(head == null) {
//             head = newNode;
//             return;
//         }

//         Node curNode = head;

//         while(curNode.next != null) {
//             curNode = curNode.next;
//         }

//         curNode.next = newNode;
//     }

//     // print
//     public void printList() {
//         if(head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node curNode = head;

//         while(curNode != null) {
//             System.out.print(curNode.data + "-> ");
//             curNode = curNode.next;
//         }
//         System.out.println("NULL");
//     }
     


//     public static void main(String[] args) {
//         LL list = new LL();

//         list.addFirst("a");
//         list.addFirst("is");
//         list.printList();

//         list.addLast("This");
//         list.printList();
        
//     }
// }


// PW LinkList
class LL {


    // print function
    public static void printLL(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // print using Recursion
    public static void printR(Node head) {
        if(head == null) {
            return;
        }

         System.out.print(head.data + " ");
         printR(head.next);

        //// for printing list in Reverse order 
        // printR(head.next);
        // System.out.print(head.data + " ");
    }

    // Length of LL 
    public static int calLength(Node head) {
        if(head == null) {
            System.out.println("empty List");
            return 0;
        }
        int i = 0 ;
        Node temp2 = head;
       
        while(temp2 != null) {
            i++;
            temp2 = temp2.next;
        }

        return i;

    }


// Node Class
   public static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
    public static void main(String[] args) {
        
        Node a = new Node(1);
        Node b = new Node(2);
        a.next = b;
       

        Node c = new Node(3);
        b.next = c;

        Node d = new Node(4);
        c.next = d;
       
        // Print
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(b.data);
        // System.out.println(b.next.data);
        // System.out.println(c.data);
        // System.out.println(c.next.data);
        // System.out.println(d.data);
       

        // print using for Loop, its not a right choice :( 

        // Node temp = a;
        // for(int i =1; i<=4; i++) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

        // print using while Loop :)

        // Node temp1 = a;
        // while(temp1 != null) {
        //     System.out.print(temp1.data + " ");
        //     temp1 = temp1.next;       
        //  }
        //  System.out.println();

        //  print using function 
         printLL(a);
        //  System.out.println();

        //  print using Recursion
        // printR(a);
        System.out.println();

        // Length List
        int len = calLength(a);
        System.out.println(len);






    }
}