
public class Student {
	private int studentId;
	private String studentName;
	private String department;
	
	
	

	public Student(int id, String name, String department) {
		this.studentName = name;
		this.department = department;
		this.studentId = id;
	}



	public String getStudentName() {
		  return studentName;
		 }
		
	 public String getDepartment() {        
	  return department;              
	  }
	    
	  public int getStudentId() {        
	   return studentId;            
	   }
	  
      public String toString() {
          return "Wizard! Name: " + getStudentName() + ",		House: " + getDepartment() + ",		Grade: "+getStudentId();
      }
    
	      
	      public int compareTo (Student o){
	    	
	    	  	if (studentId > o.studentId) {
	    	  		return 1;
	    	  	} else if (studentId < o.studentId) {
	    	  		return -1;
	    	  	} else if (studentName.compareTo(o.studentName)>0) {
	    	  		return 1;
	    	  	} else if (studentName.compareTo(o.studentName)<0) {
	    	  		return -1;
	    	  	} else if (department.compareTo(department)< 0) {
	    	  		return 1;
	    	  	} else if (department.compareTo(department)> 0) {
	    	  		return -1;
	    	  	}
	    	  	else {
	    	  		return 0;
	    	  	}
	    	}
	      
	     
	}
	   
