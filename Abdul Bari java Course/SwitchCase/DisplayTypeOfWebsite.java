package SwitchCase;
import java.util.*;
public class DisplayTypeOfWebsite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		 String ext=name.substring(name.lastIndexOf(".")+1);
		switch(ext) {
		case "com": System.out.println("Comercial");
		break;
		case "gov": System.out.println("Govt");
		break;
		case "org": System.out.println("Organisation");
		break;
		default: System.out.println("Invalid name");
		}
		
		
	}

}
