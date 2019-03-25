/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Windows.Background;

/**
 *
 * @author Mr-LiZhuo
 */
import java.awt.*;  
import javax.swing.JPanel;  
  
/** 
 * 有背景图片的Panel类 
 * @author tntxia 
 * 
 */  
public class BackgroundPanel extends JPanel {  
      
    /** 
     *  
     */ 
    private static final long serialVersionUID = -6352788025440244338L;  
      
    private Image image = null;  
  
    public BackgroundPanel(Image image) {  
        this.image = image;  
    }  
  
    @Override
    protected void paintComponent(Graphics g) {  
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);  
        
    }  
}  