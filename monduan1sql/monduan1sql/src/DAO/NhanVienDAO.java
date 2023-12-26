/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import lop.NhanVien;
import tienich.JdbcHelper;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL-PC
 */
public class NhanVienDAO {

    public void insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien (MaNV, HoTen, MatKhau, GioiTinh,NgaySinh,DiaChi,SoDT,ChucVu,Email,SoCCCD) VALUES (?, ?, ?, ?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaNV(),model.getHoTen(), model.getMatKhau(), model.isGioiTinh(),model.getNgaySinh(),model.getDiaChi(),model.getSoDT(), model.isChucVu(),model.getEmail(),model.getSoCCCD());
    }

    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET  HoTen=?,MatKhau=?,GioiTinh=?,NgaySinh=?,DiaChi=?,SoDT=?, ChucVu=?,Email=?,SoCCCD=? WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql,  model.getHoTen(), model.getMatKhau(),model.isGioiTinh(),model.getNgaySinh(),model.getDiaChi(),model.getSoDT(),model.isChucVu(),model.getEmail(),model.getSoCCCD(), model.getMaNV());
      

 
    }          public void delete(String MaNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }

    public List<NhanVien> select() {
        String sql = "SELECT * FROM NhanVien";
        return select(sql);
    }

    public NhanVien findById(String manv) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NhanVien> select(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
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

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setHoTen(rs.getString("HoTen"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setGioiTinh(rs.getBoolean("GioiTinh"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setSoDT(rs.getInt("SoDT"));
        model.setChucVu(rs.getBoolean("ChucVu"));
        model.setEmail(rs.getString("Email"));
        model.setSoCCCD(rs.getInt("SoCCCD"));
        return model;
    }
}
