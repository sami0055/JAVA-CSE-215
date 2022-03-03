package Lecture9;

public class TestDemo {

	public static void main(String[] args) {
		
		TestFirst f1=new TestFirst();
		TestSecond f2=new TestSecond(15);
		int p=f2.addObject(f1);
		System.out.println("Result: "+p);
	}

}
