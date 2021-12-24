package Metdods;
import java.util.*;
public class Validate {
static boolean validate(String name) {
	return name.matches("[a-zA-Z\\s]+");
		
	}
static boolean validate(int age) {
	return age>=3 && age<=15;
}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter age:");
		int a=sc.nextInt();
	   boolean x=validate(name);
	   boolean y=validate(a);
	   System.out.println(x);
	   System.out.println(y);
   
	}

}
