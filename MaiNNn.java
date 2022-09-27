import java.util.Scanner;

public class MaiNNn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read in k, which represents the maximum
        // distance between a number's current position
        // and sorted position
        int k = Integer.parseInt(sc.nextLine());
        
        // Read in the list of numbers
        int[] numbers;
        String input = sc.nextLine();
        if (input.equals("")) {
            numbers = new int[0];
        } else {    
            String[] numberStrings = input.split(" ");
            numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
        }

        // Sort the list
        sort(numbers, k);

        // Print the sorted list
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            resultSb.append(new Integer(numbers[i]).toString());
            if (i < numbers.length - 1) {
                resultSb.append(" ");
            }
        }
        System.out.println(resultSb.toString());
    }
    
    public static void sort(int[] numbers, int k) {

        {
            int heap_size = numbers.length;

            
            for(int i = numbers.length; i >= 2 ; i-- )
            {
                swap(numbers, numbers[ 1 ], numbers[ i ]);
                heap_size = heap_size - 1;
                maxHeapify(numbers, 1, heap_size);
            }
        }
        
        throw new UnsupportedOperationException();
    }
    private static void maxHeapify(int[] numbers, int n, int i) {
    	 int largest = i; // Initialize largest as root 
    	    int l = 2 * i + 1; // left = 2*i + 1 
    	    int r = 2 * i + 2; // right = 2*i + 2 
    	  
    	    // If left child is larger than root 
    	    if (l < n && numbers[l] > numbers[largest]) 
    	        largest = l; 
    	  
    	    // If right child is larger than largest so far 
    	    if (r < n && numbers[r] > numbers[largest]) 
    	        largest = r; 
    	  
    	    // If largest is not root 
    	    if (largest != i) { 
    	        swap(numbers, numbers[i], numbers[largest]); 
    	  
    	        // Recursively heapify the affected sub-tree 
    	        maxHeapify(numbers, n, largest); 
	}
    }
    void buildMaxHeap(int arr[], int n) 
    { 
        // Index of last non-leaf node 
        int startIdx = (n / 2) - 1; 
      
        // Perform reverse level order traversal 
        // from last non-leaf node and heapify 
        // each node 
        for (int i = startIdx; i >= 0; i--) { 
            maxHeapify(arr, n, i); 
        } 
    } 
	
    public static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] =  arr[indexB];
        arr[indexB] = temp;
      }
    

  
    }  
    
    

class MinHeap { 
    private int[] Heap; 
    private int size; 
    private int maxsize; 
  
    private static final int FRONT = 1; 
  
    public MinHeap(int maxsize) 
    { 
        this.maxsize = maxsize; 
        this.size = 0; 
        Heap = new int[this.maxsize + 1]; 
        Heap[0] = Integer.MIN_VALUE; 
    } 
  
    // Function to return the position of 
    // the parent for the node currently 
    // at pos 
    private int parent(int pos) 
    { 
        return pos / 2; 
    } 
  
    // Function to return the position of the 
    // left child for the node currently at pos 
    private int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 
  
    // Function to return the position of 
    // the right child for the node currently 
    // at pos 
    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
  
    // Function that returns true if the passed 
    // node is a leaf node 
    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
  
    // Function to swap two nodes of the heap 
    private void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
    } 
  
    // Function to heapify the node at pos 
    private void minHeapify(int pos) 
    { 
  
        // If the node is a non-leaf node and greater 
        // than any of its child 
        if (!isLeaf(pos)) { 
            if (Heap[pos] > Heap[leftChild(pos)] 
                || Heap[pos] > Heap[rightChild(pos)]) { 
  
                // Swap with the left child and heapify 
                // the left child 
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) { 
                    swap(pos, leftChild(pos)); 
                    minHeapify(leftChild(pos)); 
                } 
  
                // Swap with the right child and heapify 
                // the right child 
                else { 
                    swap(pos, rightChild(pos)); 
                    minHeapify(rightChild(pos)); 
                } 
            } 
        } 
    } 
  
    // Function to insert a node into the heap 
    public void insert(int element) 
    { 
        if (size >= maxsize) { 
            return; 
        } 
        Heap[++size] = element; 
        int current = size; 
  
        while (Heap[current] < Heap[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 
  
    // Function to print the contents of the heap 
    public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + Heap[i] 
                             + " LEFT CHILD : " + Heap[2 * i] 
                             + " RIGHT CHILD :" + Heap[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
  
    // Function to build the min heap using 
    // the minHeapify 
    public void minHeap() 
    { 
        for (int pos = (size / 2); pos >= 1; pos--) { 
            minHeapify(pos); 
        } 
    } 
  
    // Function to remove and return the minimum 
    // element from the heap 
    public int remove() 
    { 
        int popped = Heap[FRONT]; 
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT); 
        return popped; 
    } 
}