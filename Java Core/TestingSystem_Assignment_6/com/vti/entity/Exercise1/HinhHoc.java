package com.vti.entity.Exercise1;

public abstract class HinhHoc{
    private static int count = 0;

    public HinhHoc() throws Exception{
        if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new Exception("So luong hinh toi da la " + Configs.SO_LUONG_HINH_TOI_DA + " nen khong the tao them Objects");
        }
        count++;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
