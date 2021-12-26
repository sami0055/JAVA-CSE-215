package DymanicMethodDispatch;
class Super{
	public void meth1() {
		System.out.println("Super meth1");
	}
	public void meth2() {
		System.out.println("Super meth2");
	}
	
}
class Sub extends Super{
	public void meth2() {
		System.out.println("Sub meth2");
	}
	public void meth3() {
		System.out.println("Sub meth3");
	}
	
}
 class DynamicDispatch {

	public static void main(String[] args) {
		
		Super s1=new Super();
		s1.meth1();
		s1.meth2();
		Sub s2=new Sub();
		s2.meth1();// extended method
		s2.meth2();//override method
		s2.meth3();//own method
		Super s=new Sub();
		s.meth1();
		s.meth2();//overrided method will be called
     //   s.meth3(); not possible cause it's not a method og super class
	}

}
