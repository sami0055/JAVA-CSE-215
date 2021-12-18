package String;

public class StringPractice {

	public static void main(String[] args) {
		String str1="Java Program";// pool area
		System.out.println(str1);
		String str2=new String("JAVA");// created in heap
		System.out.println(str2);
		
		char c[]= {'S','A','M','I'};
		String str3=new String(c);
		System.out.println(str3);
		
		byte b[]= {65,66,67,68};
		String str4=new String(b);
		System.out.println(str4);
		

	}

}
