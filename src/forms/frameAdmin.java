/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import dataBase.configdb_2110010302;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrator 10
 */
public class frameAdmin extends javax.swing.JFrame {
    configdb_2110010302 obj;


    public void tampilDataAdmin(){
        String[] JudulKolom = {"kd_admin", "nama_admin", "username_admin", "password_admin"}; //kolom yang akan di tampilkan
        int[] lebar ={100, 100, 100, 100}; //lebar masing-masing kolom
        String query = "SELECT * FROM tbl_admin";
        obj.JudulJTable(jTableAdmin, JudulKolom); //judul kolom
        obj.tampilTable(JudulKolom, query, jTableAdmin); //isi tabel
        obj.LebarJtable(jTableAdmin, lebar); //lebar kolom
        lblJmlData.setText(String.valueOf(obj.jumlahRecord(query)));
    }
    public frameAdmin() { //konstruktor
        initComponents();
        this.setLocationRelativeTo(null);
        obj = new configdb_2110010302(); //koneksi awal
        tampilDataAdmin();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKd = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jUbah = new javax.swing.JButton();
        jHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        jReport = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblJmlData = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("kode admin");

        jLabel2.setText("nama admin");

        jLabel3.setText("username admin");

        jLabel4.setText("password");

        txtKd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKdActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jUbah.setText("UBAH");
        jUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUbahActionPerformed(evt);
            }
        });

        jHapus.setText("HAPUS");
        jHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusActionPerformed(evt);
            }
        });

        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAdminMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAdmin);

        jReport.setText("REPORT");
        jReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportActionPerformed(evt);
            }
        });

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        jLabel5.setText("CARI DATA");

        jLabel6.setText("JUMLAH DATA:");

        lblJmlData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJmlData.setText("\"\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKd, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtNama)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jHapus))
                            .addComponent(jReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblJmlData))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKd, txtNama, txtPassword, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jUbah)
                            .addComponent(jButton1)
                            .addComponent(jHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jReport)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblJmlData))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String[] FieldTabelnya ={"kd_admin", "nama_admin", "username_admin", "password_admin"};
            String[] Isitabelnya = {txtKd.getText(), txtNama.getText(), txtUsername.getText(), txtPassword.getText()};
            String NamaTabel = "tbl_admin";
            if (txtKd.getText().isEmpty()){ //jika Id kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Kode Admin Belum Di isi!");
                txtKd.requestFocus();
            } else if(txtNama.getText().isEmpty()) { //jika Nama kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Nama Belum Di isi!");
                txtNama.requestFocus();
            } else if(txtUsername.getText().isEmpty()){ //jika Kategori kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Username Belum Di isi!");
                txtUsername.requestFocus();
            } else if(txtPassword.getText().isEmpty()){ //jika Jumlah kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Password Belum Di isi!");
                txtPassword.requestFocus();
            } else if(obj.duplikasiKey("tbl_admin", "kd_admin", txtKd.getText())) { //jika text box ber isi
                JOptionPane.showMessageDialog(this, "Kode Admin sudah terdaftar");
                try {
                    Statement stm = obj.getKoneksi().createStatement();
                    ResultSet rslt = stm.executeQuery("SELECT * FROM tbl_admin WHERE kd_admin = "+txtKd.getText());
                    rslt.next();
                    txtKd.setText(rslt.getString(2));
                    txtNama.setText(rslt.getString(3));
                    txtUsername.setText(rslt.getString(4));
                    txtPassword.setText(rslt.getString(5));
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e.toString());
                }
            } else {
                obj.simpanDBAuto(NamaTabel, FieldTabelnya, Isitabelnya);
                tampilDataAdmin();
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Simpan, YAY!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbahActionPerformed
        try {
            if ((txtKd.getText().isEmpty()) && (txtNama.getText().isEmpty()) && (txtUsername.getText().isEmpty()) && (txtPassword.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu!");
                jTableAdmin.requestFocus();
            } else {
                String[] FieldTabelnya ={"nama_admin", "username_admin", "password_admin"};
                String[] Isitabelnya = {txtNama.getText(), txtUsername.getText(), txtPassword.getText()};
                String NamaTabel = "tbl_admin";
                String kd_admin = txtKd.getText();
                obj.UbahDBAuto(NamaTabel, "kd_admin", kd_admin, FieldTabelnya, Isitabelnya);
                tampilDataAdmin();
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Ubah!");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jUbahActionPerformed

    private void jHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusActionPerformed
        try {
            if ((txtKd.getText().isEmpty()) && (txtNama.getText().isEmpty()) && (txtUsername.getText().isEmpty()) && (txtPassword.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Yang Akan Di Hapus Terlebih Dahulu!");
                jTableAdmin.requestFocus();
            } else {
                String NamaTabel = "tbl_admin";
                String kd_admin = txtKd.getText();
                obj.HapusDBAuto(NamaTabel, "kd_admin", kd_admin);
                tampilDataAdmin();
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus!");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_jHapusActionPerformed

    private void jTableAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdminMouseClicked
        try {
            int i = jTableAdmin.getSelectedRow();
            String kd_admin = jTableAdmin.getValueAt(i, 0).toString();
            String nama_admin = jTableAdmin.getValueAt(i, 1).toString();
            String username_admin = jTableAdmin.getValueAt(i, 2).toString();
            String password_admin = jTableAdmin.getValueAt(i, 3).toString();
        
            txtKd.setText(kd_admin);
            txtNama.setText(nama_admin);
            txtUsername.setText(username_admin);
            txtPassword.setText(password_admin);   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }        
    }//GEN-LAST:event_jTableAdminMouseClicked

    private void jReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportActionPerformed
        String cari = txtCari.getText();
        String SQL = "SELECT * FROM tbl_admin WHERE kd_admin LIKE '%"+cari+"%' OR nama_admin LIKE '%"+cari+"%' OR username_admin LIKE '%"+cari+"%'";
        obj.tampilLaporan("src/report/lapAdmin.jrxml", SQL);
    }//GEN-LAST:event_jReportActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String clear = "";
        
        txtKd.setText(clear);
        txtNama.setText(clear);
        txtUsername.setText(clear);
        txtPassword.setText(clear);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        try {
            String cari = txtCari.getText();
            String SQL = "SELECT * FROM tbl_admin WHERE kd_admin LIKE '%"+cari+"%' OR nama_admin LIKE '%"+cari+"%' OR username_admin LIKE '%"+cari+"%'";
            
            String[] JudulKolom = {"kd_admin", "nama_admin", "username_admin", "password_admin"}; //kolom yang akan di tampilkan
            int[] lebar ={100, 100, 100, 100}; //lebar masing-masing kolom
            obj.JudulJTable(jTableAdmin, JudulKolom); //judul kolom
            obj.tampilTable(JudulKolom, SQL, jTableAdmin); //isi tabel
            obj.LebarJtable(jTableAdmin, lebar); //lebar kolom
            
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_txtCariKeyPressed

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
            java.util.logging.Logger.getLogger(frameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JButton jUbah;
    private javax.swing.JLabel lblJmlData;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKd;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
