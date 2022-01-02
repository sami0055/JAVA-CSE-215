package MultiThreading;
class MyThread extends Thread{
	public void run() {
		while(true) {
			int i=1; 
			System.out.println(i+" Hello");
			i++;
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		int i=1;
		while(true) {
			System.out.println(i+" World");
			i++;
		}

	}

}
