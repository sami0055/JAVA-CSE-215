import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name :");
		String st=s.nextLine();
		System.out.println("Enter your age :");
		int age=s.nextInt();
		s.nextLine();
		System.out.println("Enter your Dept :");
		String dept=s.nextLine();
		System.out.println("Name :"+st);
		System.out.println("Age :"+age);
		System.out.println("Year Dept is :"+dept);

	}

}
