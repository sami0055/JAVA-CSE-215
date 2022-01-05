package JavaLangPackage;

public class MathClass {

	public static void main(String[] args) {
	System.out.println("Absolute: ");
	System.out.println(Math.abs(-124));
	System.out.println("Absolute: ");
	System.out.println(StrictMath.abs(-34));
	
	System.out.println("Cube Root: "+Math.cbrt(27));
	System.out.println("Exact Decrement: "+Math.decrementExact(8));
	
	System.out.print("Convert to radians: ");
	System.out.println(Math.toRadians(45));
	
     System.out.println("Exponent: "+Math.getExponent(10));
     System.out.println("FloorDiv "+Math.floorDiv(40,8));
     
     System.out.println("e power x: "+Math.exp(4));
     System.out.println(StrictMath.exp(4));
     System.out.println("Log base 10: "+Math.log10(100));
     System.out.println("Max: "+Math.max(4, 5));
     System.out.println("MIn: "+Math.min(5,0));
     System.out.println("Convert to degree: "+Math.toDegrees(Math.atan(1)));
     System.out.println("Random: "+Math.random()*10);
     
	}

}
