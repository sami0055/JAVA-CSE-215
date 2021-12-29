package Abastraction;

abstract class Super{
	public Super() {
		System.out.println("Super constructor");
	}
	public void meth1() {
		System.out.println("Super meth1");
	}
	abstract public void meth2();
}
class Sub extends Super{
	public Sub() {
		System.out.println("Sub constructos");
	}
	@Override
	
	public void meth2() {
		System.out.println("Sub meth2");
	}
	
}

public class AbastractPractice {

	public static void main(String[] args) {
	//Reference of abstract class is possible but object of 
		// abstract class is not possible like Super s=new Super();
	  Super s=new Sub();
	  s.meth1();
	  s.meth2();
	  

	}

}
