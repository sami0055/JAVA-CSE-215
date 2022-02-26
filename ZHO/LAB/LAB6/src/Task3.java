import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		System.out.println("Enter columns: ");
		int m=sc.nextInt();
		int arr1[][]=new int[n][m];
		int arr2[][]=new int [n][m];
		int sumArr[][]=new int [n][m];
		System.out.println("Enter First Matrix elements: ");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix elements: ");
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
				sumArr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("First Matrix : ");
         for(int i=0; i<arr1.length; i++)
			
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
         System.out.println("Second Matrix: ");
		for(int i=0; i<arr2.length; i++)	
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum: ");
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
