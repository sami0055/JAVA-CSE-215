package ExceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("Denominator should not be zero");
		}
		System.out.println("Bye");
	}

}
