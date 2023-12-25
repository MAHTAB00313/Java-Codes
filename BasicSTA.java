

public class BasicSTA {


    // Queue Implementation Using Array
    public static class queueA {
        int[] arr = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;

        // ADD
        public void add(int val) {
             if(r==arr.length-1) {
                System.out.println("Queue is Full!!");
                return;
            }
            if(f==-1) {
                arr[r+1] = val;
                f = r = 0;
                size++;
            }
            else {
                arr[r+1] = val;
                r++;
                size++;
            }

        }

        // Remove
        public int remove() {
            if(size==0) {
                System.out.println("Queue is empty!!");
                return -1;
            }
            else{
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }



        // Peek()

        public int peek() {
            if(f==-1) {
                System.out.println("Queue is empty!!");
                return -1;
            }
            return arr[f];
        }

        // size 
        public int size() {
            return size;
        }

        // Display
        public void display() {
            if(size == 0) {
                System.out.println("Stack is Empty");
                return;
            }
            for(int i=f; i<=r;i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }


    }
    public static void main(String[] args) {

        queueA q = new queueA();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5 );

        q.display();

        q.remove();
        q.display();

        



    }
}
