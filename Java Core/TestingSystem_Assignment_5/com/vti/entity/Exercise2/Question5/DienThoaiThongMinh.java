package com.vti.entity.Exercise2.Question5;

public class DienThoaiThongMinh extends DienThoaiDiDong implements IVuKhi{
    public void SuDung3G() {
        System.out.println("Su dung 3g");
    }
    public void ChupHinh() {
        System.out.println("Chụp hình");
    }
    @Override
    public void tanCongKeXau() {
        System.out.println("Tan cong ke xau - dien thoai thong minh");
    }
}
