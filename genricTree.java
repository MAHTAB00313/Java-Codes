import java.util.*;
public class genricTree {

    private static  class Node{
        int val;
        List<Node> child ;

        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }

    static void builtGenric(Node root) {
        root.child.add(new Node(1));
        root.child.add(new Node(2));
        root.child.add(new Node(3));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(5));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(2).child.add(new Node(8));
        root.child.get(2).child.add(new Node(9));
        root.child.get(2).child.add(new Node(10));


    }

    static void preOrder(Node root) {
        if(root.child.isEmpty()) {
            System.out.print(root.val + " ");
            return;
        }

        System.out.print(root.val + " ");
        int n = root.child.size();
        for(int i=0; i<n;i++) {
            preOrder(root.child.get(i));
        }
    }

    static void postOrder(Node root) {
        if(root.child.isEmpty()) {
            System.out.print(root.val + " ");
            return;
        }
        int n = root.child.size();
        for(int i=0;i<n;i++) {
            postOrder(root.child.get(i));
        }
        System.out.print(root.val + " ");
    }

    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) { 
            Node curr = q.remove();
            System.out.print(curr.val + " ");
            int n = curr.child.size();
            for(int i=0;i<n;i++) {
                q.add(curr.child.get(i));
            }   
        }
    }

    static int findMax(Node root) {
        if(root.child.isEmpty()) return root.val;

        int max = root.val;
        int n = root.child.size();

        for(int i=0;i<n;i++) {
            int currMax = findMax(root.child.get(i));
            max = Math.max(max, currMax);
        }
        return max;
    }






    public static void main(String[] args) {
        Node root = new Node(0);
        builtGenric(root);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(findMax(root));
    }
}
