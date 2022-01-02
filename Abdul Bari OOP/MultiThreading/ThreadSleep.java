package MultiThreading;
class Sleep extends Thread{
	public Sleep(String name) {
		super(name);
	}
	public void run() {
		int count =10;
		while(count<=100) {
			System.out.println("Hacking NSU RDS "+count+"%");
			count=count+10;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
			
		}
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		Sleep t=new Sleep("Thread2");
		t.start();
        t.interrupt();
	}

}
