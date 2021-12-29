package InnerClass;
class Outer{
	int x=10;
	Inner i=new Inner();
	
	class Inner{
		int y=20;
		public void innerDisplay() {
			System.out.println(x+" "+y);
		}
	}
	public void outerDisplay() {
		//Inner i=new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	
	}
}
public class NestedInner {

	public static void main(String[] args) {
		
//		Outer.Inner oi= new Outer().new Inner();
//		oi.innerDisplay();
	
		Outer o=new Outer();
		o.outerDisplay();
		
	}

}
