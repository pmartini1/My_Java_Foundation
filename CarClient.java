import java.util.*;
public class CarClient {

	public static void main(String[]args) {
		
		ArrayList<Car> C = new ArrayList<Car>();
			C.add(new Car("Toyota","Corolla",2018));
			C.add(new Car("Toyota","Camry",2019)); 
			C.add(new Car("Kia","Optima",2016)); 
			C.add(new Car("Toyota","Camry",2010)); 
			C.add(new Car("Kia","Soul",2015));
			
			
		 System.out.println(" "+C);
	      Collections.sort(C);
	      System.out.println(" "+C); 
	      
	}
}
