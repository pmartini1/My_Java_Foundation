
public class HarvardLawyer extends Lawyer {
 
	 private String name = "Harvard Lawyer";
	 
	 public String getName() {
	  return name;
	 }
	
 public double getSalary() {  
  return super.getSalary() + ((1/5)*super.getSalary());    
    }        
  public int getVacationDays() {        
   return super.getVacationDays() + 3;            
   } 
    public String getVacationForm() {        
     return super.getVacationForm()+super.getVacationForm()+super.getVacationForm();    
 }
}
