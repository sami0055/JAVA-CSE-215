import java.util.Scanner;

public class SumofTwoMatrix {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dimension: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int arr2[][]=new int [n][m];
		int sumArr[][]=new int [n][m];
		System.out.println("Enter First Matrix: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix: ");
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<sumArr.length; i++)
		{
			for(int j=0; j<sumArr[i].length; j++)
			{
				sumArr[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		System.out.println("Matrix 1: ");
         for(int i=0; i<arr.length; i++)
			
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
         System.out.println("Matrix 2: ");
         for(int i=0; i<arr2.length; i++)
			
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of two Matrix: ");
		for(int i=0; i<sumArr.length; i++)
			
		{
			for(int j=0; j<sumArr[i].length; j++)
			{
				System.out.print(sumArr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
