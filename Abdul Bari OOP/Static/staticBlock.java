package Static;
class My{
	static {
		System.out.println("Block3");
		
	}
	static {
		System.out.println("Block4");
	}
}
public class staticBlock {
	static int s;
	static {
		System.out.println("Block1");
		s=10;
	}
	static {
		System.out.println("Block2");
		s=33;
	}
	public static void main(String[] args) {
		
	  System.out.println("Main");
	  My m=new My();

	}

}
