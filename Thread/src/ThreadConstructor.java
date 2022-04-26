class MyThr extends Thread{
	public MyThr(String name){
		super(name);
	}
	public void run() {
		
		
		System.out.println("Thank u");
//		while(true) {
//			System.out.println("I am thread");
//		}
	}
		
}
public class ThreadConstructor {

	public static void main(String[] args) {
	MyThr t=new MyThr("Sami");
	MyThr t2=new MyThr("Mitu");
	t.start();
	t2.start();
	System.out.println("The id of thread t is "+t.getId());
	System.out.println("The id of thread t2 is "+t2.getId());
	System.out.println("The name of thread is "+t.getName());
	System.out.println("The name of thread is "+t2.getName());
	

	}

}
