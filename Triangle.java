
public class Triangle {
private int side1;
private int side2;
private int side3;

		public Triangle (int side11, int side22, int side33) {
			side1 = side11;
			side2 = side22;
			side3 = side33;
		}

				public int getSide1() {
					return side1;
				}
					public int getSide2() {
						return side2;
					}
						public int getSide3() {
							return side3;
						}

					public String toString() {
						return "("+side1+" ,"+side2+" ,"+side3+")";
					}
				public boolean isEquilateral () {
					if ((side1 == side2) && (side1 == side3))
						return true;
						else	
							return false;
						}
			public boolean isIsosceles () {
				 if (((side1 == side2) && (side1 != side3)) ||
					((side1 == side3) && (side1 != side2)) ||
					((side2 == side3) && (side2 != side1)))
					 	return true;
				 else
					    return false;
			} 
		public boolean isScalene () {
			if (((side3 != side2) && (side2 != side3) && (side1 != side3)))
				return true;
			else
				return false;
				   }
					
				}

