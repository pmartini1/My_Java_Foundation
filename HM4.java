//Paris Martini
//Homework 4 part B
public class HM4 {
	
	public static void main( String[]args) {
		int a = 5;
		int b = 3;
		
		//Multiply
		System.out.println(a+" * "+b+" = "+multiply(3,5));
		System.out.println();
		
		//WriteSequence
		writeSequence(1);
		System.out.println();
		writeSequence(2);
		System.out.println();
		writeSequence(3);
		System.out.println();
		writeSequence(4);
		System.out.println();
		writeSequence(5);
		System.out.println();
		writeSequence(6);
		
	}
	
	public static int multiply (int a, int b){
		if(a== 0) {
			return 0;
		}else {
			return b + multiply(b, a-1);

		}
	
	}
		
	public static void writeSequence(int n) {
	
		if(n<1)
	    	throw new IllegalArgumentException();
		else if(n==1)
	    	System.out.print(1);
		else if(n==2)
	    	System.out.print("1 1");
		else {
	    	System.out.print((n+1)/2+" ");
	     	writeSequence(n-2);
	     	System.out.print(" "+(n+1)/2);
	    }
		
	}	
	
}