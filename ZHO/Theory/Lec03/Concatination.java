package Lec03;

public class Concatination {

	public static void main(String[] args) {
		
	int b=20;
	int a=10;
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println("a = "+a);//a=10;
		System.out.println("b= "+b);//b=20;
		System.out.println(a+b); //30
		System.out.println("a+b= "+a+b);//a+b=1020
		System.out.println("a+b= "+(a+b));//a+b=30
		System.out.println(a+b+" =a+b"); //30=a+b
	    //System.out.println("a+b="+a-b); error occur string minus integer not possible
		System.out.println("a*b="+a*b);//a*b=200    (*) higher precedence
		

	}

}
