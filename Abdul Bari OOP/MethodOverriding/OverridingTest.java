package MethodOverriding;
class Super{
	public void display() {
		System.out.println("Super class display");
	}
}
class Sub extends Super{
	@Override
	public void display() {
		System.out.println("Sub class display");
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		Super sup=new Super();
		sup.display();
		Sub s=new Sub();
		s.display();
		Super sp=new Sub();
		sp.display();

	}

}
