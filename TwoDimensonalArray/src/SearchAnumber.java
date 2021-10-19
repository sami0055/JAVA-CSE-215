import java.util.*;
public class SearchAnumber {
public static void main(String[] args) {
	int i,j,n,row,col;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter rows and cols for array");
	row=input.nextInt();
	col=input.nextInt();
	int Arr[][]=new int [row][col];
	for(i=0; i<row; i++) {
		for(j=0; j<col; j++) {
			Arr[i][j]=input.nextInt();
		}
	}
	System.out.println("Enter a num which you want to search");
	n=input.nextInt();
	for(i=0; i<row; i++) {
		for(j=0; j<col; j++) {
			if(Arr[i][j]==n)
			{
				System.out.println("Number found at "+i+","+j+" index");
				break;
			}
		}
	}
}
}
