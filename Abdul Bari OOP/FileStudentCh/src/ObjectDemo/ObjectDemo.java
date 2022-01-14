package ObjectDemo;
import java.io.*;
class Student implements Serializable{
	private int rollno;
	private String name;
	private float avg;
	private String dept;
	public static int data=10;
	public transient int t;
	public Student() {
		
	
	}
	public Student(int rollno, String name, float avg, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.avg = avg;
		this.dept = dept;
		
		data=200;
		t=200;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", avg=" + avg + ", dept=" + dept + "]";
	}
	
}
public class ObjectDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileOutputStream fos=new FileOutputStream("G:\\Java\\FileStudentCh\\src\\ObjectDemo\\Student.txt");
	ObjectOutputStream oss=new ObjectOutputStream(fos);
	
	Student s=new Student(10,"Samiul Alim",99.8f,"Cse");
	oss.writeObject(s);
	fos.close();
	oss.close();
	
	FileInputStream fis=new FileInputStream("G:\\Java\\FileStudentCh\\src\\ObjectDemo\\Student.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	 s=(Student) ois.readObject();
	System.out.println(s);
	fis.close();
	ois.close();
	
	
	}

}
