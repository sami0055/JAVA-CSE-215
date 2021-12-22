package Arrays;

import java.util.Scanner;

public class InsertingAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
		int A[]=new int [n];
		for(int i=0; i<A.length; i++) {
			A[i]=sc.nextInt();
		}
		int x,k;
		System.out.println("Enter index and value for insert: ");
		x=sc.nextInt();
		k=sc.nextInt();
		for(int i=A.length-1; i>x; i--) {
			A[i]=A[i-1];
		}
		A[x]=k;
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}

	}

}
