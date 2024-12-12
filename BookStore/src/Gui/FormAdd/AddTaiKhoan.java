/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui.FormAdd;

import Bus.Impl.khachHangImpl;
import Bus.Impl.nhanVienImpl;
import Bus.Impl.taiKhoanImpl;
import Dao.KHACHHANGDAO;
import Dao.NHANVIENDAO;
import Dto.KHACHANG;
import Dto.NHANVIEN;
import Dto.TAIKHOAN;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static org.apache.logging.log4j.util.Strings.isBlank;

/**
 *
 * @author DELL
 */
public class AddTaiKhoan extends javax.swing.JFrame {
    Integer mode;
    taiKhoanImpl taiKhoanImpl = new taiKhoanImpl();
    nhanVienImpl nhanVienImpl1 = new nhanVienImpl();    
    khachHangImpl khachHangImpl1=new khachHangImpl();
    /**
     * Creates new form AddTaiKhoan
     */
    public AddTaiKhoan() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        loadID();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAdd = new javax.swing.JPanel();
        mid = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        mkhau = new javax.swing.JTextField();
        SelectRole = new javax.swing.JComboBox<>();
        exit = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JTextField();
        SelectID = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        bot = new javax.swing.JPanel();
        submitbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelAdd.setLayout(new java.awt.BorderLayout());

        mid.setBackground(new java.awt.Color(51, 255, 255));

        name.setBackground(new java.awt.Color(204, 255, 204));
        name.setForeground(new java.awt.Color(0, 51, 51));
        name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Họ và Tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        mkhau.setBackground(new java.awt.Color(204, 255, 204));
        mkhau.setForeground(new java.awt.Color(0, 51, 51));
        mkhau.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mật Khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        SelectRole.setBackground(new java.awt.Color(204, 255, 204));
        SelectRole.setForeground(new java.awt.Color(0, 51, 51));
        SelectRole.setMaximumRowCount(3);
        SelectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên", "Khách Hàng", "Quản Trị Viên" }));
        SelectRole.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SelectRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectRoleActionPerformed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_30px_1.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        TaiKhoan.setBackground(new java.awt.Color(204, 255, 204));
        TaiKhoan.setForeground(new java.awt.Color(0, 51, 51));
        TaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tài Khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        SelectID.setBackground(new java.awt.Color(204, 255, 204));
        SelectID.setForeground(new java.awt.Color(0, 51, 51));
        SelectID.setMaximumRowCount(3);
        SelectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Chọn vai trò");

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(0, 51, 51));
        id.setText("Mã Nhân Viên");

        javax.swing.GroupLayout midLayout = new javax.swing.GroupLayout(mid);
        mid.setLayout(midLayout);
        midLayout.setHorizontalGroup(
            midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TaiKhoan)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(mkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midLayout.createSequentialGroup()
                        .addComponent(id)
                        .addGap(18, 18, 18)
                        .addComponent(SelectID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        midLayout.setVerticalGroup(
            midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midLayout.createSequentialGroup()
                .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit)
                    .addGroup(midLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(mkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        PanelAdd.add(mid, java.awt.BorderLayout.CENTER);

        submitbtn.setBackground(new java.awt.Color(255, 255, 255));
        submitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(0, 51, 51));
        submitbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitbtn.setText("Xác Nhận");
        submitbtn.setOpaque(true);
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botLayout = new javax.swing.GroupLayout(bot);
        bot.setLayout(botLayout);
        botLayout.setHorizontalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        botLayout.setVerticalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        PanelAdd.add(bot, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        String TK = TaiKhoan.getText();
        String MK = mkhau.getText();
        String Role =(String) SelectRole.getSelectedItem();
        
        if(mode==0){//NHÂN VIÊN
            int id=Integer.parseInt(SelectID.getSelectedItem().toString());
            String hoVaten = name.getText();
            if (isBlank((String)SelectID.getSelectedItem())) {
                JOptionPane.showMessageDialog(this, "Id Không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(hoVaten)) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập họ và tên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(TK)) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập Tài Khoản", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(MK)) {
                JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Mật Khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            TAIKHOAN nv_new = new TAIKHOAN( TK, MK,id,Role);
            if(taiKhoanImpl.themTaiKhoan(nv_new)==false){
                 JOptionPane.showMessageDialog(this, "Tài Khoản đã tồn tại,hãy thử thêm số hoặc kí tự khác vào", "Lỗi", JOptionPane.ERROR_MESSAGE);
                 return;          
             }
        }
        else if(mode==1){//KHÁCH HÀNG
            int id=Integer.parseInt(SelectID.getSelectedItem().toString());
            String hoVaten = name.getText();
            if (isBlank((String)SelectID.getSelectedItem())) {
                JOptionPane.showMessageDialog(this, "Id Không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(hoVaten)) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập họ và tên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(TK)) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập Tài Khoản", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(MK)) {
                JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Mật Khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            TAIKHOAN kh_new=new TAIKHOAN(TK,MK,Role,id);
            if(taiKhoanImpl.themTaiKhoan(kh_new)==false){
                 JOptionPane.showMessageDialog(this, "Tài Khoản khách hàng này đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                 return;          
             }
        }
        else if(mode==2){//ADMIN
            if (isBlank(TK)) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập Tài Khoản", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (isBlank(MK)) {
                JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Mật Khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            TAIKHOAN ad_new = new TAIKHOAN( TK, MK,Role);
            if(taiKhoanImpl.themTaiKhoan(ad_new)==false){
                 JOptionPane.showMessageDialog(this, "Tài Khoản đã tồn tại,hãy thử thêm số hoặc kí tự khác vào", "Lỗi", JOptionPane.ERROR_MESSAGE);
                 return;          
             }
        }
        this.dispose();
    }//GEN-LAST:event_submitbtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void SelectRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoleActionPerformed
        loadID();
    }//GEN-LAST:event_SelectRoleActionPerformed
    private void loadID(){
        int choose = SelectRole.getSelectedIndex();
        switch (choose) {
            case 0:
                id.setText("Mã Nhân Viên");
                mode=0;
                name.setText("");
                TaiKhoan.setText("");
                mkhau.setText("");
                id.setVisible(true);
                name.setVisible(true);
                SelectID.setVisible(true);
                SelectID.removeAllItems();
                ArrayList<Integer> IDnv=NHANVIENDAO.getInstance().getIDnv();
                for(Integer nv : IDnv){
                    String strNV = Integer.toString(nv);
                    SelectID.addItem(strNV);
                }
                break;
            case 1:
                id.setText("Mã Khách Hàng");
                mode=1;
                name.setText("");
                TaiKhoan.setText("");
                mkhau.setText("");
                id.setVisible(true);
                SelectID.setVisible(true);
                name.setVisible(true);
                SelectID.removeAllItems();
                ArrayList<Integer> IDkh=KHACHHANGDAO.getInstance().getIDkh();
                for(Integer kh : IDkh){
                    String strKH = Integer.toString(kh);
                    SelectID.addItem(strKH);
                }
                break;
            case 2:
                id.setText("Mã Người Quản Trị");
                mode=2;
                id.setVisible(false);
                SelectID.setVisible(false);
                SelectID.removeAllItems();
                name.setVisible(false);
                TaiKhoan.setText("admin");
                mkhau.setText("admin");
                break;
        }  
    }
    private void SelectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectIDActionPerformed
        // TODO add your handling code here:
        if (mode == 0) {
            int choose = Integer.parseInt((String) SelectID.getSelectedItem());
            NHANVIEN tmp = new NHANVIEN(choose);
            NHANVIEN nv = NHANVIENDAO.getInstance().selectById(tmp);
            name.setText(nv.getHoten());
        }
        else if (mode == 1) {
            int choose = Integer.parseInt((String) SelectID.getSelectedItem());
            KHACHANG tmp = new KHACHANG(choose);
            KHACHANG kh = KHACHHANGDAO.getInstance().selectById(tmp);
            name.setText(kh.getHoten());
        }
    }//GEN-LAST:event_SelectIDActionPerformed

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
            java.util.logging.Logger.getLogger(AddTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdd;
    private javax.swing.JComboBox<String> SelectID;
    private javax.swing.JComboBox<String> SelectRole;
    private javax.swing.JTextField TaiKhoan;
    private javax.swing.JPanel bot;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mid;
    private javax.swing.JTextField mkhau;
    private javax.swing.JTextField name;
    private javax.swing.JLabel submitbtn;
    // End of variables declaration//GEN-END:variables
}