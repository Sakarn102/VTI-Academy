package Exercise_5_Question4;

public class Book extends Document {
	protected String author;
	protected int numberOfPages;
	
	public Book(String id, String publisher, int numberOfProducts, String author, int numberOfPages) {
		super(id, publisher, numberOfProducts);
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", numberOfPages=" + numberOfPages + "]";
	}
	
	
}
