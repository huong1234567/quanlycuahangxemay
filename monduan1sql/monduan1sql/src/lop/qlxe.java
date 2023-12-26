/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;


public class qlxe {
String MaXe;
String MaNCC;
String TenXe;
int SoLuong;
String PhanLoai;
Double Gia;
String tinhtrang;

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

    public qlxe(Double Gia) {
        this.Gia = Gia;
    }
String GhiChu;
String Hinh;

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getTinhtrang() {
       if(SoLuong>0){
           return tinhtrang ="Còn";
       }else{
           return tinhtrang = "Hết";
       }
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public qlxe(String Hinh) {
        this.Hinh = Hinh;
    }

    public qlxe(String MaXe, String MaNCC, String TenXe, int SoLuong, String PhanLoai, String GhiChu) {
        this.MaXe = MaXe;
        this.MaNCC = MaNCC;
        this.TenXe = TenXe;
        this.SoLuong = SoLuong;
        this.PhanLoai = PhanLoai;
        this.GhiChu = GhiChu;
    }

    public qlxe() {
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public int getSoLuong() {
               
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String PhanLoai) {
        this.PhanLoai = PhanLoai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }


}
