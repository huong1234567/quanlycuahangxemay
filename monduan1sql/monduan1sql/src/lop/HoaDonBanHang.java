/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

import java.util.Date;

/**
 *
 * @author HP
 */

public class HoaDonBanHang extends HoaDonBanHangChiTiet {
    String MaHD;
    String MaKH;
    String MaNV;
    Date NgayBan;
    int SoLuongTong;
    double GiaTong;
    

    public HoaDonBanHang() {
//        HoaDonBanHangChiTiet hd = new HoaDonBanHangChiTiet();
//        this.getSoLuongTong() = hd.getSoLuongTong();
    }
    

    public HoaDonBanHang(String MaHD, String MaKH,  String MaNV, Date NgayBan, int SoLuongTong, double GiaTong) {
        this.MaHD = MaHD;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.NgayBan = NgayBan;
        this.SoLuongTong = SoLuongTong;
        this.GiaTong = GiaTong;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

   

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(Date NgayBan) {
        this.NgayBan = NgayBan;
    }

    public int getSoLuongTong() {
        return SoLuongTong ;
    }

    public void setSoLuongTong(int SoLuongTong) {
        this.SoLuongTong = SoLuongTong;
    }

    public double getGiaTong() {
        return  (this.Gia * this.SoLuong);
    }

    public void setGiaTong(double GiaTong) {
        this.GiaTong = GiaTong;
    }
    
    
}
