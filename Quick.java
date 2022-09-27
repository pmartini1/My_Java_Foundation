import java.util.*;

class Quick {
  
  public static List<Integer> input() {
    return Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
  }
  
  public static List<Integer> QuickSort(List<Integer> sortMe){
    int n = sortMe.size(); 

    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> right = new ArrayList<Integer>();
    if (n < 2){
      return sortMe;
    }
    int pivot = sortMe.get(n-1);
    for (int i = 0; i <= n-2; i++) {
      if (sortMe.get(i) <= pivot){
        left.add(sortMe.get(i));
      } else {
        right.add(sortMe.get(i));
      }
    }
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.addAll(QuickSort(right));
    result.add(pivot);
    result.addAll(QuickSort(left));
    return result;
  } 
  
  public static void main(String[] args) { 
   System.out.println(QuickSort(input()));
  }
}
