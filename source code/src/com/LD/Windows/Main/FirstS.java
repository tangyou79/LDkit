/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Windows.Main;

import com.LD.Window.Easy.FirstJFrame;
import java.awt.AWTException;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Robot;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.LD.Aapp.Format;
import com.LD.Windows.Background.BackgroundPanel;
import com.LD.Windows.ChooseFile.ChooseFile;
import com.LD.Windows.Error.ErrorChrom;
import com.LD.Windows.Error.ErrorEndLine;
import com.LD.Windows.Error.ErrorFile;
import com.LD.Windows.Error.ErrorSileLine;
import com.LD.Front.Use.Loadfont;
import com.LD.Windows.Method.Method;
import com.LD.Windows.More.MoreInputPath;
import com.LD.Windows.Background.MyJPanel;
import com.LD.Windows.Background.MyJPanelMethod;
import com.LD.Windows.Background.MyJPanelParameter;
import com.LD.Windows.Background.MyJPanelTheWay;
import com.LD.Windows.Background.MyJPanelThreadNum;
import com.LD.Windows.Background.MyJPaneldna;
import com.LD.Windows.OK;
import com.LD.Windows.Parameter.Parameter;
import com.LD.Front.Use.SSFONT;
import com.LD.Windows.Sure;
import com.LD.Windows.TheWay.TheWay;
import com.LD.Windows.ThreadNumber.ThreadNum;

/**
 *
 * @author Mr-LiZhuo
 */
public class FirstS extends javax.swing.JFrame {

    TheWay theway = new TheWay(this, 2);
    ThreadNum threadnum = new ThreadNum(this, 2);
    Parameter parameter = new Parameter(this, 2);
    Method method = new Method(this, 2);

    Image Title = new ImageIcon(FirstS.class.getResource("/com/LD/img/Title.png")).getImage();
    Image Starting = new ImageIcon(FirstS.class.getResource("/com/LD/img/Starting.png")).getImage();

    Image ChooseFile = new ImageIcon(FirstS.class.getResource("/com/LD/img/ChooseFile.png")).getImage();
    Image ChooseFiles = new ImageIcon(FirstS.class.getResource("/com/LD/img/ChooseFile.gif")).getImage();

    Image Parameter = new ImageIcon(FirstS.class.getResource("/com/LD/img/Parameter.png")).getImage();
    Image Parameters = new ImageIcon(FirstS.class.getResource("/com/LD/img/Parameter.gif")).getImage();

    Image TheWays = new ImageIcon(FirstS.class.getResource("/com/LD/img/TheWay.png")).getImage();
    Image TheWay = new ImageIcon(FirstS.class.getResource("/com/LD/img/TheWay.gif")).getImage();

    Image ThreadNum = new ImageIcon(FirstS.class.getResource("/com/LD/img/ThreadNum.png")).getImage();
    Image ThreadNums = new ImageIcon(FirstS.class.getResource("/com/LD/img/ThreadNum.gif")).getImage();

    Image Method = new ImageIcon(FirstS.class.getResource("/com/LD/img/Method.png")).getImage();
    Image Methods = new ImageIcon(FirstS.class.getResource("/com/LD/img/Method.gif")).getImage();

    Image DNA = new ImageIcon(FirstS.class.getResource("/com/LD/img/dna.png")).getImage();
    Image DNAs = new ImageIcon(FirstS.class.getResource("/com/LD/img/dna.gif")).getImage();

    Image Delete = new ImageIcon(FirstS.class.getResource("/com/LD/img/delete.png")).getImage();

    Image ico = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/LD/img/1.jpg"));

    Image ic = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/LD/img/ic.png"));
    SSFONT ss = new SSFONT();

    private TrayIcon trayIcon;//托盘图标
    private SystemTray systemTray;//系统托盘
    Loadfont ff = new Loadfont();

    FirstJFrame fj;

    String[] inputname = new String[1000];
    String tt[] = new String[30];

    /**
     * Creates new form FirstW
     */
    public FirstS() {

        //初始化文件数组
        for (int i = 0; i < inputname.length; i++) {
            inputname[i] = "";
        }

        //初始化数据数组
        tt[0] = "";
        tt[1] = "";
        tt[2] = "100";
        tt[3] = "";
        tt[4] = "nopop";
        tt[5] = "all";
        tt[6] = "0.2";
        tt[7] = "yes";
        int cp = Runtime.getRuntime().availableProcessors() / 2;
        if (cp != 0) {
            tt[8] = String.valueOf(cp);
        } else {
            tt[8] = "1";
        }
        tt[9] = "";
        tt[10] = "";
        tt[11] = "";
        tt[12] = "1";
        tt[13] = "1";
        tt[14] = "0.005";
                tt[20] = "no";
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

        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new BackgroundPanel(Title);
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new MyJPanel(ChooseFiles,ChooseFile);
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new MyJPanelParameter(Parameters,Parameter);
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new MyJPanelTheWay(TheWay,TheWays);
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new MyJPanelThreadNum(ThreadNums,ThreadNum);
        jPanel8 = new BackgroundPanel(Starting);
        try {
            jPanel9 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "com/LD/Windows/Main.FirstS_jPanel9");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel36 = new BackgroundPanel(Delete);
        jPanel37 = new BackgroundPanel(Delete);
        jPanel38 = new BackgroundPanel(Delete);
        jPanel39 = new BackgroundPanel(Delete);
        jPanel40 = new BackgroundPanel(Delete);
        jPanel41 = new BackgroundPanel(Delete);
        jPanel42 = new BackgroundPanel(Delete);
        jPanel43 = new BackgroundPanel(Delete);
        jPanel46 = new BackgroundPanel(Delete);
        jPanel47 = new BackgroundPanel(Delete);
        jPanel48 = new BackgroundPanel(Delete);
        jPanel49 = new BackgroundPanel(Delete);
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel50 = new BackgroundPanel(Delete);
        jPanel16 = new MyJPaneldna(DNAs,DNA);
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new MyJPanelMethod(Methods,Method);

        jLabel26.setFont(new java.awt.Font("华文隶书", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("LDkitWheatchr1.vcf.gz");

        jLabel29.setFont(new java.awt.Font("华文隶书", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("LDkitWheatchr1.vcf.gz");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LDkit");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(993, 600));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(690, 65));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 118, 117));
        jPanel3.setPreferredSize(new java.awt.Dimension(446, 136));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel1.setFont(ff.loadFont(14)
        );
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose File");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jPanel11.setPreferredSize(new java.awt.Dimension(67, 68));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6))
        );

        jPanel4.setBackground(new java.awt.Color(9, 132, 227));
        jPanel4.setPreferredSize(new java.awt.Dimension(221, 136));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel2.setFont(ff.loadFont(14)
        );
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Parameter");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jPanel12.setPreferredSize(new java.awt.Dimension(63, 64));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6))
        );

        jPanel5.setBackground(new java.awt.Color(0, 206, 201));
        jPanel5.setPreferredSize(new java.awt.Dimension(221, 136));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel3.setFont(ff.loadFont(14)
        );
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LD type");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jPanel13.setPreferredSize(new java.awt.Dimension(64, 59));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(253, 203, 110));
        jPanel6.setPreferredSize(new java.awt.Dimension(221, 136));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel5.setFont(ff.loadFont(14)
        );
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Plot");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jPanel14.setPreferredSize(new java.awt.Dimension(71, 64));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(6, 6, 6))
        );

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(448, 67));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jLabel6.setFont(ff.loadFont(12)
        );
        jLabel6.setForeground(new java.awt.Color(254, 119, 119));
        jLabel6.setText("more");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel19.setFont(ss.ssFont(12)
        );
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Input File:");

        jLabel20.setFont(ss.ssFont(12)
        );
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(ss.ssFont(12)
        );
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setToolTipText("");

        jLabel22.setFont(ss.ssFont(12)
        );
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(ss.ssFont(12)
        );
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(ss.ssFont(12)
        );
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(ss.ssFont(12)
        );
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(ss.ssFont(12)
        );
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(ss.ssFont(12)
        );
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(ss.ssFont(12)
        );
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(ss.ssFont(12)
        );
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(ss.ssFont(12)
        );
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(ss.ssFont(12)
        );
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));

        jPanel36.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel37.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel38.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel39.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel40.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel41.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel42.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel42.setRequestFocusEnabled(false);
        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel43.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel46.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel47.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel48.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel49.setPreferredSize(new java.awt.Dimension(10, 12));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20))
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel27))
                                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel30))
                                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(jLabel31))
                            .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel32))
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel36.setVisible(false);
        jPanel37.setVisible(false);
        jPanel38.setVisible(false);
        jPanel39.setVisible(false);
        jPanel40.setVisible(false);
        jPanel41.setVisible(false);
        jPanel42.setVisible(false);
        jPanel43.setVisible(false);
        jPanel46.setVisible(false);
        jPanel47.setVisible(false);
        jPanel48.setVisible(false);
        jPanel49.setVisible(false);

        jPanel10.setBackground(new java.awt.Color(71, 153, 153));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pop File:  none");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Windows Size: 100");

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Missing Rate: 0.2 ");

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText( "Thread: "+tt[8]);

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Plating: yes ");

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Chrom: all");

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("r-square");

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LD decay");

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Chrom: none");

        jLabel16.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("End: none");

        jLabel17.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Start:  none");

        jLabel18.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MAF:0.005");

        jPanel50.setPreferredSize(new java.awt.Dimension(16, 18));
        jPanel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel16.setPreferredSize(new java.awt.Dimension(279, 53));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Result Name: result");

        jLabel37.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Chr: none");

        jLabel38.setFont(new java.awt.Font("Century Schoolbook", 2, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Pos: none");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel18))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel34))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel34))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel37))
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel38))
                .addGap(5, 5, 5)
                .addComponent(jLabel16)
                .addGap(5, 5, 5)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel50.setVisible(false);

        jPanel7.setBackground(new java.awt.Color(250, 177, 160));
        jPanel7.setPreferredSize(new java.awt.Dimension(221, 136));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel4.setFont(ff.loadFont(14)
        );
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Measurements");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jPanel15.setPreferredSize(new java.awt.Dimension(56, 63));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drag();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.setIconImage(ic);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        // this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);

        parameter.setVisible(true);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        parameter.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        parameter.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        method.setVisible(true);
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        method.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        method.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here:
        //   this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        threadnum.setVisible(true);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        threadnum.setVisible(true);;
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        threadnum.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        theway.setVisible(true);
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        //   this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        theway.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        //   this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        theway.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
        //this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        new ChooseFile(this, 2).setVisible(true);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        //  this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        new ChooseFile(this, 2).setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //    this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        new ChooseFile(this, 2).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        //   this.setVisible(false);
        //窗口不可编辑
        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        //  this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        new MoreInputPath(inputname, this, 2).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
        // TODO add your handling code here:
        if (!inputname[7].equals("")) {
            jPanel37.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);

            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 7; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[6] = "";
            jLabel28.setText("");
            jPanel37.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel37MouseClicked

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!inputname[8].equals("")) {

            jPanel36.setVisible(false);

            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel36.setVisible(false);

            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 8; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[7] = "";
            jLabel27.setText("");
            jPanel36.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
        // TODO add your handling code here:
        if (!inputname[9].equals("")) {
            jPanel38.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);

            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 9; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[8] = "";
            jLabel30.setText("");
            jPanel38.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
        // TODO add your handling code here:
        if (!inputname[10].equals("")) {
            jPanel39.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);

            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 10; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[9] = "";
            jLabel31.setText("");
            jPanel39.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
        // TODO add your handling code here:
        if (!inputname[11].equals("")) {
            jPanel40.setVisible(false);
            jPanel41.setVisible(false);

            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 11; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[10] = "";
            jLabel32.setText("");
            jPanel40.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
        // TODO add your handling code here:
        //对第11个进行操作
        if (!inputname[12].equals("")) {
            jPanel41.setVisible(false);

            jLabel33.setText("");
            for (int i = 12; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[11] = "";
            jLabel33.setText("");
            jPanel41.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
        // TODO add your handling code here:
        if (!inputname[6].equals("")) {
            jPanel42.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel37.setVisible(false);
            jPanel36.setVisible(false);

            jLabel24.setText("");
            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 6; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[5] = "";
            jLabel24.setText("");
            jPanel42.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!inputname[5].equals("")) {
            jPanel43.setVisible(false);
            jPanel43.setVisible(false);
            jPanel42.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel37.setVisible(false);
            jPanel36.setVisible(false);
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 5; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[4] = "";
            jLabel25.setText("");
            jPanel43.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
        // TODO add your handling code here:
        if (!inputname[4].equals("")) {
            jPanel46.setVisible(false);
            jPanel43.setVisible(false);
            jPanel42.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel37.setVisible(false);
            jPanel36.setVisible(false);
            jLabel23.setText("");
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 4; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[3] = "";
            jLabel23.setText("");
            jPanel46.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseClicked
        // TODO add your handling code here:
        if (!inputname[3].equals("")) {
            jPanel47.setVisible(false);
            jPanel46.setVisible(false);
            jPanel43.setVisible(false);
            jPanel42.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel37.setVisible(false);
            jPanel36.setVisible(false);
            jLabel21.setText("");
            jLabel23.setText("");
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 3; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[2] = "";
            jLabel21.setText("");
            jPanel47.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel47MouseClicked

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
        // TODO add your handling code here:
        if (!inputname[2].equals("")) {
            jPanel48.setVisible(false);
            jPanel47.setVisible(false);
            jPanel46.setVisible(false);
            jPanel43.setVisible(false);
            jPanel42.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel37.setVisible(false);
            jPanel36.setVisible(false);

            jLabel22.setText("");
            jLabel21.setText("");
            jLabel23.setText("");
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");
            for (int i = 2; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i]);
                setInputName(tempFile.getName(), inputname[i], 2);
            }
        } else {
            inputname[1] = "";
            jLabel22.setText("");
            jPanel48.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked

        // TODO add your handling code here:
        if (!inputname[1].equals("")) {
            //   System.out.println("11");

            jPanel49.setVisible(false);
            jPanel48.setVisible(false);
            jPanel47.setVisible(false);
            jPanel46.setVisible(false);
            jPanel43.setVisible(false);
            jPanel42.setVisible(false);
            jPanel41.setVisible(false);
            jPanel40.setVisible(false);
            jPanel39.setVisible(false);
            jPanel38.setVisible(false);
            jPanel37.setVisible(false);
            jPanel36.setVisible(false);

            jLabel20.setText("");
            jLabel22.setText("");
            jLabel21.setText("");
            jLabel23.setText("");
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel28.setText("");
            jLabel27.setText("");
            jLabel30.setText("");
            jLabel31.setText("");
            jLabel32.setText("");
            jLabel33.setText("");

            for (int i = 1; i < inputname.length; i++) {
                inputname[i - 1] = inputname[i];
                File tempFile = new File(inputname[i - 1]);
                setInputName(tempFile.getName(), inputname[i - 1], 2);
                // System.out.println(tempFile.getName()+inputname[i-1]);
            }

        } else {
            inputname[0] = "";
            jLabel20.setText("");
            jPanel49.setVisible(false);
        }
        jPanel9.repaint();
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        // TODO add your handling code here:

        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel13.addI();
        jPanel13.repaint();
        jPanel5.repaint();
        jPanel5.setVisible(true);
        jPanel13.setVisible(true);

    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel13.deleteI();
        jPanel13.repaint();
        jPanel5.repaint();
        jPanel5.setVisible(true);
        jPanel13.setVisible(true);


    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel11.setVisible(false);
        jPanel11.addI();
        jPanel11.repaint();
        jPanel3.repaint();
        jPanel3.setVisible(true);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel11.setVisible(false);
        jPanel11.deleteI();
        jPanel11.repaint();
        jPanel3.repaint();
        jPanel3.setVisible(true);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel11.setVisible(false);
        jPanel11.addI();
        jPanel11.repaint();
        jPanel3.repaint();
        jPanel3.setVisible(true);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel11.setVisible(false);
        jPanel11.deleteI();
        jPanel11.repaint();
        jPanel3.repaint();
        jPanel3.setVisible(true);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel11.setVisible(false);
        jPanel11.addI();
        jPanel11.repaint();
        jPanel3.repaint();
        jPanel3.setVisible(true);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel11.setVisible(false);
        jPanel11.deleteI();
        jPanel11.repaint();
        jPanel3.repaint();
        jPanel3.setVisible(true);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:

        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel13.addI();
        jPanel13.repaint();
        jPanel5.repaint();
        jPanel5.setVisible(true);
        jPanel13.setVisible(true);

    }//GEN-LAST:event_jPanel5MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:

        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel13.addI();
        jPanel13.repaint();
        jPanel5.repaint();
        jPanel5.setVisible(true);
        jPanel13.setVisible(true);

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel13.deleteI();
        jPanel13.repaint();
        jPanel5.repaint();
        jPanel5.setVisible(true);
        jPanel13.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel13.setVisible(false);
        jPanel13.deleteI();
        jPanel13.repaint();
        jPanel5.repaint();
        jPanel5.setVisible(true);
        jPanel13.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        // TODO add your handling code here:

        jPanel7.setVisible(false);//面板
        jPanel15.setVisible(false);//图片
        jPanel15.addI();
        jPanel15.repaint();
        jPanel7.repaint();
        jPanel7.setVisible(true);
        jPanel15.setVisible(true);


    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        // TODO add your handling code here:
        jPanel7.setVisible(false);//面板
        jPanel15.setVisible(false);//图片
        jPanel15.deleteI();
        jPanel15.repaint();
        jPanel7.repaint();
        jPanel7.setVisible(true);
        jPanel15.setVisible(true);
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setVisible(false);//面板
        jPanel15.setVisible(false);//图片
        jPanel15.deleteI();
        jPanel15.repaint();
        jPanel7.repaint();
        jPanel7.setVisible(true);
        jPanel15.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jPanel7.setVisible(false);//面板
        jPanel15.setVisible(false);//图片
        jPanel15.deleteI();
        jPanel15.repaint();
        jPanel7.repaint();
        jPanel7.setVisible(true);
        jPanel15.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:

        jPanel7.setVisible(false);//面板
        jPanel15.setVisible(false);//图片
        jPanel15.addI();
        jPanel15.repaint();
        jPanel7.repaint();
        jPanel7.setVisible(true);
        jPanel15.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:

        jPanel7.setVisible(false);//面板
        jPanel15.setVisible(false);//图片
        jPanel15.addI();
        jPanel15.repaint();
        jPanel7.repaint();
        jPanel7.setVisible(true);
        jPanel15.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        // TODO add your handling code here:

        jPanel6.setVisible(false);//面板
        jPanel14.setVisible(false);//图片
        jPanel14.addI();
        jPanel14.repaint();
        jPanel6.repaint();
        jPanel6.setVisible(true);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        // TODO add your handling code here:

        jPanel6.setVisible(false);//面板
        jPanel14.setVisible(false);//图片
        jPanel14.deleteI();
        jPanel14.repaint();
        jPanel6.repaint();
        jPanel6.setVisible(true);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        // TODO add your handling code here:

        jPanel4.setVisible(false);//面板
        jPanel12.setVisible(false);//图片
        jPanel12.addI();
        jPanel12.repaint();
        jPanel4.repaint();
        jPanel4.setVisible(true);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setVisible(false);//面板
        jPanel12.setVisible(false);//图片
        jPanel12.addI();
        jPanel12.repaint();
        jPanel4.repaint();
        jPanel4.setVisible(true);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jPanel4.setVisible(false);//面板
        jPanel12.setVisible(false);//图片
        jPanel12.addI();
        jPanel12.repaint();
        jPanel4.repaint();
        jPanel4.setVisible(true);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jPanel4.setVisible(false);//面板
        jPanel12.setVisible(false);//图片
        jPanel12.deleteI();
        jPanel12.repaint();
        jPanel4.repaint();
        jPanel4.setVisible(true);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setVisible(false);//面板
        jPanel12.setVisible(false);//图片
        jPanel12.deleteI();
        jPanel12.repaint();
        jPanel4.repaint();
        jPanel4.setVisible(true);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        // TODO add your handling code here:
        jPanel4.setVisible(false);//面板
        jPanel12.setVisible(false);//图片
        jPanel12.deleteI();
        jPanel12.repaint();
        jPanel4.repaint();
        jPanel4.setVisible(true);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:

        jPanel6.setVisible(false);//面板
        jPanel14.setVisible(false);//图片
        jPanel14.addI();
        jPanel14.repaint();
        jPanel6.repaint();
        jPanel6.setVisible(true);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:

        jPanel6.setVisible(false);//面板
        jPanel14.setVisible(false);//图片
        jPanel14.addI();
        jPanel14.repaint();
        jPanel6.repaint();
        jPanel6.setVisible(true);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        jPanel6.setVisible(false);//面板
        jPanel14.setVisible(false);//图片
        jPanel14.deleteI();
        jPanel14.repaint();
        jPanel6.repaint();
        jPanel6.setVisible(true);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited

        // TODO add your handling code here:
        jPanel6.setVisible(false);//面板
        jPanel14.setVisible(false);//图片
        jPanel14.deleteI();
        jPanel14.repaint();
        jPanel6.repaint();
        jPanel6.setVisible(true);
        jPanel14.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked

        this.setEnabled(false);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        new Sure(this, 2).setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    public void start() {

      

        int tta = 1;
        for (int s = 0; s < inputname.length; s++) {
            if (inputname[s].equals("")) {
                //  System.out.println("退出");
                break;
            }
            if (s > 0) {
                File tempa = new File(inputname[s]);
                String tea = tempa.getName().substring(tempa.getName().lastIndexOf(".") + 1);
                File tempb = new File(inputname[s - 1]);
                String teb = tempb.getName().substring(tempb.getName().lastIndexOf(".") + 1);
                if ("ped".equals(tea)) {
                    tea = "map";
                    if (!"".equals(inputname[2])) {
                        tta = 2;
                    }
                } else if ("ped".equals(teb)) {
                    teb = "map";
                    if (!"".equals(inputname[2])) {
                        tta = 2;
                    }
                }
                if (!tea.equals(teb)) {
                    tta = 0;
                }
            }
        }
        if (tta == 0) {
            JOptionPane.showMessageDialog(null, "Select  files  in  the  same  format", "error", JOptionPane.ERROR_MESSAGE);
        } else if (tta == 2) {
            JOptionPane.showMessageDialog(null, "PED file can only choose a pair", "error", JOptionPane.ERROR_MESSAGE);
        } else {

            //第一种方式，整个窗口不可点击，不可以动，不可最小化和关闭。
            this.setEnabled(false);
            //     this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
            /*    第二种方式，禁止鼠标进入，鼠标会飞到屏幕左上角
   try {//禁止鼠标进入
            Robot myRobot = new Robot();
            jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    int x = evt.getX();
                    int y = evt.getY();
                    //      System.out.println(x + "   " + y);
                    myRobot.mouseMove(0, 0);
                }
            });
        } catch (AWTException ex) {
        }
   
             */
            System.out.println("即将开始运算");
            //动图开始    1  
            jPanel10.setVisible(false);//面板
            jPanel16.setVisible(false);//图片
            jPanel16.addI();
            jPanel16.repaint();
            jPanel10.repaint();
            jPanel10.setVisible(true);
            jPanel16.setVisible(true);
            //动图开始    2  

            //格式化数组
            for (int a = 0; a < inputname.length; a++) {
                if (inputname[a].equals("")) {
                    //  System.out.println("退出");
                    break;
                }
                if (a == inputname.length - 1) {
                    tt[0] = tt[0] + inputname[a];
                } else {
                    tt[0] = tt[0] + inputname[a] + ",";
                }
            }

            /*     System.out.println("文件是：" + tt[0]);
        System.out.println("计算精度是：" + tt[2]);
        System.out.println("亚群体文件：" + tt[4]);
        System.out.println("染色体是：" + tt[5]);
        System.out.println("计算误差是：" + tt[6]);
        System.out.println("是否生成染色体图片：" + tt[7]);
        System.out.println("运算线程数：" + tt[8]);
        System.out.println("运算行号：" + tt[9]);
        System.out.println("运算前范围：" + tt[10]);
        System.out.println("运算后范围：" + tt[11]);
        System.out.println("计算方法：" + tt[12]);
        System.out.println("计算方式：" + tt[13]);
        System.out.println("计算比率：" + tt[14]);*/
            FirstS fs = this;
            new Thread() {
                public void run() {

                    //开始运算
                    int sa;
                    try {

                        Format ff = new Format();
                        sa = ff.Windows(tt);
                        //停止动图
                        jPanel10.setVisible(false);//面板
                        jPanel16.setVisible(false);//图片
                        jPanel16.deleteI();
                        jPanel16.repaint();
                        jPanel10.repaint();
                        jPanel10.setVisible(true);
                        jPanel16.setVisible(true);
                        //运算结束结束后，弹出正确对话窗
                        if (sa == 1) {
                            dispose();
                            theway.dispose();
                            threadnum.dispose();
                            parameter.dispose();
                            method.dispose();
                            new OK().setVisible(true);
                        } else if (sa == 0) {
                            fs.setVisible(false);
                            fs.setEnabled(true);
                            new ErrorFile(fs, 2).setVisible(true);
                        } else if (sa == 2) {

                            new ErrorEndLine(ff.getFirstSNP(), tt[11], theway, 2).setVisible(true);
                        } else if (sa == 3) {
                            new ErrorSileLine(tt[18], theway, 1).setVisible(true);
                        }else if(sa == 4){
                            new ErrorChrom(tt[9], theway,1).setVisible(true);
                        }else if(sa == 5){
                             new ErrorChrom(tt[19], theway,2).setVisible(true);
                        }
                    } catch (Exception ex) {
                        jPanel10.setVisible(false);//面板
                        jPanel16.setVisible(false);//图片
                        jPanel16.deleteI();
                        jPanel16.repaint();
                        jPanel10.repaint();
                        jPanel10.setVisible(true);
                        jPanel16.setVisible(true);
                        fs.setVisible(false);
                        fs.setEnabled(true);
                        new ErrorFile(fs, 2).setVisible(true);
                        Logger.getLogger(FirstW.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }.start();
        }

    }
    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void jPanel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseClicked
        // TODO add your handling code here:
        jPanel50.setVisible(false);
        tt[4] = "nopop";
        jLabel7.setText("Pop File: none");
    }//GEN-LAST:event_jPanel50MouseClicked

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
            java.util.logging.Logger.getLogger(FirstS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstS().setVisible(true);
            }
        });
    }
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

   */
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private MyJPanel jPanel11;
    private MyJPanelParameter jPanel12;
    private MyJPanelTheWay jPanel13;
    private MyJPanelThreadNum jPanel14;
    private MyJPanelMethod jPanel15;
    private MyJPaneldna jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;

    public void setjLabel10(String MissingRate) {
        jLabel10.setText("Missing Rate: " + MissingRate);
        tt[6] = MissingRate;
    }

    public void setjLabel11(String Plating) {
        jLabel11.setText("Plating: " + Plating);
        tt[7] = Plating;
    }

    public void setjLabel12(String Chrom) {
        jLabel12.setText("Chrom: " + Chrom);
        tt[5] = Chrom;
    }

    public void setjLabel13(String Method) {
        jLabel13.setText(Method);
        if (Method.equals("r-square")) {
            tt[13] = "1";
        } else {
            tt[13] = "2";
        }
    }

    public void setjLabel14(String TheWay) {
        jLabel14.setText(TheWay);
        if (TheWay.equals("LD decay")) {
            tt[12] = "1";
        } else if (TheWay.equals("LD block")) {
            tt[12] = "2";
        } else if (TheWay.equals("LD site")) {
            tt[12] = "3";
        }
    }

    public void setjLabel15(String Positioning) {
        jLabel15.setText("Chrom: " + Positioning);
        tt[9] = Positioning;
    }

    public void setjLabel16(String FrontRanges) {
        jLabel16.setText("Start: " + FrontRanges);
        tt[10] = FrontRanges;
    }

    public void setjLabel17(String RearRanges) {
        jLabel17.setText("End: " + RearRanges);
        tt[11] = RearRanges;
    }

    public void setjLabel18(String MS) {
        jLabel18.setText("MAF: " + MS);
        tt[14] = MS;
    }

    public void setjLabel7(String popname, String poppath) {

        if (poppath.equals("null")) {
            tt[4] = "nopop";
            jLabel7.setText("Pop File: none");
        } else {
            jPanel50.setVisible(true);
            tt[4] = poppath;
            if (popname.length() > 25) {
                jLabel7.setText("Pop File: " + popname.substring(0, 25) + "...");
                //  jLabel31.setText(InputName.substring(0, 25) + "...");
            } else {
                jLabel7.setText("Pop File: " + popname);
            }

        }

    }

    public void setjLabel8(String WindowsSize) {
        jLabel8.setText("WindowsSize: " + WindowsSize);
        tt[2] = WindowsSize;
    }

    public void setjLabel9(String Thread) {
        jLabel9.setText("Thread: " + Thread);
        int nomom = Runtime.getRuntime().availableProcessors();
        if (Thread.equals("Superme")) {
            tt[8] = String.valueOf(2 * nomom);
        } else if (Thread.equals("Fast")) {
            tt[8] = String.valueOf(nomom);
        } else if (Thread.equals("Normal")) {
            tt[8] = "1";
        } else {
            tt[8] = Thread;
        }
    }

    public void setInputName(String InputName, String Inputpath, int temp) {
        //用于设置要计算的文件显示哪些
        if (InputName.equals("null") || Inputpath.equals("")) {
            //   System.out.println("aa");
        } else {
            if (jLabel20.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel20.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel20.setText(InputName);
                }
                jLabel20.setToolTipText(Inputpath);
                jPanel49.setVisible(true);
                if (temp == 1) {
                    inputname[0] = Inputpath;
                }
            } else if (jLabel22.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel22.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel22.setText(InputName);
                }
                jLabel22.setToolTipText(Inputpath);
                jPanel48.setVisible(true);
                if (temp == 1) {
                    inputname[1] = Inputpath;
                }
            } else if (jLabel21.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel21.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel21.setText(InputName);
                }
                jLabel21.setToolTipText(Inputpath);
                jPanel47.setVisible(true);
                if (temp == 1) {
                    inputname[2] = Inputpath;
                }
            } else if (jLabel23.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel23.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel23.setText(InputName);
                }
                jLabel23.setToolTipText(Inputpath);
                jPanel46.setVisible(true);
                if (temp == 1) {
                    inputname[3] = Inputpath;
                }
            } else if (jLabel25.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel25.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel25.setText(InputName);
                }
                jLabel25.setToolTipText(Inputpath);
                jPanel43.setVisible(true);
                if (temp == 1) {
                    inputname[4] = Inputpath;
                }
            } else if (jLabel24.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel24.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel24.setText(InputName);
                }
                jLabel24.setToolTipText(Inputpath);
                jPanel42.setVisible(true);
                if (temp == 1) {
                    inputname[5] = Inputpath;
                }
            } else if (jLabel28.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel28.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel28.setText(InputName);
                }
                jLabel28.setToolTipText(Inputpath);
                jPanel37.setVisible(true);
                if (temp == 1) {
                    inputname[6] = Inputpath;
                }
            } else if (jLabel27.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel27.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel27.setText(InputName);
                }
                jLabel27.setToolTipText(Inputpath);
                jPanel36.setVisible(true);
                if (temp == 1) {
                    inputname[7] = Inputpath;
                }
            } else if (jLabel30.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel30.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel30.setText(InputName);
                }
                jLabel30.setToolTipText(Inputpath);
                jPanel38.setVisible(true);
                if (temp == 1) {
                    inputname[8] = Inputpath;
                }
            } else if (jLabel31.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel31.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel31.setText(InputName);
                }
                jLabel31.setToolTipText(Inputpath);
                jPanel39.setVisible(true);
                if (temp == 1) {
                    inputname[9] = Inputpath;
                }
            } else if (jLabel32.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel32.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel32.setText(InputName);
                }
                jLabel32.setToolTipText(Inputpath);
                jPanel40.setVisible(true);
                if (temp == 1) {
                    inputname[10] = Inputpath;
                }
            } else if (jLabel33.getText().equals("")) {
                if (InputName.length() > 25) {
                    jLabel33.setText(InputName.substring(0, 25) + "...");
                } else {
                    jLabel33.setText(InputName);
                }
                jLabel33.setToolTipText(Inputpath);
                jPanel41.setVisible(true);
                if (temp == 1) {
                    inputname[11] = Inputpath;
                }
            } else {
                if (temp == 1) {
                    for (int i = 0; i < inputname.length; i++) {
                        if (inputname[i].equals("")) {
                            inputname[i] = Inputpath;
                            break;
                        }
                    }
                } else {
                }
            }
        }
        jPanel9.repaint();
    }

    public void drag()//定义的拖拽方法
    {
        FirstS fj = this;
        //panel表示要接受拖拽的控件
        new DropTarget(jPanel1, DnDConstants.ACTION_COPY_OR_MOVE, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent dtde)//重写适配器的drop方法
            {
                try {
                    if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor))//如果拖入的文件格式受支持
                    {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);//接收拖拽来的数据
                        List<File> list = (List<File>) (dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor));
                        //     String temp = "";
                        for (File file : list) {
                            //先判断是不是文件夹
                            if (file.isFile() == true) {//文件
                                //只能接受gz格式的文件
                                File tem = new File(file.getAbsolutePath());
                                //  String fileName = tem.getName();
                                String te = tem.getName().substring(tem.getName().lastIndexOf(".") + 1);
                                if (te.startsWith("gz") || te.startsWith("vcf") || te.startsWith("map") || te.startsWith("ped")) {
                                    fj.setInputName(tem.getName(), tem.getPath(), 1);
                                }
                            } else {
                                //文件夹
                                File[] array = file.listFiles();
                                for (int is = 0; is < array.length; is++) {
                                    String te = array[is].getName().substring(array[is].getName().lastIndexOf(".") + 1);
                                    if (te.startsWith("gz") || te.startsWith("vcf") || te.startsWith("map") || te.startsWith("ped")) {
                                        fj.setInputName(array[is].getName(), array[is].getPath(), 1);
                                    }
                                }

                            }

                            //  temp += file.getAbsolutePath() + ",";
                        }
                        // JOptionPane.showMessageDialog(null, temp);

                        dtde.dropComplete(true);//指示拖拽操作已完成
                        jPanel9.repaint();
                    } else {
                        dtde.rejectDrop();//否则拒绝拖拽来的数据
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void clean() {
        jPanel49.setVisible(false);
        jPanel48.setVisible(false);
        jPanel47.setVisible(false);
        jPanel46.setVisible(false);
        jPanel43.setVisible(false);
        jPanel42.setVisible(false);
        jPanel41.setVisible(false);
        jPanel40.setVisible(false);
        jPanel39.setVisible(false);
        jPanel38.setVisible(false);
        jPanel37.setVisible(false);
        jPanel36.setVisible(false);

        jLabel20.setText("");
        jLabel22.setText("");
        jLabel21.setText("");
        jLabel23.setText("");
        jLabel25.setText("");
        jLabel24.setText("");
        jLabel28.setText("");
        jLabel27.setText("");
        jLabel30.setText("");
        jLabel31.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
    }

    public void setjLabel34(String resulename) {
        if (resulename.length() > 6) {
            jLabel34.setText("Result Name: " + resulename.substring(0, 3) + "...");
        } else {
            jLabel34.setText("Result Name: " + resulename);

        }
        tt[3] = resulename;
    }

    public void setjLabel37(String chr) {
        jLabel37.setText("Chr: " + chr);
        tt[19] = chr;
    }

    public void setjLabel38(String pos) {
        jLabel38.setText("Pos: " + pos);
        tt[18] = pos;
    }

    public String popname() {
        return jLabel7.getText();
    }

    public void SetResuldPath(String path) {
        tt[1] = path;
    }
        public void setIntermediate(String value){
        tt[20] = value;
        
    }
}
