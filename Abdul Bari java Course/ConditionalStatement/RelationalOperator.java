package ConditionalStatement;

public class RelationalOperator {
  public static void main(String args[]) {
	  
	  int a=5,b=10,c=15;
	  System.out.println(a<b);
	  System.out.println(a<b || b>c);
	  if(a>0) {
		  System.out.println("Positive");
	  }
	  else {
		  System.out.println("Negative");
	  }
  }
}
