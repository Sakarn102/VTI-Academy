package com.vti.entity.Exercise1;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) throws Exception {
        super();
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
