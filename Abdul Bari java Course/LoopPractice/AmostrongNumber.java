package LoopPractice;
import java.util.*;
public class AmostrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check amostrong or not: ");
	int n=sc.nextInt();
	int m=n;
	int sum=0; 
	int r;
	while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
		
		
	}
	if(sum==m)
		System.out.println("Amostrong number");
	else
		System.out.println("Not amostrong number");

	}

}
