package SingletonClass;

public class Driver {

	public static void main(String[] args) {
		CoffeMachine m1=CoffeMachine.getInstatnce();
		CoffeMachine m2=CoffeMachine.getInstatnce();
		CoffeMachine m3=CoffeMachine.getInstatnce();
		//all the object references are same
		System.out.println(m1+" "+m2+" "+m3);
		if(m1==m2 && m1==m3) {
			System.out.println("Same");
		}
	}

}
