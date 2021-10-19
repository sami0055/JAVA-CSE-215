import java.util.*;
public class Strings {

	public static void main(String[] args) {
		//Strings are immutable
		//concatenation
		String first_Name="Samiul";
		String LastName="Alim";
		String FullName=first_Name+" "+LastName;
		System.out.println(FullName);
		//length
		System.out.println(FullName.length());
		//charAt
		//Character print
		for(int i=0; i<FullName.length(); i++)
		{
			System.out.println(FullName.charAt(i));
		}
		//compare
		//s1>s2=+ve valus
		//s1==s2=0
		//s1<s2=-ve value
		String name1="Tony";
		String name2="Tony2";
		if(name1.compareTo(name2)==0)	
			System.out.println("String are equal");	
		else
		System.out.println("Stri are not equal");
		
		String sentence="My Name is Tony";
		String name=sentence.substring(3);
		System.out.println(name);
	}

}
