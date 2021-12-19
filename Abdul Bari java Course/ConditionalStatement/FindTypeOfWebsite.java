package ConditionalStatement;
import java.util.*;
public class FindTypeOfWebsite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a URL: ");
	     String url=sc.nextLine();
	     String protocol=url.substring(0,url.indexOf(":"));
	     if(protocol.equals("http"))
	    	 System.out.println("Hyper text");
	     else if(protocol.equals("ftp"))
	    	 System.out.println("File transfer");
	     
	     String ext=url.substring(url.lastIndexOf(".")+1);
	     if(ext.equals("com"))
	    	 System.out.println("Comercial website");
	     else if(ext.equals("gov"))
	    	 System.out.println("Government web");
	     else if(ext.equals("org"))
	    	 System.out.println("Organisation");
   	}

}
