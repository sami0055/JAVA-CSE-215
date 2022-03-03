package Lecture9;

public class PassObject {

	public static void main(String[] args) {
	
		Test o1=new Test(10,20);
		Test o2=new Test(10,20);
		Test o3=new Test(-1,-1);
		
		System.out.println("ob1==ob2: "+o1.equals(o2));
		System.out.println("o1==o3: "+o1.equals(o3));
		
	}

}
