package ExceptionHandeling;

public class ThrowAndThrows {
     
//     static void meth2(){
//    	 meth1();
//     }
//     static void meth3()  {
//    	 meth2();
//     }
     static int area(int l,int b) throws Exception {
    	 if(l<0 || b<0)
    		 throw new Exception();
    	 return l*b;
     }
     static void meth1() throws Exception {
    	 System.out.println(area(-5,5));
	
     }
	public static void main(String[] args) {
//		try {
//			meth3();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
	try {
		meth1();
	} catch (Exception e) {
		
		System.out.println(e);
	}

	}

}
