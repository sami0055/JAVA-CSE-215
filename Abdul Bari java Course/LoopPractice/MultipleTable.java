package LoopPractice;

import java.util.*;

public class MultipleTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for Multiplication Table");
		int n=sc.nextInt();
	
			for(int i=1; i<=10; i++) {
				System.out.println(i+"X"+n+"="+i*n);
			}
		

	}

}
