/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hello;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sledgehammer
 */
public class VideoGame extends javax.swing.JFrame {

    /**
     * Creates new form VideoGame
     */
    public VideoGame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gaming.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
        double randNumber = Math.random();
        double randomNumber = randNumber * 100;
        int randomInt = (int) randomNumber + 1;
        int changer = 0;
        int gradeschanger = 0;

        if ((randomInt > 10) && (randomInt < 90)) {
            // Load vidyagame.png from the classpath
            ImageIcon icon = new ImageIcon(getClass().getResource("/vidyagame.png"));
            Image image2 = icon.getImage().getScaledInstance(130, 100, 0);
            JOptionPane.showMessageDialog(null,
                    "You pressed some buttons and won some virtual trophies.\nHappiness increased by 6.",
                    "Game Sesh Results", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
            changer = 6;
            gradeschanger = -4;
        }

        if (randomInt <= 10) {
            // Load ripvidyagame.png from the classpath
            ImageIcon icon = new ImageIcon(getClass().getResource("/ripvidyagame.png"));
            Image image2 = icon.getImage().getScaledInstance(130, 100, 0);
            JOptionPane.showMessageDialog(null,
                    "You started to get a little pressed when playing some online Halo.\nThis resulted in you hurling your controller across the room.\nWould you like a side of chips with that salt?\nHappiness decreased by 30.",
                    "Game Sesh Results", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
            changer = -30;
            gradeschanger = -5;
        }

        if (randomInt >= 90) {
            // Load awesomevidyagame.png from the classpath
            ImageIcon icon = new ImageIcon(getClass().getResource("/awesomevidyagame.png"));
            Image image2 = icon.getImage().getScaledInstance(130, 100, 0);
            JOptionPane.showMessageDialog(null,
                    "You attended a Smash tourney and kicked everyone's butt.\nAren't you quite the swagmaster epic gamer?\nIf only you didn't main Ness.\nHappiness increased by 20.",
                    "Game Sesh Results", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
            changer = 20;
            gradeschanger = 0;
        }

        levels instance = levels.getInstance();
        instance.setHappiness(changer);
        instance.setGrades(gradeschanger);
        dispose();
    }
    // GEN-LAST:event_formWindowOpened

    /**
     * 
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoGame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
