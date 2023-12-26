/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import lop.NhanVien;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;


/**
 *
 * @author DELL-PC
 */
public class ShareHelper {
    

//    public static final Image APP_ICON;
//
//    static {
//        String file = "/icon/logo.png";
//        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
//    }

    public static boolean saveLogo(File file) {
        File thumuc = new File("anhmonduan"); //lay file co nguồn là anhmonduan
        if (!thumuc.exists()) {//nếu khoogn tồn tại
            thumuc.mkdirs();//tạo folder
        }
        File newFile = new File(thumuc, file.getName()); //cho phep lấy nguồn lấy tên
        try {
            Path source = Paths.get(file.getAbsolutePath()); //lấy đường dẫn
            Path destination = Paths.get(newFile.getAbsolutePath()); //nếu tồn tại thì thay thế nó
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * * Đọc hình ảnh logo chuyên đề * @param fileName là tên file logo *
     * @return ảnh đọc được
     */
    public static ImageIcon readLogo(String fileName) {
        File path = new File("anhmonduan", fileName); //lay duong dan logos doc ten file
        return new ImageIcon(path.getAbsolutePath());
    }
    /**
     * * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
//    public static NhanVien user = null;
//
//    /**
//     * * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */
//    public static void logoff() {
//        ShareHelper.user = null;
//    }
//
//    /**
//     * * Kiểm tra xem đăng nhập hay chưa * @return đăng nhập hay chưa
//     */
//    public static boolean authenticated() {
//        return ShareHelper.user != null;
//    }
//    public static boolean isManager(){
//        return ShareHelper.authenticated()&& user.isChucVu();
//    }
    public static NhanVien user = null;
    
    public static void logoff(){
        ShareHelper.user=null;
    }
    
    public static boolean authenticated(){
        return ShareHelper.user != null;
    }
    
    public static boolean isManager(){
        return ShareHelper.authenticated() && user.isChucVu();
    }
    
}


