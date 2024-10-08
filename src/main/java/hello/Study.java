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
public class Study extends javax.swing.JFrame {

    /**
     * Creates new form VideoGame
     */
    public Study() {
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studyscreen.jpg"))); // NOI18N

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
            // Load study.png from classpath
            final ImageIcon icon = new ImageIcon(getClass().getResource("/study.png"));
            Image image2 = icon.getImage().getScaledInstance(130, 100, 0);
            JOptionPane.showMessageDialog(null,
                    "You learned about permanganate and carbon dioxide and some\nother stuff. But it wasn't really fun. But I respect the study grind.\nGrades went up a little.",
                    "Study Sesh Results", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
            changer = -8;
            gradeschanger = 4;
        }

        if (randomInt <= 10) {
            // Load ripstudy.png from classpath
            final ImageIcon icon = new ImageIcon(getClass().getResource("/ripstudy.png"));
            Image image2 = icon.getImage().getScaledInstance(130, 100, 0);
            JOptionPane.showMessageDialog(null,
                    "Chemistry is... really annoying. You are really fed up with this.\nNothing seems to be working. Maybe you will be paying the tutors a visit\nsometime soon. Because this 'studying' thing isn't working.\n Happiness decreased by 20.",
                    "Study Sesh Results", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
            changer = -20;
            gradeschanger = -10;
        }

        if (randomInt >= 90) {
            // Load awesomestudy.png from classpath
            final ImageIcon icon = new ImageIcon(getClass().getResource("/awesomestudy.png"));
            Image image2 = icon.getImage().getScaledInstance(130, 100, 0);
            JOptionPane.showMessageDialog(null,
                    "Today, you tried out this new thing called the 'Pomodoro Technique'.\nHOW COME YOU HAVEN'T DONE THIS SOONER? It's like you absorbed the entire\nbook magically into your brain with this one study session.\nGrades went up quite a bit.",
                    "Study Sesh Results", JOptionPane.PLAIN_MESSAGE, new ImageIcon(image2));
            changer = 5;
            gradeschanger = 15;
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
            java.util.logging.Logger.getLogger(Study.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Study.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Study.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Study.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Study().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
