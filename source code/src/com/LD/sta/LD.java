/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.sta;

import org.te33.WB;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mr-LiZhuo
 * @see 首先分割用户的染色体，然后循环计算用户选定的染色体
 * @see 根据亚群体文件，开始循环亚群体的情况
 * @see 循环文件中所有染色体体的情况，如果该染色体是用户指定计算的，则开始执行计算
 * @see 如果发现多个文件中有相同的染色体，则将这些相同的染色体结果取平均值
 * @see 最后输出的是Map<String, double[][]> re n
 * 其中key存放的是染色体名称，用double[][i]来获取不同亚群体的计算结果。
 */
public class LD {

    Map<String, int[][]> rm = new HashMap();

    public LD() {
    }

    public Map<String, float[][]> LD(String chrom, String[][] crop, int corsize,
            int windowssize, Map<Integer, Integer[]> pos, Map<Integer, byte[][]> genotype,
            Map<Integer, String[]> grop, double erp, Map<Integer, String[]> subpop,
            int subpopsize, String OperationMethod, int Thrsize, String subpopFile, int Method) {
        String[] chr = chrom.split(",");
        int block = windowssize;
        Map<Integer, float[]> rest = new HashMap();
        Map<String, float[][]> re = new HashMap();
        float[][] res;
        int[][] rea;
        int[] resb = null;
        int cors = 0;
        for (String chr1 : chr) {      
            res = new float[block+1][subpopsize];
            rea = new int[block+1][subpopsize];
            for (int sa = 0; sa < subpopsize; sa++) { 
                for (int mc = 0; mc < corsize; mc++) {
                    if (chr1.equals(crop[mc][0])) {
                        Integer ppos[] = pos.get(Integer.parseInt(crop[mc][3]));
                        byte[][] ggenotype = genotype.get(Integer.parseInt(crop[mc][3]));
                        String[] grops = grop.get(Integer.parseInt(crop[mc][3]));
                        float[] resa;
                        WB vv = new WB();
                        if (Thrsize == 1) {
                            resa = vv.calCorall(windowssize, Integer.parseInt(crop[mc][1]), Integer.parseInt(crop[mc][2]), ppos, ggenotype, subpop.get(sa), subpopFile, grops, Method);
                            resb = vv.getResp();
                        } else {
                            resa = vv.calCorall(windowssize, Integer.parseInt(crop[mc][1]), Integer.parseInt(crop[mc][2]), ppos, ggenotype, subpop.get(sa), subpopFile, grops, Thrsize, Method);
                            resb = vv.getResp();
                        }
                        rest.put(cors, resa);
                        cors++;
                    }
                }
                float[] resa = getrest(rest, cors);
                for (int hs = 0; hs < resa.length; hs++) {
                    res[hs][sa] = resa[hs];
                    rea[hs][sa] = resb[hs];
                }
                System.out.println(new Date() + "   " + chr1 + " chrom calculation number " + (sa + 1) + " Subgroup");
                cors = 0;
            }
            re.put(chr1, res); 
            rm.put(chr1, rea);

        }
        return re;
    }

    public float[] getrest(Map<Integer, float[]> rest, int cors) {
        float[] res = new float[rest.get(0).length];
        for (int m = 0; m < rest.get(0).length; m++) {
            for (int i = 0; i < cors; i++) {
                if (i == 0) {
                    res[m] = rest.get(i)[m];
                } else {
                    res[m] += rest.get(i)[m];
                }
            }
            res[m] = res[m] / cors;
        }
        return res;
    }

    public Map<String, int[][]> getRm() {
        return rm;
    }

}
