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
import lop.qlxe;
import tienich.JdbcHelper;

public class XeDAO {

    public void insert(qlxe model) {
        String sql = "INSERT INTO qlxe (MaXe, MaNCC, TenXe,SoLuong,Gia,PhanLoai,GhiChu,Hinh) VALUES (?,?, ?, ?, ?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaXe(), model.getMaNCC(), model.getTenXe(), model.getSoLuong(),model.getGia(), model.getPhanLoai(), model.getGhiChu(), model.getHinh());
    }

    public void update(qlxe model) {
        String sql = "UPDATE qlxe SET  MaNCC=?,TenXe=?,SoLuong=?,Gia=?,PhanLoai=?,GhiChu=?, Hinh=? WHERE MaXe=?";
        JdbcHelper.executeUpdate(sql, model.getMaNCC(), model.getTenXe(), model.getSoLuong(),model.getGia(), model.getPhanLoai(), model.getGhiChu(), model.getHinh(), model.getMaXe());

    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM qlxe WHERE MaXe=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }

    public List<qlxe> select() {
        String sql = "SELECT * FROM qlxe";
        return select(sql);
    }

    public qlxe findById(String manv) {
        String sql = "SELECT * FROM qlxe WHERE MaXe=?";
        List<qlxe> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<qlxe> select(String sql, Object... args) {
        List<qlxe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    qlxe model = readFromResultSet(rs);
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

    private qlxe readFromResultSet(ResultSet rs) throws SQLException {
        qlxe model = new qlxe();
        model.setMaXe(rs.getString("MaXe"));
        model.setMaNCC(rs.getString("MaNCC"));
        model.setTenXe(rs.getString("TenXe"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setGia(rs.getDouble("Gia"));
        model.setPhanLoai(rs.getString("PhanLoai"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setHinh(rs.getString("Hinh"));
        return model;
    }
}
