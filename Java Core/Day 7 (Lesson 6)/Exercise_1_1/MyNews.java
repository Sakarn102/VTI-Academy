package Exercise_1_1;

import java.util.Scanner;

public class MyNews {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("============MENU============");
		System.out.println("1. Insert news");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
		System.out.println("Enter lệnh: ");
		int order = scanner.nextInt();
		New newView = new New();
		
		switch (order) {
		case 1: {
			creatObjectNew(scanner);
			break;
			
		}
		case 2: {
			newView.Display();
			break;
		}
		case 3: {
			newView.Caculate(null);
			newView.Display();
			break;
		}
		
		default:
			System.exit(0);
		}
		System.out.println(newView.toString());
	}
	
	private static New creatObjectNew(Scanner scanner) {
		System.out.println("Bat dau tao object!");
		
		System.out.println("Vui long nhap title: ");
		String title = scanner.nextLine();
		
		System.out.println("Vui long nhap PublishDate: ");
		String pubString = scanner.nextLine();
		
		System.out.println("Vui long nhap Author: ");
		String author = scanner.nextLine();
		
		System.out.println("Vui long nhap content: ");
		String content = scanner.nextLine();
		
		int[] rates = new int[3];
		for(int i = 0; i < rates.length; i++) {
			System.out.println("Vui long nhap danh gia so " + (i + 1));
			rates[i] = scanner.nextInt();
		}
		return new New(1, title, pubString, author, content, rates);
	}
}
