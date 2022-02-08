package Lec03;

import java.util.Scanner;

public class ForEach2Darray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int nums[][]=new int [2][2];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
			  nums[i][j]=sc.nextInt();
			}
		}
		for(int x[]: nums)
		{
			for(int y:x) {
				System.out.println("Value is: "+y);
				sum+=y;
			}
		}
		System.out.println("Summation : "+sum);
		
	}

}
