package Quiz1;

import java.util.Scanner;


public class Quiz {

	static int isPresent(String s1,String s2)
	{
		int a=s1.length();
		int b=s2.length();
		for(int i=0; i<=a-b; i++)
		{
			for(int j=0; j<b; j++)
			{
				if(s1.charAt(i+j)!=s2.charAt(j))
					break;
				if(j==b)
					return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int r=isPresent(s1,s2);
	if(r==-1)
		System.out.println("LOSER");
		else {
			System.out.println("WINNER");
		}
	}

}
