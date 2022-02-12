package ArrayOfObject;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[2];
		for(int i=0; i<s.length; i++)	
		{
			System.out.println("Enter your ID: ");
			String id=sc.nextLine();
			System.out.println("Enter your Name: ");
			String name=sc.nextLine();
			System.out.println("Enter your Dept: ");
			String dept=sc.nextLine();
			System.out.println("How many course u want to take??");
			int n=sc.nextInt();
			sc.nextLine();
			String[] course=new String [n];
			System.out.println("Enter your courses: ");
			for(int j=0; j<course.length; j++)
			{
				course[j]=sc.nextLine();
			}
			s[i]=new Student(id,name,dept,course);
		}
		
		System.out.println("Student Information: ");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].toString());
		}

	}

	
}
