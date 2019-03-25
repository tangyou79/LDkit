/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Windows.TheWay;


import com.LD.Front.Use.Loadfont;
import com.LD.Windows.Background.BackgroundPanel;
import com.LD.Windows.JTextFieldHintListener;
import com.LD.Windows.MJTextField;
import com.LD.Windows.Main.FirstS;
import com.LD.Windows.Main.FirstW;
import com.LD.Front.Use.SSFONT;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Mr-LiZhuo
 */
public class TheWay extends javax.swing.JFrame {

    /**
     * Creates new form TheWay
     */
    FirstW fj;
    FirstS fs;
    int sa;
    Image TheWay = new ImageIcon(FirstW.class.getResource("/com/LD/img/TheWay.png")).getImage();
    Image ic = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/LD/img/ic.png"));
    ButtonGroup ways = new ButtonGroup();
    ButtonGroup Intermediate = new ButtonGroup();
    Loadfont ff = new Loadfont();
    SSFONT ss = new SSFONT();
 MJTextField dd =  new MJTextField();

    public TheWay(FirstW fj, int sa) {
        this.fj = fj;
        this.sa = sa;
        initComponents();
    }

    public TheWay(FirstS fs, int sa) {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "com/LD/Windows/TheWay.TheWay_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new BackgroundPanel(TheWay);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new MJTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new MJTextField();
        jTextField3 = new MJTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new MJTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new MJTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LD type");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(ff.loadFont(36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LD type");

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jRadioButton1.setBackground(new java.awt.Color(0, 206, 201));
        ways.add(jRadioButton1);
        jRadioButton1.setFont(ss.ssFont(24));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("LD decay");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 206, 201));
        ways.add(jRadioButton2);
        jRadioButton2.setFont(ss.ssFont(24));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("LD site");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(0, 206, 201));
        ways.add(jRadioButton3);
        jRadioButton3.setFont(ss.ssFont(24));
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("LD block");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(ss.ssFont(24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Chrom:");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel3.setFont(ss.ssFont(24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("End:");

        jLabel4.setFont(ss.ssFont(24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Start:");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jButton1.setFont(ss.ssFont(12));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(ss.ssFont(12));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(ss.ssFont(24));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Region");

        jLabel6.setFont(ss.ssFont(24));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Site");

        jLabel7.setFont(ss.ssFont(24));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chr :");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel8.setFont(ss.ssFont(24));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pos:");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel9.setFont(ss.ssFont(24));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Intermediate:");

        jRadioButton4.setBackground(new java.awt.Color(0, 206, 201));
        Intermediate.add(jRadioButton4);
        jRadioButton4.setFont(ss.ssFont(12));
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("YES");

        jRadioButton5.setBackground(new java.awt.Color(0, 206, 201));
        Intermediate.add(jRadioButton5);
        jRadioButton5.setFont(ss.ssFont(12));
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jRadioButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jRadioButton3)
                        .addGap(49, 49, 49)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(208, 208, 208)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton5))
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton4)
                        .addComponent(jRadioButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(95, 95, 95))
        );

        jLabel2.setVisible(false);
        jTextField1.addFocusListener(new JTextFieldHintListener(jTextField1, "Example:11"));
        jTextField1.setVisible(false);

        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jTextField2.addFocusListener(new JTextFieldHintListener(jTextField2, "Example:10000"));
        jTextField2.setVisible(false);
        jTextField3.addFocusListener(new JTextFieldHintListener(jTextField3, "Example:10000"));
        jTextField3.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField4.addFocusListener(new JTextFieldHintListener(jTextField4, "Example:11"));
        jTextField4.setVisible(false);
        jLabel8.setVisible(false);
        jTextField5.addFocusListener(new JTextFieldHintListener(jTextField5, "Example:10000"));
        jTextField5.setVisible(false);
        jLabel9.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        this.setIconImage(ic);
        new MJTextField();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setVisible(false);
        jLabel2.setVisible(false);
        jTextField3.setText("");
        jTextField3.setVisible(false);
        jLabel3.setVisible(false);
        jTextField2.setText("");
        jTextField2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        jTextField4.setVisible(false);
        jTextField4.setText("");
        jTextField5.setVisible(false);
        jTextField5.setText("");
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel5.setVisible(false);
        jLabel9.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        //  this.setVisible(false);
        jPanel1.repaint();
        this.setVisible(true);

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setVisible(true);
        jLabel2.setVisible(true);
        jTextField3.setText("");
        jTextField3.setVisible(true);
        jLabel3.setVisible(true);
        jTextField2.setText("");
        jTextField2.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jTextField4.setText("");
        jTextField4.setVisible(true);
        jTextField5.setText("");
        jTextField5.setVisible(true);
        jLabel9.setVisible(false);
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);
        jTextField1.addFocusListener(new JTextFieldHintListener(jTextField1, "Example:11"));
        jTextField2.addFocusListener(new JTextFieldHintListener(jTextField2, "Example:10000"));
        jTextField3.addFocusListener(new JTextFieldHintListener(jTextField3, "Example:10000"));
        jTextField4.addFocusListener(new JTextFieldHintListener(jTextField4, "Example:11"));
        jTextField5.addFocusListener(new JTextFieldHintListener(jTextField5, "Example:10000"));
        //  this.setVisible(false);
        jPanel1.repaint();
        this.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setVisible(true);
        jLabel2.setVisible(true);
        jTextField3.setText("");
        jTextField3.setVisible(true);
        jLabel4.setVisible(true);
        jTextField2.setText("");
        jTextField2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel6.setVisible(false);
        jTextField4.setVisible(false);
        jTextField4.setText("");
        jTextField5.setVisible(false);
        jTextField5.setText("");
        jLabel5.setVisible(true);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(true);
        jRadioButton4.setVisible(true);
        jRadioButton5.setVisible(true);
        jTextField1.addFocusListener(new JTextFieldHintListener(jTextField1, "Example:11"));
        jTextField2.addFocusListener(new JTextFieldHintListener(jTextField2, "Example:10000"));
        jTextField3.addFocusListener(new JTextFieldHintListener(jTextField3, "Example:10000"));
        // this.setVisible(false);
        jPanel1.repaint();

        this.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:    
        String enableb = "";
        Enumeration<AbstractButton> radioBtnsb = ways.getElements();
        while (radioBtnsb.hasMoreElements()) {
            AbstractButton btn = radioBtnsb.nextElement();
            if (btn.isSelected()) {
                enableb = btn.getText();
                break;
            }
        }
        String enable = "";
        Enumeration<AbstractButton> radioBtns = Intermediate.getElements();
        while (radioBtns.hasMoreElements()) {
            AbstractButton bt = radioBtns.nextElement();
            if (bt.isSelected()) {
                enable = bt.getText();
                break;
            }
        }

        if (enableb.equals("LD block") && (jTextField1.getText().equals("Example:11") || jTextField1.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  Chrom ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD block") && (jTextField2.getText().equals("Example:10000") || jTextField2.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  End  ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD block") && (jTextField3.getText().equals("Example:10000") || jTextField3.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  Start  ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD site") && (jTextField4.getText().equals("Example:11") || jTextField3.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  Chr  ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD site") && (jTextField5.getText().equals("Example:10000") || jTextField3.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  Pos ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD site") && (jTextField2.getText().equals("Example:10000") || jTextField2.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  End ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD site") && (jTextField3.getText().equals("Example:10000") || jTextField3.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  Start ", "error", JOptionPane.ERROR_MESSAGE);
        } else if (enableb.equals("LD site") && (jTextField1.getText().equals("Example:11") || jTextField3.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please  enter  Chrom ", "error", JOptionPane.ERROR_MESSAGE);
        } else if ((enableb.equals("LD block")||enableb.equals("LD site"))&&Long.parseLong(jTextField2.getText()) - Long.parseLong(jTextField3.getText()) <=0) {
            JOptionPane.showMessageDialog(null, "The End Must More Than The Start", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (sa == 1) {
                if (enableb.equals("LD decay")) {
                    fj.setjLabel14("LD decay");
                    fj.setjLabel15("none");
                    fj.setjLabel16("none");
                    fj.setjLabel17("none");
                } else if (enableb.equals("LD block")) {
                    fj.setjLabel14("LD block");
                    fj.setjLabel15(jTextField1.getText());
                    fj.setjLabel16(jTextField3.getText());
                    fj.setjLabel17(jTextField2.getText());
                    fj.setIntermediate(enable);
                } else if (enableb.equals("LD site")) {
                    fj.setjLabel14("LD site");
                    fj.setjLabel15(jTextField1.getText());
                    fj.setjLabel16(jTextField3.getText());
                    fj.setjLabel17(jTextField2.getText());
                    fj.setjLabel35(jTextField4.getText());
                    fj.setjLabel36(jTextField5.getText());
                }

                this.setVisible(false);
                fj.setVisible(true);
                fj.setEnabled(true);
            } else {
                if (enableb.equals("LD decay")) {
                    fs.setjLabel14("LD decay");
                    fs.setjLabel15("none");
                    fs.setjLabel16("none");
                    fs.setjLabel17("none");
                } else if (enableb.equals("LD block")) {
                    fs.setjLabel14("LD block");
                    fs.setjLabel15(jTextField1.getText());
                    fs.setjLabel16(jTextField3.getText());
                    fs.setjLabel17(jTextField2.getText());
                    fs.setIntermediate(enable);
                } else if (enableb.equals("LD site")) {
                    fs.setjLabel14("LD site");
                    fs.setjLabel15(jTextField1.getText());
                    fs.setjLabel16(jTextField3.getText());
                    fs.setjLabel17(jTextField2.getText());
                    fs.setjLabel37(jTextField4.getText());
                    fs.setjLabel38(jTextField5.getText());
                }

                this.setVisible(false);
                fs.setVisible(true);
                fs.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

        // TODO add your handling code here:
        String text = jTextField1.getText();  // 当前输入框内容
        char ch = evt.getKeyChar();   // 准备附加到输入框的字符
        // 限制不能输入非数字和小数点
        if (!(ch >= '0' && ch <= '9')) {
            evt.consume();    // 销毁当前输入字符
            // 限制不能是小数点开头
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        String text = jTextField3.getText();  // 当前输入框内容
        char ch = evt.getKeyChar();   // 准备附加到输入框的字符
        // 限制不能输入非数字和小数点
        if (!(ch >= '0' && ch <= '9') && ch != '-') {
            evt.consume();    // 销毁当前输入字符
            // 限制不能是小数点开头
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        String text = jTextField2.getText();  // 当前输入框内容
        char ch = evt.getKeyChar();   // 准备附加到输入框的字符
        // 限制不能输入非数字和小数点
        if (!(ch >= '0' && ch <= '9') && ch != '-') {
            evt.consume();    // 销毁当前输入字符
            // 限制不能是小数点开头
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.setVisible(false);
        if (sa == 1) {
            fj.setVisible(true);
            fj.setEnabled(true);
        } else {
            fs.setVisible(true);
            fs.setEnabled(true);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        this.setVisible(false);
        if (sa == 1) {
            fj.setVisible(true);
            fj.setEnabled(true);
        } else {
            fs.setVisible(true);
            fs.setEnabled(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:        // TODO add your handling code here:
     
        char ch = evt.getKeyChar();   // 准备附加到输入框的字符
        // 限制不能输入非数字和小数点
        if (!(ch >= '0' && ch <= '9')) {
            evt.consume();    // 销毁当前输入字符
            // 限制不能是小数点开头
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
            char ch = evt.getKeyChar();   // 准备附加到输入框的字符
        // 限制不能输入非数字和小数点
        if (!(ch >= '0' && ch <= '9')) {
            evt.consume();    // 销毁当前输入字符
            // 限制不能是小数点开头
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1InputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables


    
   
}