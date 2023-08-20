package Inheritence;

public class Manager extends Employee{
String department;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void displayManager() {
		System.out.println("name "+name+ " id "+id+" department "+department);
		
		
	}

}
