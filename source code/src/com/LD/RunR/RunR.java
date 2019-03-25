/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.RunR;

import java.io.IOException;

/**
 *
 * @author Mr-LiZhuo
 * @see 执行R语言，输出图片
 */
public class RunR {

    public int RunR(String fileName) {
        Runtime run = Runtime.getRuntime();
        try {
            String mm = fileName.replaceAll("\\\\", "/");

            String os = System.getProperty("os.name");
            if (os.toLowerCase().startsWith("win")) {
                String cmds = "CMD /k start Rscript.exe " + mm;
                run.exec(cmds);
                System.out.println(cmds);
            } else if (os.toLowerCase().startsWith("lin")) {
                String cmds = "di " + mm;
                run.exec(cmds);
            }
        } catch (IOException e) {
        }
        return 1;
    }
}
