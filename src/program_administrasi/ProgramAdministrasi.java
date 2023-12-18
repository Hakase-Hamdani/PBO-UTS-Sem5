/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program_administrasi;
import dataBase.dbCrud;
import forms.frameAdmin;
import forms.frameJabatan;
import forms.framePegawai;
/**
 *
 * @author hakase
 */
public class ProgramAdministrasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //String[] field = {"nama_admin", "username_admin", "password_admin"};
        //String[] isiField = {"Dani", "2103BJM", "083109875456789"};
        dbCrud obj = new dbCrud();
        
        //obj.simpanDBAuto("tbl_admin", field, isiField);
        //obj.UbahDBAuto("tbl_admin", "kd_admin", "213", field, isiField);
        //obj.HapusDBAuto("tbl_admin", "kd_admin", "213");
        //System.out.println(obj.getFieldTable(field));
        //System.out.println(obj.getIsiTabel(isiField));



        //new frameAdmin().setVisible(true);
        System.out.print(String.valueOf(obj.isiTable("SELECT * FROM tbl_admin", 3)));
        //new frameJabatan().setVisible(true);
        //new framePegawai().setVisible(true);
        //new frameAdmin().setVisible(true);
        
        
        // new koneksi();
        
        //koneksi obj = new koneksi();
        //try {
              //obj.perintah.execute("INSERT INTO bahan VALUE ('kd02', 'Tepung Terigu', 'makanan', '20')");
              //obj.perintah.execute("UPDATE bahan set nama='Tepung Goreng', kategori='bahan mentah', qty='100' where id='kd01'");
              //obj.perintah.execute("DELETE FROM bahan WHERE id = 'kd01'");
              //String sql = "INSERT INTO bahan VALUE (?, ?, ?, ?)";
              //String sql = "UPDATE bahan set nama=?, kategori=?, qty=? where id=?";
              //String sql = "DELETE FROM bahan WHERE id = ?";
              //PreparedStatement kueri = obj.konekDB.prepareStatement(sql);
              
        //      kueri.setString(1, "kd01");
              //kueri.setString(2, "minuman bersoda");
              //kueri.setInt(3, 10);
              //kueri.setString(4, "kd01");
              
        //      kueri.executeUpdate();
        //} catch (SQLException ex) {
        //    System.out.print(ex);
        //}
    }
    
}
