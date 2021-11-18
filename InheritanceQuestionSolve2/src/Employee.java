
public class Employee extends Person{
	private String department;
	private String designation;
	Employee(){
		
	}
	Employee(String name,int age,String address,String department,String designation){
		super(name,age,address);	
		this.setDepartment(department);
		this.setDesignation(designation);
		
		}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
