/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.LDblock;

import org.te33.WI;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Mr-LiZhuo
 */
public class block {

    public void writeblock(String[][] res, String outFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(outFile);
        try (BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(fos))) {
            for (String[] re : res) {
                for (int h = 0; h < res[0].length; h++) {
                    if (re[h] != null) {
                        osw.write(re[h] + "\t");
                    }
                }
                osw.write("\n");
            }
        }
    }

    public void writeblock(float[][] res, String outFile, Integer[] ppos, String chrname) throws IOException {
        try (BufferedWriter bw = WI.getTextWriter(outFile)) {
            for (int i = 0; i < res.length + 1; i++) {
                for (int h = 0; h < res[0].length; h++) {
                    if (i == 0 && h == 0) {
                        bw.write("chr:" + chrname + "\t");
                    }
                    if (i == 0) {
                        bw.write(ppos[h] + "\t");
                    } else if (h == 0) {
                        bw.write(ppos[i - 1] + "\t");
                    }
                    if (i != 0) {
                        if (res[i - 1][h] != 0f) {
                            bw.write(res[i - 1][h] + "\t");
                        }
                    }
                }
                bw.write("\n");
            }
            bw.flush();
        }
    }
}
