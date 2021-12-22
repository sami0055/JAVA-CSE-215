package Arrays;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
	    int [] A=new int[n];
	    for(int i=0; i<A.length; i++) {
	    	A[i]=sc.nextInt();
	    	
	    }
	    int sum=0;
	    for(int i=0; i<A.length; i++) {
	    	
	    	sum=sum+A[i];
	    }
	    System.out.println(sum);
		

	}

}
