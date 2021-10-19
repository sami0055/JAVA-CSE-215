import java.util.*;
public class isAscending {
public static void main(String[] args)
{
	int i,x,n;
	System.out.println("Enter the size of array: ");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	int Arr[]=new int[n];
	for(i=0; i<n; i++) {
		Arr[i]=input.nextInt();
	}
	boolean isAscending=true;
	for(i=0; i<n-1; i++) {
		if(Arr[i]>Arr[i+1]) {
			isAscending=false;
		}
	}
	if(isAscending)
	{
		System.out.println("The array is shorted in Ascending order");
		
	}
	else
		System.out.println("The array is not shorted in Ascending order");
}
}
