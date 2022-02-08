package Lec03;

public class ExplicitCasting {

	public static void main(String[] args) {
		
		byte b;
		int i=294;
		double d=33.33;
		System.out.println("Type Conversion of int to byte: ");
		b= (byte) i;
		System.out.println("i ans b "+i+" "+b);//Data may lose
		
		System.out.println("Conversion into double to int; ");
		i=(int) d;
		System.out.println("i and d is "+i+" "+" d "+d);
		
		System.out.println("Conversion of double to byte: ");
		b=(byte)d;
		System.out.println("d and b "+d+" "+b);

	}

}
