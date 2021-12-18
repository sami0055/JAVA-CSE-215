package String;

public class StringMethos2 {

	public static void main(String[] args) {
		String str1="Mr. Shahrukh Khan";
		
	//	boolean b=str1.startsWith("Mr.");
		boolean b=str1.startsWith("Shah",4);
		System.out.println(b);
		boolean b1=str1.endsWith("Khan");
		System.out.println(b1);
		System.out.println(str1.charAt(4));
//		for(int i=0; i<str1.length(); i++) {
//			System.out.print(str1.charAt(i));
//			
//		}
		
		String u="www.udemy.co.in";
		System.out.println(u.indexOf(".",4));// after 4 find dot
		System.out.println(u.lastIndexOf(".",8));//before 8 find dot
	}

}
