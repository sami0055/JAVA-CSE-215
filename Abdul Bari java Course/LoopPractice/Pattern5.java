package LoopPractice;
import java.util.*;
/*
 * 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 * 
 */
public class Pattern5 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}

	}

}
