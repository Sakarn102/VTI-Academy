package Exercise_2_2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private Gender gender;
	LocalDate birthDay;
	private String adress;
	
	public enum Gender {
		Male, Female, Other;
	}
	

	public Person() {
		
	}
	

	public Person(String name, Gender gender, LocalDate birthDay, String adress) {
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void inputInfo() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		
		System.out.println("Gender (1.Male - 2.Female - 3.Other): ");
		int select = sc.nextInt();
		switch (select) {
		case 1:
			this.gender = Gender.Male;
			break;
		case 2:
			this.gender = Gender.Female;
			break;
		case 3:
			this.gender = Gender.Other;
			break;
		default:
			break;
		}
		
		System.out.println("Birthday (yyyy-MM-dd): ");
		this.birthDay = LocalDate.parse(sc.next());
		
		sc.nextLine();
		
		System.out.println("Address: ");
		this.adress = sc.nextLine();
	}
	public String showInfo() {
		return 
				"Name: " + getName() + "\n" +
				"Gender: " + getGender() + "\n" + 
				"Birth Day: " + getBirthDay() + "\n" +
				"Address: " + getAdress();
	}
}

