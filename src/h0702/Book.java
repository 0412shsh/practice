package h0702;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} //디폴트 생성자, 멤버변수에 값을 넣어줌
	
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName+" "+author); //책 정보를 알려주는 메서드 
	}
	
}
