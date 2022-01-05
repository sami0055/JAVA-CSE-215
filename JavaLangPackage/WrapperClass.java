package JavaLangPackage;

public class WrapperClass {

	public static void main(String[] args) {
	
		Integer i=new Integer(10);
		Integer a=Integer.valueOf(10);
		System.out.println(a);
		Integer b=10;
		Byte c=15;
		Byte d=Byte.valueOf("15");
		Byte e=Byte.valueOf((byte) 5);
		Short f=Short.valueOf("123");
		Float g=12.3f;
		
		
		Double j=Double.valueOf(1234.5667);
		System.out.println(j);
		Character k=Character.valueOf('A');
		Boolean l=Boolean.valueOf("true");
		
		//unboxing
		Float h=Float.valueOf("123.4");
		float x=h.floatValue();
		float y=h;
		System.out.println(h);
		//boxing
		int m=10;
		//auto boxing
		Integer n=m;
		//Integer n=Integer.valueOf(m);
		//auto unboxing
		int p=n;
		System.out.println(p);
	}

}
