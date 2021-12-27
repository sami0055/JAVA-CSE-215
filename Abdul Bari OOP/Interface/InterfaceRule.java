package Interface;
interface Rule
{
	final static int X=10;
	public abstract void meth1();
	void meth2();
	private void meth6() {
		System.out.println("Interfacr private method");
	}
	default void meth3() {
		meth6();
	}

//    default void meth5() {
//    	System.out.println("Default method");
//    }
}
interface Rule2 extends Rule{
	void meth4();
}
class Mine implements Rule2{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth4() {
		// TODO Auto-generated method stub
		
	}
	public void meth3() {
		
	}
	
}
public class InterfaceRule {

	public static void main(String[] args) {
		System.out.println(Rule.X);
		Mine m=new Mine();
		m.meth3();
	}

}
