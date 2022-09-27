
public class RectangleClient {
	
	public static void main(String []args) {
		Rectangle rect1 = new Rectangle(2,4,3,5);
		

			System.out.println(rect1.toString());
			
			
			System.out.println(rect1.area());
			System.out.println(rect1.perimeter());
			
			
		Rectangle rect2 = new Rectangle(10, 20, 30, 40);
			
		System.out.println(rect2.toString());
			
		System.out.println(rect2.area());
		System.out.println(rect2.perimeter());
	}
}
