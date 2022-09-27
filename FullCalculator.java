import java.util.*;

public class FullCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// read input
		String expression = sc.nextLine();

		// print the evaluated result
		System.out.println(eval(expression));
		}

	public static int eval(String expression) {
		ArrayList<Integer> numList = new ArrayList<>();
		Stack<Character> opStack = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if(ch >= '0' && ch <= '9'){
				int num = 0;
				while (ch >= '0' && ch <= '9') {
					num = num*10 + (ch-'0');
					i++;
				if(i < expression.length())
					ch = expression.charAt(i);
				else
					break;
				}
		i--;
		numList.add(num);
		
			} else if(ch == '('){
				opStack.push(ch);
			} else if(ch == ')') {
				while(opStack.peek() != '('){
				int output = op(numList, opStack);
				numList.add(output);
			}
		opStack.pop();
		} else if( ch == '*' || ch == '+' || ch == '(' || ch == ')') {
			while(!opStack.isEmpty() && level(ch) < level(opStack.peek())) {
				int output = op(numList, opStack);
				numList.add(output);
			}
			opStack.push(ch);
		}
	}

		while(!opStack.isEmpty()){
			int output = op(numList, opStack);
				numList.add(output);
		}
	return numList.remove(numList.size()-1);
	}

		public static int op(ArrayList<Integer> numbers, Stack<Character> operations) {
			int a = numbers.remove(numbers.size()-1);
			int b = numbers.remove(numbers.size()-1);
			char operation = operations.pop();
				switch (operation) {
					case '+':
						return a + b;
					case '*':
						return a * b;
				}
		return 0;
		}
		static int level(char c){
			switch (c){
				case '+':
					return 1;
				case '*':
					return 2;
			}
			return -1;
		}
	}