package Lec03;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a integer: ");
	   int n=sc.nextInt();
	   System.out.println("You entered: "+n);
	   System.out.println("Eneter a flaot value: ");
	   float f=sc.nextFloat();
	   System.out.println("You entered: "+f);
	   System.out.println("Enter a double value: ");
	   double d=sc.nextDouble();
	   sc.nextLine();
	   System.out.println("You entered: "+d);
	   System.out.println("Enter your name: ");
	  String s=sc.nextLine();
	  System.out.println("Your name is: "+s);

	}

}
