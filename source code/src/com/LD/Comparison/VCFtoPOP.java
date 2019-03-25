/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Comparison;

import org.te33.WI;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr-LiZhuo
 * @see 该类的作用是：
 * @see 判断用户输入的亚群体文件和VCF文件的样本信息是否一致。如果不一致，则返回false，如果一致，则返回true
 * @see 获取亚群体文件的样本信息，放到Map<String, String[]> subpop; 其中key代表了亚群体的个数；
 */
public class VCFtoPOP {

    Map<Integer, String[]> subpop = new HashMap();
    Map<Integer, String> subpopname = new HashMap();
    int line = 0;

    public boolean ispop(String subpopfile) {
        if (subpopfile.equals("nopop")) {
            subpopname.put(line, "Subgroup1");
            line++;
            return true;
        }
        String temp = "";
        BufferedReader bs = WI.getTextReader(subpopfile);
        try {
            while ((temp = bs.readLine()) != null) {
                String[] sq = temp.split(":");
                String[] ss = sq[1].split(",");
                String[] se = new String[ss.length - 1];
                for (int s = 0; s < se.length; s++) {
                    se[s] = ss[s + 1];
                }
                subpopname.put(line, sq[0]);
                subpop.put(line, se);
                line++;
            }
        } catch (IOException ex) {
            Logger.getLogger(VCFtoPOP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public Map<Integer, String[]> getSubpop() {
        return subpop;
    }

    public int getpopsize() {
        return line;
    }

    public Map<Integer, String> getSubpopname() {
        return subpopname;
    }

}
