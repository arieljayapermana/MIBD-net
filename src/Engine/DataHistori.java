package Engine;


import java.sql.Connection;
import java.sql.Date;
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
public class DataHistori {
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
            String query = "select * from Data_Histori";
            
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
            String query = "select * from Data_Histori where "+tipe+"="+input;
            
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
    public void insertDataHistori(int id, String nama, String tanggalPerpanjang, int kuotaTambahan, int akumulasiKuota)
    {
        String tempTanggal,tempBulan,tempTahun;
        
        tempTanggal=tanggalPerpanjang.substring(0,2);
        int tanggal=Integer.parseInt(tempTanggal);        
        
        tempBulan=tanggalPerpanjang.substring(3,5);
        int bulan=Integer.parseInt(tempBulan);        
        
        tempTahun=tanggalPerpanjang.substring(6,10);
        int tahun=Integer.parseInt(tempTahun); 
        
        Date date=new Date(tahun-1900, bulan-1, tanggal);
        
        String tambahan="'"+kuotaTambahan+" mb'";
        String akumulasi="'"+akumulasiKuota+" mb'";
        
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query="INSERT INTO Data_Histori values("+id+",'"+nama+"',"+date+","+tambahan+","+akumulasi+")";
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
            String query="DELETE from Data_Histori where "+tipe+"='"+input+"'";
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
            String query="UPDATE Data_Histori SET "+tipe+"='"+inputTipe+"' where "+tipe2+"='"+input+"'";
            sta.executeQuery(query);              
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }
}
