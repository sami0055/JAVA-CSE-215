package LoopPractice;
import java.util.*;
public class CountDigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer:");
	int n=sc.nextInt();
	int r,count=0;
	while(n>0) {
	
		
		n=n/10;
		count++;
	}
	System.out.println(count);

	}

}
