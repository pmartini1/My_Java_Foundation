import java.util.*;

public class Test1 {
	
	public static void main(String[]args) {
		int y = 1;
		int x = 3;
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(0);
		a.add(3);
		a.add(5);
		a.add(7);
		
		mystery(a, y, x);
		System.out.println (x + " " + y + " "+ a);
	}
	
	public static void mystery(ArrayList<Integer> a, int x, int y) { // x = 1 and y = 3
		//if 1 < 3, x = 2, and index at 2 = 17
		if (x < y) {
			x++;
			a.set(x, 17);
		//index of 3 = 17
		} else {
			a.set(y, 17);
		}
		System.out.println(x+" "+y+ " "+ a);
	}
}		//outPut:
		// 2 3 [0, 3, 17, 7]
		// 3 1 [0, 3, 17, 7]
