/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author DELL-PC
 */
import tienich.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

   public List<Object[]> getDoanhthu(int nam){
       List<Object[]> list = new ArrayList<>();
       try{
           ResultSet rs = null;
           try{
               String sql = "{call sp_doanhthu (?)}";
               rs=JdbcHelper.executeQuery(sql, nam);
               while(rs.next()){
                   Object[] row = {rs.getString("TenXe"),
                   rs.getInt("SoLuong"),
                   rs.getDouble("TongTien")
                   };
                   list.add(row);
               }
           }finally{
               rs.getStatement().getConnection().close();
           }
       }catch(Exception e){
           throw new RuntimeException(e);
       }
       return list;
   }


    public List<Object[]> getqlxe(int nam) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_qlxe (?)}";
                rs = JdbcHelper.executeQuery(sql, nam);
                while (rs.next()) {
                    Object[] model = {rs.getString("TenXe"),
                        rs.getInt("SoLuong"),rs.getInt("SoLuongNhap"),rs.getInt("tonkho")};
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

    public List<Object[]> getNhanVien(int thang) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_nhanvienban (?)}";
                rs = JdbcHelper.executeQuery(sql, thang);
                while (rs.next()) {
                    Object[] model = {rs.getString("Hoten"),rs.getString("MaNV"),
                        rs.getInt("SoLanBan"),rs.getInt("SoLuong"), rs.getDouble("DoanhThu")};
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
