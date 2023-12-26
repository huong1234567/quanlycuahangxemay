/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import DAO.NhanVienDAO;
import java.awt.event.KeyEvent;
import lop.NhanVien;
import tienich.MgsBox;
import tienich.ShareHelper;

/**
 *
 * @author HP
 */
public class dangnhap extends javax.swing.JFrame {

    /**
     * Creates new form dangnhap
     */
    public dangnhap() {
         init();
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtnatkhau = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtmatkhau = new javax.swing.JPasswordField();
        lblma = new javax.swing.JLabel();
        lblmatkhau = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng nhập");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã người dùng:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtnatkhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnatkhau.setText("Mật khẩu");
        getContentPane().add(txtnatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        txtma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmaKeyPressed(evt);
            }
        });
        getContentPane().add(txtma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 260, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Đăng nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, 80));

        jCheckBox1.setText("Hiện mật khẩu");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        txtmatkhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmatkhauKeyPressed(evt);
            }
        });
        getContentPane().add(txtmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 260, 30));

        lblma.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 20));

        lblmatkhau.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 260, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anhnen2.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2560, 1600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: login
        login();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: exitr
        exit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox1.isSelected()==true){
         txtmatkhau.setEchoChar((char)0);
        }else{
             txtmatkhau.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void txtmatkhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatkhauKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtmatkhauKeyPressed

    private void txtmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtmaKeyPressed
NhanVienDAO dao = new NhanVienDAO();
    private void login() {

        String manv = txtma.getText();
        String matKhau = new String(txtmatkhau.getPassword());
        try {
           
            if (manv.isEmpty()) {
                //MgsBox.alert(this, "Chưa nhập mã nhân viên");
                lblma.setText("Chưa nhập mã nhân viên");
                //lblma.setVisible(true);
            } else {
                lblma.setText("");
                 NhanVien nhanVien = dao.findById(manv);
                if (nhanVien != null) {
                    String matKhau2 = nhanVien.getMatKhau();
                    if (matKhau.equals(matKhau2)) {
                        ShareHelper.user = nhanVien;
                        MgsBox.alert(this, "Đăng nhập thành công");
                        lblma.setText("");
                        lblmatkhau.setText("");
                        formmanghinhchinh ql = new formmanghinhchinh();
                        ql.setVisible(true);
                        this.dispose();
                    } else if(matKhau.isEmpty()) {
                        //MgsBox.alert(this, "Chưa nhập mật khẩu!");
                        lblmatkhau.setText("Chưa nhập mật khẩu");
                    }else{
                        //MgsBox.alert(this, "Sai mật khẩu");
                        lblmatkhau.setText("Sai mật khẩu");
                        txtmatkhau.setText("");
                    }
                } else {
                    //MgsBox.alert(this, "Sai tên đăng nhập!");
                    lblma.setText("Sai tên đăng nhập");
                }
            }
        } catch (Exception e) {
            MgsBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void exit() {
        if (MgsBox.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không?")) {
            System.exit(0);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblma;
    private javax.swing.JLabel lblmatkhau;
    private javax.swing.JTextField txtma;
    private javax.swing.JPasswordField txtmatkhau;
    private javax.swing.JLabel txtnatkhau;
    // End of variables declaration//GEN-END:variables

     void init() {
        this.setLocation(500, 250);
        
        
    }
}
