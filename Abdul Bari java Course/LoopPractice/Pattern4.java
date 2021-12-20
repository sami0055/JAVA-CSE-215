package LoopPractice;
/*
 1 2 3 4 5
 6 7 8 910
1112131415
1617181920
2122232425
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int i,j,n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    n=sc.nextInt();
	    int k=1;
	    for(i=1; i<=n; i++) {
	    	for(j=1; j<=n; j++) {
	         	System.out.printf("%2d",k);
	         	k++;
	    	}
	    	System.out.println();
	    }

		}
	}


