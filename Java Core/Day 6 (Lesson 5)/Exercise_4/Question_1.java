package Exercise_4;

public class Question_1 {
	public static class Student {
		private int propertyID;
		private String name;
		private String homeTown;
		private double score;
		
		public Student(String name, String homeTown) {
			this.name = name;
			this.homeTown = homeTown;
			this.score = 0;
		}

		public void setScore(double score) {
			this.score = score;
		}
		public void addScore(double scoreAdd) {
			this.score += scoreAdd;
		}
	}
		
		public static void print() {
			Student student = new Student("Tuan Anh", "Ha Noi");
			String rating = "";
			if(student.score < 4) {
				rating = "Weak";
			} else if(student.score > 4 && student.score < 6) {
				rating = "Average";
			} else if(student.score > 6 && student.score < 8) {
				rating = "Good";
			} else {
				rating = "Very Good";
			}
			
			System.out.println("Property ID:" + student.propertyID);
			System.out.println("Name: " + student.name);
			System.out.println("Home town: " + student.homeTown);
			System.out.println("Score: " + student.score);
			System.out.println("Rating: " + rating);
		}
		public static void main(String[] args) {
			print();
		}
}
