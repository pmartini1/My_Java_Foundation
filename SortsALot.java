//Paris Martini
//1302, Tuesday 3:00 Lab

import java.util.*;

public class SortsALot {

	
	
	   public static void main(String args[])

	   {

	       int arr[] = {8, 6, 3, 5, 2, 1};
	       
	       System.out.println("Before Selection Sort:");
	       printArray(arr);
	       selectionSort(arr);
	       System.out.println("After:");
	       printArray(arr);

	       int arr1[] = {8, 6, 3, 5, 2, 1};
	       System.out.println("Before Bubble Sort:");
	       printArray(arr1);
	       bubbleSort(arr1);
	       System.out.println("After:");
	       printArray(arr1);

	       int arr2[] = {8, 6, 3, 5, 2, 1};
	       System.out.println("Before Insertion Sort: ");
	       printArray(arr2);
	       insertionSort(arr2);
	       System.out.println("After:");
	       printArray(arr2);
	   }

	

	 public static void selectionSort(int arr[])  {

	       int n = arr.length;
	       for (int i = 0; i < n-1; i++) {
	           int min_idx = i;
	           for (int j = i+1; j < n; j++)
	               if (arr[j] < arr[min_idx])
	                   min_idx = j;
	           
	           int temp = arr[min_idx];
	           arr[min_idx] = arr[i];
	           arr[i] = temp;

	       }

	   }
	 
	 public static void bubbleSort(int arr[]) {
	 int n = arr.length;

	 	for (int i = 0; i < n-1; i++)

	 		for (int j = 0; j < n-i-1; j++)

	 			if (arr[j] > arr[j+1]) {
	 				
	 		int temp = arr[j];
	 		arr[j] = arr[j+1];
	 		arr[j+1] = temp;

	 	}

	 
	 }
	 
	 public static void insertionSort(int arr[]) {
		int n = arr.length;

		for (int i=1; i<n; ++i) {
			int key = arr[i];
			int j = i-1;
			
		while (j>=0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j = j-1;
		}
			arr[j+1] = key;
			}

		}

		   public static void printArray(int arr[]) {
		       int n = arr.length;

		       for (int i=0; i<n; ++i)
		           System.out.print(arr[i]+" ");
		       
		       System.out.println();
		}

}