import java.util.*;
public class Array {
public static void PrintArray(int arr[],int n) {
	
	if(n==arr.length)
		return;
	System.out.println(arr[n]);
	PrintArray(arr,n+1);
	
		
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++) {
		arr[i]=sc.nextInt();
	}
	PrintArray(arr,0);
	sc.close();
	
}
}
