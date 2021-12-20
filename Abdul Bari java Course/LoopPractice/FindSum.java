package LoopPractice;
import java.util.*;
public class FindSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("up to How many number u want to add: ");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1; i<=n; i++) {
		sum=sum+i;
	}
	System.out.println(sum);

	}

}
