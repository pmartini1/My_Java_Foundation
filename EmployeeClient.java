
public class EmployeeClient {
	
	
 public static void printEmployee(Employee my) {
  System.out.println(my.getName()+"\nHours: "+my.getHours()+"\nSalary: "+my.getSalary()+"\nVacation Days: "+my.getVacationDays()+"\nVacation Form: "+my.getVacationForm());
 ((SoftwareEnjineer) my).writeCode();
 }
 
  
 public static void main (String[]args) {
	 Lawyer a = new Lawyer();
	 SoftwareEnjineer b = new SoftwareEnjineer();
	 HarvardLawyer c = new HarvardLawyer();
	 
	 printEmployee(b);
 }
}
