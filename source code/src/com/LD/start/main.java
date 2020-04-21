/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.start;

import com.LD.Aapp.Format;
import java.io.File;
import java.util.Arrays;
import com.LD.Bapp.Plformat;

/**
 *
 * @author Mr-LiZhuo
 */
public class main {

    public static void main(String args[]) throws Exception {

         int type = 1; 

        String tt[] = new String[30];
        String pt[] = new String[7];

        String temp[] = new String[32];
        temp[0] = "--infg";
        temp[1] = "--infgs";
        temp[2] = "--infv";
        temp[3] = "--infvs";
        temp[4] = "--out";
        temp[5] = "--ws";
        temp[6] = "--subpop";
        temp[7] = "--chr";
        temp[8] = "--missing";
        temp[9] = "--pl";
        temp[10] = "--threads";
        temp[11] = "--chra";
        temp[12] = "--chrb";
        temp[13] = "--siteline";
        temp[14] = "--start";
        temp[15] = "--end";
        temp[16] = "--ld";
        temp[17] = "--type";
        temp[18] = "--maf";
        temp[19] = "--inped";
        temp[20] = "--h";
        temp[21] = "--plot";
        temp[22] = "--inp";
        temp[23] = "--merge";
        temp[24] = "--mergechr";
        temp[25] = "--bin";
        temp[26] = "--outp";
        temp[27] = "--resultname";
        temp[28] = "--Intermediate";
        temp[29] = "--block";
        temp[30] = "--site";
        temp[31] = "--infile";
          int len = args.length;

        for (int i = 0; i < len; i++) {

            if (null != args[i]) {
                if (args[i].startsWith("--")) {
                    if (!Arrays.asList(temp).contains(args[i])) {
                        System.out.println("invalid parameter: " + args[i]);
                        return;
                    }
                }

                switch (args[i]) {
                    case "--infile":
                        String pp = args[i + 1];
                        File filez = new File(pp.split(",")[0]);
                        if (filez.isFile()) {
                            String tf = filez.getName().substring(filez.getName().lastIndexOf(".") + 1);
                            if (tf.startsWith("gz")) {
                                tt[0] = args[i + 1];
                            } else if (tf.startsWith("vcf")) {
                                tt[17] = args[i + 1];
                            }
                        } else {
                            File[] array = filez.listFiles();
                            int a = 0;
                            for (; a < array.length; a++) {
                                if (array[a].isFile()) {
                                    String tm = array[a].getName().substring(array[a].getName().lastIndexOf(".") + 1);
                                    if (tm.startsWith("gz") || tm.startsWith("vcf")) {
                                        break;
                                    }
                                }
                            }
                            if (array.length == 0) {
                                tt[0] = null;
                            } else {
                                String tm = array[a].getName().substring(array[a].getName().lastIndexOf(".") + 1);

                                if (tm.startsWith("gz")) {
                                    tt[0] = "";
                                    for (int is = 0; is < array.length; is++) {
                                        String te = array[is].getName().substring(array[is].getName().lastIndexOf(".") + 1);
                                        if (te.startsWith("gz")) {
                                            tt[0] = tt[0] + args[i + 1] + "/" + array[is].getName() + ",";
                                        }
                                    }
                                    tt[0] = tt[0].substring(0, tt[0].length() - 1);
                                } else if (tm.startsWith("vcf")) {
                                    tt[17] = "";
                                    for (int is = 0; is < array.length; is++) {
                                        String te = array[is].getName().substring(array[is].getName().lastIndexOf(".") + 1);
                                        if (te.startsWith("vcf")) {
                                            tt[17] = tt[17] + args[i + 1] + "/" + array[is].getName() + ",";
                                        }
                                    }
                                    tt[17] = tt[17].substring(0, tt[17].length() - 1);
                                }
                            }
                        }

                        i++;
                        break;
                    case "--infg":
                        tt[0] = args[i + 1];
                        i++;
                        break;
                    case "--infgs":
                        tt[0] = "";
                        File file = new File(args[i + 1]);
                        File[] array = file.listFiles();
                        for (int is = 0; is < array.length; is++) {
                            String te = array[is].getName().substring(array[is].getName().lastIndexOf(".") + 1);
                            if (te.startsWith("gz")) {
                                tt[0] = tt[0] + args[i + 1] + "/" + array[is].getName() + ",";
                            }
                        }
                        tt[0] = tt[0].substring(0, tt[0].length() - 1);
                       
                        i++;
                        break;

                    case "--resultname":
                        tt[3] = args[i + 1];
                        i++;
                        break;
                    case "--infv":
                        tt[17] = args[i + 1];
                        i++;
                        break;
                    case "--infvs":
                        tt[17] = "";
                        File files = new File(args[i + 1]);
                        File[] arrays = files.listFiles();
                        for (int is = 0; is < arrays.length; is++) {
                            String te = arrays[is].getName().substring(arrays[is].getName().lastIndexOf(".") + 1);
                            if (te.startsWith("vcf")) {
                                tt[17] = tt[17] + args[i + 1] + "/" + arrays[is].getName() + ",";
                            }
                        }
                        tt[17] = tt[17].substring(0, tt[17].length() - 1);
                     
                        i++;
                        break;
                    case "--out":
                        File ff = new File(args[i + 1]);
                        String name = ff.getName();
                   
                        if (name.contains(".")) {
                          
                            tt[3] = name.split("\\.")[0];
                            if (ff.getPath().split(name).length != 0) {
                                tt[1] = ff.getPath().split(name)[0];
                            }
                        } else {
                            tt[1] = ff.getPath();
                        }
                        i++;
                        break;

                    case "--ws":
                        tt[2] = args[i + 1];
                        i++;
                        break;
                    case "--subpop":
                        tt[4] = args[i + 1];
                        i++;
                        break;
                    case "--chr":
                        tt[5] = args[i + 1];
                        i++;
                        break;
                    case "--missing":
                        tt[6] = args[i + 1];
                        i++;
                        break;
                    case "--threads":
                        tt[8] = args[i + 1];
                        i++;
                        break;
                    case "--chra":
                        tt[9] = args[i + 1];
                        i++;
                        break;
                    case "--chrb":
                        tt[19] = args[i + 1];
                        i++;
                        break;
                    case "--siteline":
                        tt[18] = args[i + 1];
                        i++;
                        break;
                    case "--start":
                        tt[10] = args[i + 1];
                        i++;
                        break;
                    case "--end":
                        tt[11] = args[i + 1];
                        i++;
                        break;
                    case "--ld":
                        tt[12] = "1";
                        break;
                    case "--type":
                        tt[13] = args[i + 1];
                        i++;
                        break;
                    case "--maf":
                        tt[14] = args[i + 1];
                        i++;
                        break;
                    case "--inped":
                        tt[15] = args[i + 1];
                        i++;
                        break;
                    case "--Intermediate":
                        tt[20] = args[i + 1];
                        i++;
                        break;
                    case "--block":

                        try {
                            String temps = args[i + 1];
                            String t1 = temps.split("chr")[1];
                            String t3 = t1.split(":")[1];
                            String start = t3.split("-")[0];
                            String end = t3.split("-")[1];
                            String chr = t1.split(":")[0];

                            tt[9] = chr;
                            tt[10] = start;
                            tt[11] = end;
                            tt[12] = "2";
                        } catch (Exception e) {
                            System.out.println("--block format input error");
                            System.out.println("chr:start-end. Region for LD block or LD site. For example: chr1:1000-20000 ");
                            return;
                        }

                        i++;
                        break;

                    case "--site":
                        try {
                            String tempb = args[i + 1];
                            String p1 = tempb.split("chr")[1];
                            String p3 = p1.split(":")[1];
                            String star = p3.split("-")[0];
                            String en = p3.split("-")[1];
                            String chra = p1.split(":")[0];
                            tt[9] = chra;
                            tt[10] = star;
                            tt[11] = en;

                            String tempq = args[i + 2];
                            String m1 = tempq.split("chr")[1];
                            String po = m1.split(":")[1];
                            String chrb = m1.split(":")[0];

                            tt[19] = chrb;
                            tt[18] = po;
                            tt[12] = "3";
                        } catch (Exception e) {
                            System.out.println("--site format input error");
                            System.out.println("chr:start-end chr:site. Given site for LD site. For example: chr1:1000-2000 chr1:24556 ");
                            return;
                        }
                        i += 2;
                        break;

                    case "--h":
                        System.out.println("");
                        System.out.println("--input: input file or folder");
                        System.out.println("");
                        System.out.println("--output: output file");
                        System.out.println("");
                        System.out.println("--ws: max distance between two variants (kb) for LD decay. Default is 100 Kb");
                        System.out.println("");
                        System.out.println("--subpop: input of subgroup files");
                        System.out.println("");
                        System.out.println("--chr: chromosome name if you just want to calculate one or some of them. Multiple chromosomes should be separated by comma. Default is all");
                        System.out.println("");
                        System.out.println("--maf: minor allele frequency filter. Default is 0.005");
                        System.out.println("");
                        System.out.println("--threads: number of threads, default is 1");
                        System.out.println("");
                        System.out.println("--type: measurements of LD. 1 for r-sqaure, 2 for D prime. Default is 1");
                        System.out.println("");
                        System.out.println("--Intermediate save the LD file for LD block or not. Default is no");
                        System.out.println("");
                        System.out.println("--block: chr:start-end. Region for LD block or LD site. For example: chr1:1000-20000");
                        System.out.println("");
                        System.out.println("--site: chr:start-end chr:site. Given site for LD site. For example: chr1:1000-2000 chr1:24556");
                        System.out.println("");
                        System.out.println("--inp: input file for plot");
                        System.out.println("");
                        System.out.println("--merge: plot all subgroups in one figure or not. Default is yes");
                        System.out.println("");
                        System.out.println("--mergechr: plot all chromosomes or not. Default is yes");
                        System.out.println("");
                        System.out.println("--bin: the size of bin for calculating mean r2 or D’");
                        System.out.println("");

                        return;
                    case "--plot":
                        type = 2;
                     
                        break;
                    case "--inp":
                        pt[0] = args[i + 1];
                        i++;
                        break;
                    case "--merge":
                        pt[5] = args[i + 1];
                        i++;
                        break;
                    case "--mergechr":
                        pt[1] = args[i + 1];
                        i++;
                        break;
                    case "--bin":
                        pt[2] = args[i + 1];
                        i++;
                        break;
                    case "--outp":
                        pt[3] = args[i + 1];
                        i++;
                        break;
                }
            }
        }

        if (type == 1) {
            new Format().Command(tt);
        } else {
            new Plformat().Command(pt);
        }
    }

}
