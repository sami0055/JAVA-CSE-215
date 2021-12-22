package TwoDArray;

import java.util.Scanner;

public class MultiplyingTwoMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter row and col: ");
		n=sc.nextInt();
		m=sc.nextInt();
		int A[][]=new int [n][m];
		int B[][]=new int [n][m];
		int C[][]=new int [n][m];
		System.out.println("Enter the elements of A");
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements for B");
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				B[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				C[i][j]=0;
				for(int k=0; k<B[0].length; k++) {
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
		}
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[0].length; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}

	}

}
