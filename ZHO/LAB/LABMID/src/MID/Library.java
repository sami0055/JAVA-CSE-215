package MID;

import java.util.Arrays;

public class Library {
	
	private String libraryName;
	private String address;
	private Book[] bookList=new Book[4];
	private int numberOfBooks=0;
	
	public Library(String libraryName,String address)
	{
		this.libraryName=libraryName;
		this.address=address;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book[] getBookList() {
		return bookList;
	}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public void addBook(Book book)
	{
		bookList[numberOfBooks++]=book;
	}
	public void removeBook(Book book)
	{
		for(int i=0; i<numberOfBooks; i++)
		{
			if(bookList[i].equals(book))
			{
				for(int j=i; j<numberOfBooks-1; j++)
				{
					bookList[j]=bookList[j+1];
				}
				numberOfBooks--;
				break;
			}
			
		}
	}
	
	public void searchBook(Book book)
	{
		for(int i=0; i<numberOfBooks; i++)
		{
			if(bookList[i].equals(book)) {
				System.out.println(bookList[i].toString());
			}
		}
		
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", address=" + address + ", bookList="
				+ Arrays.toString(bookList) + ", numberOfBooks=" + numberOfBooks + "]";
	}
	

}
