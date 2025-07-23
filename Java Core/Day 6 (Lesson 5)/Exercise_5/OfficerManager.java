package Exercise_5;

import Exercise_5.Officer.Gender;

public class OfficerManager {
	private Officer[] officers = new Officer[100];
	private int count = 0;
	
	public void addOfficer(Officer officer) {
		if(count < officers.length) {
			officers[count] = officer;
			count++;
			System.out.println("Add succesfully");
		} else {
			System.out.println("List full, can not add!");
		}
	}
	
	public void searchOfficer(String fullName) {
		boolean found = false;
		for(int i = 0; i < count; i++) {
			if(officers[i].getFullName().equalsIgnoreCase(fullName)) {
				System.out.println("Found: " + officers[i]);
				found = true;
			} else if(!found){
				System.out.println("Cannot find name in the oficer: " + fullName);
			}
		}
	}
	
	public void officerList() {
		if(count==0) {
			System.out.println("Empty list of officer");
		} else {
			for(int i = 0; i < count; i++) {
				System.out.println(officers[i]);
			}
		}
	}
	
	public void deleteOfficer(String fullName) {
		int found = 0;
		for(int i = 0; i < count; i++) {
			if(officers[i].getFullName().equalsIgnoreCase(fullName)) {
				for(int j = i; j < count - 1; j++) {
					officers[j] = officers[j + 1];
				}
				officers[count - 1] = null;
				count--;
				i--;
				found++;
			}
		}
		if(found > 0) {
			System.out.println("Deleted " + found + " officers named " + fullName);
		} else {
			System.out.println("Cannot find the officer named: " + fullName);
		}
	}
	
	public static void main(String[] args) {
		OfficerManager manager = new OfficerManager();
		
		Officer off1 = new Officer("Tuan Anh", 20, Gender.Nam, "Ha Noi");
		Officer off2 = new Officer("Name2", 15, Gender.Nam, "Ha Noi");
		Officer off3 = new Officer("Name3", 25, Gender.Nu, "Ha Noi");
		Officer off4 = new Officer("Name4", 25, Gender.Nu, "Ha Noi");

		manager.addOfficer(off1);
		manager.addOfficer(off2);
		manager.addOfficer(off3);
		manager.addOfficer(off4);
		
		manager.searchOfficer("Tuan Anh");
		
		manager.deleteOfficer("Name4");
		
		manager.officerList();

	}
}
