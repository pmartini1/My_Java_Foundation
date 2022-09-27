import java.util.ArrayList;

public class ARRL {

	
	public static void minToFront(ArrayList<Integer> array) {
    int mindex = 0;
    
    for (int i = 1; i < array.size(); i++) {
        if (array.get(mindex) > array.get(i)) {
            mindex = i;
        }
    }
    
    int minValue = array.remove(mindex);
    array.add(0, minValue);
    
    System.out.println(array);
}
	public static void main(String[]args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(15);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		minToFront(list);
		
	}
}
