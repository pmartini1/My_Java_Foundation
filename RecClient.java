import java.util.*;

public class RecClient {

	public static void main (String[]args) {
		Random random=new Random();
		ArrayList<Rectangle> list1 = new ArrayList<Rectangle>();
		
        for (int i = 0; i < 8; i++) {
            int width= random.nextInt(100);
            int height= random.nextInt(100);
            Point topCorner = new Point(random.nextInt(100), random.nextInt(100));
            list1.add(new Rectangle(width,height, new Point(random.nextInt(width),random.nextInt(height))));
        }
        list1.add(new Rectangle(2,2,new Point(0,0)));
        list1.add(new Rectangle(2,2,new Point(4,4)));
        
        	for (Rectangle rec:list1) {
        		System.out.println(rec);
        	}
        System.out.println("\n\n");
        		Collections.sort(list1);
        
        	for (Rectangle rec:list1) {
            	System.out.println(rec);
            }
	}
	
}
