package LoopPractice;
/*
 * 
 * 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */
import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int k=1;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(k+" ");
				k++;
				
			}
			System.out.println();
			
		}

	}

}
