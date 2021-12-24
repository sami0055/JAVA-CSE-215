package Metdods;
import java.util.*;
public class ReverseNumber {
     
	static int reverse(int n) {
	int r,rev=0;
	while(n!=0) {
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	return rev;
	}
	static int [] reverse(int A[]) {
		int B[]=new int [A.length];
		for(int i=A.length-1, j=0; i>=0; i--,j++) {
			B[j]=A[i];
		}
		return B;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nubmer: ");
		int n=sc.nextInt();
		int rev=reverse(n);
        int A[]=new int [5];
        for(int i=0; i<A.length; i++) {
        	A[i]=sc.nextInt();
        }
        
         int B[]=reverse(A);
         System.out.println("Reverse array is : "+rev);
         System.out.println("Reverse array is : ");
         for(int x:B) {
        	 System.out.print(x+" ");
         }
	}

}
