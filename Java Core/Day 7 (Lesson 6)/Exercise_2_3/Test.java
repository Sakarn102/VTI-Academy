package Exercise_2_3;

public class Test {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat(4, 5);
		System.out.println("Chu vi hinh chu nhat: " + hcn.tinhChuVi());
		System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());
		
		HinhVuong hv = new HinhVuong(4);
		System.out.println("Chu vi hình vuông: " + hv.tinhChuVi());
		System.out.println("Diện tích hình vuông: " + hv.tinhDienTich());
	}
}
