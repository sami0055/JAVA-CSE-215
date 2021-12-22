package Arrays;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
		int A[]=new int [n];
		for(int i=0; i<A.length; i++) {
			A[i]=sc.nextInt();
		}
		int max1=A[0];
		int max2=A[0];
		for(int i=0; i<A.length; i++) {
			if(A[i]>max1) {
				max2=max1;
				max1=A[i];
				
			}
			else if(A[i]>max2) {
				max2=A[i];
			}
		}
		System.out.println("Second largest is "+max2);
		

	}

}
