package Exercise_5;

public class Officer {
		private String fullName;
		private int age;
		Gender gender;
		private String address;
			
		public enum Gender {
		Nam, Nu, Khac;
		}

		public Officer(String fullName, int age, Gender gender, String address) {
			this.fullName = fullName;
			this.age = age;
			this.gender = gender;
			this.address = address;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Officer [name=" + fullName + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
		}
		
		
}
