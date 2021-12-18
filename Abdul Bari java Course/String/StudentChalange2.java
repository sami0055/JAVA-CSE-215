package String;

public class StudentChalange2 {

	public static void main(String[] args) {
	int b=10110001;
	String s=String.valueOf(b);
	System.out.println(s.matches("[01]+"));
    //Check for hexa num
	String str="234AB";
	System.out.println(str.matches("[0-9A-F]+"));
	
	String d="01/12/2000";
	System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
	}

}
