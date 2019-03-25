/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Result;

import org.te33.WI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.LD.Aapp.mains;
import com.LD.gzip.CompressFileGZIP;

/**
 *
 * @author Mr-LiZhuo‘
 * @see 输出结果文件
 */
public class writerResule {

    public writerResule() {
    }

    public void writerRes(String chrom, String outFile, int size, Map<String, float[][]> res, Map<Integer, String> subpopname, Map<String, int[][]> resh) {
        String[] chr = chrom.split(",");
        BufferedWriter bw = WI.getTextWriter(outFile);
        try {
            bw.write("CHROM\tDistance(bp)\t");
            for (int ds = 0; ds < size; ds++) {
                bw.write(subpopname.get(ds) + "\t" + subpopname.get(ds) + "-times" + "\t");
            }
            bw.newLine();
            for (String chr1 : chr) {
                for (int s = 1; s < res.get(chr1).length; s++) {
                    bw.write(chr1 + "\t" + s + "\t");
                    for (int ds = 0; ds < size; ds++) {
                        bw.write(res.get(chr1)[s][ds] + "\t" + resh.get(chr1)[s][ds] + "\t");
                    }
                    bw.newLine();
                }
            }
            bw.flush();
            bw.close();
            new CompressFileGZIP().doCompressFile(outFile);
            new File(outFile).delete();
        } catch (IOException ex) {
            Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
