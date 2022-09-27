import java.util.*;
public class ModInsertionSort {
	
	public static void main (String[]args) {
		
		String[] array = {"Shorter ", "long ", "Longer ", "o "};
		
		insertionSort(array);
		
	}
	
	
	public static void insertionSort(String[] a) {
	for (int j = 1; j < a.length; j++) {
		String b = a[j];
		int i = j - 1;
			while (i >=0) {
				if (b.compareTo(a[i]) >= 0) {
					break;
				}
				a[i + 1] = a[i];
				i--;
				}
			a[i + 1] = b;
		System.out.println(Arrays.toString(a));
		}
	}

}

