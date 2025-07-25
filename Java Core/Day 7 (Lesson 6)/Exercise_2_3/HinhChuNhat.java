package Exercise_2_3;

public class HinhChuNhat {
	protected float a,b;
	
	
	public HinhChuNhat(float a, float b) {
		this.a = a;
		this.b = b;
	}
	
	public float tinhDienTich() {
		return a * b;
	}
	
	public float tinhChuVi() {
		return 2 * (a + b);
	}
}
