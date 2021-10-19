import java.util.*;
public class CombinedLength {
public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int size=input.nextInt();
	String arr[]=new String[size];
	int length=0;
	for(int i=0; i<size; i++) {
		arr[i]=input.next();
		length=length+arr[i].length();
	}
	System.out.println(length);
	input.close();
}
}
