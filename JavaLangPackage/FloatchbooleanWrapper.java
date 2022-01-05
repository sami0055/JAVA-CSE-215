package JavaLangPackage;

public class FloatchbooleanWrapper {

	public static void main(String[] args) {
	
		float a=12.3f;
		Float b=12.3f/0;
		Float c=(float) Math.sqrt(-1);
		//System.out.println(b.equals(a));
		System.out.println(b.isInfinite());
		//System.out.println(b==Float.POSITIVE_INFINITY);
        System.out.println(c.isNaN());
        //System.out.println(c!=Float.NaN);
        
        Character i='A';
        Boolean n;
        
        
	}

}
