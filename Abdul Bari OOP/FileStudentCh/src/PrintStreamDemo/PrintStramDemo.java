package PrintStreamDemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
}
public class PrintStramDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("G:\\Java\\FileStudentCh\\src\\PrintStreamDemo\\Student.txt");
		PrintStream ps=new PrintStream(fos);
		Student s=new Student();
		s.rollno=34;
		s.name="Smaiul";
		s.dept="CSE";
		ps.println(s.rollno);
		ps.println(s.name);
		ps.println(s.dept);
		ps.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("G:\\Java\\FileStudentCh\\\\src\\PrintStreamDemo\\Student.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        System.out.println("Roll no: "+s.rollno);
        System.out.println("Name: "+s.name);
        System.out.println("Dept: "+s.dept);
		
	}

}
