
public class Car implements Comparable<Car> {
private String make;
private String model;
private int year;

public  Car(){
    make ="none";
    model ="none";
    year =0;
}

public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
}


public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public String getMake() {
    return make;
}

public void setMake(String make) {
    this.make = make;
}

public String toString() {
    return make+" "+model+", "+year;
}

	public int compareTo(Car o) {
		int compare;
		compare=this.make.compareToIgnoreCase(o.make);
				
			if(compare==0)
					compare = this.model.compareTo(o.model);
				if(compare==0) {
       
				if (this.year > o.year)
				compare= 1;
			else if (this.year < o.year)
            compare= -1;
		else
        compare= 0;
    }
    return compare;
}

}