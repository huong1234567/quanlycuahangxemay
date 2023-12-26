/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import DAO.HoaDonBanHangDAO;
import DAO.HoaDonChiTietDAO;
import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import lop.HoaDonBanHang;
import lop.HoaDonBanHangChiTiet;
import lop.KhachHang;
import lop.NhanVien;
import tienich.DateHelper;
import tienich.MgsBox;
import tienich.ShareHelper;

/**
 *
 * @author HP
 */
public class qlhoadonban extends javax.swing.JFrame {

    /**
     * Creates new form qlhoadonban
     */
    
    public qlhoadonban() {
        initComponents();
        init();  
        load();
        fillComboBoxMaKH();
    }
    HoaDonBanHangDAO dao = new HoaDonBanHangDAO();
    int index = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmahd = new javax.swing.JTextField();
        txtngayban = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        cbomakh = new javax.swing.JComboBox<>();
        txtmanv = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnlammoi = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin hóa đơn bán hàng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("CẬP NHẬT HÓA ĐƠN BÁN HÀNG");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn bán hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã hóa đơn:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã khách hàng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mã nhân viên:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày bán");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số lượng:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Giá");

        txtngayban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaybanActionPerformed(evt);
            }
        });

        txtsoluong.setEditable(false);
        txtsoluong.setEnabled(false);
        txtsoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoluongActionPerformed(evt);
            }
        });

        txtgia.setEditable(false);
        txtgia.setEnabled(false);
        txtgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgiaActionPerformed(evt);
            }
        });

        cbomakh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtmahd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbomakh, 0, 209, Short.MAX_VALUE)
                    .addComponent(txtmanv))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngayban, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtngayban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbomakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnlammoi.setText("Làm mới");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã KH", "Mã NV", "Ngày bán", "Số lượng", "Giá"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnthem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnxoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnlammoi)
                                .addGap(128, 128, 128)
                                .addComponent(btnfirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnprev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlast))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthem)
                        .addComponent(btnsua)
                        .addComponent(btnxoa)
                        .addComponent(btnlammoi))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnfirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnprev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Hóa Đơn Bán Hàng Chi Tiết");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtsoluongActionPerformed

    private void txtgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiaActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here: clear
        try{
        clear();
        txtngayban.setText("");
        btnthem.setEnabled(true);
        txtmahd.setEditable(true);
        txtmahd.setEnabled(true);
        txtsoluong.setText("");
        txtgia.setText("");
        load();
        }catch(Exception e){
            //e.printStackTrace();
            MgsBox.alert(this, "Không thể làm mới khi chưa có dữ liệu");
        }
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here: mouse click
        if(evt.getClickCount()==1){
            this.index = jTable1.rowAtPoint(evt.getPoint());
            if(index>=0){
                this.edit();
//                new qlhoadonchitiet().setVisible(true);
//                txtmahd.setEditable(false);
//                txtmahd.setEnabled(false);
            }
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here: thêm
        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here: sửa
        update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here: xóa
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here: first
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here: prev
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here: next
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:last
        this.index = jTable1.getRowCount()-1;
        this.edit();
    }//GEN-LAST:event_btnlastActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        qlhoadonchitiet hd = new qlhoadonchitiet();
//                hd.setModel(model);
//        hd.setVisible(true);
qlhoadonchitiet hd = new qlhoadonchitiet();
//txtgia.setText(String.valueOf(a*b));

hd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtngaybanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaybanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaybanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        xuathoadon();
    }//GEN-LAST:event_jButton2ActionPerformed

  
   void load(){
       DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
       HoaDonBanHangChiTiet ct = new HoaDonBanHangChiTiet();
       if(!String.valueOf(ct.getSoLuong()).isEmpty()){
          List<Object[]> list1 = dao.getHD();
       for(Object[] row : list1){
          model.addRow(row);
       }
//       }else if(String.valueOf(ct.getSoLuong()).isEmpty()){
//            List<HoaDonBanHang> list2 = dao.select1();
//           for(HoaDonBanHang bh : list2){
//               Object[] row = new Object[]{
//            bh.getMaHD(),
//                   bh.getMaKH(),
//                   bh.getMaNV(),
//                   bh.getNgayBan(),
//                   bh.getSoLuongTong(),
//                   bh.getGiaTong()
//               };
//               model.addRow(row);
//           }
       
       }
   }
   void xuathoadon() {
        if (!MgsBox.confirm(this, "Bạn muốn xuất hóa đơn?")) {
            return;
        }
        int line = jTable1.getRowCount();
        try {
            Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("HistoryHoaDon//" + "Hóa Đơn" + ".pdf"), "UTF-8"));
            bw.write("\t\t\t\tHóa Đơn Bán Xe\r\n\r\n");
            bw.write("\t\t\t\tHoline: 0123456789\r\n\r\n");
            bw.write("\t\t\t\tHÓA ĐƠN BÁN HÀNG\r\n\r\n");
            bw.write("Ngày Thanh Toán: " + txtngayban.getText() + "\r\n");
            bw.write("Mã hóa đơn: " + txtmahd.getText() + "\r\n");
            bw.write("NHÂN VIÊN: " + txtmanv.getText() + "\r\n");
            bw.write("TÊN BÀN: " + txtsoluong.getText() + "\r\n");
            bw.write("----------------------------------------------------------------\r\n");
            bw.write("STT\t Sản phẩm \t Kích thước \t Đơn Giá \t Số Lượng \t Thành tiền\r\n");
            bw.write("----------------------------------------------------------------\r\n");
            for (int i = 0; i < line; i++) {
                int stt = i;
                String sanpham = (String) jTable1.getValueAt(i, 0);
                String size = String.valueOf(jTable1.getValueAt(i, 1));
                String dongia = String.valueOf(jTable1.getValueAt(i, 2));
                String soluong = String.valueOf(jTable1.getValueAt(i, 3));
                String thanhtien = String.valueOf(jTable1.getValueAt(i, 4));
                bw.write(stt + "  \t" + sanpham + "\t\t    " + size + "     \t" + dongia + "\t\t" + soluong + "\t" + thanhtien + "\r\n\r\n");
            }
            bw.write("-----------------------------------------------------------------------------------\r\n");
            bw.write("Tổng Tiền Thanh Toán:\t\t\t" + txtgia.getText() + " VNĐ\r\n");
            bw.write("-----------------------------------------------------------------------------------\r\n");
            bw.write("---------------------------------------------------------------------------------------\r\n");
            bw.write("--------------------------------------------------------------------------------------\r\n");
            bw.write("----------------------------------CÁM ƠN QUÝ KHÁCH!----------------------------");
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
Runtime run = Runtime.getRuntime();
        try {
//            //setOrderThanhToan();
//            //txtMaHD.setText("");
//            //txtTinhTongTien.setText("");
//            settxt();
            run.exec("Notepad HistoryHoaDon//" + "Hóa Đơn" + ".txt");
        } catch (IOException e) {

        }
    }

   void fillComboBoxMaKH(){
       DefaultComboBoxModel model = (DefaultComboBoxModel)cbomakh.getModel();
//       DefaultComboBoxModel model1 =(DefaultComboBoxModel)cbomanv.getModel();
       model.removeAllElements();
      // model1.removeAllElements();
       KhachHangDAO khdao = new KhachHangDAO();
       List<KhachHang> list = khdao.select();
       for(KhachHang kh : list){
           String makh = kh.getMaKH();
           if(model.getIndexOf(makh)<0){
               model.addElement(makh);
           }
       }
       NhanVienDAO nvdao = new NhanVienDAO();
//       List<NhanVien> list1 =nvdao.select();
//       for(NhanVien nv : list1){
//           String manv = nv.getMaNV();
//           if(model1.getIndexOf(manv)<0){
//               model1.addElement(manv);
//           }
      // }
       cbomakh.setSelectedItem(null);
      // cbomanv.setSelectedItem(null);
   }
   
   
   void setModel(HoaDonBanHang model){//đổ dữ liệu lên form
       txtmahd.setText(model.getMaHD());
       cbomakh.setSelectedItem(model.getMaKH());
       //txtmaxe.setText(model.getMaXe());
//       cbomanv.setSelectedItem(model.getMaNV());
       txtmanv.setText(model.getMaNV());
       txtngayban.setText(DateHelper.toString(model.getNgayBan()));
       //this.index = jTable1.getSelectedRow();
       txtsoluong.setText(String.valueOf(jTable1.getValueAt(this.index, 4)+""));
       txtgia.setText(String.valueOf(jTable1.getValueAt(this.index, 5)+""));
        
       
       
   }
   
   HoaDonBanHang getModel(){
       HoaDonBanHang model = new HoaDonBanHang();
       model.setMaHD(txtmahd.getText());
       model.setMaKH(cbomakh.getSelectedItem().toString());
       //model.setMaXe(txtmaxe.getText());
      // model.setMaNV(cbomanv.getSelectedItem().toString());
      model.setMaNV(txtmanv.getText());
       model.setNgayBan(DateHelper.toDate(txtngayban.getText()));
       //model.setSoLuong(Integer.parseInt(txtsoluong.getText()));
       return model;
   }
   void setStatus(boolean insertable){
       if(jTable1.getRowCount()>0){
           txtmahd.setEditable(insertable);
           btnthem.setEnabled(insertable);
           btnsua.setEnabled(!insertable);
           btnxoa.setEnabled(!insertable);
          
          
       }else{
            btnthem.setEnabled(!insertable);
           btnsua.setEnabled(!insertable);
           btnxoa.setEnabled(!insertable);
           
       }
       boolean first = this.index > 0;
       boolean last = this.index<jTable1.getRowCount()-1;
       btnfirst.setEnabled(!insertable && first);
       btnprev.setEnabled(!insertable && first);
       btnnext.setEnabled(!insertable && last);
       btnlast.setEnabled(!insertable && last);
   }
   void edit(){ // hiển thị dữ liệu lên form format lại các nút
      try{
          String mahd = (String)jTable1.getValueAt(this.index, 0);
          HoaDonBanHang model = dao.findById(mahd);
          if(model != null){
              this.setModel(model);
              this.setStatus(false);
          }
      }catch(Exception e){
          MgsBox.alert(this, "Lỗi edit");
          e.printStackTrace();
      }
   }
   void clear(){
      this.setModel(new HoaDonBanHang());
      index = 0;
      this.setStatus(false);
   }
   
   void insert(){
       HoaDonBanHang model = getModel();
       try{
           dao.insert(model);
           this.load();
           this.clear();
           MgsBox.alert(this, "Thêm mới thành công");
       }catch(Exception e){
           MgsBox.alert(this, "Thêm thất bại");
           e.printStackTrace();
       }
   }
   void update(){
       HoaDonBanHang model = getModel();
       try{
           dao.update(model);
           this.load();
           this.clear();
           MgsBox.alert(this, "Cập nhật thành công");
       }catch(Exception e){
           e.printStackTrace();
           MgsBox.alert(this, "Lỗi sửa dữ liệu");
       }
   }
   void delete(){
       if(!ShareHelper.isManager()){
           MgsBox.alert(this, "Bạn không có quyền xóa mã hóa đơn");
       }else{
           String mahd = txtmahd.getText();
           try{
               dao.delete(mahd);
               this.load();
               this.clear();
           }catch(Exception e){
               e.printStackTrace();
               MgsBox.alert(this, "Lỗi xóa dữ liệu");
           }
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
            java.util.logging.Logger.getLogger(qlhoadonban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlhoadonban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlhoadonban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlhoadonban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlhoadonban().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbomakh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtmahd;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtngayban;
    private javax.swing.JTextField txtsoluong;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
       // txtmanv.setText(String.valueOf(ShareHelper.user.getMaNV()));
    }
}
