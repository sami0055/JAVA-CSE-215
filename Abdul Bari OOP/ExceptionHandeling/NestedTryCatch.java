package ExceptionHandeling;

public class NestedTryCatch {
   public static void main(String args[]) {
	   int a[]= {30,0,55,66,0};
	   try {
		   int c=a[0]/a[2];
		   System.out.println("Division is "+c);
		   try {
			   System.out.println(a[7]);
		   }
		   catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("Index is invalid");
		   }
		  
	   }catch(ArithmeticException e) {
		   System.out.println("Denominator should not be 0");
	   }
	   
	   System.out.println("bye");
   }
}
