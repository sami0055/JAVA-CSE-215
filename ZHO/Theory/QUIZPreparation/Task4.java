package QUIZPreparation;

import java.util.Scanner;

/*
 * Write a program that will take an integer from keyboard and will determine whether 
   the number is even or odd.
 * 
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		if(n1%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
