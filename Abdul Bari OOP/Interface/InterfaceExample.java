package Interface;
class Phone{
	public void call() {
		System.out.println("Calling");
	}
	public void sms() {
		System.out.println("Sending sms");
	}
}

interface ICamera{
	void click();
	void record();
}
interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{

	
	public void videoCall() {
		System.out.println("Video..");
	}
	
	@Override
	public void play() {
	System.out.println("Playing music...");
		
	}

	@Override
	public void stop() {
	System.out.println("Stop");
		
	}

	@Override
	public void click() {
		System.out.println("Click");
		
	}

	@Override
	public void record() {
		 System.out.println("Recording....");
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
//		SmartPhone sp=new SmartPhone();
//		sp.call();
//		sp.click();
//		sp.play();
	
//		Phone p=new SmartPhone();
//		p.call();
//		p.sms();
		
		
//        ICamera ic=new SmartPhone();
//        ic.click();
      //  ic.record();
		
		IMusicPlayer im=new SmartPhone();
		im.play();
		im.stop();
	}

}
