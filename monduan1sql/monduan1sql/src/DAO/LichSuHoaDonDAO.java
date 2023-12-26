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
import lop.LichSuHoaDon;
import lop.NhanVien;
import tienich.JdbcHelper;

public class LichSuHoaDonDAO {
public void insert (LichSuHoaDon model){
    String sql = "Insert into LichSu (MaHD,MaKH,MaNV,NgayBan,SoLuong,TongTien) values (?,?,?,?,?,?)";
    JdbcHelper.executeUpdate(sql, model.getMaHD(),model.getMaKH(),model.getMaNV(),model.getNgayBan(),model.getSoLuong(),model.getTongTien());
}
public void delete(String MaHD){
    String sql ="Delete from LichSu where MaHD = ?";
    JdbcHelper.executeUpdate(sql, MaHD);
}
public List<LichSuHoaDon> select() {
        String sql = "SELECT * FROM LichSu";
        return select(sql);
    }
    private List<LichSuHoaDon> select(String sql, Object... args) {
        List<LichSuHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    LichSuHoaDon model = readFromResultSet(rs);
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

    private LichSuHoaDon readFromResultSet(ResultSet rs) throws SQLException {
        LichSuHoaDon model = new LichSuHoaDon();
        model.setMaHD(rs.getString("MaHD"));
        model.setMaKH(rs.getString("MaKH"));
        model.setMaNV(rs.getString("MaNV"));
        model.setNgayBan(rs.getDate("NgayBan"));
       model.setSoLuong(rs.getInt("SoLuong"));
       model.setTongTien(rs.getDouble("TongTien"));
        return model;
    }
}
