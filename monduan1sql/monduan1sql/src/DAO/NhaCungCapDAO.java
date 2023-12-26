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
import lop.NhaCungCap;
import tienich.JdbcHelper;


public class NhaCungCapDAO {
    public void insert(NhaCungCap model) {
        String sql = "INSERT INTO NhaCungCap (MaNCC,TenNCC,DiaChi,SoDT,GhiChu,MaNV,Email) values (?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql,model.getMaNCC(),model.getTenNCC(),model.getDiaChi(),model.getSoDT(),model.getGhiChu(),model.getMaNV(),model.getEmail());
    }

    public void update(NhaCungCap model) {
        String sql = "UPDATE NhaCungCap SET  TenNCC=?,DiaChi=?,SoDT=?,GhiChu=?, MaNV=?,Email=? WHERE MaNCC=?";
        JdbcHelper.executeUpdate(sql,model.getTenNCC(),model.getDiaChi(),model.getSoDT(),model.getGhiChu(),model.getMaNV(),model.getEmail(), model.getMaNCC());
      

 
    }          public void delete(String MaNCC) {
        String sql = "DELETE FROM NhaCungCap WHERE MaNCC=?";
        JdbcHelper.executeUpdate(sql, MaNCC);
    }

    public List<NhaCungCap> select() {
        String sql = "SELECT * FROM NhaCungCap";
        return select(sql);
    }

    public NhaCungCap findById(String mancc) {
        String sql = "SELECT * FROM NhaCungCap WHERE MaNCC=?";
        List<NhaCungCap> list = select(sql, mancc);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NhaCungCap> select(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhaCungCap model = readFromResultSet(rs);
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

    private NhaCungCap readFromResultSet(ResultSet rs) throws SQLException {
        NhaCungCap model = new NhaCungCap();
        model.setMaNCC(rs.getString("MaNCC"));
        model.setTenNCC(rs.getString("TenNCC"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setSoDT(rs.getInt("SoDT"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setMaNV(rs.getString("MaNV"));
        model.setEmail(rs.getString("Email"));
        return model;
    }
}
