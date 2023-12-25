import java.util.LinkedList;
import java.util.Queue;

public class deletenodebst {

    public static class Node{
        int val;
        Node left;
        Node right;

         Node(int val) {
            this.val = val;
        }
    }
    public static Node construct(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while(i<n-1) {
            Node temp = q.remove();
            Node left = new Node(2);
            Node right = new Node(1);

            if(arr[i].equals("")) {
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.val = l; 
                q.add(left);
            }

            if(arr[i+1].equals("")) {
                right = null;
            } else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r; 
                q.add(right);
            }

            temp.left = left;
            temp.right = right;
            i+=2;

        }
        return root;
    }

    public static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        
        preorder(root.right);

        
    }

/* 
    public static void delete(Node root, int target) {
        if(root == null) return;
        if(root.val>target) { // go left
            if(root.left==null) return;
            if(root.left.val==target) {
                Node l = root.left; // Node -> delete
                if(l.left==null && l.right==null) root.left = null; //0 child

                else if(l.left==null || l.right==null) { //1 child
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }

                else{ // 2 child
                    Node curr = l;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }

            else delete(root.left, target);
        }
        if(root.val<target) { // go right
            if(root.right==null) return;
            if(root.right.val==target) {
                Node r = root.right;
                if(r.left==null && r.right == null) root.right = null;//0 child
                else if(r.left==null || r.right==null) { // 1 child
                    if(r.left!=null) root.right = r.left;
                    else root.right = r.right;
                } 

                else { // 2 child
                    Node curr = r;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else delete(root.right, target);
        }
    } */

    public static void delete(Node root, int target) {
        if(root==null) return;
        if(root.val==target) {
            root = null;
            return;
        }
        if(root.val>target) delete(root.left, target);
       
        if(root.val<target) delete(root.right, target);
        
    }
    

    public static void main(String[] args) {
       // String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
       String[] arr = {"5","3","7","2","4","6","8","1",""};
        Node root =  construct(arr);
       preorder(root);
       System.out.println();
       delete(root, 1);//
       preorder(root);




    }
}
