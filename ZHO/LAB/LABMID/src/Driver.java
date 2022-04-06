
public class Driver {

	public static void main(String[] args) {
		
		PhoneBook book=new PhoneBook(5);
		System.out.println("isEmpty: "+book.isEmpty());
		book.addContact(new Contact("Samiul","018681216",true));
		book.addContact(new Contact("Sami","234",false));
		System.out.println("Size: "+book.getSize());
		book.addContact(new Contact("Robi","01867",true));
		book.addContact(new Contact("Mitu","01876",true));
		book.addContact(new Contact("Rakib","455",false));
		System.out.println("All Contact: ");
		book.viewAllContacts();
		System.out.println("Search: ");
		String p=book.searchContact("Sami");
		System.out.println(p);
		System.out.println("isFull: "+book.isFull());
		System.out.println("Emergency Contact: ");
		book.ViewEmergencyContacts();
		book.delete("Sami");
		System.out.println("After deleting sami: size: "+book.getSize());
		book.viewAllContacts();
		book.deleteAll();
		System.out.println("After delete all: "+book.getSize());
		book.viewAllContacts();
	}

}
