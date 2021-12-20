package LoopPractice;
import java.util.*;
public class PrintDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int temp=n,r;
		while(temp!=0) {
			r=temp%10;
			System.out.println(r);
			temp=temp/10;
		}

	}

}
