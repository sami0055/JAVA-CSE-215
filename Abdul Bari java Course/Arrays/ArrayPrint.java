package Arrays;
import java.util.*;
public class ArrayPrint {

	public static void main(String[] args) {
		int A[]=new int [10];
		int B[]= {1,2,3,4,5};
		int C[];
		C=new int [10]; 
		B[2]=15; 
		for(int i=0; i<A.length; i++) { 
			System.out.print(A[i]); 
		}
		System.out.println();
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i]+++" ");
		}
		for(int x:B) {
			System.out.println(x);
		}
	}

}
