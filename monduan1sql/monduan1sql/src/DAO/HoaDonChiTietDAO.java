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
import lop.HoaDonBanHangChiTiet;
import tienich.JdbcHelper;


public class HoaDonChiTietDAO {
      public void insert(HoaDonBanHangChiTiet model) {
        String sql = "INSERT INTO HoaDonBanHangChiTiet (MaHDCT,MaHD,MaXe,SoLuong) values (?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaHDCT(),model.getMaHD(),model.getMaXe(),model.getSoLuong());
    }

    public void update(HoaDonBanHangChiTiet model) {
        String sql = "UPDATE HoaDonBanHangChiTiet SET  MaHD=?,MaXe=?, SoLuong=? WHERE MaHDCT=?";
        JdbcHelper.executeUpdate(sql,  model.getMaHD(),model.getMaXe(),model.getSoLuong(),model.getGia(),model.getMaHDCT());
      

 
    }          public void delete(String MaHD) {
        String sql = "DELETE FROM HoaDonBanHangChiTiet WHERE MaHD=?";
        JdbcHelper.executeUpdate(sql, MaHD);
    }

    public List<HoaDonBanHangChiTiet> select(String mahd) {
        
         List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
               String sql = "select ct.MaHDCT,ct.MaHD,ct.MaXe,ct.SoLuong, qlxe.Gia,(qlxe.SoLuong*qlxe.Gia)  Tong\n" +
"from HoaDonBanHangChiTiet ct inner join qlxe on qlxe.MaXe = ct.MaXe where MaHD=?";
                rs = JdbcHelper.executeQuery(sql, mahd);
                while (rs.next()) {
                    Object[] model = {rs.getString("MaHDCT"),
                        rs.getString("MaHD"), 
                        rs.getString("MaXe"), 
                        rs.getString("SoLuong"),
                        rs.getString("Gia"),
                        rs.getString("Tong")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
          return null;
    }
    

    public HoaDonBanHangChiTiet findById(String mahdct) {
        String sql = "SELECT * FROM HoaDonBanHangChiTiet WHERE MaHDCT=?";
        List<HoaDonBanHangChiTiet> list = select(sql, mahdct);
        return list.size() > 0 ? list.get(0) : null;
    }
    

    private List<HoaDonBanHangChiTiet> select(String sql, Object... args) {
        List<HoaDonBanHangChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonBanHangChiTiet model = readFromResultSet(rs);
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

    private HoaDonBanHangChiTiet readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonBanHangChiTiet model = new HoaDonBanHangChiTiet();
        model.setMaHDCT(rs.getString("MaHDCT"));
        model.setMaHD(rs.getString("MaHD"));
        model.setMaXe(rs.getString("MaXe"));
        model.setSoLuong(rs.getInt("SoLuong"));
        //model.setGia(rs.getDouble("Gia"));
        return model;
    }
  

public List<Object[]> getloadHD() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_hoadonchitiet}";
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {rs.getString("MaHDCT"), rs.getString("MaHD"),rs.getString("MaXe"), rs.getInt("SoLuong"),rs.getDouble("Gia"),rs.getDouble("Tong")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw new RuntimeException(ex);
        }
        return list;
    }


      public List<Object[]> getHDCT(String mahd) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "select ct.MaHDCT as MaHDCT,\n" +
"ct.MaHD as MaHD,\n" +
"ct.MaXe as MaXe,\n" +
"ct.SoLuong as SoLuong,\n" +
" qlxe.Gia as Gia,\n" +
"(ct.SoLuong*qlxe.Gia) as Tong\n" +
"from HoaDonBanHangChiTiet ct inner join qlxe on qlxe.MaXe = ct.MaXe where MaHD=?";
                rs = JdbcHelper.executeQuery(sql, mahd);
                while (rs.next()) {
                    Object[] model = {rs.getString("MaHDCT"),
                        rs.getString("MaHD"), 
                        rs.getString("MaXe"), 
                        rs.getString("SoLuong"),
                        rs.getString("Gia"),
                        rs.getString("Tong")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

