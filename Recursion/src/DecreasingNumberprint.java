import java.util.*;
public class DecreasingNumberprint {
	public static void PrintDecreasing(int n) {
		if(n==0)
			return;
		System.out.println(n);
		PrintDecreasing(n-1);
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	PrintDecreasing(n);
	
}
}
