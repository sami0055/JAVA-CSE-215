package Metdods;
import java.util.*;
public class SumOfAllElements {
    static int sum(int ...A) {
    	int s=0;
    	for(int i=0; i<A.length; i++)
    	{
    		s=s+A[i];
    	}
    	return s;
    }
	public static void main(String[] args) {
		
	     System.out.println(sum(4,5,6,6,7,8));

	}

}
