package String;

public class Methods3 {

	public static void main(String[] args) {
		String s="Pyramid";
		String s1="pyramid";
		String s2=new String("Pyramid");
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s1==s);
		System.out.println(s2==s);//false
		System.out.println(s2.equals(s2));
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s));
		System.out.println(s2.compareToIgnoreCase(s));
		String c="The great wall of chaina";
		System.out.println(c.contains("The"));
		System.out.println(s.concat(s2));
	    
		
		
		
	}

}
