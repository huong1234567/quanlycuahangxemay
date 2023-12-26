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
import lop.HoaDonBanHang;
import tienich.JdbcHelper;

public class HoaDonBanHangDAO {
     public void insert(HoaDonBanHang model) {
        String sql = "INSERT INTO HoaDonBanHang (MaHD,MaKH,MaNV,NgayBan) values (?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaHD(),model.getMaKH(),model.getMaNV(),model.getNgayBan());
    }

    public void update(HoaDonBanHang model) {
        String sql = "UPDATE HoaDonBanHang SET  MaKH=?,MaNV=?,NgayBan=? WHERE MaHD=?";
        JdbcHelper.executeUpdate(sql,  model.getMaKH(),model.getMaNV(),model.getNgayBan(),model.getMaHD());
      

 
    }          public void delete(String MaHD) {
        String sql = "DELETE FROM HoaDonBanHang WHERE MaHD=?";
        JdbcHelper.executeUpdate(sql, MaHD);
    }

//    public List<HoaDonBanHang> select() {
//        String sql = "select bh.MaHD, MaKH,MaNV,NgayBan,sum(SoLuong),SUM(Gia*SoLuong)\n" +
//"  from HoaDonBanHang bh inner join HoaDonBanHangChiTiet ct \n" +
//"  on bh.MaHD = ct.MaHD group by bh.MaHD, MaKH,MaNV,NgayBan";
//        return select(sql);
//    }
    public List<HoaDonBanHang> select(){
        String sql ="select hd.MaHD, MaKH,MaNV,NgayBan,sum(ct.SoLuong) SoLuong,\n" +
" SUM(qlxe.Gia * ct.SoLuong) TongTien\n" +
" from HoaDonBanHang hd inner join HoaDonBanHangChiTiet ct on \n" +
" hd.MaHD=ct.MaHD inner join qlxe on qlxe.MaXe = ct.MaXe\n" +
" group by hd.MaHD, MaKH,MaNV,NgayBan ";
        return select(sql);
    }
     
    public List<HoaDonBanHang> select1(){
        String sql ="select * from HoaDonBanHang";
        return select(sql);
    }
//     private List<HoaDonBanHang> select1(String sql, Object... args) {
//        List<HoaDonBanHang> list = new ArrayList<>();
//        try {
//            ResultSet rs = null;
//            try {
//                rs = JdbcHelper.executeQuery(sql, args);
//                while (rs.next()) {
//                    HoaDonBanHang model = readFromResultSet(rs);
//                    list.add(model);
//                }
//            } finally {
//                rs.getStatement().getConnection().close();
//            }
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//        return list;
//    }

    public HoaDonBanHang findById(String makh) {
        String sql = "SELECT * FROM HoaDonBanHang WHERE MaHD=?";
        List<HoaDonBanHang> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<HoaDonBanHang> select(String sql, Object... args) {
        List<HoaDonBanHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonBanHang model = readFromResultSet(rs);
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

    private HoaDonBanHang readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonBanHang model = new HoaDonBanHang();
        model.setMaHD(rs.getString("MaHD"));
        model.setMaKH(rs.getString("MaKH"));
//        model.setMaXe(rs.getString("MaXe"));
        model.setMaNV(rs.getString("MaNV"));
        model.setNgayBan(rs.getDate("NgayBan"));
//        model.setSoLuong(rs.getInt("SoLuong"));
//        model.setGia(rs.getDouble("Gia"));
        return model;
    }
    public List<Object[]> getHD() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_hoadonban}";
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {rs.getString("MaHD"), rs.getString("MaKH"),rs.getString("MaNV"),rs.getDate("NgayBan"), rs.getInt("SoLuong"),rs.getDouble("TongTien")
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
}
