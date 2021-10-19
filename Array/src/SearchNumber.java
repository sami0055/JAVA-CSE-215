import java.util.*;
public class SearchNumber {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n,x,i;
	n=input.nextInt();
	int Array[]=new int[n];
	//input array
	for(i=0; i<n; i++) {
		Array[i]=input.nextInt();
	}
	System.out.print("Enter a Number which you want to search: ");
	x=input.nextInt();
	
	for(i=0; i<n; i++)
	{
		if(Array[i]==x)
		{
			System.out.println("Number found at="+i+" Index");
			break;
		}
	}
}
}
