class MyThreadRunnable implements Runnable{
	public void run() {
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread"); 
	}
}
class MyThreadRunnable2 implements Runnable{
	public void run() {
		System.out.println("I am a Thread2");
		
		System.out.println("I am a Thread2");
		System.out.println("I am a Thread2");
		System.out.println("I am a Thread2");
		System.out.println("I am a Thread2");
		
	}
}
public class runnableinterface {

	public static void main(String[] args) {
	MyThreadRunnable bullet1=new MyThreadRunnable();
	Thread gun1=new Thread(bullet1);
	
	MyThreadRunnable2 bullet2=new MyThreadRunnable2();
	Thread gun2=new Thread(bullet2);
	gun1.start();
	 gun2.start();
	
	}

}
