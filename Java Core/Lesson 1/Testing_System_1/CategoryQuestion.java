package Testing_System;

public class CategoryQuestion {
	private int categoryID;
	private String categoryName;

	public CategoryQuestion(int categoryID, String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return 
				"CategoryID: " + categoryID + "\n"
				+"CategoryName: " + categoryName + "\n";
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	
}
