package LoopPractice;
/*
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
6 7 8 9 10 
 * 
 * 
 */
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    n=sc.nextInt();
	    for(i=1; i<=n; i++) {
	    	for(j=1; j<=n; j++) {
	    		System.out.print((i+j)+" ");
	    	}
	    	System.out.println();
	    }

		}
	}


