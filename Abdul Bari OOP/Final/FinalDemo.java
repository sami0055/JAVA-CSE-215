package Final;
final class Test0{
	//Final class can't be extended
}
class Test {
	public final void Show() {
		System.out.println("Hello");
	}
}
class Test1 extends Test{
//	public void Show() {
//		can't override 
//	}
}
public class FinalDemo {
  static final double PI=3.1416;
  
  
	public static void main(String[] args) {
		//final float PI=(float) 3.1416;
	
		System.out.println(PI);
		

	}

}
