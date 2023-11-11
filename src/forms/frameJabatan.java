/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import dataBase.koneksi;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator 10
 */
public class frameJabatan extends javax.swing.JFrame {
    
    koneksi objekku; //variable objekku
    DefaultTableModel modelTabelJabatan; //this is datasource equivalent in delphi, i guess...
    /**
     * Creates new form frameBahan
     */
    public frameJabatan() { //konstruktor
        initComponents();
        this.setLocationRelativeTo(null);
        objekku = new koneksi();//instance of variable objekku
        modelTabelJabatan = new DefaultTableModel(); //instance/create datasourcenya
        jTableJabatan.setModel(modelTabelJabatan);//koneksi datasource
        //menambahkan kolom
        modelTabelJabatan.addColumn("kd_jabatan");
        modelTabelJabatan.addColumn("nama_jabatan");
        
        loadTabelJabatan();
    }
    
    void loadTabelJabatan(){
        try {
            String sql = "SELECT * FROM tbl_jabatan";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sql);//mengambil data kueri
            ResultSet data = kueri.executeQuery();//mengambil data, i guess(?)
            
            while(data.next()){ //selama "data" ada
                Object[] baris = new Object[5];
                baris[0] = data.getString("kd_jabatan");
                baris[1] = data.getString("nama_jabatan");
                modelTabelJabatan.addRow(baris);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKd = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableJabatan = new javax.swing.JTable();

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

        jLabel1.setText("kode jabatan");

        jLabel2.setText("nama jabatan");

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

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableJabatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableJabatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJabatanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableJabatan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKd, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtNama)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKd, txtNama});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtKd.getText().isEmpty()){ //jika Id kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Kode Jabatan Belum Di isi!");
                txtKd.requestFocus();
            } else if(txtNama.getText().isEmpty()) { //jika Nama kosong, tampilkan pesan
                JOptionPane.showMessageDialog(this, "Nama Jabatan Belum Di isi!");
                txtNama.requestFocus();
            } else { //jika text box ber isi
                String sqlCari = "SELECT * FROM tbl_jabatan WHERE kd_jabatan = ?"; //cek semua id sebelum input
                PreparedStatement cari = objekku.konekDB.prepareStatement(sqlCari);
                cari.setString(1, txtKd.getText());
                ResultSet hasil = cari.executeQuery();
                if (hasil.next()){ //jika id input ada
                    JOptionPane.showMessageDialog(this, "Kode Jabatan SUDAH ADA!");
                    //tampilkan data yang sudah ada sesuai dengan id yang di masukkan
                    txtKd.setText(hasil.getString("kd_jabatan"));
                    txtNama.setText(hasil.getString("nama_jabatan"));
                } else { //jika id input tidak ada yang sama
                    String sqlSimpan = "INSERT INTO tbl_jabatan VALUE (?, ?)";
                    PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlSimpan);
                
                    kueri.setString(1, txtKd.getText());
                    kueri.setString(2, txtNama.getText());
                    
                    kueri.executeUpdate();
                    loadTabelJabatan();
                    
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Simpan.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String sqlUbah = "UPDATE tbl_jabatan set nama_jabatan=? where kd_jabatan=?";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlUbah);
            
            kueri.setString(2, txtKd.getText());
            kueri.setString(1, txtNama.getText());
            kueri.executeUpdate();
            loadTabelJabatan();
            
            JOptionPane.showMessageDialog(this, "User-sama, data berhasil di ubah.");
            
        } catch (Exception e) { //i have a love/hate relationship with this thing
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String sqlHapus = "DELETE FROM tbl_jabatan where kd_jabatan = ?";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlHapus);
            
            kueri.setString(1, txtKd.getText());
            
            kueri.executeUpdate();
            loadTabelJabatan();
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableJabatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJabatanMouseClicked
        int i = jTableJabatan.getSelectedRow();
        String kd_jabatan = jTableJabatan.getValueAt(i, 0).toString();
        String nama_jabatan = jTableJabatan.getValueAt(i, 1).toString();
        
        txtKd.setText(kd_jabatan);
        txtNama.setText(nama_jabatan);
    }//GEN-LAST:event_jTableJabatanMouseClicked

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
            java.util.logging.Logger.getLogger(frameJabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameJabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameJabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameJabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameJabatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableJabatan;
    private javax.swing.JTextField txtKd;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
