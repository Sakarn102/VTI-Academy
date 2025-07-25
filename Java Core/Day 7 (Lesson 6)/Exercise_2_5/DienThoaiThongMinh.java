package Exercise_2_5;

public class DienThoaiThongMinh extends DienThoaiDiDong implements IVuKhi{

	void SuDung3G() {
		System.out.println("Su dung 3g");
	}
	void ChupHinh() {
		System.out.println("Chụp hình");
	}
	@Override
	public void tanCongKeXau() {
		System.out.println("Tan cong ke xau - dien thoai thong minh");
	}

}
