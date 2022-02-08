package QUIZPreparation;

import java.util.Scanner;

/*
 * Write a program that will take two integer inputs and find the larger no among 
them.
 * 
 */
public class Task3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	if(n1>n2)
		System.out.println(n1);
	else {
		System.out.println(n2);
	}

	}

}
