package String;

public class StudentChallange {

	public static void main(String[] args) {
		String str="Programmer@gmail.com";
		int i=str.indexOf("@");
		
		String username=str.substring(0,i);
		String domain=str.substring(i+1,str.length());
		int d=str.indexOf(".");
		String mail=str.substring(i,d);
		System.out.println("UserName: "+username);
		System.out.println("Domain: "+domain);
		
		System.out.println(domain.startsWith("gmail"));
		int j=domain.indexOf(".");
		String name=domain.substring(0,j);
		System.out.println(name.equals("gmail"));
		
	}

}
