package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i13050
 */
public class PaketInternetUpdate2 extends javax.swing.JPanel {

    JFrame jf;
    /**
     * Creates new form SignIn
     */
    public PaketInternetUpdate2(JFrame j) {
        initComponents();
        jf=j;
        tabelPaketInternet.setModel(DbUtils.resultSetToTableModel(this.showTabel()));
        ResultSet rs=this.search("NamaPaket", PaketInternetUpdate1.class.getName());
//        textFieldNama.setText(rs.getString("Nama_Paket"));
//        textFieldHarga.setText(rs.getString("hargaPaket"));
//        textFieldKuota.setText(rs.getString("kuota"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPaketInternet = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textFieldKuota = new javax.swing.JTextField();
        textFieldHarga = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PAKET INTERNET");

        tabelPaketInternet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAMA PAKET", "HARGA PAKET", "KUOTA PAKET"
            }
        ));
        jScrollPane1.setViewportView(tabelPaketInternet);

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Paket        :");

        jLabel5.setText("Harga Paket       :");

        jLabel6.setText("Kuota Paket       :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(32, 32, 32)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldKuota, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                .addComponent(textFieldHarga)
                                .addComponent(textFieldNama)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldKuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(200, 200, 200))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ResultSet rs=this.search("namaPaket", PaketInternetUpdate1.class.getName());
        int a=0,b=0,c=0;
        try {
            if(!textFieldNama.getText().equals(rs.getString("namaPaket")))
            {
                this.update("nama", rs.getString("namaPaket"), "nama", textFieldNama.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                a=1;
            }
            if(!textFieldHarga.getText().equals(rs.getString("hargaPaket")))
            {
                this.update("harga", rs.getString("hargaPaket"), "harga", textFieldHarga.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                b=1;
            }
            if(!textFieldKuota.getText().equals(rs.getString("kuota")))
            {
                this.update("kuota", rs.getString("kuota"), "kuota", textFieldKuota.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                c=1;
            }
            if(a==0 && b==0 && c==0)
            {
                JOptionPane.showMessageDialog(null, "Tidak Ada Data Yang Diupdate!!!");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(PaketInternetUpdate2.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabelPaketInternet.setModel(DbUtils.resultSetToTableModel(this.showTabel()));
                                                

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jf.setPanel(jf.pie);
    }//GEN-LAST:event_jButton2ActionPerformed

    public ResultSet showTabel()
    {
        ResultSet rs=null;
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13042;password=christ0fer;database=i13042");      
            Statement sta = conn.createStatement();
            String query = "select * from Paket_Internet";
            
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
            String query="UPDATE Paket_Internet SET "+tipe+"='"+inputTipe+"' where "+tipe2+"='"+input+"'";
            sta.executeQuery(query);              
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
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
            String query = "select * from Paket_Internet where "+tipe+"="+input;
            
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPaketInternet;
    private javax.swing.JTextField textFieldHarga;
    private javax.swing.JTextField textFieldKuota;
    private javax.swing.JTextField textFieldNama;
    // End of variables declaration//GEN-END:variables
}

