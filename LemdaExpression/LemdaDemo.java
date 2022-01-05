package LemdaExpression;
interface MyLambda{
	public void display();
}
public class LemdaDemo {

	public static void main(String[] args) {
	  MyLambda m=()->{
		  System.out.println("hello world");
		 
	  };
	  m.display();

	}

}
