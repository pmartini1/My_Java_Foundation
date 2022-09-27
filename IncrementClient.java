
public class IncrementClient {

	public static void main (String[]args) {
		SequentialIncrementer SI = new SequentialIncrementer();
		 
			System.out.println("Sequental ");
			
			System.out.println(SI.getValue());
				SI.Increment();
			System.out.println(SI.getValue());
				SI.Increment();
			System.out.println(SI.getValue());
			
		RandomIncrementer RI = new RandomIncrementer();
		
			System.out.println("Random ");
			
			System.out.println(RI.getValue());
				RI.Increment();
			System.out.println(RI.getValue());
				RI.Increment();
			System.out.println(RI.getValue());
		
	}
}
