/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

import java.util.Date;

public class NhanVien {
String MaNV;
String HoTen;
String MatKhau;
boolean GioiTinh;
Date NgaySinh;
String DiaChi;
int SoDT;
boolean ChucVu;
String email;
int SoCCCD;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String HoTen, String MatKhau, boolean GioiTinh, Date NgaySinh, String DiaChi, int SoDT, boolean ChucVu, String email, int SoCMND) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.MatKhau = MatKhau;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
        this.ChucVu = ChucVu;
        this.email = email;
        this.SoCCCD = SoCCCD;
    }
    
    

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoDT() {
        return SoDT;
    }

    public void setSoDT(int SoDT) {
        this.SoDT = SoDT;
    }

    public boolean isChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSoCCCD() {
        return SoCCCD;
    }

    public void setSoCCCD(int SoCMND) {
        this.SoCCCD = SoCMND;
    }
  


}
