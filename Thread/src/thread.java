class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("Thread 1 cooking running");
			System.out.println("Cooking..");
		}
	
	}
}
class MyThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Thread 2");
			System.out.println("Thread 2 running");
		}
	
	}
}
public class thread {
   
	public static void main(String[] args) {
       
          MyThread t=new MyThread();
          MyThread2 t2=new MyThread2();
          t.start();
          t2.start();
	}

}
