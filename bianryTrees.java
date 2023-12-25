
public class bianryTrees {

    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int treeSize(Node root) {
        if(root == null) {
            return 0;
        }
        
        return 1 + treeSize(root.left) + treeSize(root.right);

    }

    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }

    public static int maxNum(Node root) {
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(maxNum(root.left), maxNum(root.right)));
    }

    public static int maxHeight(Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right==null) return 0;
        return 1 + Math.max(maxHeight(root.left),maxHeight(root.right));
    }

    

    // HW

    public static int minNum(Node root) {
        if(root == null ) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minNum(root.left), minNum(root.right)));
    }

    public static int product(Node root) {
        if(root == null ) return 0;
        
        return root.val * product(root.left) * product(root.right);
    }
    //
   



    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" -> ");
        if(root.left != null) System.out.print(root.left.val + ",");
        else System.out.print("n");
        if(root.right != null) System.out.print(root.right.val);
        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);
        
    }

    public static void pip(int n) {
        if(n==0) return;

        System.out.println("Pre "+n);
        pip(n-1);
        System.out.println("In "+n);
        pip(n-1);
        System.out.println("Post "+n);
    }

    public static void preOrder(Node root) {
        if(root==null) {
            return;
        }
        System.out.print(root.val);
        preOrder(root.right);
        preOrder(root.left);
       
    }

    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }


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
        // display(root);
        // System.out.println(size(root));
        // preOrder(root);
        //  System.out.println();
        // System.out.println(sum(root));
        // System.out.println(maxNum(root));

        // System.out.println(maxHeight(root));
        // System.out.println(minNum(root));
        // System.out.println("Product : " + product(root));
        // pip(3);

        // inOrder(root);

        // postOrder(root);





        
    }
    
}
