import java.util.*;
public class DecreasingIncreasingnum {
	
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	
	PrintDecreasingIncreasing(n);
}
private static void PrintDecreasingIncreasing(int n) {
	if(n==0)
		return;
	System.out.println(n);
	PrintDecreasingIncreasing(n-1);
	System.out.println(n);
}
		
}
