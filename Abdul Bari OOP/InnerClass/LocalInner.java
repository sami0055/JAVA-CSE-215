package InnerClass;


class Outer1{
	public void display() {
		class Inner{
			public void show() {
				System.out.println("Hello");
			}
		}
		
		Inner i=new Inner();
		i.show();
	}
	
	
}
public class LocalInner {

	public static void main(String[] args) {
	Outer1 o=new Outer1();
	o.display();

	}

}
