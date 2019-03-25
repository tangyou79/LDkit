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

        String temp[] = new String[29];
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
                    case "--infg"://输入gz文件
                        tt[0] = args[i + 1];
                        i++;
                        break;
                    case "--infgs"://输入gz文件夹
                        tt[0] = "";
                        File file = new File(args[i + 1]);
                        File[] array = file.listFiles();
                        for (File array1 : array) {
                            String te = array1.getName().substring(array1.getName().lastIndexOf(".") + 1);
                            if (te.startsWith("gz")) {
                                tt[0] = tt[0] + args[i + 1] + "/" + array1.getName() + ",";
                            }
                        }
                        tt[0] = tt[0].substring(0, tt[0].length() - 1);
                        i++;
                        break;
                    case "--resultname"://自定义文件名
                        tt[3] = args[i + 1];
                        i++;
                        break;
                    case "--infv"://读取文件vcf文件
                        tt[17] = args[i + 1];
                        i++;
                        break;
                    case "--infvs"://输入vcf文件夹
                        tt[17] = "";
                        File files = new File(args[i + 1]);
                        File[] arrays = files.listFiles();
                        for (File array1 : arrays) {
                            String te = array1.getName().substring(array1.getName().lastIndexOf(".") + 1);
                            if (te.startsWith("vcf")) {
                                tt[17] = tt[17] + args[i + 1] + "/" + array1.getName() + ",";
                            }
                        }
                        tt[17] = tt[17].substring(0, tt[17].length() - 1);
                        i++;
                        break;
                    case "--out"://输出文件夹
                        tt[1] = args[i + 1];
                        i++;
                        break;
                    case "--ws"://计算精度
                        tt[2] = args[i + 1];
                        i++;
                        break;
                    case "--subpop"://亚群体文件
                        tt[4] = args[i + 1];
                        i++;
                        break;
                    case "--chr"://要计算的染色体
                        tt[5] = args[i + 1];
                        i++;
                        break;
                    case "--missing"://计算误差
                        tt[6] = args[i + 1];
                        i++;
                        break;
                    case "--threads"://运算线程数
                        tt[8] = args[i + 1];
                        i++;
                        break;
                    case "--chra"://运算指定染色体
                        tt[9] = args[i + 1];
                        i++;
                        break;
                    case "--chrb"://运算指定染色体
                        tt[19] = args[i + 1];
                        i++;
                        break;
                    case "--siteline"://运算指定行号
                        tt[18] = args[i + 1];
                        i++;
                        break;
                    case "--start"://指定运算行号的前范围
                        tt[10] = args[i + 1];
                        i++;
                        break;
                    case "--end"://指定运算行号的后范围
                        tt[11] = args[i + 1];
                        i++;
                        break;
                    case "--ld"://计算方法
                        tt[12] = args[i + 1];
                        i++;
                        break;
                    case "--type"://计算方式
                        tt[13] = args[i + 1];
                        i++;
                        break;
                    case "--maf"://读取文件的比率
                        tt[14] = args[i + 1];
                        i++;
                        break;
                    case "--inped"://ped文件
                        tt[15] = args[i + 1];
                        i++;
                        break;
                    case "--Intermediate"://LDblock的中间文件
                        tt[20] = args[i + 1];
                        i++;
                        break;
                    case "--h"://读取文件的比率
                        System.out.println("这是帮助文件   等待后期写入内容");
                        return;
                    case "--plot"://进入作图程序
                        type = 2;
                        //  i++;
                        break;
                    case "--inp"://作图的输入文件
                        pt[0] = args[i + 1];
                        i++;
                        break;
                    case "--merge"://是否合并多种亚群体
                        pt[5] = args[i + 1];
                        i++;
                        break;
                    case "--mergechr"://是否合并多染色体
                        pt[1] = args[i + 1];
                        i++;
                        break;
                    case "--bin"://画图的区间大小
                        pt[2] = args[i + 1];
                        i++;
                        break;
                    case "--outp"://文件输出的名字
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
