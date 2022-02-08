package QUIZPreparation;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
	 
		int a[][]=new int [3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("Sum is : "+sum);
		

	}

}
