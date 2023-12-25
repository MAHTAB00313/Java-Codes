import java.util.*;

public class BFS {
    
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }


    }

     public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0) {
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();


        }
        

     }
    

// pre order iterative
// post order iterative



    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);


        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        f.left = g;
        
        bfs(root);
    }
    
}
