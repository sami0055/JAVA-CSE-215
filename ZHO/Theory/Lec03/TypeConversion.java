package Lec03;

public class TypeConversion {

	public static void main(String[] args) {
		
		char c='a';
		int a=c;
		double d=c;
		System.out.println(d);
		long l=c;
		float f=c;
	 //  short s=c; Error occure
		int p=10;
		f=p;
		d=p;
		//p=d; not possible integer can't contain double
		int t=0;
		//
	    float ft=4f;
	   // t= ft; Error occure integer can't contain float
	    

	}

}
