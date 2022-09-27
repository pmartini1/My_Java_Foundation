
import java.util.*;

interface TArray {
  int get(int i);
  void set(int i, int el);
  void swap(int i, int j);
  int size();
  String toString();
}

class WrappedArray implements TArray {
  
  private int[] arr;
  
  public WrappedArray(int[] arr) {
    this.arr = arr;
  }
 
  public int get(int i) {
    return arr[i];
  }
  
  public void set(int i, int el) {
    arr[i] = el;
  }
  
  public void swap(int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
  public int size() {
    return arr.length;
  }
  
  public String toString() {
    return Arrays.toString(arr);
  }
}
