/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author hakase
 */
public class koneksi {
    public Connection konekDB;
    public Statement perintah;
    
    public koneksi(){
        
        try {
            String namaDB = "pbo2_revised";
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost/" + namaDB;
            
            Class.forName("com.mysql.jdbc.Driver");
            konekDB = DriverManager.getConnection(url, username, password);
            perintah = konekDB.createStatement(); //statement
            
            System.out.println("Database berhasil di koneksikan.");

            //holy sh*t java is hard
        } catch (Exception e) {
            //menangkap kesalahan
            JOptionPane.showMessageDialog(null, e.toString());
        }
    };
}
