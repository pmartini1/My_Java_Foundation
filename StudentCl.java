
public class StudentCl {

	public static void main(String[] args) {
		Student a = new Student(1324, "John", "CS");
		Student b = new Student(1324, "Jo", "CS");
		
		System.out.print(a.compareTo(b));

	}

}
