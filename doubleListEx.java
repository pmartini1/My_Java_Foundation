import java.util.*;

public class doubleListEx {

	public static void doubleList(ArrayList<String> array) {
		int s1 = array.size();
		
	    for (int i = 0; i < s1; i++) {
	        String word = array.get(2 * i);
	        array.add(2 * i + 1, word);
	    }
	    System.out.println(array);
	}
	
	public static void main (String[]args) {
		
		ArrayList<String> a = new ArrayList<String>();
			a.add("How ");
			a.add("are ");
			a.add("you? ");
			
		doubleList(a);
		
	}

}
