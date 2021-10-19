import java.util.*;
public class TwoDArray {
public static void main(String[] args)
{
	int i,j,row,col;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter row and col: ");
	row=input.nextInt();
	col=input.nextInt();
	int Arr[][]=new int [row][col];
	for(i=0; i<row; i++) {
		for(j=0; j<col; j++)
		{
			Arr[i][j]=input.nextInt();
		}
	}
	System.out.println("The Matrix is : ");
	for(i=0; i<row; i++) {
		for(j=0; j<col; j++)
		{
			System.out.print(Arr[i][j]+" ");
		}
		System.out.println();
	}
	input.close();
}
}
