import java.util.*;
public class Factorial {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int result=FactorialOfn(n);
	System.out.println(result);
	input.close();
}

private static int  FactorialOfn(int n) {
	if(n==1)
		return 1;
	
		int f1= n*FactorialOfn(n-1);  
		return f1;
}
}
