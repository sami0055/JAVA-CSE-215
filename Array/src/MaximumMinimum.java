import java.util.*;
public class MaximumMinimum {
public static void main(String[] args)
{
	int i,x,n;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	n=input.nextInt();
	int Array[]=new int [n];
	for(i=0; i<n; i++) {
		Array[i]=input.nextInt();
	}
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(i=0; i<n; i++) {
		if(Array[i]<min)
			min=Array[i];
		else if(Array[i]>max)
			max=Array[i];
	}
	System.out.println("Min= "+min+"\nMax= "+max);
}
}
