/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktaktoe;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruchi
 */
public class singlePlayerGame extends javax.swing.JFrame {
    singlePlayerAlgo tickacktoeAlgo=new singlePlayerAlgo();
    imageHandling newImaHandling=new imageHandling();
    JButton[][] buttonArray=new JButton[3][3];
    supermanWins supermanWinForm=new supermanWins();
    /**
     * Creates new form singlePlayerGame
     */
    public singlePlayerGame() {
        initComponents();
        
        buttonArray[0][0]=button00;
        buttonArray[0][1]=button01;
        buttonArray[0][2]=button02;
        buttonArray[1][0]=button10;
        buttonArray[1][1]=button11;
        buttonArray[1][2]=button12;
        buttonArray[2][0]=button20;
        buttonArray[2][1]=button21;
        buttonArray[2][2]=button22;
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button00 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Single Player Game");
        setBounds(new java.awt.Rectangle(600, 300, 0, 0));
        getContentPane().setLayout(null);

        button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button00ActionPerformed(evt);
            }
        });
        getContentPane().add(button00);
        button00.setBounds(74, 89, 89, 77);

        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        getContentPane().add(button10);
        button10.setBounds(74, 172, 89, 77);

        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });
        getContentPane().add(button20);
        button20.setBounds(74, 255, 89, 77);

        button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button01ActionPerformed(evt);
            }
        });
        getContentPane().add(button01);
        button01.setBounds(169, 89, 89, 77);

        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        getContentPane().add(button11);
        button11.setBounds(169, 172, 89, 77);

        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });
        getContentPane().add(button21);
        button21.setBounds(169, 255, 89, 77);

        button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button02ActionPerformed(evt);
            }
        });
        getContentPane().add(button02);
        button02.setBounds(264, 89, 89, 77);

        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        getContentPane().add(button12);
        button12.setBounds(264, 172, 89, 77);

        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });
        getContentPane().add(button22);
        button22.setBounds(264, 255, 89, 77);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticktaktoe/blurry_blue_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-16, -15, 800, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button00ActionPerformed
        // TODO add your handling code here:
        if(button00.getIcon()==null){
        button00.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(0,0);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button00ActionPerformed

    private void button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button01ActionPerformed
        // TODO add your handling code here:
        if(buttonArray[0][1].getIcon()==null){
        buttonArray[0][1].setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(0,1);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button01ActionPerformed

    private void button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button02ActionPerformed
        // TODO add your handling code here:
        if(button02.getIcon()==null){
        button02.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(0,2);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button02ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        if(button10.getIcon()==null){
        button10.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(1,0);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
        if(button11.getIcon()==null){
        button11.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(1,1);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
        if(button12.getIcon()==null){
        button12.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(1,2);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button12ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        // TODO add your handling code here:
        if(button20.getIcon()==null){
        button20.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(2,0);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button20ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        // TODO add your handling code here:
        if(button21.getIcon()==null){
        button21.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(2,1);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button21ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        // TODO add your handling code here:
        if(button22.getIcon()==null){
        button22.setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
        tickacktoeAlgo.setSuperman(2,2);
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            System.out.println("wining");
            tickacktoeAlgo.print();
            //JOptionPane.showMessageDialog(null,"Superman wins  ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499, 371);
        }
        else{
            tickacktoeAlgo.autoPlay();
            this.setIcons(tickacktoeAlgo.getContent());
        }
        }
    }//GEN-LAST:event_button22ActionPerformed

    public void setIcons(int temp[][]){
        int check=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(temp[i][j]==5){
                    buttonArray[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getCaptain())));
                    
                }
                if(temp[i][j]==1){
                    buttonArray[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(newImaHandling.getSuperman())));
                    
                }
                if(temp[i][j]==0){
                    check++;
                }
            }
        }
        if(check==0){
            JOptionPane.showMessageDialog(null,"Game Over try again  ","Information ",JOptionPane.INFORMATION_MESSAGE);
        }
        if(!"loose".equals(tickacktoeAlgo.checkWin())){
            JOptionPane.showMessageDialog(null,"Captain America wins ","Information ",JOptionPane.INFORMATION_MESSAGE);
            supermanWinForm.setVisible(true);
            supermanWinForm.setSize(499,282);
        }
        
    }
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
            java.util.logging.Logger.getLogger(singlePlayerGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singlePlayerGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singlePlayerGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singlePlayerGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singlePlayerGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button00;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}