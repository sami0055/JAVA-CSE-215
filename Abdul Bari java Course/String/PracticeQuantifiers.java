package String;

public class PracticeQuantifiers {

	public static void main(String[] args) {
	
		String s="Samiul@gmail.com";
		System.out.println(s.matches(".*gmail.*"));
		System.out.println(s.matches("\\w*@gmail(.*)"));
	}

}
