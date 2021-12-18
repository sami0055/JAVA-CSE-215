package String;
public class RegularExpression {

	public static void main(String[] args) {
	
		String s="f";
		System.out.println(s.matches("."));//single character
		String s2="a";
		System.out.println(s2.matches("[abc]"));//range a,b,or c
		System.out.println(s.matches("^abc"));// except abc
		System.out.println(s.matches("[a-zA-Z0-9]"));//anything from a-z or 0-9 or A to Z
		String s3="a8";
		System.out.println(s3.matches("[a-z][0-9]")); //character form a to z and 0-9 must be there
		System.out.println(s.matches("a|b"));//either a or b
		System.out.println(s.matches("abx"));//all must be there exactly
		
		
		
		
		
	}

}
