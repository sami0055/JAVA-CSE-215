package ArrayOfObjects;

import java.util.Arrays;

public class Student {
private String ID;
private String name;
String dept;

String[] subs=new String[4];

public Student(String iD, String name, String dept, String[] subs) {
	
	ID = iD; 
	this.name = name; 
	this.dept = dept;
	this.subs = subs;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}
public String[] getSubs() {
	return subs;
}
public void setSubs(String ...subs) {
	this.subs = subs;
}

public String getID() {
	return ID;
}
public String getName() {
	return name;
}

@Override
public String toString() {
	return "Student [ID=" + ID + ", name=" + name + ", dept=" + dept + ", subs=" + Arrays.toString(subs) + "]";
}
 
	

}
