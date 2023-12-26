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
import lop.HoaDonNhapXe;
import tienich.JdbcHelper;

public class HoaDonNhapDAO {
      public void insert(HoaDonNhapXe model) {
        String sql = "INSERT INTO HoaDonNhapXe (MaHDN,MaNCC,MaXe,MaNV,NgayNhap,SoLuong,GhiChu,Gia) values (?,?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaHDN(),model.getMaNCC(),model.getMaXe(),model.getMaNV(),model.getNgayNhap(),model.getSoLuong(),model.getGhiChu(),model.getGia());
    }

    public void update(HoaDonNhapXe model) {
        String sql = "UPDATE HoaDonNhapXe SET  MaNCC=?,MaXe=?,MaNV=?,NgayNhap=?, SoLuong=?,GhiChu=?,Gia=? WHERE MaHDN=?";
        JdbcHelper.executeUpdate(sql,  model.getMaNCC(),model.getMaXe(),model.getMaNV(),model.getNgayNhap(),model.getSoLuong(),model.getGhiChu(),model.getGia(),model.getMaHDN());
      

 
    }          public void delete(String MaHDN) {
        String sql = "DELETE FROM HoaDonNhapXe WHERE MaHDN=?";
        JdbcHelper.executeUpdate(sql, MaHDN);
    }

    public List<HoaDonNhapXe> select() {
        String sql = "SELECT * FROM HoaDonNhapXe";
        return select(sql);
    }

    public HoaDonNhapXe findById(String mahdn) {
        String sql = "SELECT * FROM HoaDonNhapXe WHERE MaHDN=?";
        List<HoaDonNhapXe> list = select(sql, mahdn);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<HoaDonNhapXe> select(String sql, Object... args) {
        List<HoaDonNhapXe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonNhapXe model = readFromResultSet(rs);
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

    private HoaDonNhapXe readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonNhapXe model = new HoaDonNhapXe();
        model.setMaHDN(rs.getString("MaHDN"));
        model.setMaNCC(rs.getString("MaNCC"));
        model.setMaXe(rs.getString("MaXe"));
        model.setMaNV(rs.getString("MaNV"));
        model.setNgayNhap(rs.getDate("NgayNhap"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setGia(rs.getDouble("Gia"));
        return model;
    }
}
