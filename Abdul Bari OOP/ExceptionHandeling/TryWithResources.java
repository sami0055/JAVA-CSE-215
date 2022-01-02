package ExceptionHandeling;

import java.io.*;
import java.util.*;
public class TryWithResources {
    FileInputStream f1;
    //static Scanner sc;
    static void Divide() throws Exception {
    	
    	try (FileInputStream f=new FileInputStream("/Users/sm/Desktop/sm.txt"); Scanner sc=new Scanner(f)){
    	// sc=new Scanner(f);
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		int c=sc.nextInt();
    		System.out.println(a/b);
    	}
//    	finally {
//    		f.close();
//    		sc.close();
//    	}
		
    }
	public static void main(String[] args)  {
	
		try {
			Divide();
		} catch (Exception e) {
			
			System.out.println(e);
		}
     
	}

}
