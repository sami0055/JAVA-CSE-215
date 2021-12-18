package String;

public class StringMethos {

	public static void main(String[] args) {
	String str=new String("SamiulALim");
	int len=str.length();
	System.out.println(len);
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
	String s=new String("    Sami    ");
	s=s.trim();//space remove
	System.out.println(s);
	
	String sub=new String("samiulalim");
	String sum2=sub.substring(3);
	System.out.println(sum2);
	
	String sum3=sub.substring(3, 7);
	System.out.println(sum3);
	
	String sub4=sub.replace('i','M');
	System.out.println(sub4);
	}

}
