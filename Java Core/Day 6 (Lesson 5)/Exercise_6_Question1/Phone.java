package Exercise_6_Question1;

public abstract class Phone {
	protected Contact[] contacts;
	protected int numberOfContact;
	protected final int maxNumber = 100;
	
	public Phone() {
		contacts = new Contact[maxNumber];
		numberOfContact = 0;
	}
	
	public abstract void insertContact(String name, String phone);
	public abstract void removeContact(String name);
	public abstract void updateContact(String name, String newPhone);
	public abstract void searchContact(String name);
}
