package Metdods;
import java.util.*;
public class ArrayMax {
     static int max(int a[]) {
    	 int m=a[0];
    	 for(int i=0; i<a.length; i++) {
    		 if(a[i]>m) {
    			 m=a[i];
    		 }
    	 }
    	 return m;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a[]=new int [5];
	    for(int i=0; i<a.length; i++) {
	    	a[i]=sc.nextInt();
	    }
	    
		int m=max(a);
		System.out.println(m);
    
	}

}
