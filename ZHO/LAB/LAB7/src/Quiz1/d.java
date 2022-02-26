package Quiz1;

import java.util.Scanner;

public class d {

	static int isSubstring(
	        String s1, String s2)
	    {
	        int M = s1.length();
	        int N = s2.length();
	 
	      
	        for (int i = 0; i <= N - M; i++) {
	            int j;
	 
	            for (j = 0; j < M; j++)
	                if (s2.charAt(i + j)
	                    != s1.charAt(j))
	                    break;
	 
	            if (j == M)
	                return i;
	        }
	 
	        return -1;
	    }
	
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	
	        String s1 = sc.next();
	        String s2 = sc.next();
	 
	        int res = isSubstring(s2, s1);
	 
	        if (res == -1)
	            System.out.println("Loser");
	        else
	            System.out.println("Winner");
	    }
}
