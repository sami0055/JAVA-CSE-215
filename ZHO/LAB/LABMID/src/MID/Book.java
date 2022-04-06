package MID;

public class Book {
private String bookTitle;
private String authorName;
private String genre;
private int publishedYear;
private int totalPages;
public Book(String bookTitle, String authorName, String genre, int publishedYear, int totalPages) {
	
	this.bookTitle = bookTitle;
	this.authorName = authorName;
	this.genre = genre;
	this.publishedYear = publishedYear;
	this.totalPages = totalPages;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getPublishedYear() {
	return publishedYear;
}
public void setPublishedYear(int publishedYear) {
	this.publishedYear = publishedYear;
}
public int getTotalPages() {
	return totalPages;
}
public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}
@Override
public String toString() {
	return "Book [bookTitle=" + bookTitle + ", authorName=" + authorName + ", genre=" + genre + ", publishedYear="
			+ publishedYear + ", totalPages=" + totalPages + "]";
}



}
