import java.util.*;
class MaxHeap {
  
  public static TArray arr;
  private static int size;
  
  public MaxHeap(TArray input) {
    this.arr = input;
    this.size = 0;
  }
  
  private static int parent(int i) {
    return (i-1) / 2;
  }
  
  private static int left(int i) {
    return i * 2 + 1;
  }
  
  private static int right(int i) {
    return i * 2 + 2;
  }
  
    public void add(int el) {
	  size ++;
	  int i = size -1;
	 
	  while (arr.get(i) > parent(i)) {
	    	arr.swap(parent(i), i);
	    	i = parent(i);
	    } 
	  }   
  
  
  
  public static int extractMax() {
	int ans = arr.get(0);
    arr.swap(0, size-1);
    arr.set(size-1, 0);
    size--;
    maxHeapify(0);
	return ans;
  }
  private static void maxHeapify(int i) {
	    while (left(i)!=0) {
	      int small = left(i);

	      if (right(i) != 0 && right(i) < left(i)) {
	        small = right(i);
	      }

	      if (arr.get(i) < arr.get(small)) {
	        arr.swap(i, small);
	      } else {
	        break;
	      }
	      i = small;
	    }

	    while (parent(i) != 0 && arr.get(parent(i)) < arr.get(i)) {
	      arr.swap(parent(i), i);
	      i = parent(i);
	    }
	  }

  
  
  public int peek() {
    return arr.get(0);
  }
  
  public int size() {
    return size;
  }

  public String toString() {
    return arr.toString();
  }

}
