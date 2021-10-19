import java.util.*;
public class MathodOverloading {
public static void main(String[] args) {
	
	
	System.out.println(sum(3,3));
	System.out.println(sub(5.5,5.6));
	System.out.println(sum(5.5,6.7));
	System.out.println(sub(4,2));
	System.out.println(sum(2,2.2,2));
	
	
}
public static int sum(int a,int b) {
	return a+b;
}
public static int sub(int a,int b) {
	return a-b;
}
public static double sum(double a,double b) {
	return a+b;
}
public static double sub(double a,double b) {
	return a-b;
}
public static double sum(int a,double b,int c) {
	return a+b+c;
}

}
