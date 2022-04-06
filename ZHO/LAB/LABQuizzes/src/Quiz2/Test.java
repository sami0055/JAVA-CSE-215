package Quiz2;


public class Test {
	public static void main (String[] args) {
		PoundOunces p1 = new PoundOunces (10, 13);
		PoundOunces p2 = new PoundOunces (11, 14);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("Check Compare --> " + p1.toComapre(p2));
		System.out.println();
		
		
		PoundOunces p3 = new PoundOunces (10, 14);
		PoundOunces p4 = new PoundOunces (10, 14);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println("Check Compare --> " + p3.toComapre(p4));
		System.out.println();
		
		
		PoundOunces newAdd = p3.add(p4);
		System.out.println(newAdd.toString());
	}
}

