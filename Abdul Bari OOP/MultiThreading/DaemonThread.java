package MultiThreading;
class Deamon extends Thread{
	public void run() {
		int count =1;
		while(true) {
			System.out.println(count++);
			
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		Deamon t=new Deamon();
		t.setDaemon(true);

		t.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		System.out.println(e);
		}
		Thread mainThread =Thread.currentThread();
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
	}

}
