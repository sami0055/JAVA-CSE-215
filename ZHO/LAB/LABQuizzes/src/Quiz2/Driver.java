package Quiz2;

import java.util.Scanner;

public class Driver {
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
          System.out.print("Enter Burger bun size Small Medium or Large :  ");
  String a= sc.next();
  System.out.print("Number of patties :  ");
  int b= sc.nextInt();
  System.out.print("Cheese Slices :  ");
   int c= sc.nextInt();
  System.out.print("Pastrami Slices :  ");
  int d= sc.nextInt();
  Burger bo= new Burger(a,c,b,d);
  System.out.println("Burger cost :$"+bo.calcCost());
  System.out.println(bo.toString());
  }
	}


