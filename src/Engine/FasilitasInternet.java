package Engine;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christofer Indra Sinarya / 2013730042
 *         Ariel Jayapermana / 2013730050
 */
public class FasilitasInternet {
    /*
    method show buat nampilin semua isi tabel
    */
    public ResultSet show()
    {
        ResultSet rs=null;
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query = "select * from Fasilitas_Internet";
            
            rs = sta.executeQuery(query);
            /*while (rs.next()) 
            {
                System.out.println(rs.getString("title"));
            }*/            
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return rs;        
    }
    
    /*
    method search buat nampilin 1 record atau lebih yang kita cari
    sesuai dengan kolom dan isinya
    */
    public ResultSet search(String tipe, String input)
    {
        ResultSet rs=null;
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query = "select * from Fasilitas_Internet where "+tipe+"="+input;
            
            rs = sta.executeQuery(query);
            /*while (rs.next()) 
            {
                System.out.println(rs.getString("title"));
            }*/            
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
    /*
    method untuk insert data baru ke database
    */
    public void insertFasilitasInternet(String nama, boolean browsing, boolean mail, boolean sosmed, int sms, int telepon)
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query="INSERT INTO Fasilitas_Internet values('"+nama+"',";
            
            if(browsing==true)
            {
                query+="'Y',";
            }
            else
            {
                query+="'N',";
            }
            
            if(mail==true)
            {
                query+="'Y',";
            }
            else
            {
                query+="'N',";
            }
            
            if(sosmed==true)
            {
                query+="'Y',";
            }
            else
            {
                query+="'N',";
            }
            
            String temp="'"+sms+"/hari',";            
            query+=temp+"";
            
            temp="'"+telepon+" jam/hari'";
            query+=temp;
            
            query+=")";
            sta.executeQuery(query);              
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }
    
    /*
    method untuk delete data yang sudah ada dari database
    */
    public void delete(String tipe, String input)
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query="DELETE from Fasilitas_Internet where "+tipe+"='"+input+"'";
            sta.executeQuery(query);              
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } 
    }
    
    /*
    method update untuk mengubah data
    param tipe dan inputTipe sebagai data baru
    param tipe2 dan input sebagai kata kunci untuk mencari record
    yang datanya akan dirubah
    */
    public void update(String tipe, String inputTipe, String tipe2, String input)
    {        
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query="UPDATE Fasilitas_Internet SET "+tipe+"='"+inputTipe+"' where "+tipe2+"='"+input+"'";
            sta.executeQuery(query);              
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }
}
