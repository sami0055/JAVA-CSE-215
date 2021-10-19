import java.util.*;
public class Array {
public static void main(String[] args)
{
	
	/*Marks[0]=88;
	Marks[1]=44;
	Marks[2]=77;
	*/
	//int Mark[]= {11,22,33};
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int Marks[]=new int[n];
	//input
	for(int i=0; i<n; i++) {
	   Marks[i]=input.nextInt();
	}
	//Output
	for(int i=0; i<n; i++) {
		System.out.println(Marks[i]);
	}
	
}
}
