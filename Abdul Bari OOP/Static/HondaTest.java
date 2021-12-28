package Static;

public class HondaTest {

	public static void main(String[] args) {
	HondaCity h1=new HondaCity();
	long price=(long) h1.onRoadPrice("Delhi");
	System.out.println(price);
	HondaCity h2=new HondaCity();
	
	System.out.println(h2.onRoadPrice("Mumbi"));

	}

}
