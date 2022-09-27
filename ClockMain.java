
public class ClockMain {
	public static void main (String[]args) {
		ClockTime t = new ClockTime(2, 43, "pm");
		
		ClockTime b = new ClockTime(2, 40, "pm");
		if (b.equals(t)) {
		System.out.println(t);
		} else {
			System.out.println("huh?");
		}
	}

}
