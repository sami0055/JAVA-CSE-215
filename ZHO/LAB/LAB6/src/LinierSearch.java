import java.util.Scanner;

public class LinierSearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter array element: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number for search: ");
		int n=sc.nextInt();
		 boolean isFound=false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==n)
			{
				isFound=true;
				break;
			}
		}
		if(isFound)
		{
			System.out.println("Found!");
		}
		else {
			System.out.println("Not Found!");
		}

	}

}
