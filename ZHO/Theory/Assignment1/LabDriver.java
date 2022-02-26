package Assignment1;

public class LabDriver {

	public static void main(String[] args) {
		
		LabRoom L1=new LabRoom(20,30,30);
		LabRoom L2=new LabRoom(10,39,49);
		L1.addChairs(30);
		L1.addTable(34);
		L1.addComputers(56);
		System.out.println(L1.getChair());
		System.out.println(L1.getTable());
		System.out.println(L1.getComputers());

	}

}
