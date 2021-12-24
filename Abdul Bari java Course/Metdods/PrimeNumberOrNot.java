package Metdods;
import java.util.*;
public class PrimeNumberOrNot {
    static boolean isPrime(int x) {
    	boolean c=true;
		for(int i=2; i<x/2; i++) {
			if(x%i==0) {
				c=false;
			}
		}
		return c;
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		
		boolean x=isPrime(a);
		if(x) {
			System.out.println("Yes number is prime ");
			
		}
		else {
			System.out.print("Not a prime number");
		}

	}

}
