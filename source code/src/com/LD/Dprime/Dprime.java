package com.LD.Dprime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yaozhou
 */
public class Dprime {

    public Dprime() {

    }

    public float correlation(float[] ge, float[] gm) {
        int i = 0;
        for (int s = 0; s < ge.length; s++) {
            if (ge[s] != 3 && gm[s] != 3) {
                i++;
            }
        }

        float[][] te = new float[2][i];
        int m = 0;
        for (int s = 0; s < ge.length; s++) {
            if (ge[s] != 3 && gm[s] != 3) {
                te[0][m] = ge[s];
                te[1][m] = gm[s];
                m++;
            }
        }
        float s = cc(te);
        return s;

    }

    // geno是两个SNP的值：0，1或者2，没有NA。0是vcf里面的0/0，或者0|0； 1是0/1或者是0|1，1|0； 2是1/1或者是1|1.
    //第一行是SNP1，第二行是SNP2
    public float cc(float[][] geno) {
        float p1 = sum(geno[0]) / (geno[0].length * 2);
        float p2 = sum(geno[1]) / (geno[1].length * 2);
        float q1 = 1 - p1;
        float q2 = 1 - q1;
        float p11 = p1 * q1;
        float p12 = p1 * q2;
        float p21 = p2 * q1;
        float p22 = p2 * q2;
        float D = p11 * p22 - p12 * p21;
        float Dmax = 0;
        if (D > 0) {
            Dmax = min(p12, p21);
        } else {
            Dmax = min(p11, p22);
        }
        float Dprime = D / Dmax;
        return Dprime;
    }

    private float sum(float[] ge) {
        float sum = 0;
        for (int i = 0; i < ge.length; ++i) {
            sum += ge[i];
        }
        return sum;
    }

    private float min(float a, float b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

}
