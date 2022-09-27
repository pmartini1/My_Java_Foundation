import java.util.Arrays;

public class mergeSortedArrays {
	public static void main(String[]args) {
		System.out.println(approximateLog2(32, 20));
	}
	
	 private static double approximateLog2(int n, int iterations) { 
		 //getting the upper bound and lower bound of the number 
		 double lower_bound = -1; 
		 //to store the lower_bound for the binary search algorithm. The lower_bound is the power of 2 such that it is just smaller than the number n 
		 int m = n; 
		 //to work on a different number 
		 while(m > 0) 
			 //to get the lower_bound of binary search and to get the last bit which is 1 in n 
			 { m = (m/2); 
			 lower_bound++; } 
		 double upper_bound = lower_bound + 1; 
		 //upper bound for BS is lower bound +1 
		 //binary search i.e. divide and conquer algorithm 
		 //Binary Search algorithm begins 
		 //start stores the lower limit of the search and end stores the upper limit with mid storing the middle value for the search 
		  
		 double mid = (lower_bound + upper_bound)/2.0; 
		 int num_iterations = 0; 
		 while(num_iterations <= iterations) 
			 //run a while loop till the number of iterations are less than equal to the given iterations
			 { if(Math.pow(2.0, mid) == n) 
				 
			 //if we found the solution directly for numbers n which are powers of 2 
		 { return mid; //return the mid value as the answer is obtained 
		 } else if(Math.pow(2.0, mid) < n)
			 //if the value of 2^mid is less than n then we move towards right 
			 { lower_bound = mid; } 
		 else if(Math.pow(2.0, mid) > n) 
				 //if the value of 2^mid is greater than n then we move towards the left 
				 { upper_bound = mid; } 
			 mid = (lower_bound + upper_bound)/2.0; 
				 //update the value of 
				 num_iterations++; 
				 //increase the number of iterations 
				 } return mid; 
				 //return the mid value which is the answer
				 }
		 
	 }



