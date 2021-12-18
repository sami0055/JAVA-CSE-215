package String;

public class Methods4 {

	public static void main(String[] args) {
	String s="abcdkkff";
	System.out.println(s.matches(".*"));//anything
	String s1="abcdddddsd";
	System.out.println(s1.matches("[a-z]*"));
	String s3="abbbccccaaa";
	System.out.println(s3.matches("[abc]*"));//O or more
	System.out.println(s3.matches("[abc]+"));//1 or more times
	String s4="bca";//false for four latter
	System.out.println(s4.matches("[abc]{3}"));
	String s5="aaabb";
	System.out.println(s5.matches("[abc]{3,7}"));
	}

}
