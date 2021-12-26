package Constructors;
class Parent1 {
	  Parent1(){
		  System.out.println("Parent constructor");
	  }
	}
	 class Child extends Parent1{
		 Child(){
			 System.out.println("Child constructor");
		 }
		
	}
	 class GrandChild extends Child{
		 GrandChild(){
			 System.out.println("Grand child");
		 }
		
	 }
public class Test {

	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
	}

}
