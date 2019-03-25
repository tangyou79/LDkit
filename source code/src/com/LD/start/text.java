/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.start;

import com.LD.Aapp.Format;
import org.te33.WH;
import org.te33.WE;
import java.util.Date;

/**
 *
 * @author Mr-LiZhuo 这是一个测试类
 */
public class text {

    public static void main(String args[]) throws Exception {

        String tt[] = new String[30];
        tt[0] = "C:\\\\Users\\\\Mr-LiZhuo\\\\Documents\\\\R\\\\chr\\\\test.vcf.gz";
        tt[10] = "1";
        tt[11] = "999999999";
        tt[9] = "11";
        tt[12] = "2";
       // tt[20] = "yes";
        new Format().Command(tt);
    /*    String tt[] = new String[30];
        tt[15] = "C:\\\\Users\\\\Mr-LiZhuo\\\\Documents\\\\R\\\\chr\\\\mydata";
        tt[10] = "1";
        tt[11] = "299170278";
        tt[9] = "1";
        tt[12] = "2";
       // tt[20] = "yes";
        new Format().Command(tt);*/
    }

}
