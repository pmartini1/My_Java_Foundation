import java.util.*;
public class Stuff {
	public static void printStars(int n) {
		for (int i = 0; i < n; i++) {
		System.out.print("*");
		}
		System.out.println();   
		
	}
	
	public static void PS(int n){
		int b = n;
		if (n ==0) {
			System.out.println();
		} else {
			
			System.out.print(b+"*");
			b = n-1;
			PS(b);
			
		}
		}
	
	public static int cumulativeSum(int n) {
		
		if (n == 0) {
			return 0; 
		} else {
			return n + cumulativeSum(n-1);
		}
		
	}
	
	public static int mystery(int n) {
		if (n < 10) {
		return (10 * n) + n;
		} else {
		int a = 
		mystery(n / 10)
		;
		int b = 
		mystery(n % 10)
		;
		return (100 * a) + b;
		}
		}
	
	public static void reverseLines(Scanner input) {
		if (input.hasNextLine()) {
		String line = input.nextLine();  
		// "Roses are red,"
		reverseLines(input);
		System.out.println(line);
		}
	}
	
	public static void selectionSort(int[] arr) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
	
	
	public static void insertionSort(int[]a) {
		for (int i = 1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			
			while ((j >-1) && (a[j] > key)) {
				a[j+1] = a[j];
				j--;
			}
		a[j+1] = key;
		}
	}
	
	
	public static void even(ArrayList<String> a) {
		for (int i = 0; i< a.size(); i++) 	{
			if ((a.get(i)).length()%2 == 0) {
				a.remove(i);
				i--;
			}
		}
		
	}
	public static void main (String[]args) {
		
		int [] arr = {10, 34, 2, 56, 7, 67, 88, 42};
	
		ArrayList<String> a = new ArrayList<String>();
		a.add("Lots");
		a.add("No");
		a.add("Diptheria");
		a.add("a");
		a.add("eeeeb");
		a.add("tf");
		  
		
		even(a);
		System.out.println(a);
		
		System.out.println(cumulativeSum(4));
		
		
		
		insertionSort(arr);
		int[] arr1 = arr;
		System.out.println();
		for (int j = 0; j< arr1.length; j++) {
		
		
		System.out.print(" "+ arr1[j]);
		}
		
	
	}
}
