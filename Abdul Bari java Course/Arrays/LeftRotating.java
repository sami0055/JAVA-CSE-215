package Arrays;
import java.util.*;
public class LeftRotating {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the size of array: ");
	n=sc.nextInt();
	int A[]=new int [n];
	for(int i=0; i<A.length; i++) {
		A[i]=sc.nextInt();
	}
	int temp=A[0];
	for(int i=0; i<A.length-1; i++) {
		A[i]=A[i+1];
	}
	A[A.length-1]=temp;
	for(int i=0; i<A.length; i++) {
		System.out.print(A[i]+" ");
	}

	}

}
