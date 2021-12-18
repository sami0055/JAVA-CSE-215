package String;

public class RegularExpression2 {

	public static void main(String[] args) {
		String s="e";
		System.out.println(s.matches("\\w"));// alphabet or number
		String s1="7";
		System.out.println(s1.matches("\\d"));// \\d means use for digit
		String s2="a";
		System.out.println(s2.matches("\\D"));// \\D means not digit
		
		String s3="$";
		System.out.println(s3.matches("\\W"));//other than digit or alphabet
		String s4=" ";
		System.out.println(s4.matches("\\s"));//space
		String s5=" ";
		System.out.println(s5.matches("\\S"));//not a space
		
	}

}
