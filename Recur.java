
public class Recur {
	public static void main (String[]args) {
		print(5);
		System.out.println();
		print(6);
	}
	
	public static void print (int n) {
		if (n == 1) {
			System.out.print("1");
		
		} else {
			if (n%2 ==0 ) {
				System.out.print(n+n+", ");
				print(n-1);
			} else {
				print(n-1);
				System.out.print(", "+n*n);
			}
		}
	}
}
