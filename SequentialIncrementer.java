
public class SequentialIncrementer implements Incrementable {
	
	double num =0;
	
	public void Increment() {
		num = num + 1 ;
	}

	public double getValue() {
		return num;
	}

}
