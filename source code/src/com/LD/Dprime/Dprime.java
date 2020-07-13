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

        double[][] te = new double[2][i];
        int m = 0;
        for (int s = 0; s < ge.length; s++) {
            if (ge[s] != 3 && gm[s] != 3) {
                te[0][m] = ge[s];
                te[1][m] = gm[s];
                m++;
            }
        }
        float s = (float) cc(te);
        //  System.out.println( s);
        return s;

    }

    // geno是两个SNP的值：0，1或者2，没有NA。0是vcf里面的0/0，或者0|0； 1是0/1或者是0|1，1|0； 2是1/1或者是1|1.
    //第一行是SNP1，第二行是SNP2
    public double cc(double[][] geno) {

        System.out.print("实际：" +Arrays.toString(geno[0]) +"   "+ Arrays.toString(geno[1]));
        
       double p1 = sum(geno[0])/(geno[0].length*2);
        double q1 = sum(geno[1])/(geno[1].length*2);
        double p2 = 1 - p1;
        double q2 = 1- q1;
        
        double p11 = p1 * q1;
        double p12 = p1 * q2;
        double p21 = p2 * q1;
        double p22 = p2 * q2;
        
        double D = calD(geno);
        double Dmax = 0;
        if (D>0){
            Dmax = min(p12,p21);
        }else{
            Dmax = -min(p11,p22);
        }
        double Dprime = D/Dmax;
        return Dprime;
    }
      private double sum(double[] ge){
        double sum = 0;
        for (int i = 0; i< ge.length;++i){
            sum += ge[i];
        }
        return sum;
    }
    
    public double calD(double[][] ge){
        double d = 0;
        int a = 0; //(11)
        int b = 0; //(10)
        int c = 0; //(01)
        int e = 0; //(00)
        for (int i =0; i < ge[0].length;i++){
            if(ge[0][i]==0){
                if(ge[1][i] == 0){
                    e+=2;
                }else if (ge[1][i] == 1){
                    e++;
                    c++;
                }else{
                    c+=2;
                }
            }else if (ge[0][i]==1){
                if(ge[1][i] == 0){
                    e++;
                    b++;
                }else if (ge[1][i] == 1){
                    b++;
                    c++;
                }else{
                    c++;
                    a++;
                }
            }else{
                if(ge[1][i] == 0){
                    b+=2;
                }else if (ge[1][i] == 1){
                    b++;
                    a++;
                }else{
                    a+=2;
                }
            }
        }
        d = (a*e-b*c*1.0)/(a+b+c+e)/(a+b+c+e);
        return d;
    }
    private double min(double a,double b){
        if(a > b){
            return b;
        }else{
            return a;
        }
    }

}
