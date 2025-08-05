package Assignment_1;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student("S01", "Nguyễn Văn A", 20, "Nam Định", "Đại học", 4, 210);
		System.out.println(st1);
		
        Teacher t1 = new Teacher("T01", "Cô Hoa", 35, "Hà Nội", 15000000, "Java"); 
        System.out.println(t1);
        
        st1.doHomeWork();
        t1.fixHomeWork();
        
        Club musicClub = new Club("Âm nhạc", "Đêm nhạc guitar");
        musicClub.organizeEvent();

        Stationery pen = new Stationery("Bút bi", 2);
        pen.use();

        Tuition tuition = new Tuition(st1, 5000000);
        tuition.pay();
	}
}
