import java.util.*;

public class ClientCR extends ColoredRectangle {

	public static void main(String[]args) {
		ColoredRectangle a = new ColoredRectangle();
		a.setHeight(10);
		a.setWidth(4);
		
		ColoredRectangle b = new ColoredRectangle();
		b.setHeight(10);
		b.setWidth(10);
		
		ColoredRectangle c = new ColoredRectangle();
		c.setHeight(4);
		c.setWidth(10);
		
		ArrayList<ColoredRectangle> RC = new ArrayList<ColoredRectangle>();
			RC.add(a);
			RC.add(b);
			RC.add(c);
			
			System.out.println(RC);
			System.out.println("a = b: "+a.equals(b));
			System.out.println("b = c: "+b.equals(c));
			System.out.println("c = a: "+c.equals(a));
	}
}
