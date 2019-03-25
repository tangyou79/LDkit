/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Windows.ChooseFile;

import com.LD.Windows.Main.FirstS;
import com.LD.Windows.Main.FirstW;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Mr-LiZhuo
 */
public class ChoosePopFile extends javax.swing.JFrame {

    /**
     * Creates new form ChoosePopFile
     */
    ChooseFile fi;
    FirstW fj;
    FirstS fs;
    int sa;
    Image ic = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/LD/img/ic.png"));

    public ChoosePopFile(ChooseFile fi, FirstW fj, int sa) {
        this.fi = fi;
        this.fj = fj;
        this.sa = sa;
        initComponents();
    }

    public ChoosePopFile(ChooseFile fi, FirstS fs, int sa) {
        this.fi = fi;
        this.fs = fs;
        this.sa = sa;
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

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Choose Pop File:");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\"));
            jFileChooser1.setToolTipText("");
            jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jFileChooser1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            this.setIconImage(ic);

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
//System.out.println(jFileChooser1.getSelectedFile().getName());
        if (jFileChooser1.getSelectedFile() == null) {
            fi.setVisible(true);
            dispose();
        } else {
            fi.setjLabel5(jFileChooser1.getSelectedFile().getName());
            if (sa == 1) {
                fj.setjLabel7(jFileChooser1.getSelectedFile().getName(), jFileChooser1.getSelectedFile().toString());
            } else {
                fs.setjLabel7(jFileChooser1.getSelectedFile().getName(), jFileChooser1.getSelectedFile().toString());
            }

            fi.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        fi.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
