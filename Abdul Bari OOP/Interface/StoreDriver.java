package Interface;

public class StoreDriver {

	public static void main(String[] args) {
	Store s=new Store();
	Customer c1=new Customer("Samiul ALim");
	Customer c2=new Customer("Mitu Chowdhury");
	
	s.register(c1);
	s.register(c2);
	s.invitetoSale();

	}

}
