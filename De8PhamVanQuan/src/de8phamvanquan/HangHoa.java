/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de8phamvanquan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class HangHoa extends javax.swing.JFrame {

    /**
     * Creates new form HangHoa
     */
    public HangHoa() {
        initComponents();
        loadFom();
    }
 //   private int index=0;
    public void loadFom(){
        try {
         Connection conn=ConnectDB.getConnection();
            String sql="Select * From MatHang";
            PreparedStatement ptm=conn.prepareStatement(sql);
            ResultSet rs=ptm.executeQuery();
            while(rs.next()){
                    txtMatHang.setText(rs.getString("mamathang"));
                    txtTen.setText(rs.getString("tenmathang"));
                    txtChatl.setText(rs.getString("chatlieu"));
                    txtDonvi.setText(rs.getString("dvt"));
                    txtNSX.setText(rs.getString("nhasanxuat"));
                   
            }
  
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMatHang = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtChatl = new javax.swing.JTextField();
        txtDonvi = new javax.swing.JTextField();
        txtNSX = new javax.swing.JTextField();
        txtBanGhi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();
        btnTruoc = new javax.swing.JButton();
        btnSau = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã mặt hàng");

        jLabel2.setText("Tên mặt hàng");

        jLabel3.setText("Chất liệu");

        jLabel4.setText("Đơn vị tính");

        jLabel5.setText("Nhà sản xuất");

        jLabel6.setText("Vị trí bản ghi");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnDau.setText("Đầu");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnTruoc.setText("Trước");

        btnSau.setText("Sau");

        btnCuoi.setText("Cuối");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBanGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChatl, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(txtTen)
                            .addComponent(txtMatHang))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnDau)
                .addGap(48, 48, 48)
                .addComponent(btnTruoc)
                .addGap(40, 40, 40)
                .addComponent(btnSau)
                .addGap(47, 47, 47)
                .addComponent(btnCuoi)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMatHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnThem)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtChatl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanGhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDau)
                    .addComponent(btnTruoc)
                    .addComponent(btnSau)
                    .addComponent(btnCuoi))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public void loadForm(ResultSet rs){
        try {
         Connection conn=ConnectDB.getConnection();
            String sql="Select * From MatHang";
            PreparedStatement ptm=conn.prepareStatement(sql);
             rs=ptm.executeQuery();
            while(rs.next()){
                    txtMatHang.setText(rs.getString("mamathang"));
                    txtTen.setText(rs.getString("tenmathang"));
                    txtChatl.setText(rs.getString("chatlieu"));
                    txtDonvi.setText(rs.getString("dvt"));
                    txtNSX.setText(rs.getString("nhasanxuat"));
                   
            }
  
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        try {
            Connection conn=ConnectDB.getConnection();
            String sql="INSERT INTO mathang(mamathang,tenmathang,chatlieu,dvt,nhasanxuat) VALUES(?,?,?,?,?)";
            PreparedStatement ptm=conn.prepareStatement(sql);
            ptm.setString(1,txtMatHang.getText());
            ptm.setString(2,txtTen.getText());
            ptm.setString(3,txtChatl.getText());
            ptm.setString(4,txtDonvi.getText());
            ptm.setString(5,txtNSX.getText());
            
            ptm.executeUpdate();//thuc hien cau lenh
            JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công!");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage());
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            Connection conn=ConnectDB.getConnection();
            String sql="Update mathang Set tenmathang=?,chatlieu=?,dvt=?,nhasanxuat=? Where mamathang=?";
            PreparedStatement ptm=conn.prepareStatement(sql);
            ptm.setString(5,txtMatHang.getText());
            ptm.setString(1,txtTen.getText());
            ptm.setString(2,txtChatl.getText());
            ptm.setString(3,txtDonvi.getText());
            ptm.setString(4,txtNSX.getText());
            
            ptm.executeUpdate();//thuc hien cau lenh
            JOptionPane.showMessageDialog(this, "Sửa dữ liệu thành công!");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void Display(int index){
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnSau;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTruoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBanGhi;
    private javax.swing.JTextField txtChatl;
    private javax.swing.JTextField txtDonvi;
    private javax.swing.JTextField txtMatHang;
    private javax.swing.JTextField txtNSX;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
