package OverridingExample;
class Super{
	private void display() {
		System.out.println("Super display");
	}
	
	

}
class Sub extends Super{
	protected void display() {
		System.out.println("Sub display");
	}
	
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
