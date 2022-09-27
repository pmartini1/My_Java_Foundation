import java.util.*;

public class TriangleClient {
	
	public static void main (String[]args) {
		Scanner tri = new Scanner(System.in);  
	    System.out.println("Side 1= ");
	    	int Side1 = tri.nextInt(); 
	    	System.out.println("Side 2= ");
	    	int Side2 = tri.nextInt(); 
	    		System.out.println("Side 3= ");
	    		int Side3 = tri.nextInt(); 
	    		
	    Triangle angle = new Triangle (Side1, Side2, Side3);
	    
	    System.out.println(angle.toString());
	    
	    if (angle.isEquilateral()==true)
	    	System.out.println ("Equilateral");
	    else if (angle.isIsosceles ()==true)
	    	System.out.println ("Isosoles");
	    else if (angle.isScalene ()==true)
	    	System.out.println ("Scalene");
	    
       
	}
}
