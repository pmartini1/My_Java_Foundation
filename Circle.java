public class Circle {
	int x;
	int y;
	private double radius;
	private Point p;

	  
	public Circle (Point p, double radius ) {
		this.p = p;
		this.radius = radius;
	}
	  public String toString() {
		  return "Center is ("+p.toString()+") ,radius= "+ radius;
	  }
	   			public double getRadius( ) {
	   				return radius;
	   			}
	   				public Point getCenter() {
	   					return p;
	   				}			
	   			public double getCircumference() {
	   				return 2* Math.PI * radius;
	   			}
	   		public double getArea( ) {
	   			return Math.PI*radius*radius;
	   		}
	   	public boolean contains(Point a) {
	   		if(p.getDistance(a) <= radius)
	   			return true;
	   		else {
	   		    return false;
	   		}
	  }
}