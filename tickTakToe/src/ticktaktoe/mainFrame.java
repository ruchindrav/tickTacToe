/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktaktoe;

/**
 *
 * @author Ruchi
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
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

        singlePlayerButton = new javax.swing.JButton();
        multyPlayerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setPreferredSize(new java.awt.Dimension(500, 700));
        getContentPane().setLayout(null);

        singlePlayerButton.setBackground(new java.awt.Color(0, 0, 0));
        singlePlayerButton.setForeground(new java.awt.Color(255, 255, 255));
        singlePlayerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticktaktoe/game_controller.png"))); // NOI18N
        singlePlayerButton.setText("Single Player");
        singlePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singlePlayerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(singlePlayerButton);
        singlePlayerButton.setBounds(60, 190, 190, 80);

        multyPlayerButton.setBackground(new java.awt.Color(0, 0, 0));
        multyPlayerButton.setForeground(new java.awt.Color(255, 255, 255));
        multyPlayerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticktaktoe/game_controller.png"))); // NOI18N
        multyPlayerButton.setText("Multi Player");
        getContentPane().add(multyPlayerButton);
        multyPlayerButton.setBounds(60, 100, 190, 81);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select a game mode to play");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 430, 29);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticktaktoe/login.png"))); // NOI18N
        jButton1.setText("log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 400, 170, 70);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticktaktoe/register.png"))); // NOI18N
        jButton2.setText("Register");
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 400, 170, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\OOSD\\projectRe\\blurry_blue_background.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(3, -5, 640, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loginForm newLogin=new loginForm();
        newLogin.setVisible(true);
        newLogin.setSize(600,400);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void singlePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singlePlayerButtonActionPerformed
        // TODO add your handling code here:
        
        singlePlayerAlgo test=new singlePlayerAlgo();
        System.out.println(test.checkWin());
        this.dispose();
        singlePlayerGame singlePlayer=new singlePlayerGame();
        singlePlayer.setVisible(true);
        singlePlayer.setSize(600,400);
        
        
    }//GEN-LAST:event_singlePlayerButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multyPlayerButton;
    private javax.swing.JButton singlePlayerButton;
    // End of variables declaration//GEN-END:variables
}
