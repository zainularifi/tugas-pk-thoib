package kelas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author zainu
 */
public class koneksi {
    private Connection konekSQL;
    private String host="localhost";
    private String db ="tokokita";
    private String user="root";
    private String pasword="";
    private String port="3306";
    private String url="jdbc:mysql://"+host+":"+port+"/"+db;
    
    public Connection konekDB() throws SQLException{
        try {
            konekSQL = DriverManager.getConnection(url, user, pasword);
            System.out.println("koneksi berhasil");
        } catch (SQLException sQLException) {
            System.out.println("koneksi gagal");
        }
        return konekSQL;
        
    }
}
