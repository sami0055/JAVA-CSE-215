interface Camera{
	void takeSnap();
	void recordVideo();
	private void greet() {
		System.out.println("Good morning");
	}
	default void record4kVideo() {
		greet();
		System.out.println("Recording 4k video....");
	}

}
interface wifi{
	String[] getNetwork();
	void connectToNetwork(String network);
	
}
abstract class Myphone{
	void callNumber(int phoneNumber) {
	System.out.println("calling"+phoneNumber);
	}
	void pickcall() {
		System.out.println("Connecting....");
	}
	void takeSnap() {
		System.out.println("Taking snap");
	}
}
class Mysmartphone extends Myphone implements wifi,Camera{
	
//	public void record4kVideo() {
//		System.out.println("Recording 4k vidoe....");
//	}
	
	public void takeSnap() {
		System.out.println("Taking snap...");
	}
	public void recordVideo() {
		System.out.println("Recording vedio...");
		
	}
	public String[] getNetwork()
	{
		System.out.println("Getting list of network...");
		String [] networkList= {"Harry","Tplink","Sami"};
		return networkList;
	}
	public void connectToNetwork(String network) {
		System.out.println("Connecting to "+network);
	}
	
	
}
public class Phone {

	public static void main(String[] args) {
		Mysmartphone sm=new Mysmartphone();
		sm.record4kVideo();
	//	sm.greet(); theow error
		String ar[]=sm.getNetwork();
		for(String item:ar) {
			System.out.println(item+" ");
		}
		

	}

}
