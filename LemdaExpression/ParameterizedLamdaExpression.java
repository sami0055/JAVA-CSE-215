package LemdaExpression;

@FunctionalInterface
interface Mylemda{
	public void display(String str);
}
public class ParameterizedLamdaExpression {

	public static void main(String[] args) {
		 Mylemda m=(s)->{
			  System.out.println(s);
			 
		  };
		  m.display("Hello world");
	}

}
