package com.vti.entity.Exercise2.Question5;

public class DienThoaiCoDien extends DienThoaiDiDong implements IVuKhi{
    public void ngheRadio() {
        System.out.println("Nghe radio...");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println("Tan cong ke xau - dien thoai co dien");
    }
}
