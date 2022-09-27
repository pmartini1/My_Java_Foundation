
public class RandomIncrementer implements Incrementable{
	
	double num =0;
	
	public void Increment() {
		this.num = (int)(Math.random()*1000);
		num = num + (int)(Math.random()*1000);
	}

	public double getValue() {
		return num;
	}

}
