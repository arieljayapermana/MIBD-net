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
public class FasilitasInternetUpdate2 extends javax.swing.JPanel {

    JFrame jf;
    /**
     * Creates new form SignIn
     */
    public FasilitasInternetUpdate2(JFrame j) {
        initComponents();
        jf=j;
        jTable1.setModel(DbUtils.resultSetToTableModel(this.showTabel()));

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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        textFieldBrowsing = new javax.swing.JTextField();
        textFieldMail = new javax.swing.JTextField();
        textFieldSosmed = new javax.swing.JTextField();
        textFieldSms = new javax.swing.JTextField();
        textFieldTelepon = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FASILITAS INTERNET");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Browsing", "Mail", "Sosmed", "SMS", "Telepon"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        jLabel4.setText("Mail                    :");

        jLabel3.setText("Browsing            :");

        jLabel2.setText("Nama                  :");

        jLabel5.setText("Sosmed              :");

        jLabel6.setText("SMS                    :");

        jLabel7.setText("Telepon              :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(19, 19, 19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(1, 1, 1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(textFieldBrowsing, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(textFieldTelepon))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(textFieldSms))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(textFieldSosmed, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(268, 268, 268)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldBrowsing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldSosmed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jf.setPanel(new FasilitasInternetEdit(jf));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ResultSet rs=this.search("namaPaket", PaketInternetUpdate1.class.getName());
        int a=0,b=0,c=0,d=0,e=0,f=0;
        try {
            if(!textFieldNama.getText().equals(rs.getString("namaPaket")))
            {
                this.update("nama", rs.getString("namaPaket"), "nama", textFieldNama.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                a=1;
            }
            if(!textFieldBrowsing.getText().equals(rs.getString("browsing")))
            {
                this.update("browsing", rs.getString("browsing"), "browsing", textFieldBrowsing.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                b=1;
            }
            if(!textFieldMail.getText().equals(rs.getString("mail")))
            {
                this.update("mail", rs.getString("mail"), "mail", textFieldMail.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                c=1;
            }
            if(!textFieldSosmed.getText().equals(rs.getString("sosmed")))
            {
                this.update("sosmed", rs.getString("sosmed"), "sosmed", textFieldSosmed.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                d=1;
            }
            if(!textFieldSms.getText().equals(rs.getString("sms")))
            {
                this.update("sms", rs.getString("sms"), "sms", textFieldSms.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                e=1;
            }
            if(!textFieldTelepon.getText().equals(rs.getString("telepon")))
            {
                this.update("telepon", rs.getString("telepon"), "telepon", textFieldTelepon.getText());
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!!");
                f=1;
            }
            if(a==0 && b==0 && c==0 && d==0 && e==0 && f==0)
            {
                JOptionPane.showMessageDialog(null, "Tidak Ada Data Yang Diupdate!!!");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(PaketInternetUpdate2.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(DbUtils.resultSetToTableModel(this.showTabel()));
    }//GEN-LAST:event_jButton1ActionPerformed

public ResultSet showTabel()
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textFieldBrowsing;
    private javax.swing.JTextField textFieldMail;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldSms;
    private javax.swing.JTextField textFieldSosmed;
    private javax.swing.JTextField textFieldTelepon;
    // End of variables declaration//GEN-END:variables
}
