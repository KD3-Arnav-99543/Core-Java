package ak;

public class Book {
	//variables
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	//constructor
	public Book(String isbn,double price, String authorName,int quantity) {
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.quantity=quantity;
		
	}
	//Getters
	public int getQaunatity() {
		return quantity;
	}
	public double getPrice() {
		return price;
		
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getIsbn() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	

}
