package com.vti.entity.Exercise5.Question1;

public class OfficerManager {
    private Officer[] officers = new Officer[100];
    private int count = 0;

    public void addOfficer(Officer officer) {
        if(count < officers.length) {
            officers[count] = officer;
            count++;
            System.out.println("Add succesfully");
        } else {
            System.out.println("List full, can not add!");
        }
    }

    public void searchOfficer(String fullName) {
        boolean found = false;
        for(int i = 0; i < count; i++) {
            if(officers[i].getFullName().equalsIgnoreCase(fullName)) {
                System.out.println("Found: " + officers[i]);
                found = true;
            } else if(!found){
                System.out.println("Cannot find name in the oficer: " + fullName);
            }
        }
    }

    public void officerList() {
        if(count==0) {
            System.out.println("Empty list of officer");
        } else {
            for(int i = 0; i < count; i++) {
                System.out.println(officers[i]);
            }
        }
    }

    public void deleteOfficer(String fullName) {
        int found = 0;
        for(int i = 0; i < count; i++) {
            if(officers[i].getFullName().equalsIgnoreCase(fullName)) {
                for(int j = i; j < count - 1; j++) {
                    officers[j] = officers[j + 1];
                }
                officers[count - 1] = null;
                count--;
                i--;
                found++;
            }
        }
        if(found > 0) {
            System.out.println("Deleted " + found + " officers named " + fullName);
        } else {
            System.out.println("Cannot find the officer named: " + fullName);
        }
    }
}
