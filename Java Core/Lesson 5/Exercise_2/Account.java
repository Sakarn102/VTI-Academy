package Exercise_2;

import java.time.LocalDate;
import java.util.concurrent.ForkJoinPool;

public class Account {
	public String email;
	public String userName;
	public String fullName;
	LocalDate createDate;
	public Account(String email, String userName, String fullName, LocalDate createDate) {
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.createDate = createDate;
	}
	
	public static void Question_1() {
		Account accounts = new Account("Email 1", "User name 1", "Full Name 1", LocalDate.now());
		Account[] arr = {accounts};
		for(int i = 0; i < arr.length; i++) {
			System.out.println("============Question 1============");
			System.out.println("Email: " + arr[i].email);
			System.out.println("User Name: " + arr[i].userName);
			System.out.println("Full Name: " + arr[i].fullName);
			System.out.println("Create Date: " + arr[i].createDate);
		}
	}
	
	public static void main(String[] args) {
		Question_1();
	}
	
}
