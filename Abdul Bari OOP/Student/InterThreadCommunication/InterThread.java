package InterThreadCommunication;
class MyData{
	int value;
	boolean flag=true;
  synchronized	public void set(int v) {
	  while(flag!=true)
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		value=v;
		flag=false;
		notify();
	}
  synchronized	public int get() {
	  while(flag!=false)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		int x=0;
		x=value;
		flag=true;
		notify();
		return x;
	}
}
class Producer extends Thread{
	MyData data;
	public Producer(MyData d) {
		data=d;
	}
	public void run() {
		int count=1;
		while(true) {
			data.set(count);
			System.out.println("Producer "+count);
			count++;
		}
	}
}
class Consumer extends Thread{
	MyData data;
	public Consumer(MyData d) {
		data=d;
	}
	int value;
	public void run() {
		
		while(true) {
			value=data.get();
			System.out.println("Consumer "+value);
		}
	}
}
public class InterThread {

	public static void main(String[] args) {
	  MyData data=new MyData();
	  Producer p=new Producer(data);
	  Consumer c=new Consumer(data);
	  p.start();
	  c.start();

	}

}
