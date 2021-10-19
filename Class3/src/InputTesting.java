import java.util.*;
public class InputTesting {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your ID");
	int id=input.nextInt();
	input.nextLine();
	System.out.println("Enter cgpa");
	double cgpa=input.nextDouble();
	input.nextLine();
	System.out.println("Enter your full name");
	String name=input.nextLine();
	System.out.println("ID "+id);
	System.out.println("CGPA "+cgpa);
	System.out.println("Name "+name);
}
}
