package Extra_Asignment_2;

import java.util.Random;

public class Exercise_1 {
	public static void main(String[] args) {
		String[] ho = {"Nguyen", "Tran", "Le", "Pham", "Hoang", "Dang", "Bui"};
        String[] tenDem = {"Van", "Thi", "Ngoc", "Duc", "Quoc", "Minh", "Hong"};
        String[] ten = {"An", "Binh", "Cuong", "Duy", "Linh", "Trang", "Hanh"};

        String[] fullNames = new String[10];
        String[] fullIds = new String[10];
        String[] fullDates = new String[10];
        
        Random random = new Random();
        int count = 0;
        
        while(count<10) {
        	String hoTen = ho[random.nextInt(ho.length)] + " " +
                   tenDem[random.nextInt(tenDem.length)] + " " +
                   ten[random.nextInt(ten.length)];
        	
        	// Kiểm tra tên trùng
        	boolean trungTen = false;
        	for(int i=0; i<count; i++) {
        		if (fullNames[i].equals(hoTen)) {
        			trungTen=true;
        			break;
        		}
        	}
        	if (trungTen) continue;
        	
        	// Tạo ID dạng SV + 7 số
        	String id;
        	boolean trungID;
        	do {
        		int number = 1000000 + random.nextInt(90000000);
        		id = "SV"+number;
        		
        		trungID = false;
        		for(int i=0; i<count; i++) {
        			if(fullIds[i].equals(id)) {
        				trungID = true;
        				break;
        			}
        		}
        	} while(trungID);
        	
        	String fullDate = null;
        	boolean trungNgay = false;
        	do {
        		int day = 1 + random.nextInt(31);
        		int month = 2 + random.nextInt(12);
        		int year = 1991;
        		
        		if ((month == 2 && day > 28) || day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                    continue;
                }
        		
        		fullDate = (day < 10 ? "0" + day : day) + "/" +
        					(month < 10 ? "0" + month : month) + "/" + year;
        		
        		trungNgay = false;
        		for(int i=0; i<count; i++) {
        			if(fullDates[i].equals(fullDate)) {
        				trungNgay = true;
            			break;
        			}
        			
        		}
        	}while (trungNgay);
        	
        	fullNames[count] = hoTen;
        	fullIds[count] = id;
        	fullDates[count] = fullDate;
        	count++;
        	
        }
        
        //In kết quả
        System.out.printf("%-30s | %-12s | %-12s\n", "Full Name", "ID", "Date");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-30s | %-12s | %-12s\n", fullNames[i], fullIds[i], fullDates[i]);
        }
	}
}
