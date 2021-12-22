package Arrays;

import java.util.Scanner;

public class SrarchingAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
	    int [] A=new int[n];
	    for(int i=0; i<A.length; i++) {
	    	A[i]=sc.nextInt();
	    	
	    }
	    int key,index=-1;
	    System.out.println("Enter a number which you want to search: ");
	    key=sc.nextInt();
	    for(int i=0; i<A.length; i++) {
	    	if(key==A[i]) {
	    		index=i;
	    		break;
	    	}
	    }
	    if(index!=-1) {
	    	System.out.println("Element fount at "+index+" index");
	    }
	    else {
	    	System.out.println("Element not found");
	    }

	}

}
