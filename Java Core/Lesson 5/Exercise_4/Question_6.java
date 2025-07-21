package Exercise_4;

import java.util.Scanner;

public class Question_6 {
	public static void Question_6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		String[] words = name.trim().split("\\s+");
		String ho = words[0];
		String ten = words[words.length-1];
		 String tenDem = "";
	        for (int i = 1; i < words.length - 1; i++) {
	            tenDem += words[i] + " ";
	        }
	        tenDem = tenDem.trim(); 
	        System.out.println("Họ là: " + ho);
	        System.out.println("Tên đệm là: " + tenDem);
	        System.out.println("Tên là: " + ten);
	}	
	public static void main(String[] args) {
		Question_6();
	}
}
