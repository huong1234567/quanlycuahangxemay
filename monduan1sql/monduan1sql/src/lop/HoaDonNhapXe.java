/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

import java.util.Date;


public class HoaDonNhapXe {
String MaHDN;
String MaNCC;
String MaXe;
String MaNV;
Date NgayNhap;
int SoLuong;
String GhiChu;
double Gia;

    public HoaDonNhapXe() {
    }

    public HoaDonNhapXe(String MaHDN, String MaNCC, String MaXe, String MaNV, Date NgayNhap, int SoLuong, String GhiChu, double Gia) {
        this.MaHDN = MaHDN;
        this.MaNCC = MaNCC;
        this.MaXe = MaXe;
        this.MaNV = MaNV;
        this.NgayNhap = NgayNhap;
        this.SoLuong = SoLuong;
        this.GhiChu = GhiChu;
        this.Gia = Gia;
    }

    public String getMaHDN() {
        return MaHDN;
    }

    public void setMaHDN(String MaHDN) {
        this.MaHDN = MaHDN;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }


}
