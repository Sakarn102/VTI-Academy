package Exercise_5;

import java.util.Scanner;

import Testing_System.*;
import Testing_System.Position.PositionName;

public class Question_5 {
	public static Account createAccount(){
        Scanner scanner = new Scanner(System.in);
        Account ac = new Account();
        Position pos = new Position();

        System.out.println("Nhập ID: ");
        ac.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập email: ");
        ac.email = scanner.nextLine();

        System.out.println("Nhập full name: ");
        ac.fullName = scanner.nextLine();

        System.out.println("Nhập position (Chọn vị trí từ 1 đến 4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                pos.name = PositionName.Dev;
                break;
            case 2:
            	pos.name = PositionName.Test;
                break;
            case 3:
            	pos.name = PositionName.Scrum_Master;
                break;
            case 4:
            	pos.name = PositionName.PM;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return null;
        }
        ac.position = pos;
        return ac;
    }
	
    public static void main(String[] args) {
        Account newAcc = Question_5.createAccount();
        
        System.out.println("ID: " + newAcc.id);
        System.out.println("Email: " + newAcc.email);
        System.out.println("Full name: " + newAcc.fullName);
        System.out.println("Position: " + newAcc.position.name);
    }
}
