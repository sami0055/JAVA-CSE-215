package LoopPractice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0,r;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");

	}

}
