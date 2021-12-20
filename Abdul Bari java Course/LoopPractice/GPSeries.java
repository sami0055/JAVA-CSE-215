package LoopPractice;

import java.util.Scanner;

public class GPSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,n,r,i;
		System.out.println("Enter first number: ");
	    a=sc.nextInt();
	    System.out.println("How many term you want to print?");
	    n=sc.nextInt();
	    System.out.println("What is the ratio ?");
	    r=sc.nextInt();
	    for(i=1; i<=n; i++) {
	    	System.out.println(a);
	    	a=a*r;
	    }
	    

	}

}
