
public class Cumulative {
	public static void main (String[]args) {
		int [] a = new int[5];
		a[0] = 5;
		a[1] = 2;
		a[2] = 4;
		a[3] = 1;
		a[4] = 3;
		
		selectionSort(a);
		for (int i = 0; i <a.length; i++) {
		System.out.println(a[i]);
 	}
		}
	
	static int cumulativeSum(int n) {

		if (n == 0)

			return 0;

		else

			return (n + cumulativeSum(n - 1));

		}
	
	 public static void selectionSort(int arr[])  {

	       int n = arr.length;
	       for (int i = 0; i < n-1; i++) {
	           int min_idx = i;
	           for (int j = i+1; j < n; j++) {
	               if (arr[j] < arr[min_idx]) {
	                   min_idx = j;
	                   }
	           }
	           int temp = arr[min_idx];
	           arr[min_idx] = arr[i];
	           arr[i] = temp;

	       }

	   }
}
