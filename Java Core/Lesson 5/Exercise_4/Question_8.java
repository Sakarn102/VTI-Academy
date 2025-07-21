package Exercise_4;

public class Question_8 {
	public static void Question_8() {
		String[] groupNames = {"Java with VTI", "Cach qua mon gia va", "Hoc Java co kho khong"};
		System.out.println("Cac group co chua tu Java");
		for (String groupName : groupNames) {
			if(groupName.contains("Java")) {
				System.out.println(groupName);
			}
		}
	}
	public static void main(String[] args) {
		Question_8();
	}
	
}
