package com.LD.Windows;

import java.awt.datatransfer.Clipboard;  
import java.awt.datatransfer.DataFlavor;  
import java.awt.datatransfer.Transferable;  
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.InputEvent;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import java.io.IOException;
  
import javax.swing.JMenuItem;  
import javax.swing.JPopupMenu;  
import javax.swing.JTextField;  
import javax.swing.KeyStroke;  
    
  
public class MJTextField extends JTextField implements MouseListener {  
  
    private static final long serialVersionUID = -2308615404205560110L;  
  
    private JPopupMenu pop = null;
  
    private JMenuItem copy = null, paste = null, cut = null; 
  
    public MJTextField() {  
        super();  
        init();  
    }  
  
    private void init() {  
        this.addMouseListener(this);  
        pop = new JPopupMenu();  
        pop.add(copy = new JMenuItem("copy"));  
        pop.add(paste = new JMenuItem("paste"));  
        pop.add(cut = new JMenuItem("cut"));   
        copy.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_MASK));  
        paste.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.CTRL_MASK));  
        cut.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_MASK));  
        copy.addActionListener((ActionEvent e) -> {
            action(e);  
        });  
        paste.addActionListener((ActionEvent e) -> {
            action(e);  
        });  
        cut.addActionListener((ActionEvent e) -> {
            action(e);  
        });  
        this.add(pop);  
    }  
  
    /** 
     * 菜单动作 
     *  
     * @param e 
     */  
    public void action(ActionEvent e) {  
        String str = e.getActionCommand();  
        if (str.equals(copy.getText())) { 
            this.copy();  
        } else if (str.equals(paste.getText())) {  
            this.paste();  
        } else if (str.equals(cut.getText())) { 
            this.cut();  
        }  
    }  
  
    public JPopupMenu getPop() {  
        return pop;  
    }  
  
    public void setPop(JPopupMenu pop) {  
        this.pop = pop;  
    }  
  
    /** 
     * 剪切板中是否有文本数据可供粘贴 
     *  
     * @return true为有文本数据 
     */  
    public boolean isClipboardString() {  
        boolean b = false;  
        Clipboard clipboard = this.getToolkit().getSystemClipboard();  
        Transferable content = clipboard.getContents(this);  
        try {  
            if (content.getTransferData(DataFlavor.stringFlavor) instanceof String) {  
                b = true;  
            }  
        } catch (UnsupportedFlavorException | IOException e) {  
        }  
        return b;  
    }  
  
    /** 
     * 文本组件中是否具备复制的条件 
     *  
     * @return true为具备 
     */  
    public boolean isCanCopy() {  
        boolean b = false;  
        int start = this.getSelectionStart();  
        int end = this.getSelectionEnd();  
        if (start != end)  
            b = true;  
        return b;  
    }  
  
    @Override
    public void mouseClicked(MouseEvent e) {  
    }  
  
    @Override
    public void mouseEntered(MouseEvent e) {  
    }  
  
    @Override
    public void mouseExited(MouseEvent e) {  
    }  
  
    @Override
    public void mousePressed(MouseEvent e) {  
        if (e.getButton() == MouseEvent.BUTTON3) {  
            copy.setEnabled(isCanCopy());  
            paste.setEnabled(isClipboardString());  
            cut.setEnabled(isCanCopy());  
            pop.show(this, e.getX(), e.getY());  
        }  
    }  
  
    @Override
    public void mouseReleased(MouseEvent e) {  
    }  
  
}  