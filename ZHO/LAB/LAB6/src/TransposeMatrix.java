import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dimension: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		int T[][]=new int [n][m];
		System.out.println("Enter Matrix element: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("MATRIX: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				T[i][j]=arr[j][i];
			}
		}

		
		System.out.println("Transpose Matrix: ");
		for(int i=0; i<T.length; i++)
			
		{
			for(int j=0; j<T[i].length; j++)
			{
				System.out.print(T[i][j]+" ");
			}
			System.out.println();
		}
	}

}
