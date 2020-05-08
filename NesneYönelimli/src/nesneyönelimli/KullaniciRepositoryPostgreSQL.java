/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneyönelimli;
//package edu.sau.vys.vys1;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class KullaniciRepositoryPostgreSQL {
    private Connection baglan() throws Exception{
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DenetleyiciSistemi","postgres", "postgres");
            
            if(conn != null)
                System.out.println("Veritabanına bağlandınız...");
            else
                System.out.println("Veritabanı ile bağlantınız kurulamadı...");
        }
        catch(SQLException e){
        }
        return conn;
    }
    public boolean KullaniciSorgula(String ad, String sifre) throws Exception{
        
        System.out.println("Kontrol ediliyor...");

        String sql = "SELECT count(kullaniciadi) as giris FROM users WHERE kullaniciadi = '"+ad+"' AND sifre = '"+sifre+"'";
        int getint = 0;
        
        Connection conn = this.baglan();
        try{
            Statement stmt = conn.createStatement(
                                          ResultSet.TYPE_SCROLL_INSENSITIVE,
                                          ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            rs.next();
            getint = rs.getInt("giris");
            
            rs.close();
            stmt.close();
            
        }catch(Exception e){e.printStackTrace();}
        
        if(getint == 1)
            return true;
        else
            return false;
    }
 
    
}
