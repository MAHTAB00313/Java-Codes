import java.util.*;
public class heap {

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }

    // insertion -> Min Heap
    public static void insertInMinHeap(List<Integer> heap, int element){
        heap.add(element);
        int i = heap.size()-1;
        pushUpInMinHeap(heap, i);

    }

    public static void pushUpInMinHeap(List<Integer> heap, int i) {
        int parent_index = (i-1)/2;
        if(i==0 || heap.get(parent_index)<heap.get(i)) return;

        //swaping values -> (parent > child).
        swap(heap,parent_index,i);
        pushUpInMinHeap(heap, parent_index);
    }

    // insertion -> Max Heap
    public static void insertInMaxHeap(List<Integer> heap, int element) {
        heap.add(element);
        int i = heap.size()-1;
        pushUpInMaxHeap(heap, i);

    }

    public static void pushUpInMaxHeap(List<Integer> heap, int i) {
        int parent_index = (i-1)/2;
        if(i==0 || heap.get(parent_index)>heap.get(i)) return;
        //swaping values -> (parent < child).
        swap(heap,parent_index,i);
        pushUpInMaxHeap(heap, parent_index);
    }

    // deletion -> Min Heap
    public static void deletFromMinHeap(List<Integer> heap) {
        int n = heap.size()-1;
        swap(heap, 0,n);
        heap.remove(n);
        pushDownInMin(heap,0);        
    }

    public static void pushDownInMin(List<Integer> heap, int i) {
        int n = heap.size()-1;
        if(i==n) return;

        int leftChild = (2*i)+1;
        int rightChild = (2*i)+2;
        int smallest = i;

        if(leftChild<=n && heap.get(leftChild)<heap.get(smallest)) {
            smallest = leftChild;
        }

        if(rightChild<=n && heap.get(rightChild)<heap.get(smallest)) {
            smallest = rightChild;
        }

        if(smallest==i) return;

        swap(heap,i,smallest);
        pushDownInMin(heap,smallest);
    }

    // Heapify -> Min Heap
    public static void heapifyMin(List<Integer> heap) {
        int nonLeaf = ((heap.size()-1) -1)/2;

        for(int i=nonLeaf;i>=0;i--) {
            heapifyDownMin(heap,i,heap.size()-1);
        }
    }
    public static void heapifyDownMin(List<Integer> heap, int i, int n) {
        if(i==n) return;

        int leftChild = (2*i)+1;
        int rightChild = (2*i)+2;
        int smallest = i;

        if(leftChild<=n && heap.get(leftChild)<heap.get(smallest)) {
            smallest = leftChild;
        }

        if(rightChild<=n && heap.get(rightChild)<heap.get(smallest)) {
            smallest = rightChild;
        }

        if(smallest==i) return;

        swap(heap,i,smallest);
        heapifyDownMin(heap,smallest,n);
    }

    // heapify Max 

    public static void heapifyMax(List<Integer> heap) {
        int nonLeaf = ((heap.size()-1) -1)/2;

        for(int i=nonLeaf;i>=0;i--) {
            maxDownHeapify(heap, i,heap.size()-1);
        }
    }

    public static void maxDownHeapify(List<Integer> heap, int i, int n) {
        if(i==n) return;

        int leftChild = (2*i)+1;
        int rightChild = (2*i) +2;
        int largest = i;

        if(leftChild<=n && heap.get(largest)<heap.get(leftChild)) {
            largest = leftChild;
        }

        if(rightChild<=n && heap.get(largest)<heap.get(rightChild)) {
            largest = rightChild;
        }

        if(largest == i) return;

        swap(heap,i,largest);
        maxDownHeapify(heap, largest, n);

    }



    public static void main(String[] args) {

        // Min Heap insertion
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        // System.out.println(heap);
        // insertInMinHeap(heap, 5);
        // System.out.println(heap);
        

        // max heap
        List<Integer> heap2 = new ArrayList<>();
        heap2.add(50);
        heap2.add(40);
        heap2.add(30);
        heap2.add(20);
        heap2.add(10);
        // System.out.println(heap2);
        // insertInMaxHeap(heap2, 1000);
        // System.out.println(heap2);


        // deletion Min heap
        // List<Integer> heap3 = new ArrayList<>();
        // heap3.add(5);
        // heap3.add(20);
        // heap3.add(10);
        // heap3.add(40);
        // heap3.add(50);
        // heap3.add(30);
        // heap3.add(60);

        // System.out.println(heap3);
        // deletFromMinHeap(heap3);
        // System.out.println(heap3);

        // heapify Min
        System.out.println(heap2);
        heapifyMin(heap2);
        System.out.println(heap2);
        System.out.println();
        // heapify Max
        System.out.println(heap);
        heapifyMax(heap);
        System.out.println(heap);
    }
}
