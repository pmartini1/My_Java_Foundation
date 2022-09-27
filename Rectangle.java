
public class Rectangle implements Comparable<Rectangle>  {

	private int height;
	private int width;
	private Point topCorner = new Point();
	
	public static void print(Object line) {
	    System.out.println(line);
	}
	
	public Rectangle(Point o, int newHeight, int newWidth) {
		this.height = newHeight;
		this.width = newWidth;
		this.topCorner = o;
		
	}
			public Rectangle(int width2, int height2, Point o) {
				this.height = height2;
				this.width = width2;
				this.topCorner = o;
	}

			public double getHeight() {
		return height;
	}
	
			public double getWidth() {
		return width;
	}
	
			public Point getTopCorner() {
				return topCorner;
			}
			
			 public void setWidth(int width) {
			        this.width = width;
			    }
			 
			 public void setHeight(int height) {
			        this.height = height;
			    }
			 
			   public void setTopCorner(Point topCorner) {
			        this.topCorner = topCorner;
			    }
			   
			public String toString() {
		return "Rectangle [Top Corner = "+topCorner+", height = "+height+", width = "+width+" ]";
		
		
			}
			
			

		    public int compareTo(Rectangle rectangle) {
		        int compare=width > rectangle.width ? +1 : width < rectangle.width ? -1 : 0;

		        if (compare==0){
		            compare=width > rectangle.height ? +1 : height < rectangle.height ? -1 : 0;
		            if (compare==0)
		                return topCorner.compareTo(rectangle.topCorner);
		        }
		        return compare;
		    }
		    
}
	

