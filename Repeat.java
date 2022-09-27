
public class Repeat {
	
	public static void main(String[]args) {
		
		String s = "Wow";
		int n = 4;
		
		String RS = repeat(s,n);
		
		System.out.println(RS);
	}

	public static String repeat (String s, int n) {
		if (n == 1) {
			return s;
		}else if (n==0) {
			return " ";
		}else {
			return s + repeat(s,n-1);
		}
		
	}
}
