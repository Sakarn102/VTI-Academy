package Assignment_1;

public class Tuition {
	 private Student student;
	 private double amount;
	 
	 public Tuition(Student student, double amount) {
		this.student = student;
		this.amount = amount;
	 }
	 
	 public void pay() {
		 System.out.println("Sinh viên " + student + " đã đóng học phí: " + amount + " VND");
	 }
}
