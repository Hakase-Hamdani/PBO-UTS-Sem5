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
public class frameSuratMasuk extends javax.swing.JFrame {

    koneksi objekku;
    DefaultTableModel modelTabelSMasuk;
    public frameSuratMasuk() {
        initComponents();
        this.setLocationRelativeTo(null);
        objekku = new koneksi();
        modelTabelSMasuk = new DefaultTableModel();
        jTableSKeluar.setModel(modelTabelSMasuk);
        
        modelTabelSMasuk.addColumn("kd_suratmasuk");
        modelTabelSMasuk.addColumn("tgl_input");
        modelTabelSMasuk.addColumn("no_surat");
        modelTabelSMasuk.addColumn("pengirim");
        modelTabelSMasuk.addColumn("perihal");
        modelTabelSMasuk.addColumn("scan");
        modelTabelSMasuk.addColumn("kd_pegawai");
        modelTabelSMasuk.addColumn("tgl_disposisi");
        modelTabelSMasuk.addColumn("kd_jabatan");
        modelTabelSMasuk.addColumn("keterangan");
        modelTabelSMasuk.addColumn("kd_admin");
        
    }
    
    void loadTabelSMasuk(){
        try{
            String sql = "SELECT * FROM tbl_suratmasuk";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sql);
            ResultSet data = kueri.executeQuery();
            
            while(data.next()){
                Object[] baris = new Object[11];
                baris[0] = data.getString("");
                baris[1] = data.getString("");
                baris[2] = data.getString("");
                baris[3] = data.getString("");
                baris[4] = data.getString("");
                baris[5] = data.getString("");
                baris[6] = data.getString("");
                baris[7] = data.getString("");
                baris[8] = data.getString("");
                baris[9] = data.getString("");
                baris[10] = data.getString("");
                
                modelTabelSMasuk.addRow(baris);
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_pengirim = new javax.swing.JTextField();
        txt_kd_masuk = new javax.swing.JTextField();
        txt_no_masuk = new javax.swing.JTextField();
        txt_scan = new javax.swing.JTextField();
        txt_kodepegawai = new javax.swing.JTextField();
        txt_kodejabatan = new javax.swing.JTextField();
        txt_kdadmin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSKeluar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_perihal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txta_ket = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txt_tgl_masuk = new javax.swing.JTextField();
        txt_tgl_disposisi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("kode surat masuk");

        jLabel2.setText("tanggal input");

        jLabel3.setText("nomor surat masuk");

        jLabel4.setText("pengirim");

        jLabel5.setText("perihal");

        jLabel6.setText("scan");

        jLabel7.setText("kode pegawai");

        jLabel8.setText("tanggal disposisi");

        jLabel9.setText("kode jabatan");

        jLabel10.setText("keterangan");

        jLabel11.setText("kode admin");

        txt_pengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pengirimActionPerformed(evt);
            }
        });

        txt_kd_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kd_masukActionPerformed(evt);
            }
        });

        txt_no_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_masukActionPerformed(evt);
            }
        });

        txt_scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_scanActionPerformed(evt);
            }
        });

        txt_kodepegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodepegawaiActionPerformed(evt);
            }
        });

        txt_kodejabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodejabatanActionPerformed(evt);
            }
        });

        txt_kdadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kdadminActionPerformed(evt);
            }
        });

        jTableSKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode", "tanggal input", "nomor surat", "pengirim", "perihal", "scan file", "kode pegawail", "tanggal disposisi", "kode jabatan", "keterangan", "kode admin"
            }
        ));
        jTableSKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSKeluarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSKeluar);

        txta_perihal.setColumns(20);
        txta_perihal.setRows(5);
        jScrollPane2.setViewportView(txta_perihal);

        txta_ket.setColumns(20);
        txta_ket.setRows(5);
        jScrollPane3.setViewportView(txta_ket);

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txt_tgl_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tgl_masukActionPerformed(evt);
            }
        });

        txt_tgl_disposisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tgl_disposisiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel12.setText("*dalam format tahun-bulan-tanggal (tttt-bb-hh)");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel13.setText("*dalam format tahun-bulan-tanggal (tttt-bb-hh)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kodejabatan)
                            .addComponent(txt_kdadmin)
                            .addComponent(txt_kodepegawai)
                            .addComponent(txt_scan)
                            .addComponent(txt_pengirim)
                            .addComponent(txt_no_masuk)
                            .addComponent(txt_kd_masuk)
                            .addComponent(txt_tgl_masuk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_tgl_disposisi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(0, 16, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_kd_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_no_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_pengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_scan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_kodepegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_tgl_disposisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_kodejabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_kdadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pengirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pengirimActionPerformed

    private void txt_kd_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kd_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kd_masukActionPerformed

    private void txt_no_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_masukActionPerformed

    private void txt_scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_scanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_scanActionPerformed

    private void txt_kodepegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodepegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodepegawaiActionPerformed

    private void txt_kodejabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodejabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodejabatanActionPerformed

    private void txt_kdadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kdadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kdadminActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            if (txt_kd_masuk.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kode Surat Mausk Belum Di Masukkan!");
                txt_kd_masuk.requestFocus();
            } else if (txt_tgl_masuk.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tanggal Masuk Belum Di Masukkan!");
                txt_tgl_masuk.requestFocus();
            } else if (txt_no_masuk.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nomor Surat Belum Di Masukkan!");
                txt_no_masuk.requestFocus();
            } else if (txt_pengirim.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pengirim Surat Belum Di Masukkan!");
                txt_pengirim.requestFocus();
            } else if (txta_perihal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Perihal Surat Belum Di Masukkan!");
                txta_perihal.requestFocus();
            } else if (txt_scan.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Scan Surat Belum Di Masukkan!");
                txt_scan.requestFocus();
            } else if (txt_kodepegawai.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kode Pegawai Belum Di Masukkan!");
                txt_kodepegawai.requestFocus();
            } else if (txt_tgl_disposisi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tanggal Disposisi Belum Di Masukkan!");
                txt_tgl_disposisi.requestFocus();
            } else if (txt_kodejabatan.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kode Jabatan Belum Di Masukkan!");
                txt_kodejabatan.requestFocus();
            } else if (txta_ket.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Keterangan Surat Belum Di Masukkan!");
                txta_ket.requestFocus();
            } else if (txt_kdadmin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tanggal Masuk Belum Di Masukkan!");
                txt_kdadmin.requestFocus();
            } else {
                String sqlCari = "SELECT * FROM tbl_suratmasuk WHERE kd_suratmasuk = ?";
                PreparedStatement cari = objekku.konekDB.prepareStatement(sqlCari);
                cari.setString(1, txt_kd_masuk.getText());
                ResultSet hasil = cari.executeQuery();
                
                if (hasil.next()){
                    JOptionPane.showMessageDialog(this, "Kode Surat Masuk Sudah Ada!");
                    txt_kd_masuk.setText(hasil.getString("kd_suratmasuk"));
                    txt_tgl_masuk.setText(hasil.getString("tgl_inputsuratmasuk"));
                    txt_no_masuk.setText(hasil.getString("no_suratmasuk"));
                    txt_pengirim.setText(hasil.getString("pengirim_suratmasuk"));
                    txta_perihal.setText(hasil.getString("perihal_suratmasuk"));
                    txt_scan.setText(hasil.getString("scan_suratmasuk"));
                    txt_kodepegawai.setText(hasil.getString("kd_pegawai"));
                    txt_tgl_disposisi.setText(hasil.getString("tgl_disposisi"));
                    txt_kodejabatan.setText(hasil.getString("kd_jabatan"));
                    txta_ket.setText(hasil.getString("keterangan"));
                    txt_kdadmin.setText(hasil.getString("kd_admin"));
                } else {
                    String sqlSimpan = "INSERT INTO tbl_surat masuk VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlSimpan);
                    
                    kueri.setString(1, txt_kd_masuk.getText());
                    kueri.setString(2, txt_tgl_masuk.getText());
                    kueri.setString(3, txt_no_masuk.getText());
                    kueri.setString(4, txt_pengirim.getText());
                    kueri.setString(5, txta_perihal.getText());
                    kueri.setString(6, txt_scan.getText());
                    kueri.setString(7, txt_kodepegawai.getText());
                    kueri.setString(8, txt_tgl_disposisi.getText());
                    kueri.setString(9, txt_kodejabatan.getText());
                    kueri.setString(10, txta_ket.getText());
                    kueri.setString(11, txt_kdadmin.getText());
                    
                    kueri.executeUpdate();
                    loadTabelSMasuk();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Simpan!");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            String sqlUbah = "UPDATE tbl_suratmasuk SET tgl_inputsuratmasuk = ?, no_suratmasuk = ?, pengirim_suratmasuk = ?, perihal_suratmasuk = ?, scan_suratmasuk = ?, kd_pegawai = ?, tgl_disposisi = ?, kd_jabatan = ?, keterangan = ?, kd_admin = ? WHERE kd_suratmasuk = ?";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlUbah);
            
            kueri.setString(11, txt_kd_masuk.getText());
            kueri.setString(1, txt_tgl_masuk.getText());
            kueri.setString(2, txt_no_masuk.getText());
            kueri.setString(3, txt_pengirim.getText());
            kueri.setString(4, txta_perihal.getText());
            kueri.setString(5, txt_scan.getText());
            kueri.setString(6, txt_kodepegawai.getText());
            kueri.setString(7, txt_tgl_disposisi.getText());
            kueri.setString(8, txt_kodejabatan.getText());
            kueri.setString(9, txta_ket.getText());
            kueri.setString(10, txt_kdadmin.getText());
            kueri.executeUpdate();
            loadTabelSMasuk();
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Ubah!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
 
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sqlHapus = "DELETE FROM tbl_suratmasuk WHERE kd_suratmasuk = ?";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlHapus);
            
            kueri.setString(1, txt_kd_masuk.getText());
            
            kueri.executeUpdate();
            loadTabelSMasuk();
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txt_tgl_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tgl_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tgl_masukActionPerformed

    private void txt_tgl_disposisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tgl_disposisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tgl_disposisiActionPerformed

    private void jTableSKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSKeluarMouseClicked
        int i = jTableSKeluar.getSelectedRow();
        String kd_suratmasuk = jTableSKeluar.getValueAt(i, 0).toString();
        String tgl_inputsuratmasuk = jTableSKeluar.getValueAt(i, 1).toString();
        String no_suratmasuk = jTableSKeluar.getValueAt(i, 2).toString();
        String pengirim_suratmasuk = jTableSKeluar.getValueAt(i, 3).toString();
        String perihal_suratmasuk = jTableSKeluar.getValueAt(i, 4).toString();
        String scan_suratmasuk = jTableSKeluar.getValueAt(i, 5).toString();
        String kd_pegawai = jTableSKeluar.getValueAt(i, 6).toString();
        String tgl_disposisi = jTableSKeluar.getValueAt(i, 7).toString();
        String kd_jabatan = jTableSKeluar.getValueAt(i, 8).toString();
        String keterangan = jTableSKeluar.getValueAt(i, 9).toString();
        String kd_admin = jTableSKeluar.getValueAt(i, 10).toString();
        
        txt_kd_masuk.setText(kd_suratmasuk);
        txt_tgl_masuk.setText(tgl_inputsuratmasuk);
        txt_no_masuk.setText(no_suratmasuk);
        txt_pengirim.setText(pengirim_suratmasuk);
        txta_perihal.setText(perihal_suratmasuk);
        txt_scan.setText(scan_suratmasuk);
        txt_kodepegawai.setText(kd_pegawai);
        txt_tgl_disposisi.setText(tgl_disposisi);
        txt_kodejabatan.setText(kd_jabatan);
        txta_ket.setText(keterangan);
        txt_kdadmin.setText(kd_admin);
    }//GEN-LAST:event_jTableSKeluarMouseClicked

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
            java.util.logging.Logger.getLogger(frameSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameSuratMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableSKeluar;
    private javax.swing.JTextField txt_kd_masuk;
    private javax.swing.JTextField txt_kdadmin;
    private javax.swing.JTextField txt_kodejabatan;
    private javax.swing.JTextField txt_kodepegawai;
    private javax.swing.JTextField txt_no_masuk;
    private javax.swing.JTextField txt_pengirim;
    private javax.swing.JTextField txt_scan;
    private javax.swing.JTextField txt_tgl_disposisi;
    private javax.swing.JTextField txt_tgl_masuk;
    private javax.swing.JTextArea txta_ket;
    private javax.swing.JTextArea txta_perihal;
    // End of variables declaration//GEN-END:variables
}