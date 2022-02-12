package ArrayOfObject;

import java.util.Arrays;

public class Student {

	private String ID;
	private String name;
	String dept;
	String sub[]=new String[4];
	public Student(String iD, String name, String dept, String[] sub) {
		super();
		ID = iD;
		this.name = name;
		this.dept = dept;
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String[] getSub() {
		return sub;
	}
	public void setSub(String ...sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", dept=" + dept + ", sub=" + Arrays.toString(sub) + "]";
	}
	
	
	
}
