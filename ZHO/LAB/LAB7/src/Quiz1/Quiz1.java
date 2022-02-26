package Quiz1;

import java.util.Scanner;



public class Quiz1 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	int count=0;
	for(int i=0; i<s1.length(); i++)	
	{
		for(int j=0; j<s2.length(); j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				
				if(count==s2.length()|| s1.charAt(i)!=s2.charAt(j))
					break;
				count++;
			}
		}
	}
	if(count==s2.length())
	{
		System.out.println("WINNER");
	}
	else {
		System.out.println("LOSER");
	}

	}

}
