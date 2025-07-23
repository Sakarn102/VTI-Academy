package Exercise_5_Question4;

public class Document {
	protected String id;
	protected String publisher;
	protected int numberOfProducts;
	
	public Document(String id, String publisher, int numberOfProducts) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.numberOfProducts = numberOfProducts;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", publisher=" + publisher + ", numberOfProducts=" + numberOfProducts + "]";
	}
	
	
}
