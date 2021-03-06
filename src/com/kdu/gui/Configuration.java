/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kdu.gui;

import static com.kdu.gui.Tempo.s;
import javax.swing.ImageIcon;
import jm.util.Play;
import jm.util.Read;

/**
 *
 * @author Lasitha
 */
public class Configuration extends javax.swing.JFrame {

    /**
     * Creates new form Configuration
     */
    public Configuration(){
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        Read.midi(s, "34time8.mid");
        //s.setTitle(fd.getFile());
        //beat = new Beat(s);
        //System.out.println("END "+s.getEndTime());
        s = s.copy(20.25, 35.25);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectStyle = new javax.swing.JPanel();
        popBtn = new javax.swing.JLabel();
        jazzBtn = new javax.swing.JLabel();
        classicBtn = new javax.swing.JLabel();
        countryBtn = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 485));
        getContentPane().setLayout(null);

        SelectStyle.setLayout(null);

        popBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kdu/gui/images/pop button.png"))); // NOI18N
        popBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                popBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                popBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                popBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                popBtnMouseReleased(evt);
            }
        });
        SelectStyle.add(popBtn);
        popBtn.setBounds(530, 160, 150, 150);

        jazzBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kdu/gui/images/jazz button.png"))); // NOI18N
        jazzBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jazzBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jazzBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jazzBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jazzBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jazzBtnMouseReleased(evt);
            }
        });
        SelectStyle.add(jazzBtn);
        jazzBtn.setBounds(370, 160, 150, 150);

        classicBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kdu/gui/images/classic button.png"))); // NOI18N
        classicBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classicBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classicBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classicBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                classicBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                classicBtnMouseReleased(evt);
            }
        });
        SelectStyle.add(classicBtn);
        classicBtn.setBounds(210, 160, 150, 150);

        countryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kdu/gui/images/country button.PNG"))); // NOI18N
        countryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countryBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                countryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                countryBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                countryBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                countryBtnMouseReleased(evt);
            }
        });
        SelectStyle.add(countryBtn);
        countryBtn.setBounds(50, 160, 150, 150);

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kdu/gui/images/cancel button.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelButtonMouseReleased(evt);
            }
        });
        SelectStyle.add(cancelButton);
        cancelButton.setBounds(560, 370, 100, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kdu/gui/images/music style.jpg"))); // NOI18N
        SelectStyle.add(Background);
        Background.setBounds(0, 0, 700, 450);

        getContentPane().add(SelectStyle);
        SelectStyle.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        ImageIcon normal = new ImageIcon(getClass().getResource("images/cancel button.png"));
        cancelButton.setIcon(normal);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        ImageIcon hover = new ImageIcon(getClass().getResource("images/cancel button hover.png"));
        cancelButton.setIcon(hover);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        ImageIcon hover = new ImageIcon(getClass().getResource("images/cancel button pressed.png"));
        cancelButton.setIcon(hover);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void cancelButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseReleased
        ImageIcon normal = new ImageIcon(getClass().getResource("images/cancel button.png"));
        cancelButton.setIcon(normal);
    }//GEN-LAST:event_cancelButtonMouseReleased

    private void countryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryBtnMouseEntered
    
        ImageIcon hover = new ImageIcon(getClass().getResource("images/country button hover.png"));
        countryBtn.setIcon(hover);
        
    }//GEN-LAST:event_countryBtnMouseEntered

    private void countryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryBtnMouseExited
        //Play.stopMidiCycle();
        ImageIcon normal = new ImageIcon(getClass().getResource("images/country button.png"));
        countryBtn.setIcon(normal);
    }//GEN-LAST:event_countryBtnMouseExited

    private void countryBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryBtnMousePressed
        ImageIcon hover = new ImageIcon(getClass().getResource("images/country button pressed.png"));
        countryBtn.setIcon(hover);
    }//GEN-LAST:event_countryBtnMousePressed

    private void countryBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryBtnMouseReleased
        ImageIcon normal = new ImageIcon(getClass().getResource("images/country button.png"));
        countryBtn.setIcon(normal);
    }//GEN-LAST:event_countryBtnMouseReleased

    private void classicBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicBtnMouseExited
        ImageIcon normal = new ImageIcon(getClass().getResource("images/classic button.png"));
        classicBtn.setIcon(normal);
    }//GEN-LAST:event_classicBtnMouseExited

    private void classicBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicBtnMousePressed
        ImageIcon hover = new ImageIcon(getClass().getResource("images/classic button pressed.png"));
        classicBtn.setIcon(hover);
    }//GEN-LAST:event_classicBtnMousePressed

    private void classicBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicBtnMouseReleased
        ImageIcon normal = new ImageIcon(getClass().getResource("images/classic button.png"));
        classicBtn.setIcon(normal);
    }//GEN-LAST:event_classicBtnMouseReleased

    private void classicBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicBtnMouseEntered
        ImageIcon hover = new ImageIcon(getClass().getResource("images/classic button hover.png"));
        classicBtn.setIcon(hover);
    }//GEN-LAST:event_classicBtnMouseEntered

    private void jazzBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzBtnMouseExited
        ImageIcon normal = new ImageIcon(getClass().getResource("images/jazz button.png"));
        jazzBtn.setIcon(normal);
    }//GEN-LAST:event_jazzBtnMouseExited

    private void jazzBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzBtnMousePressed
        ImageIcon hover = new ImageIcon(getClass().getResource("images/jazz button pressed.png"));
        jazzBtn.setIcon(hover);
    }//GEN-LAST:event_jazzBtnMousePressed

    private void jazzBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzBtnMouseReleased
        ImageIcon normal = new ImageIcon(getClass().getResource("images/jazz button.png"));
        jazzBtn.setIcon(normal);
    }//GEN-LAST:event_jazzBtnMouseReleased

    private void jazzBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzBtnMouseEntered
        ImageIcon hover = new ImageIcon(getClass().getResource("images/jazz button hover.png"));
        jazzBtn.setIcon(hover);
    }//GEN-LAST:event_jazzBtnMouseEntered

    private void popBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popBtnMouseExited
        ImageIcon normal = new ImageIcon(getClass().getResource("images/pop button.png"));
        popBtn.setIcon(normal);
    }//GEN-LAST:event_popBtnMouseExited

    private void popBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popBtnMousePressed
        ImageIcon hover = new ImageIcon(getClass().getResource("images/pop button pressed.png"));
        popBtn.setIcon(hover);
    }//GEN-LAST:event_popBtnMousePressed

    private void popBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popBtnMouseReleased
        ImageIcon normal = new ImageIcon(getClass().getResource("images/pop button.png"));
        popBtn.setIcon(normal);
    }//GEN-LAST:event_popBtnMouseReleased

    private void popBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popBtnMouseEntered
        ImageIcon hover = new ImageIcon(getClass().getResource("images/pop button hover.png"));
        popBtn.setIcon(hover);
    }//GEN-LAST:event_popBtnMouseEntered

    private void countryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryBtnMouseClicked
        dispose();
        new Tempo().setVisible(true);
    }//GEN-LAST:event_countryBtnMouseClicked

    private void classicBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicBtnMouseClicked
        dispose();
        new Tempo().setVisible(true);
    }//GEN-LAST:event_classicBtnMouseClicked

    private void jazzBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzBtnMouseClicked
        dispose();
        new Tempo().setVisible(true);
    }//GEN-LAST:event_jazzBtnMouseClicked

    private void popBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popBtnMouseClicked
        dispose();
        new Tempo().setVisible(true);
    }//GEN-LAST:event_popBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel SelectStyle;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel classicBtn;
    private javax.swing.JLabel countryBtn;
    private javax.swing.JLabel jazzBtn;
    private javax.swing.JLabel popBtn;
    // End of variables declaration//GEN-END:variables
}
