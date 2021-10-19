import java.util.*;
public class ReverseArray {
	public static void PrintReverse(int arr[],int n) {
		if(n==arr.length)
			return;
		PrintReverse(arr,n+1);
		System.out.print(arr[n]+" ");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	PrintReverse(arr,0);
	
}
}
