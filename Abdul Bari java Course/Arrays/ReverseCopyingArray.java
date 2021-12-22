package Arrays;

import java.util.Scanner;

public class ReverseCopyingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		int A[]=new int [n];
		int B[]=new int [n];
		for(int i=0; i<A.length; i++) {
			System.out.println("A["+i+"]= ");
			A[i]=sc.nextInt();
		}
		int j=0;
		System.out.print("Reverse array: ");
		for(int i=A.length-1; i>=0; i--,j++) {
			B[j]=A[i];
		}
		for( j=0; j<B.length; j++) {
			System.out.print(B[j]);
		}

	}

}
