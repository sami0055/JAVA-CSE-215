package MID;

public class Driver {

	public static void main(String[] args) {
		Library lib=new Library("National Library","Dhaka");
		Book b1=new Book("x","Sami","Thriller",2021,500);
		Book b2=new Book("y","Samiul ALim","Fiction",2022,300);
		Book b3=new Book("z","Safayet Ullah","Science Fiction",2021,1000);
		Book b4=new Book("l","Mustafizur Rahman","Thriller",2020,400);
		
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		
		lib.removeBook(b3);
		lib.searchBook(b4);
		lib.searchBook(b2);

	}

}
