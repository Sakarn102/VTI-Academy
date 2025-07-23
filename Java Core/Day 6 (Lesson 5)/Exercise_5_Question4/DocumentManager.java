package Exercise_5_Question4;

public class DocumentManager {
	protected Document[] documents;
	protected int numberOfDocument;
	protected final int maxNumber = 100;
	
	public DocumentManager() {
		documents = new Document[maxNumber];
		numberOfDocument = 0;
	}
	
	public void addDocument(Document document) {
		if(numberOfDocument < maxNumber) {
			documents[numberOfDocument] = document;
			numberOfDocument++;
			System.out.println("Add succesfully document!");
		} else {
			System.out.println("Don not document becasuse list max!");
		}
	}
	
	public void deleteDocument(String id) {
		int found = 0;
		for(int i = 0; i < numberOfDocument; i++) {
			if(documents[i].id.equalsIgnoreCase(id)) {
				for(int j = i; j < numberOfDocument - 1; j++) {
					documents[j] = documents[j + 1];
				}
				documents[numberOfDocument - 1] = null;
				numberOfDocument--;
				i--;
				found++;
			}
		}
		if(found > 0) {
			System.out.println("Delete document with id: " + id);
		} else {
			System.out.println("Cannot find the documnent with id: " + id);
		}
	}
	
	public void printDocument() {
		if(numberOfDocument==0) {
			System.out.println("Empty list of document");
		} else {
			for(int i = 0; i < numberOfDocument; i++) {
				System.out.println(documents[i]);
			}
		}
	}
	
	public void searchDocument(String type) {
		int found = 0;
		for(int i = 0; i < numberOfDocument; i++) {
			if(type.equalsIgnoreCase("Book") && documents[i] instanceof Book) {
				System.out.println(documents[i]);
				found++;
			}
			if(type.equalsIgnoreCase("Magazine") && documents[i] instanceof Magazine) {
				System.out.println(documents[i]);
				found++;
			}
			if(type.equalsIgnoreCase("Newspaper") && documents[i] instanceof Newspaper) {
				System.out.println(documents[i]);
				found++;
			}
		}
		if(found==0) {
			System.out.println("No document found with type: " + type);
		}
	}
	
	public static void main(String[] args) {
		DocumentManager manager = new DocumentManager();
		
		Document document1 = new Document("Document1", "NXB1", 200);
		Document document2 = new Document("Document2", "NXB2", 300);
		Document document3 = new Document("Document3", "NXB3", 500);
		Document document4 = new Document("Document4", "NXB3", 500);
		
		manager.addDocument(document1);
		manager.addDocument(document2);
		manager.addDocument(document3);
		manager.addDocument(document4);
		manager.addDocument(new Book("Document1", "NXB1", 200, "Tacgia Book", 250));
		
		manager.searchDocument("book");
		
		manager.printDocument();
	}
}
