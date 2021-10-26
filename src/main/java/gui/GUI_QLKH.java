/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.KhachHangDAO;
import entity.KhachHang;
import entity.TaiKhoan;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SessionFactory;
import service.KhachHangService;
import util.MySessionFactory;

/**
 *
 * @author hieud
 */
public class GUI_QLKH extends javax.swing.JPanel {
    private final List<KhachHang> list;
    DefaultTableModel model;
    KhachHangService khachhangdao;
    private int selectRow;
    public GUI_QLKH() {
        initComponents();
        SessionFactory sessionFactory = new MySessionFactory().getSessionFactory();
        khachhangdao = new KhachHangDAO(sessionFactory);
        list = khachhangdao.getListKhachHang();
        model = (DefaultTableModel) tableDSKhachHang.getModel();
        showTable();
    }
    public void showTable() {
        model.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for (KhachHang kh1 : list) {
            model.addRow(new Object[]{
                kh1.getMaKhachHang(), kh1.getHoTen(), kh1.getDiaChi(), formatter.format(kh1.getNgaySinh()), kh1.getSoDienThoai(), kh1.getGioiTinh(), kh1.getEmail()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHoTen = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jcbGioiTinh = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnThemKhachHang = new javax.swing.JButton();
        btnSuaKhachHang = new javax.swing.JButton();
        btnXoaKhachHang = new javax.swing.JButton();
        btnXoaTrangForm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDSKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setText("Quản Lý Khách Hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblHoTen.setText("Họ và tên");

        lblDiaChi.setText("Địa chỉ");

        lblNgaySinh.setText("Ngày sinh");

        lblSoDienThoai.setText("Số điện thoại");

        lblGioiTinh.setText("Giới tính");

        lblEmail.setText("Email");

        lblTaiKhoan.setText("Tài khoản");

        lblMatKhau.setText("Mật khẩu");

        txtNgaySinh.setText("dd/MM/yyyy");
        txtNgaySinh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNgaySinhFocusGained(evt);
            }
        });

        jcbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgaySinh)
                            .addComponent(lblDiaChi)
                            .addComponent(lblHoTen))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSoDienThoai)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNgaySinh)
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtTaiKhoan)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTaiKhoan)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMatKhau)
                                    .addComponent(lblGioiTinh)
                                    .addComponent(lblEmail))
                                .addGap(2, 2, 2)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(jcbGioiTinh, 0, 250, Short.MAX_VALUE))))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen)
                    .addComponent(lblGioiTinh)
                    .addComponent(jcbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaiKhoan)
                    .addComponent(lblNgaySinh))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDienThoai)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau))
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnThemKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnThemKhachHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThaiHoc\\OneDrive - Industrial University of HoChiMinh City\\Documents\\NetBeansProjects\\shopQuanAo\\resources\\icon\\Create.png")); // NOI18N
        btnThemKhachHang.setText("Thêm khách hàng");
        btnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachHangActionPerformed(evt);
            }
        });

        btnSuaKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaKhachHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThaiHoc\\OneDrive - Industrial University of HoChiMinh City\\Documents\\NetBeansProjects\\shopQuanAo\\resources\\icon\\Edit.png")); // NOI18N
        btnSuaKhachHang.setText("Sửa khách hàng");
        btnSuaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKhachHangActionPerformed(evt);
            }
        });

        btnXoaKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaKhachHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThaiHoc\\OneDrive - Industrial University of HoChiMinh City\\Documents\\NetBeansProjects\\shopQuanAo\\resources\\icon\\Delete.png")); // NOI18N
        btnXoaKhachHang.setText("Xóa khách hàng");
        btnXoaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhachHangActionPerformed(evt);
            }
        });

        btnXoaTrangForm.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaTrangForm.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThaiHoc\\OneDrive - Industrial University of HoChiMinh City\\Documents\\NetBeansProjects\\shopQuanAo\\resources\\icon\\Refresh.png")); // NOI18N
        btnXoaTrangForm.setText("Xóa trắng form");
        btnXoaTrangForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnXoaTrangForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSuaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSuaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnXoaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnXoaTrangForm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableDSKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ và tên", "Địa chỉ", "Ngày sinh", "Số điện thoại", "Giới tính", "Email"
            }
        ));
        tableDSKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDSKhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachHangActionPerformed
        KhachHang kh = new KhachHang();
        kh.setHoTen(txtHoTen.getText());
        kh.setDiaChi(txtDiaChi.getText());
        try {
            kh.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(txtNgaySinh.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        kh.setSoDienThoai(txtSoDienThoai.getText());
        kh.setGioiTinh((String) jcbGioiTinh.getSelectedItem());
        kh.setEmail(txtEmail.getText());
        kh.setTaiKhoan(new TaiKhoan(txtTaiKhoan.getText(), jPasswordField1.getText(), kh));
        if (khachhangdao.addKhachHang(kh)) {
            xoaTrang();
            list.add(kh);
            showTable();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm khách hàng thất bại");
        }
    }//GEN-LAST:event_btnThemKhachHangActionPerformed

    private void btnSuaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKhachHangActionPerformed
        selectRow = tableDSKhachHang.getSelectedRow();
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không có khách hàng để sửa");
        } else if (selectRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng cần sửa");
        } else {
            KhachHang kh = new KhachHang();
            kh.setMaKhachHang(list.get(selectRow).getMaKhachHang());
            kh.setHoTen(txtHoTen.getText());
            kh.setDiaChi(txtDiaChi.getText());
            try {
                kh.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(txtNgaySinh.getText()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            kh.setSoDienThoai(txtSoDienThoai.getText());
            kh.setGioiTinh((String) jcbGioiTinh.getSelectedItem());
            kh.setEmail(txtEmail.getText());
            System.out.println(kh);
            TaiKhoan tk = new TaiKhoan(txtTaiKhoan.getText(), jPasswordField1.getText(), kh);
            tk.setMaTaiKhoan(list.get(selectRow).getTaiKhoan().getMaTaiKhoan());
            kh.setTaiKhoan(tk);
            if (khachhangdao.updateKhachHang(kh)) {
                tableDSKhachHang.setValueAt(txtHoTen.getText(), selectRow, 1);
                tableDSKhachHang.setValueAt(txtDiaChi.getText(), selectRow, 2);
                tableDSKhachHang.setValueAt(txtNgaySinh.getText(), selectRow, 3);
                tableDSKhachHang.setValueAt(txtSoDienThoai.getText(), selectRow, 4);
                tableDSKhachHang.setValueAt(jcbGioiTinh.getSelectedItem(), selectRow, 5);
                tableDSKhachHang.setValueAt(txtEmail.getText(), selectRow, 6);
                JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công");
                xoaTrang();
            }else{
                JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thất bại");
            }
        }
    }//GEN-LAST:event_btnSuaKhachHangActionPerformed

    private void btnXoaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhachHangActionPerformed
         selectRow = tableDSKhachHang.getSelectedRow();
        if(selectRow >= 0){
            int maKhachHang = list.get(selectRow).getMaKhachHang();
            if(khachhangdao.deleteKhachHang(maKhachHang)){
                model.removeRow(selectRow);
                JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công");
            }else{
                JOptionPane.showMessageDialog(this, "Xóa khách hàng thất bại");
            }
        }
    }//GEN-LAST:event_btnXoaKhachHangActionPerformed

    private void btnXoaTrangFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangFormActionPerformed
        xoaTrang();
    }//GEN-LAST:event_btnXoaTrangFormActionPerformed

    private void tableDSKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSKhachHangMouseClicked
        selectRow = tableDSKhachHang.getSelectedRow();
        if (selectRow != -1) {
            loadDataToTxtField(list.get(selectRow));
        }
    }//GEN-LAST:event_tableDSKhachHangMouseClicked

    private void txtNgaySinhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgaySinhFocusGained
        txtNgaySinh.setText("");
    }//GEN-LAST:event_txtNgaySinhFocusGained
    private void loadDataToTxtField(KhachHang s) {
        txtHoTen.setText(s.getHoTen());
        txtDiaChi.setText(s.getDiaChi());
        SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
        txtNgaySinh.setText(sm.format(s.getNgaySinh()));
        txtEmail.setText(s.getEmail());
        txtSoDienThoai.setText(s.getSoDienThoai());
        txtTaiKhoan.setText(s.getTaiKhoan().getTenDangNhap());
        jPasswordField1.setText(s.getTaiKhoan().getMatKhau());
        jcbGioiTinh.setSelectedItem(s.getGioiTinh());
    }
    private void xoaTrang() {
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtNgaySinh.setText("");
        txtEmail.setText("");
        txtSoDienThoai.setText("");
        txtTaiKhoan.setText("");
        jPasswordField1.setText("");
        jcbGioiTinh.setSelectedItem(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaKhachHang;
    private javax.swing.JButton btnThemKhachHang;
    private javax.swing.JButton btnXoaKhachHang;
    private javax.swing.JButton btnXoaTrangForm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbGioiTinh;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableDSKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
