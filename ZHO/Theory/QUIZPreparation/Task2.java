package QUIZPreparation;

import java.util.Scanner;

/*
 * Write a program that will take the radius of a circle as floating point input and will 
print the area of that circle. 
 * 
 */
public class Task2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		float area=(float) (Math.PI*r*r);
		System.out.println("Area is : "+area);
		

	}

}
