package Lecture9;

public class ReturnObjectDriver {

	public static void main(String[] args) {
		
		ReturnObjects ob1=new ReturnObjects(2);
		ReturnObjects ob2;
		ob2=ob1.incrByTen();
		System.out.println("ob1.a: "+ob1.a);
		System.out.println("ob2.a: "+ob2.a);
		ob2=ob2.incrByTen();
		System.out.println("ob2.a: "+ob2.a);
	}

}
