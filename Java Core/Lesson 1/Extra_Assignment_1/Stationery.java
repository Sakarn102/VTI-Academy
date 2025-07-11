package Assignment_1;

public class Stationery {
	 private String itemName;
	 private int quantity;
	 
	 public Stationery(String itemName, int quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
	 }
	 
	 public void use() {
		System.out.println("Sử dụng " + quantity + " " + itemName);
	 }
	 
}
