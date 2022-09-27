public class SoftwareEnjineer extends Employee {
	
	 private String name = "Software Engineer";
	 
	 public String getName() {
	  return name;
	 }
	
 public int getVacationDays() {        
  return super.getVacationDays() - 5;   
  }
 public double getSalary() {        
  return super.getSalary() + 15000;   
  }
 public int getHours() {        
  return super.getHours() +10;   
  }
 public void writeCode() {    
  System.out.println("Code!");   
  }
 } 


