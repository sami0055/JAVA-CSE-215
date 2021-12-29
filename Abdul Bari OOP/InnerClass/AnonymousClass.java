package InnerClass;
//it's also same for interface
abstract class My{
	abstract public void show();
}
class Outer2{
	public void display() {
		My m=new My() {
			public void show() {
				System.out.println("Hello");
			}
		};
		m.show();
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
	Outer2 o=new Outer2();
	o.display();

	}

}
