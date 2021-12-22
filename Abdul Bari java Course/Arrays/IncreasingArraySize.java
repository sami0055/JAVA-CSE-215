package Arrays;

import java.util.Scanner;

public class IncreasingArraySize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of an array: ");
		n=sc.nextInt();
		int A[]=new int [n];
		int B[]=new int [A.length*2];
		for(int i=0; i<A.length; i++) {
			System.out.println("A["+i+"]= ");
			A[i]=sc.nextInt();
		}
	 
		for(int i=0; i<A.length; i++) {
			B[i]=A[i];
			
		}
		A=B;
		System.out.println(A.length);

	}

}
