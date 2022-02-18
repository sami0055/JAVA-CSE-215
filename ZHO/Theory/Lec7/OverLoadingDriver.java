package Lec7;

public class OverLoadingDriver {

	public static void main(String[] args) {
		
		MethodOverloading ob=new MethodOverloading();
		
		double result;
		ob.test();
		ob.test(29, 49);
		result=ob.test(34.4);
		System.out.println(result);

	}

}
