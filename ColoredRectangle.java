import java.util.*;
public class ColoredRectangle extends Rectangle implements Colored {
	private String Color;


	public String getColored() {
		if (super.getHeight() > super.getWidth()) 
			Color = "Red";
		else if (super.getHeight() < super.getWidth())
			Color = "Blue";
		else {
			Color = "Yellow";
		 }
		return Color;
	}
	
	public boolean equals(Object o, Object c) {
        if (o instanceof Rectangle && c instanceof Colored) {
            Rectangle other = (Rectangle) o;
            Colored mother = (Colored) c;
            return super.getHeight() == other.getHeight() && super.getWidth() == other.getWidth() && getColored() == mother.getColored();
        } else {  
            return false;
        }
	}
        public String toString() {
            return "Rectangle [" + getHeight() + ", " + getWidth() + "]"+" "+getColored();
        }
}
