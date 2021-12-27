package Interface;
interface Test{
	void meth1();
	void meth2();
}
class My implements Test{

	@Override
	public void meth1() {
		System.out.println("Meht1 of my class");
		
	}

	@Override
	public void meth2()  {
		System.out.println("Meht2 of my class");
		
	}
	public void meth3() {
		System.out.println("Meth3 of my class");
	}
	
}
public class InterfacdPractice {

	public static void main(String[] args) {
	Test t=new My();
	t.meth1();
	t.meth2();

	}

}
