import java.util.Scanner;

 class ArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of row: ");
		int n=sc.nextInt();
		System.out.println("Enter Number of column: ");
		int r=sc.nextInt();
		int a[][]=new int [n][r];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
