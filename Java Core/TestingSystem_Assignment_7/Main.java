package Assignment_Lesson_7;

import Assignment_Lesson_7.MyStack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==============================");
            System.out.println("     Stack Operations Menu    ");
            System.out.println("==============================");
            System.out.println("1. Delete items");
            System.out.println("2. Show number of items");
            System.out.println("3. Show min and max items");
            System.out.println("4. Find an item");
            System.out.println("5. Print all items");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter index needing to be deleted: ");
                    int index = scanner.nextInt();
                    myStack.deleteItem(index);
                    break;
                case 2:
                    myStack.showNumberOfItems();
                    break;
                case 3:
                    myStack.showMinItem();
                    myStack.showMaxItem();
                    break;
                case 4:
                    System.out.println("Enter a value needing to be found: ");
                    int value = scanner.nextInt();
                    myStack.findItem(value);
                    break;
                case 5:
                    myStack.printAllItems();
                    break;
                case 6:
                    myStack.exitProgram();
                default:
                    System.out.println("Invalid choice. Choose again!");
            }
        } while (choice <= 6);
        scanner.close();
    }
}