
public class ClientCircle {

    public static void main(String[] args) {
        
        Point p1 = new Point(10,5);   
        Circle c1 = new Circle(p1,7);         
          
        	System.out.println(c1);
          
        		System.out.println("\nArea: " + c1.getArea());
        	System.out.println("\nCircumference: " + c1.getCircumference());
        
        Point p2 = new Point(5,7);
          
    if(c1.contains(p2 )) {
    	System.out.println("\n"+p2 + " is within the circle.");
    } else {
    	System.out.println("\n"+p2 + "is NOT within the circle.");  
    }
          
  }
    
}

