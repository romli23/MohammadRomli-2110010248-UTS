/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
    }

    void bersih(){
        tusername.setText("username");
        tpassword.setText("password");
    }
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tusername = new javax.swing.JTextField();
        tpassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-32.png"))); // NOI18N
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });
        jPanel1.add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-computer-100.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 124));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-welcome-100.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiple-users-silhouette.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        tusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tusername.setText("username");
        tusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tusernameFocusGained(evt);
            }
        });
        tusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tusernameActionPerformed(evt);
            }
        });
        jPanel1.add(tusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 40));

        tpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tpassword.setText("password");
        tpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tpasswordFocusGained(evt);
            }
        });
        jPanel1.add(tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 40));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOTES APLICATION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 468, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bt_exitMouseClicked

    private void tusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tusernameActionPerformed

    private void tusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tusernameFocusGained
           String username = tusername.getText() ; 
           if(username.equals("username")){  // untuk mengosongkan bila label diklik
           tusername.setText("");
           }// TODO add your handling code here:
    }//GEN-LAST:event_tusernameFocusGained

    private void tpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tpasswordFocusGained
        String password = tpassword.getText() ; 
           if(password.equals("password")){
           tpassword.setText("");       // untuk  mengosongkan bila label di klik
           }// TODO add your handling code here:
    }//GEN-LAST:event_tpasswordFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ((tusername.getText().equals("romli")) && (String.valueOf(tpassword.getText()).equals("romli"))){
            new TambahCatatan().setVisible(true);  //jika username dan password benar makan akan membuka halaman selanjutnya
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, tusername.getText()+"Username atau password anda salah","Warning",JOptionPane.ERROR_MESSAGE);
            tusername.setText(""); //untuk menampilkan pesan bahwa username atau password salah dan akan langsung mengosongkan field
            tpassword.setText("");
            tusername.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tpassword;
    private javax.swing.JTextField tusername;
    // End of variables declaration//GEN-END:variables
}
