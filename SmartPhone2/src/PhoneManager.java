
public class PhoneManager {

	public static void main(String[] args) {
		TelePhone t1=new SmartTelephone();
		t1.disconnect();
		//t1.call(); generate error cause call method of smarttelephoen not telephone
          t1.ring();
	}

	
}
