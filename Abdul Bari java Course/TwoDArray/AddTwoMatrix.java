package TwoDArray;
import java.util.*;
public class AddTwoMatrix {

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
			for(int j=0; j<A[i].length; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("Sum of A and B");
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	

	}

}
