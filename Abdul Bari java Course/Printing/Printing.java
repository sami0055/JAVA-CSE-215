package Printing;

public class Printing {

	public static void main(String[] args) {
		
		int x=10;
		float y=12.56f;
		char z='A';
		String s="Samiul Alim";
	System.out.printf("Hello %d %.2f %c %s",x,y,z,s);
	System.out.printf(" %2$s %1$d %1$d %1$d",x,s);
	System.out.println();
	int a=44;
	System.out.printf("%0+5d",a);//0005 space
	float f=12.45f;
	System.out.println();
	System.out.printf("%06.2f",f);
	String str="JAVA";
	System.out.println();
	System.out.printf("%-20s",str);//left aline
	}

}
