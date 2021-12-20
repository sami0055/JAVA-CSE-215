package LoopPractice;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c,n;
		System.out.println("Enter how many term you want to print: ");
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=0; i<n-2; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

	}

}
