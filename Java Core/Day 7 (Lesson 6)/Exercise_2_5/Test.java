package Exercise_2_5;

public class Test {
	public static void main(String[] args) {
		System.out.println("============ Classic Phone ============ ");
		DienThoaiCoDien dtcd = new DienThoaiCoDien();
		dtcd.Nghe();
		dtcd.Goi();
		dtcd.GuiTinNhan();
		dtcd.NhanTinNhan();
		dtcd.ngheRadio();
		dtcd.tanCongKeXau();
		
		System.out.println("============ Smart Phone ============ ");
		DienThoaiThongMinh dttm = new DienThoaiThongMinh();
		dttm.Nghe();
		dttm.Goi();
		dttm.GuiTinNhan();
		dttm.NhanTinNhan();
		dttm.SuDung3G();
		dttm.ChupHinh();
		dttm.tanCongKeXau();
	}
}
