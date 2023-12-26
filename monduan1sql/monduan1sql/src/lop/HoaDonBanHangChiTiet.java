/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

public class HoaDonBanHangChiTiet {
String MaHDCT;
String MaHD;
String MaXe;
String TenXe;

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public HoaDonBanHangChiTiet(String TenXe) {
        this.TenXe = TenXe;
    }
int SoLuong;
double Gia;
double Tong;

    public double getTong() {
        return Gia * SoLuong;
    }

    public void setTong(double Tong) {
        this.Tong = Tong;
    }

    public HoaDonBanHangChiTiet(double Tong) {
        this.Tong = Tong;
    }

    public HoaDonBanHangChiTiet() {
    }

    public HoaDonBanHangChiTiet(String MaHDCT, String MaHD, String MaXe, int SoLuong, double Gia) {
        this.MaHDCT = MaHDCT;
        this.MaHD = MaHD;
        this.MaXe = MaXe;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public String getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(String MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }


}
