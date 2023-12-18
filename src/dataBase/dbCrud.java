/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.io.File;
import java.net.ConnectException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Administrator 10
 */
public class dbCrud {
    private String Database = "muhammadhamdani_2110010302";
    private String jdbcurl = "jdbc:mysql://localhost:3306/"+Database;
    private String username = "root";
    private String password = "";
    
    public dbCrud(){}
    
    public dbCrud(String url, String username, String password){
        try {
            Driver mysqldriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqldriver);
            Connection koneksi = DriverManager.getConnection(url, username, password);
            System.out.println("Berhasil dikoneksikan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public Connection getKoneksi() throws SQLException{
        try {
            Driver mysqldriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqldriver);
            System.out.println("Berhasil Dikoneksikan");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    return DriverManager.getConnection(this.jdbcurl, this.username, this.password);
    }
    
    public boolean duplikasiKey(String tabel, String primarykey, String isi){
        boolean hasil= false;
        try {
            Statement sts = getKoneksi().createStatement();
            ResultSet rs = sts.executeQuery("SELECT * FROM "+tabel+" WHERE "+primarykey+" = '"+isi+"'");
            hasil = rs.next();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return hasil;
    }
    
    public String getFieldTable (String[] Fieldnya){ //mengubah field yang dijabarkan dari array
        String hasil = "";
        int deteksi = Fieldnya.length-1;
        try {
            for(int i = 0; i < Fieldnya.length; i++){
                if (i==deteksi){
                    hasil = hasil + Fieldnya[i];
                } else {
                    hasil = hasil + Fieldnya[i]+ ",";
                }                   
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "("+hasil+")";
    }
    
    public String getIsiTabel(String[] Isinya){ //mengubah value untuk field yang dijabarkan dari array
        String hasil = "";
        int deteksi = Isinya.length-1;
            try {
                for (int i = 0; i < Isinya.length; i++){
                    if (i == deteksi){
                        hasil = hasil+"'"+Isinya[i]+"'";
                    } else {
                        hasil = hasil+"'"+Isinya[i]+"',";
                    }
                }
            } catch (Exception e) {
                System.out.println(e.toString());
        }
        return "("+hasil+")";
    }
    
    public void simpanDBAuto(String NamaTabel, String[] FieldTabelnya, String[] Isitabelnya){ //mengambil dari getFieldTable dan getIsiTable dan menjadikannya satu kueri insert
        try {
            String SQL = "INSERT INTO "+NamaTabel+" "+getFieldTable(FieldTabelnya)+" VALUES "+getIsiTabel(Isitabelnya);
            Statement save = getKoneksi().createStatement();
            save.executeUpdate(SQL);
            save.close();;
            System.out.println(SQL);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    public String getEditFieldValue(String[] Field, String[] ValueField){ //mengubah value berbentuk array untuk diproses sebagai value dalam kueri UPDATE
        String hasil = "";
        int deteksi = Field.length-1;
        try {
            for (int i = 0; i < Field.length; i++) {
                if ( i == deteksi) {
                    hasil = hasil + Field[i]+"='"+ValueField[i]+"'";
                } else {
                    hasil = hasil + Field[i]+"='"+ValueField[i]+"', ";
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return  hasil;
    }
    
    public void UbahDBAuto (String NamaTabel, String NamaPrimary, String IsiPrimary, String[]Field, String[] ValueField){ //memasukkan data dari getEditValue menjadi kueri UPDATE
        try {
            String SQLEdit = "UPDATE "+NamaTabel+" SET "+getEditFieldValue(Field, ValueField)+" WHERE "+NamaPrimary+"='"+IsiPrimary+"'";
            Statement perintah = getKoneksi().createStatement();
            perintah.executeUpdate(SQLEdit);
            perintah.close();
            getKoneksi().close();
            System.err.println("Data Berhasil diubah");
            System.err.println(SQLEdit);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
