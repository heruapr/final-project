/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import databaseKamarr.databaseKamarr;
import static hotel.pelanggan.denda;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HERU A
 */
public class formCheckOut extends javax.swing.JDialog {

    /**
     * Creates new form formCheckOut
     */
    public formCheckOut(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        kolomIDCO = new javax.swing.JTextField();
        kolomNamaCO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        kolomKelasCO = new javax.swing.JTextField();
        kolomNomorCO = new javax.swing.JTextField();
        kolomTanggalCI = new javax.swing.JTextField();
        kolomTanggalCO = new javax.swing.JTextField();
        tra = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CheckOut");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 11, -1, -1));

        kolomIDCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomIDCOActionPerformed(evt);
            }
        });
        getContentPane().add(kolomIDCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 200, 180, -1));
        getContentPane().add(kolomNamaCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 180, -1));

        jButton1.setText("CheckOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 80, 40));
        getContentPane().add(kolomKelasCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 290, 180, -1));

        kolomNomorCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomNomorCOActionPerformed(evt);
            }
        });
        getContentPane().add(kolomNomorCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 180, -1));
        getContentPane().add(kolomTanggalCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 400, 180, -1));

        kolomTanggalCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomTanggalCOActionPerformed(evt);
            }
        });
        getContentPane().add(kolomTanggalCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 470, 180, -1));

        tra.setText("transaksi");
        tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traActionPerformed(evt);
            }
        });
        getContentPane().add(tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 120, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("H:\\Backup\\Kasar-OUT.gif")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolomIDCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomIDCOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomIDCOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        CO co=new CO(kolomNamaCO.getText(),kolomIDCO.getText(),kolomKelasCO.getText(),kolomNomorCO.getText());
        if(kolomKelasCO.getText().equalsIgnoreCase("reguler")){
            
            try {
                checkout rc=new checkout(kolomNamaCO.getText(),kolomIDCO.getText(),100000,kolomKelasCO.getText(),kolomNomorCO.getText());
                databaseKamarr dbr=new databaseKamarr();
                dbr.dbR();
                 Locale lokal = null;
        String pola = "dd-MMMM-yyyy HH:mm:ss:SSS";
        String waktuSatuStr = kolomTanggalCI.getText();
        String waktuDuaStr = kolomTanggalCO.getText();
        Date waktuSatu = pelanggan.konversiStringkeDate(waktuSatuStr,
                pola, lokal);
        Date WaktuDua = pelanggan.konversiStringkeDate(waktuDuaStr, pola,
                lokal);
         String hasilSelisih = pelanggan.selisihDateTime(waktuSatu,
                WaktuDua);
         pelanggan p=new pelanggan();
         p.getDenda();
                System.out.println(denda);
                

            } catch (IOException ex) {
                Logger.getLogger(formCheckOut.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }
       else if(kolomKelasCO.getText().equalsIgnoreCase("premium")){
            
            try {
                checkout2 rc=new checkout2(kolomNamaCO.getText(),kolomIDCO.getText(),200000,kolomKelasCO.getText(),kolomNomorCO.getText());
                databaseKamarr dbp=new databaseKamarr();
                dbp.dbP();
            } catch (IOException ex) {
                Logger.getLogger(formCheckOut.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }
        else if(kolomKelasCO.getText().equalsIgnoreCase("suite")){
            
            try {
                checkout3 rc=new checkout3(kolomNamaCO.getText(),kolomIDCO.getText(),350000,kolomKelasCO.getText(),kolomNomorCO.getText());
                databaseKamarr dbs=new databaseKamarr();
                dbs.dbS();
            } catch (IOException ex) {
                Logger.getLogger(formCheckOut.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       else if(kolomKelasCO.getText().equalsIgnoreCase("vip")){
            try {
                checkout4 rc=new checkout4(kolomNamaCO.getText(),kolomIDCO.getText(),750000,kolomKelasCO.getText(),kolomNomorCO.getText());
                databaseKamarr dbv=new databaseKamarr();
                dbv.dbV();
            } catch (IOException ex) {
                Logger.getLogger(formCheckOut.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void kolomNomorCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomNomorCOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomNomorCOActionPerformed

    private void kolomTanggalCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomTanggalCOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomTanggalCOActionPerformed

    private void traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traActionPerformed
    new cetakT().setVisible(true);
    }//GEN-LAST:event_traActionPerformed

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
            java.util.logging.Logger.getLogger(formCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formCheckOut dialog = new formCheckOut(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField kolomIDCO;
    private javax.swing.JTextField kolomKelasCO;
    private javax.swing.JTextField kolomNamaCO;
    private javax.swing.JTextField kolomNomorCO;
    private javax.swing.JTextField kolomTanggalCI;
    private javax.swing.JTextField kolomTanggalCO;
    private javax.swing.JButton tra;
    // End of variables declaration//GEN-END:variables
}
