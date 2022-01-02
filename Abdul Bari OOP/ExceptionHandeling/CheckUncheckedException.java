package ExceptionHandeling;
import java.io.*;

class LowBalanceException extends Exception{
	public String toString() {
		return "Balance should not be less than 5000 rupe";
	}
}

public class CheckUncheckedException {
    static void fun1()  {
    	//FileInputStream f1=new FileInputStream("My.txt");
    	try {
    		throw new LowBalanceException();
    	}catch(LowBalanceException e) {
    		System.out.println(e);
    	}
//    	try {
//    		System.out.println(10/0);
//    	}
//    	catch(Exception e) {
//    		System.out.println(e.getMessage());
//    		
//    	 
//    	}
    	
    }
    static void fun2() {
    	fun1();
    }
    static void fun3() {
    	fun2();
    }
	public static void main(String[] args) {
	fun3();

	}

}
