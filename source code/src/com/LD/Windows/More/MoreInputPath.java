/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Windows.More;

import com.LD.Front.Use.Loadfont;
import com.LD.Windows.Main.FirstS;
import com.LD.Windows.Main.FirstW;
import com.LD.Front.Use.SSFONT;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JList;

/**
 *
 * @author Mr-LiZhuo
 */
public class MoreInputPath extends javax.swing.JFrame {

    /**
     * Creates new form MoreInputPath
     */
    String[] inputname;
    String[] temp;
    FirstW fj;
    FirstS fs;
    int sa;
    SSFONT ss = new SSFONT();
    Image ic = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/LD/img/ic.png"));
      Loadfont ff = new Loadfont();

    public MoreInputPath(String[] inputname, FirstW fj, int sa) {
        this.fj = fj;
        this.sa = sa;
        this.inputname = inputname;
        addlist(inputname);
        initComponents();
    }

    public MoreInputPath(String[] inputname, FirstS fs, int sa) {
        this.fs = fs;
        this.sa = sa;
        this.inputname = inputname;
        addlist(inputname);
        initComponents();
    }

    public void addlist(String[] inputname) {
        int te = 0;
        for (int i = 0; i < inputname.length; i++) {
            if (inputname[i].equals("")) {
                // System.out.println("退出");
                te = i;
                break;
            }
        }
        temp = new String[te];
        for (int s = 0; s < te; s++) {
            temp[s] = inputname[s];
        }
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new JList(temp);
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("More Input File");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(71, 153, 153));

        jButton1.setFont(ss.ssFont(12)
        );
        jButton1.setText("RETURN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jList1.setBackground(new java.awt.Color(71, 153, 153));
        jList1.setFont(ss.ssFont(20)
        );
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jList1.setDropMode(javax.swing.DropMode.ON);
        jScrollPane1.setViewportView(jList1);

        jButton2.setFont(ss.ssFont(12)
        );
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(ss.ssFont(20)
        );
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Input File:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.setIconImage(ic);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        if (sa == 1) {
            fj.setVisible(true);
            fj.setEnabled(true);
        } else {
            fs.setVisible(true);
            fs.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dispose();
        if (sa == 1) {
            fj.setVisible(true);
            fj.setEnabled(true);
        } else {
            fs.setVisible(true);
            fs.setEnabled(true);
        }

    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int m = jList1.getAnchorSelectionIndex();
        if (m != -1) {
            //   System.out.println(inputname[m]);
            for (int i = m + 1; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                // System.out.println(tempFile.getName()+inputname[i-1]);
            }

            if (sa == 1) {
                fj.clean();
                for (int i = 0; i < inputname.length; i++) {
                    File tempFile = new File(inputname[i]);
                    fj.setInputName(tempFile.getName(), inputname[i], 2);
                    if (inputname[i].equals("")) {
                        break;
                    }
                    // System.out.println(tempFile.getName()+inputname[i-1]);
                }
            } else {
                fs.clean();
                for (int i = 0; i < inputname.length; i++) {
                    File tempFile = new File(inputname[i]);
                    fs.setInputName(tempFile.getName(), inputname[i], 2);
                    if (inputname[i].equals("")) {
                        break;
                    }
                    // System.out.println(tempFile.getName()+inputname[i-1]);
                }
            }

            addlist(inputname);
            jList1.setListData(temp);
            jList1.setSelectedIndex(m);
            this.repaint();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
