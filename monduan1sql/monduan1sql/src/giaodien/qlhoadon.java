/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import DAO.HoaDonBanHangDAO;
import DAO.HoaDonChiTietDAO;
import DAO.KhachHangDAO;
import DAO.LichSuHoaDonDAO;
import DAO.XeDAO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import lop.HoaDonBanHang;
import lop.HoaDonBanHangChiTiet;
import lop.KhachHang;
import lop.LichSuHoaDon;
import lop.qlxe;
import tienich.DateHelper;
import tienich.MgsBox;
import tienich.ShareHelper;
import tienich.XFile1;

/**
 *
 * @author HP
 */
public class qlhoadon extends javax.swing.JFrame {

    /**
     * Creates new form qlhoadon
     */
    public qlhoadon() {
        initComponents();
        init();
        loadct();
        loadhoadonban();
        fillComboBoxMaKH();
        fillComboBoxMaXe();
        loadls();

    }

    int index = 0;
    int index1 = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmahd = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        cbomakh = new javax.swing.JComboBox<>();
        txtmanv = new javax.swing.JTextField();
        txtngayban = new com.toedter.calendar.JDateChooser();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnlammoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtmahdct = new javax.swing.JTextField();
        txtsoluong1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblten = new javax.swing.JLabel();
        txtmahd1 = new javax.swing.JTextField();
        btnfirst1 = new javax.swing.JButton();
        btnprev1 = new javax.swing.JButton();
        btnnext1 = new javax.swing.JButton();
        btnlast1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnthem1 = new javax.swing.JButton();
        btnsua1 = new javax.swing.JButton();
        btnxoa1 = new javax.swing.JButton();
        btnlammoi1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnthanhtoan = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("HÓA ĐƠN BÁN HÀNG");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        txtmanv.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtgia)
                    .addComponent(txtsoluong)
                    .addComponent(txtmahd)
                    .addComponent(cbomakh, javax.swing.GroupLayout.Alignment.TRAILING, 0, 209, Short.MAX_VALUE)
                    .addComponent(txtmanv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtngayban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbomakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtngayban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiện ích"));

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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlammoi, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnthem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnxoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlammoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnfirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnprev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlast))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlast))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã HDCT:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Mã HD");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Mã xe:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Số lượng");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtmahdct, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtmahd1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(172, 172, 172)
                        .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmahdct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmahd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        btnfirst1.setText("|<");
        btnfirst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirst1ActionPerformed(evt);
            }
        });

        btnprev1.setText("<<");
        btnprev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprev1ActionPerformed(evt);
            }
        });

        btnnext1.setText(">>");
        btnnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnext1ActionPerformed(evt);
            }
        });

        btnlast1.setText(">|");
        btnlast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlast1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HDCT", "Mã HD", "Mã xe", "Số lượng", "Giá", "Tổng tiền"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiện ích"));

        btnthem1.setText("Thêm");
        btnthem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthem1ActionPerformed(evt);
            }
        });

        btnsua1.setText("Sửa");
        btnsua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsua1ActionPerformed(evt);
            }
        });

        btnxoa1.setText("Xóa");
        btnxoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoa1ActionPerformed(evt);
            }
        });

        btnlammoi1.setText("Làm mới");
        btnlammoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnsua1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxoa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlammoi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btnthem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnthem1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsua1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnxoa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlammoi1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnfirst1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnprev1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnext1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnlast1)))
                        .addGap(137, 137, 137))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfirst1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnnext1)
                        .addComponent(btnlast1)
                        .addComponent(btnprev1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Xuất hóa đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnthanhtoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnthanhtoan.setText("Thanh toán");
        btnthanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthanhtoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(btnthanhtoan)
                .addGap(29, 29, 29))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthanhtoan)
                    .addComponent(jButton1))
                .addGap(30, 30, 30))
        );

        jTabbedPane2.addTab("Hóa đơn bán hàng", jPanel7);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lịch sử hóa đơn"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Mã KH", "Mã NV", "Ngày bán", "Số lượng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 324, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 484, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Hoạt động", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtsoluongActionPerformed

    private void txtgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here: thêm

        txtmahd1.setText(txtmahd.getText());
        inserthd();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here: sửa
        updatehd();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here: xóa
        deletehd();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here: clear
        try {
           // clearhd();
            txtngayban.cleanup();
            btnthem.setEnabled(true);
            txtmahd.setEditable(true);
            txtmahd.setEnabled(true);
            txtsoluong.setText("");
            txtgia.setText("");
            cbomakh.removeAllItems();
            txtmahd.setText("");
            loadhoadonban();
        } catch (Exception e) {
            //e.printStackTrace();
            MgsBox.alert(this, "Không thể làm mới khi chưa có dữ liệu");
        }
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here: first
        this.index = 0;
        this.edithd();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here: prev
        this.index--;
        this.edithd();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here: next
        this.index++;
        this.edithd();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:last
        this.index = jTable1.getRowCount() - 1;
        this.edithd();
    }//GEN-LAST:event_btnlastActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here: mouse click
        if (evt.getClickCount() == 1) {
            this.index = jTable1.rowAtPoint(evt.getPoint());
            if (index >= 0) {
                this.edithd();
                //loadct();
                fillTable();
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnthem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthem1ActionPerformed
        // TODO add your handling code here: insert
        insertct();
        loadhoadonban();
        loadls();

    }//GEN-LAST:event_btnthem1ActionPerformed

    private void btnsua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsua1ActionPerformed
        // TODO add your handling code here: sửa
        updatect();
    }//GEN-LAST:event_btnsua1ActionPerformed

    private void btnxoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoa1ActionPerformed
        // TODO add your handling code here: xóa
        deletect();
    }//GEN-LAST:event_btnxoa1ActionPerformed

    private void btnlammoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoi1ActionPerformed
        // TODO add your handling code here: clear
        clearct();
        loadct();
        //edit();
        //btnthem.setEnabled(true);
        txtmahdct.setEditable(true);
    }//GEN-LAST:event_btnlammoi1ActionPerformed

    private void btnfirst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirst1ActionPerformed
        // TODO add your handling code here: first
        this.index1 = 0;
        this.editct();
    }//GEN-LAST:event_btnfirst1ActionPerformed

    private void btnprev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprev1ActionPerformed
        // TODO add your handling code here: prev
        this.index1--;
        this.editct();

    }//GEN-LAST:event_btnprev1ActionPerformed

    private void btnnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnext1ActionPerformed
        // TODO add your handling code here: next
        this.index1++;
        this.editct();

    }//GEN-LAST:event_btnnext1ActionPerformed

    private void btnlast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlast1ActionPerformed
        // TODO add your handling code here:
        this.index1 = jTable2.getRowCount() - 1;
        this.editct();
    }//GEN-LAST:event_btnlast1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.index1 = jTable2.rowAtPoint(evt.getPoint());
            if (index1 >= 0) {
                this.editct();
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnthanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthanhtoanActionPerformed
        // TODO add your handling code here: thanh toán
        if (MgsBox.confirm(this, "Bạn có muốn xuất hóa đơn không")) {
            xuathoadon();
            insertls();
            thanhtoan();

        } else {
            insertls();
            thanhtoan();
        }
    }//GEN-LAST:event_btnthanhtoanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        xuathoadon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here: hiển thị hóa đơn bán hàng chi tiết
    }//GEN-LAST:event_jTable3MouseClicked
    HoaDonBanHangDAO dao = new HoaDonBanHangDAO();

    void thanhtoan() {
//     qllichsuhoadon ql = new qllichsuhoadon();
//      ql.insertls();
        deletect();
        deletehd();

        // MgsBox.alert(this, "Đã thanh toán");
    }

    void xuathoadon() {
        if (!MgsBox.confirm(this, "Bạn muốn xuất hóa đơn?")) {
            return;
        }
        int line = jTable2.getRowCount();
        if (line == 0) {
            MgsBox.alert(this, "Bạn chưa chọn hóa đơn cần xuất");
        } else {
            try {
                File dir = new File("HistoryHoaDon1");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("HistoryHoaDon1//" + "Hóa Đơn1" + ".txt"), "UTF-8"));
                bw.write("\t\t\t\tCông Ty CNTT TIẾN THU\r\n");
                bw.write("\t\t\t    CHUYÊN CUNG CẤP MUA BÁN XE MÁY\n\n");
                bw.write("\t\t\t\tHÓA ĐƠN BÁN HÀNG\r\n\r\n");
                bw.write("\t\t\tNgày Thanh Toán: " + txtngayban.getDate() + "\r\n");
                bw.write("\t\t\t\tMã hóa đơn: " + txtmahd.getText() + "\r\n");
                bw.write("\t\t\t       Mã khách hàng: " + cbomakh.getSelectedItem().toString() + "\r\n");
                bw.write("\t\t\t\tNHÂN VIÊN: " + txtmanv.getText() + "\r\n");
                bw.write("----------------------------------------------------------------------------------\r\n");
                bw.write("STT\t Mã HDCT \t Mã xe \t    Số Lượng \t        Đơn giá \tThành tiền\r\n");
                bw.write("----------------------------------------------------------------------------------\r\n");
                for (int i = 0; i < line; i++) {
                    int stt = i;
                    String Mahdct = (String) jTable2.getValueAt(i, 0);
                    String Maxe = String.valueOf(jTable2.getValueAt(i, 2));
                    String soluong = String.valueOf(jTable2.getValueAt(i, 3));
                    String Gia = String.valueOf(jTable2.getValueAt(i, 4));
                    String thanhtien = String.valueOf(jTable2.getValueAt(i, 5));
                    bw.write(stt + "  \t" + Mahdct + "\t\t  " + Maxe + "      \t" + soluong + "\t\t" + Gia + "\t\t" + thanhtien + "\r\n\r\n");
                }
                bw.write("-----------------------------------------------------------------------------------\r\n");
                bw.write("Tổng Tiền Thanh Toán:\t\t\t" + txtgia.getText() + " VNĐ\r\n");
                bw.write("-----------------------------------------------------------------------------------\r\n");
                bw.write("-----------------------------------------------------------------------------------\r\n");
                bw.write("-----------------------------------------------------------------------------------\r\n");
                bw.write("----------------------------------CÁM ƠN QUÝ KHÁCH!--------------------------------\n\n");
                bw.write("\t\t\t\tHoline: 0123456789\r\n");
                bw.write("\t\t\t     PassWifi: camonquykhach!\n");
                bw.write("\t\tĐịa chỉ: 137 Nguyễn Thị Thập quận Liên Chiểu, TP Đà Nẵng");
                bw.close();
                Runtime run = Runtime.getRuntime();
                try {
                    run.exec("Notepad HistoryHoaDon1//" + "Hóa Đơn1" + ".txt");
                } catch (IOException e) {

                }
            } catch (Exception e) {
                //e.printStackTrace();
                MgsBox.alert(this, "Chưa chọn hóa đơn cần xuất bill");
            }

        }

    }
    // LichSuHoaDonDAO dao = new LichSuHoaDonDAO();
    LichSuHoaDonDAO daols = new LichSuHoaDonDAO();
    // qlhoadon ql = new qlhoadon();

    void loadls() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        List<LichSuHoaDon> list = daols.select();
        for (LichSuHoaDon hd : list) {
            Object[] row = new Object[]{
                hd.getStt(),
                hd.getMaHD(),
                hd.getMaKH(),
                hd.getMaNV(),
                hd.getNgayBan(),
                hd.getSoLuong(),
                hd.getTongTien(),};
            model.addRow(row);
        }
    }

    void insertls() {
        LichSuHoaDon model = getModelLS();
        try {
            daols.insert(model);
            this.loadls();
            MgsBox.alert(this, "Thanh toán thành công");
        } catch (Exception e) {
            MgsBox.alert(this, "Thêm thất bại");
            e.printStackTrace();
        }
    }

    LichSuHoaDon getModelLS() {
        LichSuHoaDon model = new LichSuHoaDon();
        model.setMaHD(txtmahd.getText());
        model.setMaKH(cbomakh.getSelectedItem().toString());
        model.setMaNV(txtmanv.getText());
        model.setNgayBan((txtngayban.getDate()));
        model.setSoLuong(Integer.parseInt(txtsoluong.getText()));
        model.setTongTien(Double.parseDouble(txtgia.getText()));
        return model;
    }

    void loadhoadonban() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        HoaDonBanHangChiTiet ct = new HoaDonBanHangChiTiet();
        List<Object[]> list1 = dao.getHD();
        for (Object[] row : list1) {
            model.addRow(row);
        }
    }

    void fillComboBoxMaKH() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbomakh.getModel();
        model.removeAllElements();
        KhachHangDAO khdao = new KhachHangDAO();
        List<KhachHang> list = khdao.select();
        for (KhachHang kh : list) {
            String makh = kh.getMaKH();
            if (model.getIndexOf(makh) < 0) {
                model.addElement(makh);
            }
        }
        cbomakh.setSelectedItem(null);
    }

    void setModelhd(HoaDonBanHang model) {
        txtmahd.setText(model.getMaHD());
        cbomakh.setSelectedItem(model.getMaKH());
        txtmanv.setText(model.getMaNV());
        txtngayban.setDate((model.getNgayBan()));
        //this.index = jTable1.getSelectedRow();
        txtsoluong.setText(String.valueOf(jTable1.getValueAt(this.index, 4) + ""));
        txtgia.setText(String.valueOf(jTable1.getValueAt(this.index, 5) + ""));
    }

    HoaDonBanHang getModelhd() {
        HoaDonBanHang model = new HoaDonBanHang();
        model.setMaHD(txtmahd.getText());
        model.setMaKH(cbomakh.getSelectedItem().toString());
        model.setMaNV(txtmanv.getText());
        model.setNgayBan((txtngayban.getDate()));
        return model;
    }

    void setStatushd(boolean insertable) {
        if (jTable1.getRowCount() > 0) {
            txtmahd.setEditable(insertable);
            btnthem.setEnabled(insertable);
            btnsua.setEnabled(!insertable);
            btnxoa.setEnabled(!insertable);

        } else {
            btnthem.setEnabled(!insertable);
            btnsua.setEnabled(!insertable);
            btnxoa.setEnabled(!insertable);

        }
        boolean first = this.index > 0;
        boolean last = this.index < jTable1.getRowCount() - 1;
        btnfirst.setEnabled(!insertable && first);
        btnprev.setEnabled(!insertable && first);
        btnnext.setEnabled(!insertable && last);
        btnlast.setEnabled(!insertable && last);
    }

    void edithd() { // hiển thị dữ liệu lên form format lại các nút
        try {
            String mahd = (String) jTable1.getValueAt(this.index, 0);
            HoaDonBanHang model = dao.findById(mahd);
            if (model != null) {
                this.setModelhd(model);
                this.setStatushd(false);
            }
        } catch (Exception e) {
            MgsBox.alert(this, "Lỗi edit");
            e.printStackTrace();
        }
    }

    void clearhd() {
        this.setModelhd(new HoaDonBanHang());
        index = 0;
        this.setStatushd(false);
    }

    void inserthd() {
        HoaDonBanHang model = getModelhd();
        // LichSuHoaDon model1 = getModelLS();
        try {
            dao.insert(model);
            // daols.insert(model1);
            this.loadhoadonban();
            this.clearhd();
            MgsBox.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            MgsBox.alert(this, "Thêm thất bại");
            e.printStackTrace();
        }
    }

    void updatehd() {
        HoaDonBanHang model = getModelhd();
        try {
            dao.update(model);
            this.loadhoadonban();
            this.clearhd();
            MgsBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MgsBox.alert(this, "Lỗi sửa dữ liệu");
        }
    }

    void deletehd() {
//       if(!ShareHelper.isManager()){
//           MgsBox.alert(this, "Bạn không có quyền xóa mã hóa đơn");
//       }else{
        String mahd = txtmahd.getText();
        try {
            dao.delete(mahd);
            this.loadhoadonban();
            this.clearhd();
            MgsBox.alert(this, "Xóa thành công");
        } catch (Exception e) {
            //  e.printStackTrace();
            //MgsBox.alert(this, "");
        }
        //   }
    }

    HoaDonChiTietDAO daoct = new HoaDonChiTietDAO();

    void loadct() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        List<Object[]> list = daoct.getloadHD();
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    void setModelct(HoaDonBanHangChiTiet model) {//đổ dữ liệu lên form
        txtmahdct.setText(model.getMaHDCT());
//       jComboBox2.setSelectedItem(model.getMaHD());
        txtmahd1.setText(model.getMaHD());
        jComboBox1.setSelectedItem(model.getMaXe());
        txtsoluong1.setText(model.getSoLuong() + "");
        //txtgia.setText(model.getGia()+"");
    }

    HoaDonBanHangChiTiet getModelct() {
        HoaDonBanHangChiTiet model = new HoaDonBanHangChiTiet();
        model.setMaHDCT(txtmahdct.getText());
        // model.setMaHD(jComboBox2.getSelectedItem().toString());
        model.setMaHD(txtmahd1.getText());
        model.setMaXe(jComboBox1.getSelectedItem().toString());
        model.setSoLuong(Integer.parseInt(txtsoluong1.getText()));
        //model.setGia(Double.parseDouble(txtgia.getText()));
        return model;
    }

    void setStatusct(boolean insertable) {
        if (jTable2.getRowCount() > 0) {
            txtmahdct.setEditable(insertable);
            btnthem1.setEnabled(insertable);
            btnsua1.setEnabled(!insertable);
            btnxoa1.setEnabled(!insertable);

        } else {
            btnthem1.setEnabled(!insertable);
            btnsua1.setEnabled(!insertable);
            btnxoa1.setEnabled(!insertable);
        }
        boolean first = this.index1 > 0;
        boolean last = this.index1 < jTable2.getRowCount() - 1;
        btnfirst1.setEnabled(!insertable && first);
        btnprev1.setEnabled(!insertable && first);
        btnnext1.setEnabled(!insertable && last);
        btnlast1.setEnabled(!insertable && last);
    }

    void editct() { // hiển thị dữ liệu lên form format lại các nút
        try {
            String mahd = (String) jTable2.getValueAt(this.index1, 0);
            HoaDonBanHangChiTiet model = daoct.findById(mahd);
            if (model != null) {
                this.setModelct(model);
                this.setStatusct(false);
            }
        } catch (Exception e) {
            MgsBox.alert(this, "Lỗi edit");
        }
    }

    void clearct() {
        this.setModelct(new HoaDonBanHangChiTiet());
        index1 = 0;
        this.setStatusct(false);
        btnthem1.setEnabled(true);
        txtngayban.cleanup();
        txtsoluong.setText("");
        txtgia.setText("");
        txtmahdct.setEditable(true);
    }

    void insertct() {
        HoaDonBanHangChiTiet model = getModelct();
        try {
            daoct.insert(model);
            this.loadct();
            this.clearct();
            MgsBox.alert(this, "Thêm mới thành công");
            qlhoadonchitiet ql = new qlhoadonchitiet();
            ql.load();
        } catch (Exception e) {
            //MgsBox.alert(this, "Thêm thất bại");
            e.printStackTrace();
        }
    }

    void updatect() {
        HoaDonBanHangChiTiet model = getModelct();
        try {
            daoct.update(model);
            this.loadct();
            this.clearct();
            MgsBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            MgsBox.alert(this, "Lỗi sửa dữ liệu");
        }
    }

    void deletect() {
//       if(!ShareHelper.isManager()){
//           MgsBox.alert(this, "Bạn không có quyền xóa mã hóa đơn");
//       }else{
        String mahd = txtmahd.getText();
        try {
            daoct.delete(mahd);
            this.loadct();
            this.clearct();
        } catch (Exception e) {
            e.printStackTrace();
            MgsBox.alert(this, "Lỗi xóa dữ liệu");
            // }
        }
    }

    void fillComboBoxMaXe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) jComboBox1.getModel();
        model.removeAllElements();
        XeDAO bhdao = new XeDAO();
        List<qlxe> ql = bhdao.select();
        for (qlxe kh : ql) {
            String maxe = kh.getMaXe();
            if (model.getIndexOf(maxe) < 0) {
                model.addElement(maxe);
            }
        }
        jComboBox1.setSelectedItem(null);
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        String mahd = String.valueOf(jTable1.getValueAt(index, 0));
        List<Object[]> list = daoct.getHDCT(mahd);
        for (Object[] row : list) {
            model.addRow(row);
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
            java.util.logging.Logger.getLogger(qlhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlhoadon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnfirst1;
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnlammoi1;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnlast1;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnnext1;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnprev1;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnsua1;
    private javax.swing.JButton btnthanhtoan;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthem1;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoa1;
    private javax.swing.JComboBox<String> cbomakh;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblten;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtmahd;
    private javax.swing.JTextField txtmahd1;
    private javax.swing.JTextField txtmahdct;
    private javax.swing.JTextField txtmanv;
    private com.toedter.calendar.JDateChooser txtngayban;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtsoluong1;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        txtngayban.setDate(DateHelper.now());
        txtmanv.setText(ShareHelper.user.getMaNV().toString());
    }
}
