
public class Pal {

	private String employeeId;
	private  String employeeName;
	private  int salary;
	private  int bonus;
	private int jobLevel;
	
	public String getEmployeeId()
	{
	    return employeeId;
	    
	}
	public String getEmployeeName()
	{
	    return employeeName;
	}
	public int getSalary()
	{
	    return salary;
 	}
  	public int getBonus()
 	{
	    return bonus;
	}
	public int getJobLevel()
	{
	    return jobLevel;
	}
	public void setEmployeeName(String newName){
	    this.employeeName =newName;
	}
	public void setEmployeeId(String newEmployee){
	    this.employeeId =newEmployee;
	}
	public void setSalary(int newSalary){
	    this.salary =newSalary;
	}
	public void setBonus(int newBonus){
	    this.bonus =newBonus;
	}
	public void setJobLevel(int newJob){
	    this.jobLevel=newJob;
	}

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}





