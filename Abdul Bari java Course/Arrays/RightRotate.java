package Arrays;

import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
		int A[]=new int [n];
		for(int i=0; i<A.length; i++) {
			A[i]=sc.nextInt();
		}
		
		int temp=A[A.length-1];
		for(int i=A.length-1; i>=0; i--) {
			if(i==0) {
				A[i]=temp;
				break;
			}
				
			A[i]=A[i-1];
			
		}
	   for(int i=0; i<A.length; i++) {
		   System.out.print(A[i]+" ");
	   }

	}

}
