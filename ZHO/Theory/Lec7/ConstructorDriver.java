package Lec7;

public class ConstructorDriver {

	public static void main(String[] args) {
	
		 ConstructorExample box1=new ConstructorExample(4,5,6);
		 ConstructorExample box2=new ConstructorExample(3,4,9);
	
		 double vol=box1.volume();
		 System.out.println(vol);
		 double vol1=box2.volume();
		  System.out.println(vol1);
		
		 

	}

}
