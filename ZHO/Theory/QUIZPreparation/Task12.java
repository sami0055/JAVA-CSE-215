package QUIZPreparation;

import java.util.Scanner;

/*
 * 
 * Write a program that declares an array of 5 floating point numbers and takes those 
floating point numbers from keyboard input. Then it will print the square of each 
elements.
 */
public class Task12 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		float a[]=new float [5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextFloat();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Square: "+a[i]*a[i]);
		}

	}

}
