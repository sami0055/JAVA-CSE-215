import java.util.*;
public class PrintName {
	public static void printMyname(String name)
	{
		System.out.println(name);
		return;
	}
 public static void main(String[] args)
 {    
	
	 Scanner input=new Scanner(System.in);
	 String name=input.nextLine();
	 printMyname(name);
	 input.close();
	 
 }
}
