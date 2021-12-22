package Arrays;
import java.util.*;
public class CopyingArray {

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
		System.out.print("Elements of A: ");
		for(int x:A) {
			System.out.print(x);
		}
		for(int j=0; j<A.length; j++) {
			B[j]=A[j];
		}
		System.out.println();
		System.out.print("Elements of B: ");
		for(int j=0; j<B.length; j++) {
			System.out.print(B[j]);
		}
	}

}
