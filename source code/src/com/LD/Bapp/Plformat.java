/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Bapp;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.te33.WA;

/**
 *
 * @author Mr-LiZhuo
 */
public class Plformat {

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    public void Command(String pt[]) throws IOException {
        if (pt[0] == null) {
            System.out.println("Please select the input file");
            return;
        }
        if (pt[1] == null) {
            pt[1] = "yes";
        }
        if (pt[2] == null) {
            pt[2] = "1";
        }
        if (pt[3] == null) {
            pt[3] = "result";
        }
        if (pt[4] == null) {
            File tempFile = new File(pt[0]);
            if (tempFile.getParent() == null) {
                pt[4] = "result" + df.format(new Date());
            } else {
                pt[4] = tempFile.getParent() + "/result" + df.format(new Date());
            }
        }
        if (pt[5] == null) {
            pt[5] = "yes";
        }
        new WA().ReadResult(pt);
    }

    public int Win(String pt[]) throws IOException {
        if (pt[0].equals("")) {
            System.out.println("Please select the input file");
            return 0;
        }
        if (pt[1] == null) {
            pt[1] = "yes";
        }
        if (pt[2].equals("")) {
            pt[2] = "1";
        }
        if (pt[3].equals("")) {
            pt[3] = "result";
        }
        if (pt[4].equals("")) {
            File tempFile = new File(pt[0]);
            if (tempFile.getParent() == null) {
                pt[4] = "result" + df.format(new Date());
            } else {
                pt[4] = tempFile.getParent() + "/result" + df.format(new Date());
            }
        }
        if (pt[5].equals("")) {
            pt[5] = "yes";
        }
        return new WA().ReadResult(pt);
    }
}
