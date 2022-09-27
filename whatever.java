import java.util.ArrayList;
import java.util.Stack;

public class whatever {
	public static void main (String [] args) {
		Stack<Integer> Stack = new Stack<>();
		ArrayList<Integer> List = new ArrayList<>();
		
		for (int i = 0 ; i < 10; i++) {
			Stack.push(i);
			List.add(i);
		}
		System.out.println(Stack);
		System.out.println(List);
		
		Stack.pop();
		List.remove(List.size()-1);
		System.out.println(Stack);
		System.out.println(List);
	}
}
