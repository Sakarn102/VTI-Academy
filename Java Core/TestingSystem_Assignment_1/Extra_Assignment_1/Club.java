package Assignment_1;

public class Club {
	private String name;
    private String description;
    
	public Club(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void organizeEvent() {
		System.out.println("CLB " + name + " tổ chức sự kiện: " + description);
    }
    
}
