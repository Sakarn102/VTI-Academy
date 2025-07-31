package com.vti.entity.Exercise3;

public class Group {
    private int id;
    private String groupName;
    Account[] accounts;

    public Group() {
        System.out.println("===== Create Group =====");
        id = ScannerUtils.inputInt("Enter id group: ");
        System.out.println("Enter group name: ");
        groupName = ScannerUtils.inputString();

        System.out.println("Do you want to add account to group? (yes/no)");
        String isAdd = ScannerUtils.inputString();

        if(isAdd.equalsIgnoreCase("yes")) {
            int numberOfAccounts = ScannerUtils.inputInt("How many accounts do you want to add?");
            accounts = new Account[numberOfAccounts];

            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Nhap thong tin Account thu " + (i + 1) + ": ");
                accounts[i] = new Account();
            }
        } else {
            accounts = null;
        }
    }

    public void showInfo() {
        System.out.println("Group id: " + id);
        System.out.println("Group name: " + groupName);
        if (accounts.length > 0 && accounts != null) {
            System.out.println("List Account");
            for (Account account : accounts) {
                account.showInfo();
            }
        } else {
            System.out.println("No empty!...");
        }
    }
}
