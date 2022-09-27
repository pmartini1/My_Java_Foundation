
public class exper {
    public static void main (String[]args) {
    	int[] numbers = {3, 2, 1, 6, 4, 5};
    	int n = numbers.length;
    	int k = 2;
    	for (int i = 0; i <= n / 2; i++) {
    		heapify(numbers, n, i, k); 		   // build a heap    
    	}
    	k=2;
    	heapify(numbers, n, 0, k);
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            resultSb.append(new Integer(numbers[i]).toString());
            if (i < numbers.length - 1) {
                resultSb.append(" ");
            }
        }
        System.out.println(resultSb.toString());
  }
    public static void heapify(int numbers[], int n, int i, int k) { 
    	int largest = i;
        if (k != 0) { //assuming it isn't already ordered
        	if (left(i) < n && numbers[left(i)] < numbers[largest]) { // If left child is > than root 
            	largest = left(i); 
            }
            if (right(i) < n && numbers[right(i)] < numbers[largest]) { // If right child is > than largest 
           		largest = right(i); 
           	}	 
           	if (largest != i) { // If largest is not root
           		int temp = numbers[i]; 
           		numbers[i] = numbers[largest]; 
           		numbers[largest] = temp; 
           		k--; 
           		heapify(numbers, n, largest, k); 
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