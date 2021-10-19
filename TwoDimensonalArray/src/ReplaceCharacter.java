import java.util.*;
public class ReplaceCharacter {
public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	String str=input.next();
	String result="";
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)=='e') {
			result+='i';
		}
		else
			result+=str.charAt(i);
	}
	System.out.println(result);
	input.close();
}
}
