drop database if exists SuperMarket;
create database if not exists SuperMarket;
use SuperMarket;

CREATE TABLE KhachHang (
    MaKH INT PRIMARY KEY AUTO_INCREMENT,
    TenKH VARCHAR(100),
    SoDienThoai VARCHAR(20),
    DiaChi TEXT
);

CREATE TABLE TheThanhVien (
    MaThe INT PRIMARY KEY AUTO_INCREMENT,
    MaKH INT UNIQUE,
    NgayDangKy DATE,
    DiemTichLuy INT DEFAULT 0,
    FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH)
);

CREATE TABLE LoaiHangHoa (
    MaLoai INT PRIMARY KEY AUTO_INCREMENT,
    TenLoai VARCHAR(100)
);

CREATE TABLE SanPham (
    MaSP INT PRIMARY KEY AUTO_INCREMENT,
    TenSP VARCHAR(100),
    DonGia DECIMAL(10,2),
    MaLoai INT,
    FOREIGN KEY (MaLoai) REFERENCES LoaiHangHoa(MaLoai)
);

CREATE TABLE DonHang (
    MaDH INT PRIMARY KEY AUTO_INCREMENT,
    MaKH INT,
    NgayDatHang DATE,
    FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH)
);

CREATE TABLE ChiTietDonHang (
    MaDH INT,
    MaSP INT,
    SoLuong INT,
    PRIMARY KEY (MaDH, MaSP),
    FOREIGN KEY (MaDH) REFERENCES DonHang(MaDH),
    FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP)
);

/*
KhachHang ↔ DonHang: 1 - N

DonHang ↔ SanPham: N - N (qua ChiTietDonHang)

LoaiHangHoa ↔ SanPham: 1 - N

KhachHang ↔ TheThanhVien: 1 - 1 (tùy chọn)
*/
