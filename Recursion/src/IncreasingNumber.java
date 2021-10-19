import java.util.*;
public class IncreasingNumber {
	public static void PrintIncreasing(int n) {
		if(n==0)
			return;
		PrintIncreasing(n-1);
		System.out.println(n);
		
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	PrintIncreasing(n);
	
}
}
