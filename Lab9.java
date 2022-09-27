/* Answer to Q1:
 * 2
 * 4 2
 * 6 4 2
 * 8 6 4 2
 * 10 8 4 2
 * */


import java.util.*;

public class Lab9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Number? ");
		
				int num = sc.nextInt();
		
			System.out.println(evenSum(num));
		
		System.out.println(fib(num));
		
	}
		public static int evenSum (int n) {
		
			if (n <=0) {
				return 0;}
			else if (n % 2 ==0) {
				return (n + evenSum(n-1));}
			else {
				return evenSum(n-1);}
		}
	
	
	public static int fib (int f) {
		if (f<= 1) {
			return f;}
		else {
			return fib(f-1)+fib(f-2);
		}
	}
}
