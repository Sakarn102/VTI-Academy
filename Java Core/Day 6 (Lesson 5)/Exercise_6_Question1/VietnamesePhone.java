package Exercise_6_Question1;

public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		for(int i = 0; i < numberOfContact; i++) {
			if(contacts[i].name.equalsIgnoreCase(name)) {
				System.out.println("Existed Contact");
			}
		}
		if(numberOfContact < maxNumber) {
			contacts[numberOfContact] = new Contact(name, phone);
			System.out.println("Add succesfully");
			numberOfContact++;
		} else {
			System.out.println("Add fail");
		}
		
	}

	@Override
	public void removeContact(String name) {
		int found = 0;
		for(int i = 0; i < numberOfContact; i++) {
			if(contacts[i].name.equalsIgnoreCase(name)) {
				for(int j = i; j < numberOfContact - 1; j++) {
					contacts[j] = contacts[j + 1];
				}
				contacts[numberOfContact - 1] = null;
				numberOfContact--;
				i--;
				found++;
			}
		}
		if(found > 0) {
			System.out.println("remove contact name: " + name);
		} else {
			System.out.println("Cannot find contact name: " + name);
		}
		
	}

	@Override
	public void updateContact(String name, String newPhone) {
		 for(int i = 0; i < numberOfContact; i++) {
			 if(contacts[i].name.equalsIgnoreCase(name)) {
				 contacts[i].phone = newPhone;
			 } else {
				 System.out.println("Cannot find contact name: " + name);
			 }
		 }
		
	}

	@Override
	public void searchContact(String name) {
		int found = 0;
		for(int i = 0; i < numberOfContact; i++) {
			if(contacts[i].name.equalsIgnoreCase(name)) {
				System.out.println(contacts[i]);
			}
		}
		if(found==0) {
			System.out.println("Cannot find: " + name);
		}
	}

	
}
