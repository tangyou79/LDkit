/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Aapp;

import org.te33.WH;
import com.LD.Comparison.VCFtoPOP;
import org.te33.WE;
import com.LD.LDblock.WriteHeatMap;
import com.LD.LDblock.block;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.LD.sta.LD;
import com.LD.Result.writerResule;
import java.io.IOException;
import org.te33.WA;
import org.te33.WB;

/**
 *
 * @author Mr-LiZhuo
 * @inFile：输入文件地址
 * @outFile:输出文件地址
 * @windowssize：计算精度（横坐标），默认是100
 * @subpopFile：亚群体文件
 * @chrom：要计算的染色体
 * @erp：计算nan/样本信息的误差精度。默认是0.2
 * @gemimg：生成的染色体，是否合并。默认是合并 T
 * @hrsize：生成的线程数。默认是10000
 */
public class mains {

    /**
     * @param args the command line arguments
     */
    String inFile;
    String outFile;
    int windowssize;
    String subpopFile;
    String chrom;
    double erp;
    String gemimg;
    int Thrsize;
    String OperationMethod;

    public int main(String[] tt, WE vc) {
        inFile = "111";
        outFile = tt[1] + "/" + tt[3] + ".txt";
        subpopFile = tt[4];
        chrom = tt[5];
        gemimg = tt[7];
        OperationMethod = tt[12];
        if (inFile.equals("请选择您要计算的文件")) {
            System.out.print("文件输入错误");
            return 0;
        } else if (tt[1].equals("请选择输出文件夹")) {
            System.out.print("文件夹输入错误");
            return 0;
        } else {
            if (tt[2].equals("")) {
                windowssize = 100 * 1000;
            } else if (!tt[2].equals("")) {
                windowssize = Integer.parseInt(tt[2]) * 1000;
            }
            if (tt[6].equals("")) {
                erp = 0.2;
            } else if (!tt[6].equals("")) {
                erp = Double.parseDouble(tt[6]);
            }
            if (gemimg.equals("")) {
                gemimg = "yes";
            }
            if (tt[8].equals("")) {
                Thrsize = 1;
            } else if (!tt[8].equals("")) {
                Thrsize = Integer.parseInt(tt[8]);
            }
            if (subpopFile.equals("请选择亚群体文件")) {
                subpopFile = "nopop";
            }
            VCFtoPOP vp = new VCFtoPOP();
            if (!vp.ispop(subpopFile)) {
                System.out.println("亚群体和VCF中的样本信息不一致");
                return 0;
            }
            try {
                //开始计算
                int Method = Integer.parseInt(tt[13]);
                LD ww = new LD();
                Map<String, float[][]> res = ww.LD(chrom, vc.getCorp(), vc.getCorsize(), windowssize, vc.getPos(), vc.getGenotype(), vc.getGrop(), erp, vp.getSubpop(), vp.getpopsize(), OperationMethod, Thrsize, subpopFile, Method);
                Map<String, int[][]> resh = ww.getRm();
                new writerResule().writerRes(chrom, outFile, vp.getpopsize(), res, vp.getSubpopname(), resh);
                /*
               String fileR = new writeR().writesR(tt, chrom, vp.getpopsize(), windowssize,vp.getSubpopname());
               new RunR().RunR(fileR); 
                 */
                String[] path = new String[10];
                path[0] = outFile + ".gz";
                path[1] = "yes";
                path[2] = "1";
                path[3] = tt[3];
                path[5] = "yes";
                path[4] = tt[1] + "/";
                new WA().ReadResult(path);
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            } catch (OutOfMemoryError E) {
                return 0;
            }
            return 1;
        }
    }

    public int main(String[] tt, WH vc) {
        inFile = "111";
        outFile = tt[1] + "/" + tt[3] + ".txt";
        subpopFile = tt[4];
        chrom = tt[5];
        gemimg = tt[7];
        OperationMethod = tt[12];
        if (inFile.equals("请选择您要计算的文件")) {
            System.out.print("文件输入错误");
            return 0;
        } else if (tt[1].equals("请选择输出文件夹")) {
            System.out.print("文件夹输入错误");
            return 0;
        } else {
            if (tt[2].equals("")) {
                windowssize = 100 * 1000;
            } else if (!tt[2].equals("")) {
                windowssize = Integer.parseInt(tt[2]) * 1000;
            }
            if (tt[6].equals("")) {
                erp = 0.2;
            } else if (!tt[6].equals("")) {
                erp = Double.parseDouble(tt[6]);
            }
            if (gemimg.equals("")) {
                gemimg = "yes";
            }
            if (tt[8].equals("")) {
                Thrsize = 1;
            } else if (!tt[8].equals("")) {
                Thrsize = Integer.parseInt(tt[8]);
            }
            if (subpopFile.equals("请选择亚群体文件")) {
                subpopFile = "nopop";
            }
            VCFtoPOP vp = new VCFtoPOP();
            if (!vp.ispop(subpopFile)) {
                System.out.println("亚群体和VCF中的样本信息不一致");
                return 0;
            }
            try {
                int Method = Integer.parseInt(tt[13]);
                LD ww = new LD();
                Map<String, float[][]> res = ww.LD(chrom, vc.getCorp(), vc.getCorsize(), windowssize, vc.getPos(), vc.getGenotype(), vc.getGrop(), erp, vp.getSubpop(), vp.getpopsize(), OperationMethod, Thrsize, subpopFile, Method);
                new writerResule().writerRes(chrom, outFile, vp.getpopsize(), res, vp.getSubpopname(), ww.getRm());
                String[] path = new String[10];
                path[0] = outFile + ".gz";
                path[1] = "yes";
                path[2] = "1";
                path[3] = "result";
                path[5] = "yes";
                path[4] = tt[1] + "/";
                new WA().ReadResult(path);
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            } catch (OutOfMemoryError E) {
                return 0;
            }
            return 1;
        }
    }

    public int pedLdblock(String[] tt, WH vc) {
        inFile = "111";
        outFile = tt[1] + "/" + tt[3];
        subpopFile = tt[4];
        chrom = tt[5];
        gemimg = tt[7];
        OperationMethod = tt[12];
        if (inFile.equals("请选择您要计算的文件")) {
            System.out.print("文件输入错误");
            return 0;
        } else if (tt[1].equals("请选择输出文件夹")) {
            System.out.print("文件夹输入错误");
            return 0;
        } else {
            if (tt[2].equals("")) {
                windowssize = 100 * 1000;
            } else if (!tt[2].equals("")) {
                windowssize = Integer.parseInt(tt[2]) * 1000;
            }
            if (tt[6].equals("")) {
                erp = 0.2;
            } else if (!tt[6].equals("")) {
                erp = Double.parseDouble(tt[6]);
            }
            if (gemimg.equals("")) {
                gemimg = "yes";
            }
            if (tt[8].equals("")) {
                Thrsize = 1;
            } else if (!tt[8].equals("")) {
                Thrsize = Integer.parseInt(tt[8]);
            }
            if (subpopFile.equals("请选择亚群体文件")) {
                subpopFile = "nopop";
            }
            VCFtoPOP vp = new VCFtoPOP();
            if (!vp.ispop(subpopFile)) {
                System.out.println("亚群体和VCF中的样本信息不一致");
                return 0;
            }
            try {
                int corsize = vc.getCorsize();

                String[][] crop = vc.getCorp();
                int h = 0;
                for (h = 0; h < corsize; h++) {

                    if (crop[h][0].equals(tt[9])) {

                        int farstline = Integer.parseInt(crop[h][1]);
                        int lastline = Integer.parseInt(crop[h][2]);
                        Integer ppos[] = vc.getPos().get(Integer.parseInt(crop[h][3]));
                        byte[][] ggenotype = vc.getGenotype().get(Integer.parseInt(crop[h][3]));
                        Map<Integer, String[]> subpop = vp.getSubpop();
                        Map<Integer, String> subpopname = vp.getSubpopname();
                        String[] grops = vc.getGrop().get(Integer.parseInt(crop[h][3]));
                        int Method = Integer.parseInt(tt[13]);
                        int getpopsize = vp.getpopsize();
                        for (int a = 0; a < getpopsize; a++) {
                            WB tta = new WB();
                            tta.PedLDblock(farstline, lastline, ppos, ggenotype, subpop.get(a), subpopFile, grops, Method, Integer.parseInt(tt[10]), Integer.parseInt(tt[11]), outFile + "-" + subpopname.get(a) + ".txt");
                            new WriteHeatMap().WriteHeatMap(outFile + "-" + subpopname.get(a) + ".txt.gz", outFile + "-" + subpopname.get(a) + ".png", crop[h][0]);
                            if (tt[20].equals("yes") || tt[20].equals("YES")) {
                                tta.PedLDblockAll(farstline, lastline, ppos, ggenotype, subpop.get(a), subpopFile, grops, Method, Integer.parseInt(tt[10]), Integer.parseInt(tt[11]), outFile + "-" + subpopname.get(a) + ".txt");
                            }
                            System.out.println(new Date() + "   " + "Calculation " + subpopname.get(a));
                        }
                    }
                }

            } catch (IOException | InterruptedException | NumberFormatException ex) {
                Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            } catch (OutOfMemoryError E) {
                return 0;
            }
            return 1;
        }
    }

    public int mainLDblock(String[] tt, WE vc) {
        inFile = "111";
        outFile = tt[1] + "/" + tt[3];
        subpopFile = tt[4];
        chrom = tt[5];
        gemimg = tt[7];
        OperationMethod = tt[12];
        if (inFile.equals("请选择您要计算的文件")) {
            System.out.print("文件输入错误");
            return 0;
        } else if (tt[1].equals("请选择输出文件夹")) {
            System.out.print("文件夹输入错误");
            return 0;
        } else {
            if (tt[2].equals("")) {
                windowssize = 100 * 1000;
            } else if (!tt[2].equals("")) {
                windowssize = Integer.parseInt(tt[2]) * 1000;
            }
            if (tt[6].equals("")) {
                erp = 0.2;
            } else if (!tt[6].equals("")) {
                erp = Double.parseDouble(tt[6]);
            }
            if (gemimg.equals("")) {
                gemimg = "yes";
            }
            if (tt[8].equals("")) {
                Thrsize = 1;
            } else if (!tt[8].equals("")) {
                Thrsize = Integer.parseInt(tt[8]);
            }
            if (subpopFile.equals("请选择亚群体文件")) {
                subpopFile = "nopop";
            }
            VCFtoPOP vp = new VCFtoPOP();
            if (!vp.ispop(subpopFile)) {
                System.out.println("亚群体和VCF中的样本信息不一致");
                return 0;
            }
            try {
                String[][] crop = vc.getCorp();
                int farstline = Integer.parseInt(crop[0][1]);
                int lastline = Integer.parseInt(crop[0][2]);
                Integer ppos[] = vc.getPos().get(Integer.parseInt(crop[0][3]));
                byte[][] ggenotype = vc.getGenotype().get(Integer.parseInt(crop[0][3]));
                Map<Integer, String[]> subpop = vp.getSubpop();
                Map<Integer, String> subpopname = vp.getSubpopname();
                String[] grops = vc.getGrop().get(Integer.parseInt(crop[0][3]));
                int Method = Integer.parseInt(tt[13]);
                int getpopsize = vp.getpopsize();
                for (int a = 0; a < getpopsize; a++) {
                    new WB().calLDblock(farstline, lastline, ppos, ggenotype, subpop.get(a), subpopFile, grops, Method, outFile + "-" + subpopname.get(a) + ".txt");
                    new WriteHeatMap().WriteHeatMap(outFile + "-" + subpopname.get(a) + ".txt.gz", outFile + subpopname.get(a) + ".png", crop[0][0]);
                    if (tt[20].equals("yes") || tt[20].equals("YES")) {
                        new WB().calLDblockAll(farstline, lastline, ppos, ggenotype, subpop.get(a), subpopFile, grops, Method, outFile + "-" + subpopname.get(a) + "-ALL.txt");
                    }
                    System.out.println(new Date() + "   " + "Calculation " + subpopname.get(a));
                }
            } catch (IOException | InterruptedException | NumberFormatException ex) {
                Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            } catch (OutOfMemoryError E) {
                return 0;
            }
            return 1;
        }
    }

    public int mainLDsite(String[] tt, WE vc) {
        inFile = "111";
        outFile = tt[1] + "/" + tt[3];
        subpopFile = tt[4];
        chrom = tt[5];
        gemimg = tt[7];
        OperationMethod = tt[12];
        if (inFile.equals("请选择您要计算的文件")) {
            System.out.print("文件输入错误");
            return 0;
        } else if (tt[1].equals("请选择输出文件夹")) {
            System.out.print("文件夹输入错误");
            return 0;
        } else {
            if (tt[2].equals("")) {
                windowssize = 100 * 1000;
            } else if (!tt[2].equals("")) {
                windowssize = Integer.parseInt(tt[2]) * 1000;
            }
            if (tt[6].equals("")) {
                erp = 0.2;
            } else if (!tt[6].equals("")) {
                erp = Double.parseDouble(tt[6]);
            }
            if (gemimg.equals("")) {
                gemimg = "yes";
            }
            if (tt[8].equals("")) {
                Thrsize = 1;
            } else if (!tt[8].equals("")) {
                Thrsize = Integer.parseInt(tt[8]);
            }
            if (subpopFile.equals("请选择亚群体文件")) {
                subpopFile = "nopop";
            }
            VCFtoPOP vp = new VCFtoPOP();
            if (!vp.ispop(subpopFile)) {
                System.out.println("亚群体和VCF中的样本信息不一致");
                return 0;
            }
            try {
                String[][] crop = vc.getCorp();
                int farstline = Integer.parseInt(crop[0][1]);
                int lastline = Integer.parseInt(crop[0][2]);
                Integer ppos[] = vc.getPos().get(Integer.parseInt(crop[0][3]));
                byte[][] ggenotype = vc.getGenotype().get(Integer.parseInt(crop[0][3]));
                Map<Integer, String[]> subpop = vp.getSubpop();
                Map<Integer, String> subpopname = vp.getSubpopname();
                String[] grops = vc.getGrop().get(Integer.parseInt(crop[0][3]));
                int Method = Integer.parseInt(tt[13]);
                int getpopsize = vp.getpopsize();
                for (int a = 0; a < getpopsize; a++) {
                    String[][] res = new WB().calLDsite(farstline, lastline, ppos, ggenotype, subpop.get(a), subpopFile, grops, Method, vc.getSiteLinegen(), vc.getSiteLineName());
                    res[0][0] = "chr:" + crop[0][0];
                    new block().writeblock(res, outFile + "-" + subpopname.get(a) + ".txt");
                    new WriteHeatMap().WriteHeatMap(res, outFile + "-" + subpopname.get(a) + ".png");
                    System.out.println(new Date() + "   " + "Calculation " + subpopname.get(a));
                }
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            } catch (OutOfMemoryError E) {
                return 0;
            }
            return 1;
        }
    }

    public int pedLDsite(String[] tt, WH vc) {
        inFile = "111";
        outFile = tt[1] + "/" + tt[3];
        subpopFile = tt[4];
        chrom = tt[5];
        gemimg = tt[7];
        if (inFile.equals("请选择您要计算的文件")) {
            System.out.print("文件输入错误");
            return 0;
        } else if (tt[1].equals("请选择输出文件夹")) {
            System.out.print("文件夹输入错误");
            return 0;
        } else {
            if (tt[2].equals("")) {
                windowssize = 100 * 1000;
            } else if (!tt[2].equals("")) {
                windowssize = Integer.parseInt(tt[2]) * 1000;
            }
            if (tt[6].equals("")) {
                erp = 0.2;
            } else if (!tt[6].equals("")) {
                erp = Double.parseDouble(tt[6]);
            }
            if (gemimg.equals("")) {
                gemimg = "yes";
            }
            if (tt[8].equals("")) {
                Thrsize = 1;
            } else if (!tt[8].equals("")) {
                Thrsize = Integer.parseInt(tt[8]);
            }
            if (subpopFile.equals("请选择亚群体文件")) {
                subpopFile = "nopop";
            }
            VCFtoPOP vp = new VCFtoPOP();
            if (!vp.ispop(subpopFile)) {
                System.out.println("亚群体和VCF中的样本信息不一致");
                return 0;
            }
            try {
                int corsize = vc.getCorsize();
                String[][] crop = vc.getCorp();
                int h = 0;
                float[] genp = null;
                String SiteLineName = null;
                for (int m = 0; m < corsize; m++) {
                    if (crop[m][0].equals(tt[19])) {
                        Integer ppos[] = vc.getPos().get(Integer.parseInt(crop[m][3]));
                        for (int sa = 0; sa < ppos.length; sa++) {
                            if (ppos[sa] == Integer.parseInt(tt[18])) {
                                genp = new float[vc.getGenotype().get(Integer.parseInt(crop[m][3]))[sa].length];
                                SiteLineName = String.valueOf(ppos[sa]);
                                for (int aa = 0; aa < genp.length; aa++) {
                                    genp[aa] = vc.getGenotype().get(Integer.parseInt(crop[m][3]))[sa][aa];
                                }
                            }
                        }
                    }
                }
                for (h = 0; h < corsize; h++) {
                    if (crop[h][0].equals(tt[9])) {
                        int farstline = Integer.parseInt(crop[h][1]);
                        int lastline = Integer.parseInt(crop[h][2]);
                        Integer ppos[] = vc.getPos().get(Integer.parseInt(crop[h][3]));
                        byte[][] ggenotype = vc.getGenotype().get(Integer.parseInt(crop[h][3]));
                        Map<Integer, String[]> subpop = vp.getSubpop();
                        Map<Integer, String> subpopname = vp.getSubpopname();
                        String[] grops = vc.getGrop().get(Integer.parseInt(crop[h][3]));
                        int Method = Integer.parseInt(tt[13]);
                        int getpopsize = vp.getpopsize();
                        for (int a = 0; a < getpopsize; a++) {
                            String[][] res = new WB().pedLDsite(farstline, lastline, ppos, ggenotype, subpop.get(a), subpopFile, grops, Method, SiteLineName, Integer.parseInt(tt[10]), Integer.parseInt(tt[11]), genp);
                            res[0][0] = "chr:" + crop[h][0];
                            new block().writeblock(res, outFile + "-" + subpopname.get(a) + ".txt");
                            new WriteHeatMap().WriteHeatMap(res, outFile + "-" + subpopname.get(a) + ".png");
                            System.out.println(new Date() + "   " + "Calculation " + subpopname.get(a));
                        }
                    }
                }

            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(mains.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            } catch (OutOfMemoryError E) {
                return 0;
            }
            return 1;
        }
    }
}
