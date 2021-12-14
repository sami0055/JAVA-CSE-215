import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Product p0=new ElectronicDevice("MObile",3445,"itel","One year");
		ClothingItem p1 = new ClothingItem("Houdie",1000,"acs");
		ElectronicDevice p2=new ElectronicDevice("Iphone",1200000,"IOS 13.3","LifeTime");
		  
		
		
		ArrayList<Product> product =new ArrayList<Product>();
		product.add(p0);
		product.add(p1);
		product.add(p2);
		
		for(int i=0; i<product.size(); i++) {
			if(product.get(i) instanceof ClothingItem) {
				System.out.println((ClothingItem)(product.get(i)));
			}
			else if(product.get(i) instanceof ElectronicDevice) {
				System.out.println((ElectronicDevice)(product.get(i)));
			}
		}
		System.out.println();
		p1.changePrice(20);
		p2.changePrice(10);
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}
   
}
