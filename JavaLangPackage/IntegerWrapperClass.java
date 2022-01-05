package JavaLangPackage;

public class IntegerWrapperClass {

	public static void main(String[] args) {
    
		int m1=12;
		Integer m2=m1;
		Integer m3=12;
		System.out.println(m2.equals(m3));
		Integer x=Integer.valueOf("123");
		Integer y=Integer.valueOf("A7", 16);
		System.out.println(y);
		Integer z=Integer.decode("0xA7");
		System.out.println(z);
		try {
			System.out.println(Integer.parseInt("12345"));
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println(Integer.reverseBytes(128));
		System.out.println(Integer.toBinaryString(45));
	}

}
