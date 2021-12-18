package String;

public class StrudentChallange3 {

	public static void main(String[] args) {
		//Removing special Character
		String str="#$JL$#1234";
		String a=str.replaceAll("[^a-zA-Z0-9]","");//remove special character
		String b=str.replaceAll("\\w", "");//remove all alphabet and digit
		System.out.println(a);
		System.out.println(b);
		
		//remove extra space from string
		String c="   sdd  d  ddd  d  ddd   ";
		String c1=c.replaceAll("\\s+","");
		System.out.println(c1);
		
		//find how many word 
		String name="     samiul alim    sami   ";
		name=name.replaceAll("\\s+", " ").trim();
	   String words[]=name.split("\\s+");
	   System.out.println(words.length);
	 
	   
		
	}

}
