/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.RunR;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr-LiZhuo
 * @see 写入R语言的命令文件
 * @see 如果R[7]是 “否”， 则生成各个染色体的图片
 * @see 如果R[7]是 “是”， 则不生成各个染色体的图片。
 * @see 最后都生成一张汇总图片
 */
public class writeR {

    FileWriter writer;

    public writeR() {
    }

    public String writesR(String[] R, String chrom, int popsize, int windowssize, Map<Integer, String> subpopname) throws IOException {
        String[] chr = chrom.split(",");
        String fileName = R[1] + "/" + R[3] + ".R";
        writer = new FileWriter(fileName);
        String mm = R[1].replaceAll("\\\\", "/");
        writer.write("setwd(\"" + mm + "\")" + "\n");
        writer.write("data = read.table(\"" + R[3] + ".txt" + "\",head =T)" + "\n");

        if (R[7].equals("no")) {
            writeRC(R, chr, popsize, windowssize, subpopname);
        }
        writeRA(R, chr, popsize, windowssize, subpopname);
        writer.close();
        return fileName;
    }

    public void writeRC(String[] R, String[] tc, int popsize, int windowssize, Map<Integer, String> subpopname) {
        int firstline = 0;
        int lastline = 0;
        try {
            for (int i = 0; i < tc.length; i++) {
                writer.write("png(file=\"" + R[3] + i + ".png" + "\", bg=\"transparent\",width=900,height=800)" + "\n");
                writer.write("par(mar=c(5.1, 4.1, 4.1,10), xpd=TRUE)" + "\n");
                for (int s = 0; s < popsize; s++) {
                    if (s > 0) {
                        writer.write("lines(data[" + firstline + ":" + lastline + ",2],data[" + firstline + ":" + lastline + "," + (s + 3) + "],col=" + s + ")\n");
                        writer.write("legend(" + (windowssize / 1000) + ",max(data[" + firstline + ":" + lastline + ",3:length(data)]+0.1)" + (-(s * 0.05)) + ",legend=\"" + subpopname.get(s) + "\",col=" + s + ",lty =1,bty=\"n\")" + "\n");
                        //writer.write("legend(" + (windowssize / 1000) + ",1" + (-(s * 0.1)) + ",legend=\"Group " + (s + 1) + "\",col=" + s + ",lty =1,bty=\"n\")" + "\n");
                    } else {
                        if (i == 0) {
                            firstline = 1;
                            lastline = windowssize / 100;
                        } else {
                            firstline = lastline + 1;
                            lastline = (i + 1) * (windowssize / 100);
                        }
                        writer.write("plot(data[" + firstline + ":" + lastline + ",2],data[" + firstline + ":" + lastline + ",3],"
                                + "type=\"l\",col=\"blue\",main=\"LD decay \\n (chromosome:" + tc[i] + ") \",xlab=\"Distance(Kb)\","
                                //+ "xlim=c(0," + R[2] + "),ylim=c(0,1),ylab=expression(r^{2}),bty=\"n\")" + "\n");
                                + "xlim=c(0," + R[2] + "),ylim=c(min(data[" + firstline + ":" + lastline + ",3:length(data)])-0.1,max(data[" + firstline + ":" + lastline + ",3:length(data)])+0.1),ylab=expression(r^{2}),bty=\"n\")" + "\n");
                        writer.write("legend(" + (windowssize / 1000) + ",max(data[" + firstline + ":" + lastline + ",3:length(data)]+0.1),legend=\"" + subpopname.get(s) + "\",col=\"blue\",lty =1,bty=\"n\",xpd=\"true\")" + "\n");
                        //writer.write("legend(" + (windowssize / 1000) + ",1,legend=\"Group " + (s + 1) + "\",col=\"blue\",lty =1,bty=\"n\",xpd=\"true\")" + "\n");
                    }
                }
                writer.write("dev.off()" + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(writeR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeRA(String[] R, String[] tc, int popsize, int windowssize, Map<Integer, String> subpopname) {
        int size = 0;
        int firstline = 0;
        int lastline = 0;
        try {
            writer.write("png(file=\"" + R[3] + "All" + ".png" + "\", bg=\"transparent\",width=900,height=800)" + "\n");
            writer.write("par(mar=c(5.1, 4.1, 4.1,10), xpd=TRUE)" + "\n");
            for (int i = 0; i < tc.length; i++) {
                for (int s = 0; s < popsize; s++) {
                    if (i == 0 & s == 0) {
                        firstline = 1;
                        lastline = windowssize / 100;
                        writer.write("plot(data[" + firstline + ":" + lastline + ",2],data[" + firstline + ":" + lastline + ",3],"
                                + "type=\"l\",col=\"blue\",main=\"LD decay \",xlab=\"Distance(Kb)\","
                                // + "xlim=c(0," + R[2] + "),ylim=c(0,1),ylab=expression(r^{2}),bty=\"n\")" + "\n");
                                + "xlim=c(0," + R[2] + "),ylim=c(min(data[" + firstline + ":" + lastline + ",3:length(data)])-0.1,max(data[" + firstline + ":" + lastline + ",3:length(data)])+0.1),ylab=expression(r^{2}),bty=\"n\")" + "\n");
                        writer.write("legend(" + (windowssize / 1000) + ",max(data[" + firstline + ":" + lastline + ",3:length(data)]+0.1),legend=\" chrom " + tc[i] + "  " + subpopname.get(s) + "\",col=\"blue\",lty =1,bty=\"n\")" + "\n");
                        //writer.write("legend(" + (windowssize / 1000) + ",1,legend=\" chrom " + tc[i] + " Group " + (s + 1) + "\",col=\"blue\",lty =1,bty=\"n\")" + "\n");
                    } else {
                        if (i > 0 & s == 0) {
                            firstline = lastline + 1;
                            lastline = (i + 1) * (windowssize / 100);
                        }
                        writer.write("lines(data[" + firstline + ":" + lastline + ",2],data[" + firstline + ":" + lastline + "," + (s + 3) + "],col=" + size + ")\n");

                        writer.write("legend(" + (windowssize / 1000) + ",max(data[" + firstline + ":" + lastline + ",3:length(data)]+0.1)" + (-(size * 0.05)) + ",legend=\" chrom: " + tc[i] + "  " + subpopname.get(s) + "\",col=" + size + ",lty =1,bty=\"n\" ,xpd=\"true\")" + "\n");
                        //writer.write("legend(" + (windowssize / 1000) + ",1" + (-(size * 0.1)) + ",legend=\" chrom: " + tc[i] + " Group " + (s + 1) + "\",col=" + size + ",lty =1,bty=\"n\" ,xpd=\"true\")" + "\n");
                    }
                    size++;
                }
            }
            writer.write("dev.off()" + "\n");
        } catch (IOException ex) {
            Logger.getLogger(writeR.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
