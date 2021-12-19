package ConditionalStatement;

public class ConditionalStatement {

	public static void main(String[] args) {
	 int a=4,b=6,c=8;
	 if(a>b && a>c) {
		 System.out.println("Max is A");
		 
	 }
	 else {
		 if(b>c)
			 System.out.println("Max is c");
		 else
		 {
			 System.out.println("Max is C");
			 
		 }
	 }
	

	}

}
