package Assignment1;

public class DriverComplex {

	public static void main(String[] args) {
		
		Complex first,second;
		first=new Complex(3,8);
		second=new Complex(2,5);
		System.out.println("First Complex Number: "+first);
		System.out.println("Second Complex Number: "+second);
		
		Complex addition;
		addition=first.add(second);
		System.out.println("First + Second Gives: "+addition);
		
	}

}
