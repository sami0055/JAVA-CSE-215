import java.util.*;
public class TransposeMatrix {
public static void main(String[] args) {
	int i,j,row,col;
	Scanner input=new Scanner(System.in);
	row=input.nextInt();
	col=input.nextInt();
	int matrix[][]=new int [row][col];
	for(i=0; i<row; i++) {
		for(j=0; j<col; j++) {
			matrix[i][j]=input.nextInt();
		}
	}
	for(j=0; j<col; j++) {
		for(i=0; i<row; i++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
