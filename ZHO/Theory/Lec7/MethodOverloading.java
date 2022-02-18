package Lec7;

public class MethodOverloading {

	void test()
	{
		System.out.println("No perameters");
		
	}
	void test(int a)
	{
		System.out.println("A: "+a);
		
	}
	void test(int a,int b)
	{
		System.out.println("Int a "+a+"int b: "+b);
		
	}
	double test(double a)
	{
		System.out.println("Double a: "+a);
		return (a+20.0);
	}
}
