public class CircularQueueArr {

    public static class CirQueA{
        int[] arr = new int[10];
        int n = arr.length;
        int size =0;
        int f = -1;
        int r = -1;

        void add(int val) {
            if(size==0) {
                f = r = 0;
                arr[0] = val;
                size++;
            }

            else if(size==n) {
                System.out.println("Queue is full!!");
            }

            else if(r<n-1) { // base case
                arr[++r] = val;
                size++;
            }
            else if(r==n-1) {
                r = 0;
                arr[0] = val;
                size++;
             }
        }


        int remove() {
            if(f==-1) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            else if(f==n-1) { 
                int x = arr[f];
                f = 0;
                size--;
                return x;
            }
            else {
                int x = arr[f];
                f++;
                size--;
                return x; 
            }
        }



        int peek() {
            if(size==0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            
            return arr[f];
        }


        void display() {

            if(size == 0) {
                System.out.println("Queue is Empty!!");
                return;
            }
            else if(f<=r) {

                for(int i=f;i<=r;i++) {
                    System.out.print(arr[i]+ " ");
                }
            }
            else if(r<f) {
                for(int i=f;i<n;i++) {
                    System.out.print(arr[i]+ " ");

                }
                for(int i=0;i<=r;i++) {
                    System.out.print(arr[i]+ " ");
                }
            }
        }



    }
    public static void main(String[] args) {
        
    }
}
