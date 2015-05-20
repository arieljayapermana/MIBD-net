package GUI;

import GUI.*;
import GUI.DataCustomerService.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i13050
 */
public class JFrame extends javax.swing.JFrame {
    
    public Connection conn;
    public Statement sta;
    
    public DataCustomerService dcs;
    
    public DataCustomerServiceEdit dcse;
    
    public DataPerpanjanganPaketInternet dppi;
    public DataPelanggan dpl;
    public DataPenggunaan dpg;
    public FasilitasInternet fi;
    public MenuUtamaCustomerService mucs;
    public MenuUtamaManager mum;
    public PaketInternet pi;
    public SignIn si;
    public DataCustomerServiceDelete dcsd;
    public DataCustomerServiceInsert dcsi;
    public DataCustomerServiceUpdate1 dcsu1;
    public DataCustomerServiceUpdate2 dcsu2;
    public DataPelangganDelete dpld;
    public DataPelangganEdit dple;
    public DataPelangganInsert dpli;
    public DataPelangganUpdate1 dplu1;
    public DataPelangganUpdate2 dplu2;
    public DataPerpanjanganPaketInternetDelete dppid;
    public DataPerpanjanganPaketInternetEdit dppie;
    public DataPerpanjanganPaketInternetInsert dppii;
    public DataPerpanjanganPaketInternetUpdate1 dppiu1;
    public DataPerpanjanganPaketInternetUpdate2 dppiu2;
    public FasilitasInternetDelete fid;
    public FasilitasInternetEdit fie;
    public FasilitasInternetInsert fii;
    public FasilitasInternetUpdate1 fiu1;
    public FasilitasInternetUpdate2 fiu2;
    public PaketInternetDelete pid;
    public PaketInternetEdit pie;
    public PaketInternetInsert pii;
    public PaketInternetUpdate1 piu1;
    public PaketInternetUpdate2 piu2;
    
    
    /**
     * Creates new form GUI
     */
    public JFrame() throws SQLException {
        initComponents();
        
        dcs=new DataCustomerService(this);
        dcsd=new DataCustomerServiceDelete(this);
        dcse=new DataCustomerServiceEdit(this);
        dcsi=new DataCustomerServiceInsert(this);
        dcsu1=new DataCustomerServiceUpdate1(this);
        dcsu2=new DataCustomerServiceUpdate2(this);
        
        dpl=new DataPelanggan(this);
        dpld=new DataPelangganDelete(this);
        dple=new DataPelangganEdit(this);
        dpli=new DataPelangganInsert(this);
        dplu1=new DataPelangganUpdate1(this);
        dplu2=new DataPelangganUpdate2(this);
        
        dpg=new DataPenggunaan(this);
        
        dppi=new DataPerpanjanganPaketInternet(this);
        dppid=new DataPerpanjanganPaketInternetDelete(this);
        dppie=new DataPerpanjanganPaketInternetEdit(this);
        dppii=new DataPerpanjanganPaketInternetInsert(this);
        dppiu1=new DataPerpanjanganPaketInternetUpdate1(this);
        dppiu2=new DataPerpanjanganPaketInternetUpdate2(this);
        
        fi=new FasilitasInternet(this);
        fid=new FasilitasInternetDelete(this);
        fie=new FasilitasInternetEdit(this);
        fii=new FasilitasInternetInsert(this);
        fiu1=new FasilitasInternetUpdate1(this);
        fiu2=new FasilitasInternetUpdate2(this);
        
        pi=new PaketInternet(this);
        pid=new PaketInternetDelete(this);
        pie=new PaketInternetEdit(this);
        pii=new PaketInternetInsert(this);
        piu1=new PaketInternetUpdate1(this);
        piu2=new PaketInternetUpdate2(this);
        
        
        mucs=new MenuUtamaCustomerService(this);
        mum=new MenuUtamaManager(this);
        si=new SignIn(this);
        
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(si);
        jPanel1.repaint();
        jPanel1.revalidate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void setPanel(JPanel x){
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(x);
        jPanel1.repaint();
        jPanel1.revalidate();
        
    }
    
    public String getID(){
        return si. getID();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}