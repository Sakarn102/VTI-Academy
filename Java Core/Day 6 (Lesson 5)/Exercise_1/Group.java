package Exercise_1;

import java.time.LocalDate;

public class Group {
	public int id;
    public String name;
    public Account creator;
    public LocalDate createDate;
    public Account[] accounts;
    
    public Group() {
		
	}

	public Group(int id, String name, Account creator, LocalDate createDate, Account[] accounts) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	public Group(int id, String name, Account creator, LocalDate createDate, String[] usernames) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = new Account[usernames.length];
		for(int  i = 0;  i < usernames.length; i++) {
			this.accounts[i] = new Account(0, usernames[i], null, null, null);
		}
	}
	
	public static void printA() {
		Group group1 = new Group();
		System.out.println("============Group A============");
		System.out.println("ID: " + group1.id);
		System.out.println("Name: " + group1.name);
		System.out.println("Creator: " + group1.creator);
		System.out.println("Create Date: " + group1.createDate);
		if(group1.accounts != null) {
			for (Account acc : group1.accounts) {
				System.out.println("Username: " + acc.id);
	            System.out.println("Full Name: " + acc.userName);
	            System.out.println("Position: " + acc.department.name);
	            System.out.println("Create Date: " + acc.createDate);
			}
		} else {
			
		}System.out.println("No accounts in this group.");
	}
	
	public static void printB() {
		Account creator = new Account();
		Account[] members = {
		            new Account(0, null, "member1", null, null),
		            new Account(0, null, "member2", null, null)
		};
		Group group2 = new Group(2, "Name2", creator, LocalDate.now(), members);
		System.out.println("============Group B============");
		System.out.println("ID: " + group2.id);
		System.out.println("Name: " + group2.name);
		System.out.println("Creator: " + group2.creator.firstName);
		System.out.println("Create Date: " + group2.createDate);
		System.out.println("List of Accounts in Group");
		if(group2.accounts != null) {
			for (Account account : group2.accounts) {
				System.out.println(account.userName);
			}
		} else {
			System.out.println("No members in group!");
		}
	}
	
	public static void printC() {
		String[] usernames = {"userA", "userB", "userC"};
		Group group3 = new Group(3, "Name3", null, LocalDate.now(), usernames);
		System.out.println("============Group C============");
		System.out.println("ID: " + group3.id);
		System.out.println("Name: " + group3.name);
		System.out.println("Create Date: " + group3.createDate);
		System.out.println("List of Accounts in Group");
		if(group3.accounts != null) {
			for (Account acc : group3.accounts) {
				System.out.println(acc.userName);
			}
		} else {
			System.out.println("No accounts");
		}
	}
	
	public static void main(String[] args) {
		printA();
		printB();
		printC();
	}
}
