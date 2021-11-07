import java.util.*;
public class EvenOrodd {
public static void main(String[] args) {
	int x,y,m;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	m=1;
	y=x&m;
	if(y==0) {
		System.out.println("Even");
	}
	else {
		System.out.println("Odd");
	}
	
}
}
