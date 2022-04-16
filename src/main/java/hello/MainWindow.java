/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hello;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javazoom.jl.player.Player;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author jacques fleischer
 */
public class MainWindow extends javax.swing.JFrame {
    playermusic MC = new playermusic();
    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
        try {
            GraphicsEnvironment ge =
                    GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/resources/BachelorPadCollege.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/resources/PressStart2P.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/resources/tf2build.ttf")));
        } catch (IOException|FontFormatException e) {
            e.printStackTrace();
        }
        final ImageIcon icon = new ImageIcon("src/main/java/resources/finnlogo.png");
        Image image2 = icon.getImage().getScaledInstance(130,100,0);
        String nextDialog = "Welcome to MDCstudentSIM!\nIf you are playing on Replit, don't forget\nto tick the audio checkbox in the bottom-right.";
        JOptionPane.showMessageDialog(null, nextDialog, "", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
        initComponents();
       setLocationRelativeTo(null);
       playermusic y = playermusic.getInstance();
       y.Play("src/main/java/resources/mainmusic.mp3");

    }
    
    public void segue(){
        if (Math.random() <.5){
            try {
                speechbubble.setIcon(new ImageIcon(ImageIO.read(new File("src/main/java/resources/speech1.png"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else{
            try {
                speechbubble.setIcon(new ImageIcon(ImageIO.read(new File("src/main/java/resources/speech2.png"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        PausablePlayer.main("finntalk1");
        
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
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        speechbubble = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MDCstudentSIMULATOR");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 102, 0));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(232, 203, 154));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bachelor Pad College JL", 0, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MDC studentSIMULATOR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 580, 80);

        jLayeredPane1.add(speechbubble);
        speechbubble.setBounds(210, 20, 210, 220);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finn-feed.png"))); // NOI18N
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(290, 90, 450, 330);

        playButton.setBackground(new java.awt.Color(204, 255, 204));
        playButton.setFont(new java.awt.Font("TF2 Build", 0, 36)); // NOI18N
        playButton.setText("PLAY!");
        playButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(playButton);
        playButton.setBounds(20, 110, 170, 90);

        quitButton.setBackground(new java.awt.Color(255, 204, 204));
        quitButton.setFont(new java.awt.Font("TF2 Build", 0, 36)); // NOI18N
        quitButton.setText("QUIT");
        quitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(quitButton);
        quitButton.setBounds(20, 220, 170, 90);

        jPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(10, 30, 850, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> SwingUtilities.invokeLater(() -> segue());

        executor.schedule(task, 3, TimeUnit.SECONDS);
        
    }//GEN-LAST:event_formWindowOpened

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // MC.Stop();

        dispose();
        CharacterSelect.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        dispose();
        System.exit(0);
        // TODO add your handling code here:

    }//GEN-LAST:event_quitButtonActionPerformed
    

    public static void main(String[] args){
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              // String[] str = new String[0];
                new MainWindow().setVisible(true);
            }
        });
       
       
        
        /*
        try{
        FileInputStream fis = new FileInputStream("src/resources/mainmusic.mp3");
        Player playMP3 = new Player(fis);
        playMP3.play();
        }
        catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Failed to play the file.");
        }
        */

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel speechbubble;
    // End of variables declaration//GEN-END:variables
}
