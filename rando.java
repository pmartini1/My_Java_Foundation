import java.util.Scanner;

public class rando {
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
    
  public static void sort(int numbers[], int k) { //sort an array by making swaps within k indexes of pointer 
	  int n = numbers.length;
    int i = 0;
    for (i = 0; i <= n / 2; i++) {
    	heapify(numbers, n-1, i, k); 		   // build a heap
    }
    if (k != 0) {       //assuming it isn't already sorted.
        for (i = 0; i < n; i++) { // go through nudging each root to the end, and reorganizing
            int temp = numbers[n-1]; 
            numbers[n-1] = numbers[i]; 
            numbers[i] = temp; 
            heapify(numbers, n-1, i, k); 
        } 
    }   
  }  
public static void heapify(int numbers[], int n, int i, int k) { 
	int max = i;
    if (k != 0) { //assuming it isn't already ordered
    	if (left(i) <= n && numbers[left(i)] < numbers[max]) { // If left child is > than root 
        	max = left(i); 
        }
        if (right(i) <= n && numbers[right(i)] < numbers[max]) { // If right child is > than largest 
       		max = right(i); 
       	}	 
       	if (max != i) { // If largest is not root
       		int temp = numbers[i]; 
       		numbers[i] = numbers[max]; 
       		numbers[max] = temp; 
       		k--; 
       		heapify(numbers, max, n, k); 
       	} 
      }
    } 
    
    public static int left (int i){
      return 2*i+1;
    }
    public static int right (int i){
      return 2*i+2;
    }
  }
