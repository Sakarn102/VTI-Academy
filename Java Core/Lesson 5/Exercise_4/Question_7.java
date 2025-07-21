package Exercise_4;

import java.util.Scanner;

public class Question_7 {
	public static void Question_7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		String[] wrods = name.trim().split("\\s+");
		String ho = wrods[0];
		String ten = wrods[wrods.length - 1];
		
		String tenDem = "";
		for(int i = 1; i < wrods.length - 1; i++) {
			tenDem += wrods[i] + " ";
		}
		tenDem = tenDem.trim();
		
		System.out.println("Ho: " + ho.substring(0,1).toUpperCase() + ho.substring(1));
		System.out.println("Ten Dem: " + tenDem.substring(0,1).toUpperCase() + tenDem.substring(1));
		System.out.println("Ten: " + ten.substring(0,1).toUpperCase() + ten.substring(1));
	}
	public static void main(String[] args) {
		Question_7();
	}
}
