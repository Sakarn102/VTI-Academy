package Exercise_4;

import java.util.Scanner;

public class Question_16 {
	public static void Question_16() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter name: ");
	        String name = scanner.nextLine();
	        System.out.println("Enter n: ");
	        int n = scanner.nextInt();
	        if(n <= 0 || name.length() % n != 0) {
	        	System.out.println("KO");
	        	return;
	        }
	        int numberOfParts = name.length() / n;
	        System.out.println("Chia duoc thanh " + numberOfParts + " phan");
	        for(int i=0; i<name.length(); i+=n) {
	        	String part = name.substring(i, i+n);
	        	System.out.println(part);
	        }
	}
	public static void main(String[] args) {
		Question_16();
	}
}
