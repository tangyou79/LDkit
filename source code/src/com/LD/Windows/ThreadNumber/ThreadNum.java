/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Windows.ThreadNumber;

import com.LD.Front.Use.Loadfont;
import com.LD.Windows.Error.ErrorFile;
import com.LD.Windows.Background.BackgroundPanel;
import com.LD.Windows.ChooseFile.ChoosePlatFile;
import com.LD.Windows.Main.FirstS;
import com.LD.Windows.Main.FirstW;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.LD.Bapp.Plformat;
import com.LD.Windows.OK;
import com.LD.Front.Use.SSFONT;

/**
 *
 * @author Mr-LiZhuo
 */
public class ThreadNum extends javax.swing.JFrame {

    /**
     * Creates new form ThreadNum
     */
    Image ThreadNum = new ImageIcon(FirstW.class.getResource("/com/LD/img/ThreadNum.png")).getImage();
    Image Delete = new ImageIcon(FirstW.class.getResource("/com/LD/img/delete.png")).getImage();
    Image ic = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/LD/img/ic.png"));
    FirstW fj;
    SSFONT ss = new SSFONT();
    FirstS fs;
    int sa;
    ButtonGroup ThreadNumS = new ButtonGroup();
    String pt[] = new String[6];
    ButtonGroup A = new ButtonGroup();
    ButtonGroup B = new ButtonGroup();
    Loadfont ff = new Loadfont();

    public ThreadNum(FirstW fj, int sa) {
        this.fj = fj;
        this.sa = sa;
        pt[0] = "";
        pt[1] = "yes";
        pt[2] = "1";
        pt[3] = "result";
        pt[4] = "";
        pt[5] = "yes";
        initComponents();
    }

    public ThreadNum(FirstS fs, int sa) {
        this.fs = fs;
        this.sa = sa;
        pt[0] = "";
        pt[1] = "yes";
        pt[2] = "1";
        pt[3] = "result";
        pt[4] = "";
        pt[5] = "yes";
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

        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "com/LD/Windows/ThreadNumber.ThreadNum_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new BackgroundPanel(ThreadNum);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new BackgroundPanel(Delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Plot");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(ss.ssFont(36));
        jLabel1.setText("Plot");

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 47));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jLabel2.setFont(ss.ssFont(18));
        jLabel2.setText("InFile:");

        jLabel3.setFont(ss.ssFont(18));
        jLabel3.setText("Merge:");

        jLabel4.setFont(ss.ssFont(18));
        jLabel4.setText("Mergechr:");

        jLabel5.setFont(ss.ssFont(18));
        jLabel5.setText("Bin:");

        jLabel6.setFont(ss.ssFont(18));
        jLabel6.setText("ResultName:");

        jButton1.setFont(ss.ssFont(12));
        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(jPanel1.getBackground());
        A.add(jRadioButton1);
        jRadioButton1.setFont(ss.ssFont(18));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("yes");

        jRadioButton2.setBackground(jPanel1.getBackground());
        A.add(jRadioButton2);
        jRadioButton2.setFont(ss.ssFont(18));
        jRadioButton2.setText("no");

        jRadioButton3.setBackground(jPanel1.getBackground());
        B.add(jRadioButton3);
        jRadioButton3.setFont(ss.ssFont(18));
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("yes");

        jRadioButton4.setBackground(jPanel1.getBackground());
        B.add(jRadioButton4);
        jRadioButton4.setFont(ss.ssFont(18));
        jRadioButton4.setText("no");

        jTextField1.setFont(ss.ssFont(12));
        jTextField1.setText("1");

        jLabel7.setFont(ss.ssFont(18));
        jLabel7.setText("kb");

        jTextField2.setFont(ss.ssFont(12));
        jTextField2.setText("result");

        jLabel8.setFont(ss.ssFont(36));
        jLabel8.setText("Start");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(ss.ssFont(18));
        jLabel9.setText("none");

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton3))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton2)))
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.setIconImage(ic);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        if (sa == 1) {
            fj.setVisible(true);
            fj.setEnabled(true);
        } else {
            fs.setVisible(true);
            fs.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new ChoosePlatFile(this).setVisible(true);
        this.setEnabled(false);
        this.setModalExclusionType(Dialog.ModalExclusionType.NO_EXCLUDE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

        jLabel9.setText("none");
        pt[0] = "";
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:

        String enableb = "";
        Enumeration<AbstractButton> radioBtnsb = A.getElements();
        while (radioBtnsb.hasMoreElements()) {
            AbstractButton btn = radioBtnsb.nextElement();
            if (btn.isSelected()) {
                enableb = btn.getText();
                break;
            }
        }
        pt[1] = enableb;

        String enable = "";
        Enumeration<AbstractButton> radioBtns = B.getElements();
        while (radioBtns.hasMoreElements()) {
            AbstractButton btna = radioBtns.nextElement();
            if (btna.isSelected()) {
                enable = btna.getText();
                break;
            }
        }

        pt[5] = enable;

        //  System.out.println(pt[1]+ "     "+pt[5]);
        pt[2] = jTextField1.getText();
        pt[3] = jTextField2.getText();

        if (pt[0].equals("")) {
            JOptionPane.showMessageDialog(null, "Please select the input file", "error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                int sat = new Plformat().Win(pt);

                if (sat == 1) {
                    this.dispose();
                    if (sa == 1) {
                        fj.dispose();
                    } else {
                        fs.dispose();
                    }
                    new OK().setVisible(true);
                } else {

                    this.setVisible(false);
                    if (sa == 1) {
                        new ErrorFile(this, fj, 3).setVisible(true);
                    } else {
                        new ErrorFile(this, fs, 4).setVisible(true);
                    }

                }
            } catch (Exception ex) {
                this.setVisible(false);
                if (sa == 1) {
                    new ErrorFile(this, fj, 3).setVisible(true);
                } else {
                    new ErrorFile(this, fs, 4).setVisible(true);
                }
                ex.printStackTrace();
                return;
            }
        }

    }//GEN-LAST:event_jLabel8MouseClicked

    public void setjLabel9(String path, String name) {
        jLabel9.setText(name);
        pt[0] = path;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}