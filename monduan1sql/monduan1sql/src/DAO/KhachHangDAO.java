/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lop.KhachHang;
import tienich.JdbcHelper;

/**
 *
 * @author HP
 */
public class KhachHangDAO {
     public void insert(KhachHang model) {
        String sql = "INSERT INTO KhachHang (MaKH,HoTen,GioiTinh,DiaChi,SoDT,MaNV,Email,ThoiGian) values (?,?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaKH(),model.getHoTen(),model.isGioiTinh(),model.getDiaChi(),model.getSoDT(),model.getMaNV(),model.getEmail(),model.getThoiGian());
    }

    public void update(KhachHang model) {
        String sql = "update KhachHang set HoTen=?,GioiTinh=?,DiaChi=?,SoDT=?,MaNV=?,Email=?,ThoiGian=? where MaKH = ?";
      JdbcHelper.executeUpdate(sql, model.getHoTen(),model.isGioiTinh(),model.getDiaChi(),model.getSoDT(),model.getMaNV(),model.getEmail(),model.getThoiGian(),model.getMaKH());

 
    }          public void delete(String MaKH) {
        String sql = "DELETE FROM KhachHang WHERE MaKH=?";
        JdbcHelper.executeUpdate(sql, MaKH);
    }

    public List<KhachHang> select() {
        String sql = "SELECT * FROM KhachHang";
        return select(sql);
    }

    public KhachHang findById(String makh) {
        String sql = "SELECT * FROM KhachHang WHERE MaKH=?";
        List<KhachHang> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<KhachHang> select(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private KhachHang readFromResultSet(ResultSet rs) throws SQLException {
        KhachHang model = new KhachHang();
        model.setMaKH(rs.getString("MaKH"));
        model.setHoTen(rs.getString("HoTen"));
        model.setGioiTinh(rs.getBoolean("GioiTinh"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setSoDT(rs.getInt("SoDT"));
        model.setMaNV(rs.getString("MaNV"));
        model.setEmail(rs.getString("Email"));
        model.setThoiGian(rs.getDate("ThoiGian"));
        return model;
    }
}
