package Arrays;

import java.util.Scanner;

public class FindMaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
	    int [] A=new int[n];
	    for(int i=0; i<A.length; i++) {
	    	A[i]=sc.nextInt();
	    	
	    }
	    int max=A[0];
	    for(int i=0; i<A.length; i++) {
	    	if(A[i]>max) {
	    		max=A[i];
	    	}
	    }
	    System.out.println("Max is "+max);

	}

}
