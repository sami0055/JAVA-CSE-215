import java.util.Scanner;

public class isPalindrome {

	static boolean palindrome(String s)
	{
		int i=0;
		int l=s.length()-1;
		boolean b=true;
		while(i<=l)
		{
			if(s.charAt(i)!=s.charAt(l))
			{
				b=false;
				break;
			}
			else
			{
				i++;
				l--;
			}
		}
		return b;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean b=palindrome(s);
		if(b)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
