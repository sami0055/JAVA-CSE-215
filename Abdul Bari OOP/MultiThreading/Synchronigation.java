package MultiThreading;
class MyData{
	public void disply(String str) {
		synchronized(this) {
			//critical section
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				
					System.out.println(e);
				}
			}
		}
		
	}
}
  class Thread1 extends Thread{
	MyData d;
	public Thread1(MyData d) {
		this.d=d;
	}
	public void run() {
		d.disply("Hello world");
	}
}
class Thread2 extends Thread{
	MyData d;
	public Thread2(MyData d) {
		this.d=d;
	}
	public void run() {
		d.disply("Welcome all");
	}
}
public class Synchronigation {

	public static void main(String[] args) {
	MyData data=new MyData();
	Thread1 t1=new Thread1(data);
	Thread2 t2=new Thread2(data);
     t1.start();
     t2.start();

	}

}
