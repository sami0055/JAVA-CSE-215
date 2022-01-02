package MultiThreading;
class ThreadProperties extends Thread{
	public ThreadProperties(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		ThreadProperties t=new ThreadProperties("Thread1");
	
	System.out.println("ID "+t.getId());
	System.out.println("Name:"+t.getName());
	System.out.println("Priority: "+t.getPriority());
	System.out.println("State: "+t.getState());
	System.out.println("Alive: "+t.isAlive());

	}

}
