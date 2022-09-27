import java.util.*;

public class ModSelectionSort{
	
    
	public static void main(String[] args) {
	       String[] arr1 = {"bigg", "bigger", "biggest", "big", "b", "bi"};
	       StringSort(arr1);
	       
	       		for(String j:arr1){
	       			System.out.println(j);
	       		}
	       	int arr2[] = {10,4,8,7,2,3,6,9,5,1};
	       		MinMaxSort(arr2);
	       		int i = 0;
	       		while (i<=arr2.length-1) {
	       			System.out.print(arr2[i]+" ");
	       		i++;
	       		
	       }
	       		
	}
	
	public static void StringSort(String ar[]) {

		for (int i = ar.length-1; i>=0 ; i-- ) {
			int longer = i;
			
			for(int j = i-1 ; j>=0; j--) {
				if (ar[j].compareTo(ar[i])>0) {
					longer = j;
				}else {
					longer = i;
				
				}
			
			   
			   swapS(ar, longer, i);
				
				}
			}  
	
	}	
	
	 public static void MinMaxSort(int array[]){
	      
	       int i=0;
	        while(i<=(array.length-i-1)) {
	          int min = i;
	          int max=array.length-i-1;
	          
	          	for (int j = i; j <=array.length-i-1; j++) {

	          		if (array[j] <=array[min]) {
	          			min = j;    
	          		}
	          		if(array[j]>=array[max]){
	          			max = j;
	          		}
	          }
	          swap(array, i, min);
	          
	          		if(i == max) {
	          			max = min;
	           }
	          swap(array, (array.length-i-1), max);
	        i++;
	        }
	   }
	  
	   private static void swap(int[] arr, int oldIndex, int newIndex){

	        int temp=arr[oldIndex];
	        arr[oldIndex]=arr[newIndex];
	        arr[newIndex]=temp;
	   }
	   
	   private static void swapS(String[] arr, int oldIndex, int newIndex){

	        String temp=arr[oldIndex];
	        arr[oldIndex]=arr[newIndex];
	        arr[newIndex]=temp;
	   }
}

