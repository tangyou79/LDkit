package com.LD.Windows.Background;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mr-LiZhuo
 */
public class MyJPaneldna extends JPanel {

    private static int i = 1;

    public void addI() {
        i++;
    }

    public void deleteI() {
        i--;
    }

    private Image image1 = null;
    private Image image2 = null;

    public MyJPaneldna(Image image1, Image image2) {

        this.image1 = image1;

        this.image2 = image2;

    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        if (i == 1) {
            g.drawImage(image2, 0, 0, this.getWidth(), this.getHeight(), this);
        } else {
            g.drawImage(image1, 0, 0, this.getWidth(), this.getHeight(), this);
        }

    }

}
