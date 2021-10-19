import java.util.*;
public class InputName {
public static void main(String[] args)
{
	String names[]=new String[5];
	Scanner input=new Scanner(System.in);
	
	for(int i=0; i<5; i++) {
		names[i]=input.nextLine();
	}
	int n=names.length;
	
	for(int i=0; i<n; i++) {
		System.out.println("Names "+(i+1)+" is "+names[i]);
	}
}
}
