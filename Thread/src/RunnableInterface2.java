class Thr  implements Runnable{
	String name;
	int i;
	public Thr(int i,String name)
	{
		
		this.name=name;
		this.i=i;
	
	}
	public void run() {
		System.out.println("Good evening");
	}
	}
public class RunnableInterface2 {

	public static void main(String[] args) {
		Thr t=new Thr(34,"Smaiul ALim");
		Thread gun=new Thread(t);
		gun.start();
		System.out.println(gun.getId());
		System.out.println(gun.getName());
		

	}

}
