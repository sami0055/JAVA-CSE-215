package ExceptionHandeling;

public class FinallyDemo {
     static void meth1() throws Exception {
    	 try {
    		 throw new Exception();
    	 }
    	 finally {
    		 System.out.println("Final mgs");
    	 }
    	
    	 
     }
	public static void main(String[] args) {
		
		try {
			meth1();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
//		try {
//			  System.out.println(10/0);
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}	 
//	   finally {
//		   System.out.println("Final message");
//			 
//	   }
	    
	}

}
