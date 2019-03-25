/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Aapp;

import org.te33.WH;
import org.te33.WE;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Mr-LiZhuo
 */
public class Format {

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    public void Command(String[] tt) throws Exception {

        if (tt[3] == null) {
            tt[3] = "result";
        }

        if (tt[0] == null) {
            if (tt[15] == null) {
                if (tt[17] == null) {
                    System.out.println("Please select the input file, you can select multiple, separated by commas");
                    return;
                }
            }
        }
        String[] tc;
        if (tt[0] != null) {
            tc = tt[0].split(",");
        } else if (tt[17] != null) {
            tc = tt[17].split(",");
        } else {
            tc = tt[15].split(",");
        }
        File tempFile = new File(tc[0]);
        if (tempFile.getParent() == null) {
            if (tt[1] == null) {
                tt[1] = "result" + df.format(new Date());
            } else {
                tt[1] = tt[1] + "/";
            }
        } else {
            if (tt[1] == null) {
                tt[1] = tempFile.getParent() + "/result" + df.format(new Date());
            } else {
                tt[1] = tt[1] + "/";
            }
        }
        new File(tt[1]).mkdirs();
        if (tt[20] == null) {
            tt[20] = "no";
        }
        if (tt[2] == null) {
            tt[2] = "100";
        }
        if (tt[4] == null) {
            tt[4] = "nopop";
        }
        if (tt[6] == null) {
            tt[6] = "0.2";
        }
        if (tt[7] == null) {
            tt[7] = "yes";
        }
        if (tt[8] == null) {
            tt[8] = "1";
        }
        if (tt[12] == null) {
            tt[12] = "1";
        }
        if (tt[13] == null) {
            tt[13] = "1";
        }
        if (tt[14] == null) {
            tt[14] = "0.005";
        }
        if (tt[9] == null) {
            if (!tt[12].equals("1")) {
                System.out.println("Please select the line number of the specified operation");
                return;
            }
        }
        if (tt[10] == null) {
            if (!tt[12].equals("1")) {
                System.out.println("Please select the front range of the specified operation line number");
                return;
            }
        }
        if (tt[11] == null) {
            if (!tt[12].equals("1")) {
                System.out.println("Please select the post-range of the operation line number");
                return;
            }
        }
        long starttime = System.currentTimeMillis();
        System.out.println(new Date() + "   " + "Starting time");
        int status = 0;
        if (tt[0] != null || tt[17] != null) {
            WE vc = new WE();
            switch (tt[12]) {
                case "1":
                    if (tt[0] != null) {
                        status = vc.ispop(tc, tt[6], tt[14], 2);
                    } else {
                        status = vc.ispop(tc, tt[6], tt[14], 1);
                    }
                    break;
                case "2":
                    if (tt[0] != null) {
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 2);
                    } else {
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 1);
                    }
                    break;
                case "3":
                    if (tt[0] != null) {
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 2, tt[19], tt[18]);
                    } else {
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 1, tt[19], tt[18]);
                    }
                    break;
                default:
                    break;
            }
            if (status != 1) {

                return;
            }

            if (tt[5] == null) {
                tt[5] = "";
                String[][] ss = vc.getCorp();
                for (String[] s : ss) {
                    if (s[0] != null) {
                        tt[5] = tt[5] + s[0] + ",";
                    }
                }
                String[] temp = tt[5].split(",");
                tt[5] = "";
                List<String> strList = Arrays.asList(temp);
                Set<String> strSet = new HashSet<>(strList);
                Iterator<String> ite = strSet.iterator();
                for (int i = 0; ite.hasNext(); i++) {
                    tt[5] = tt[5] + ite.next() + ",";
                }
                tt[5] = tt[5].substring(0, tt[5].length() - 1);
            }
            long readtable = System.currentTimeMillis();
            System.out.println(new Date() + "   " + "End of file reading");
            System.out.println(new Date() + "   " + "Opened " + tt[8] + " thread");
            switch (tt[12]) {
                case "1":
                    new mains().main(tt, vc);
                    break;
                case "2":
                    new mains().mainLDblock(tt, vc);
                    break;
                case "3":
                    new mains().mainLDsite(tt, vc);
                    break;
                default:
                    break;
            }
            long endtime = System.currentTimeMillis();
            System.out.println(new Date() + "   " + "End time");
            System.out.println((double) (endtime - starttime) / (1000 * 60) + " minutes of calculation");
        } else {
            WH vc = new WH();
            String temps = tt[15];
            tt[15] = temps + ".ped";
            tt[16] = temps + ".map";
            vc.viewFileLayout(tt[15], tt[16]);
            status = 1;
            if (status == 0) {
                return;
            }
            if (tt[5] == null) {
                tt[5] = "";
                String[][] ss = vc.getCorp();
                for (String[] s : ss) {
                    if (s[0] != null) {
                        tt[5] = tt[5] + s[0] + ",";
                    }
                }
                String[] temp = tt[5].split(",");
                tt[5] = "";
                List<String> strList = Arrays.asList(temp);
                Set<String> strSet = new HashSet<>(strList);
                Iterator<String> ite = strSet.iterator();
                for (int i = 0; ite.hasNext(); i++) {
                    tt[5] = tt[5] + ite.next() + ",";
                }
                tt[5] = tt[5].substring(0, tt[5].length() - 1);
            }
            long readtable = System.currentTimeMillis();
            System.out.println(new Date() + "   " + "End of file reading");
            System.out.println(new Date() + "   " + "Opened " + tt[8] + "thread");
            switch (tt[12]) {
                case "1":
                    new mains().main(tt, vc);
                    break;
                case "2":
                    new mains().pedLdblock(tt, vc);
                    break;
                case "3":
                    new mains().pedLDsite(tt, vc);
                    break;
                default:
                    break;
            }

            long endtime = System.currentTimeMillis();
            System.out.println(new Date() + "   " + "End time");
            System.out.println((double) (endtime - starttime) / (1000 * 60) + " minutes of calculation");
        }

    }
    int FirstSNP;

    public int Windows(String[] tt) throws Exception {
        if (tt[3].equals("")) {
            tt[3] = "result";
        }
        if (tt[8].equals("0")) {
            tt[8] = "1";
        }
        if (tt[0].equals("")) {
            return 0;
        }
        String[] tc = tt[0].split(",");
        if (tt[1].equals("")) {
            File tempFile = new File(tc[0]);
            if (tempFile.getParent() == null) {
                tt[1] = "result" + df.format(new Date());
            } else {
                tt[1] = tempFile.getParent() + "/result" + df.format(new Date());
            }
            new File(tt[1]).mkdirs();
        }
        if (tt[2].equals("")) {
            tt[2] = "100";
        }
        if (tt[4].equals("")) {
            tt[4] = "nopop";
        }
        if (tt[6].equals("")) {
            tt[6] = "0.2";
        }
        if (tt[7].equals("")) {
            tt[7] = "yes";
        }
        if (tt[8].equals("")) {
            tt[8] = "1";
        }
        if (tt[12].equals("")) {
            tt[12] = "1";
        }
        if (tt[13].equals("")) {
            tt[13] = "1";
        }
        if (tt[14].equals("")) {
            tt[14] = "0.005";
        }
        if (tt[9].equals("") || tt[9].equals("none")) {
            if (!tt[12].equals("1")) {
                return 0;
            }
        }
        if (tt[10].equals("") || tt[10].equals("none")) {
            if (!tt[12].equals("1")) {
                return 0;
            }
        }
        if (tt[11].equals("") || tt[11].equals("none")) {
            if (!tt[12].equals("1")) {
                return 0;
            }
        }
        File file = new File(tc[0]);
        File tem = new File(file.getAbsolutePath());
        String te = tem.getName().substring(tem.getName().lastIndexOf(".") + 1);
        if (te.startsWith("gz") || te.startsWith("vcf")) {
            long starttime = System.currentTimeMillis();

            int status = 0;

            WE vc = new WE();

            if (te.startsWith("gz")) {
                switch (tt[12]) {
                    case "1":
                        status = vc.ispop(tc, tt[6], tt[14], 2);
                        break;
                    case "2":
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 2);
                        break;
                    case "3":
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 2, tt[19], tt[18]);
                        break;
                    default:
                        break;
                }
            } else {
                switch (tt[12]) {
                    case "1":
                        status = vc.ispop(tc, tt[6], tt[14], 1);
                        break;
                    case "2":
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 1);
                        break;
                    case "3":
                        status = vc.ispop(tc, tt[6], tt[9], tt[10], tt[11], 1, tt[19], tt[18]);
                        break;
                    default:
                        break;
                }
            }
            switch (status) {
                case 0:
                    FirstSNP = vc.getFirstSNP();
                    return 2;
                case 3:
                    return 3;
                case 2:
                    return 0;
                case 4:
                    return 4;
                case 5:
                    return 5;
                default:
                    break;
            }
            if (tt[5].equals("") || tt[5].equals("all")) {
                tt[5] = "";
                String[][] ss = vc.getCorp();
                for (String[] s : ss) {
                    if (s[0] != null) {
                        tt[5] = tt[5] + s[0] + ",";
                    }
                }
                String[] temp = tt[5].split(",");
                tt[5] = "";
                List<String> strList = Arrays.asList(temp);
                Set<String> strSet = new HashSet<>(strList);
                Iterator<String> ite = strSet.iterator();
                for (int i = 0; ite.hasNext(); i++) {
                    tt[5] = tt[5] + ite.next() + ",";
                }
                tt[5] = tt[5].substring(0, tt[5].length() - 1);
            }
            long readtable = System.currentTimeMillis();
            switch (tt[12]) {
                case "1":
                    new mains().main(tt, vc);
                    break;
                case "2":
                    new mains().mainLDblock(tt, vc);
                    break;
                case "3":
                    new mains().mainLDsite(tt, vc);
                    break;
                default:
                    break;
            }
            long endtime = System.currentTimeMillis();
            return 1;
        } else {
            long starttime = System.currentTimeMillis();
            WH vc = new WH();
            if (te.startsWith("map")) {
                vc.viewFileLayout(tc[1], tc[0]);
            } else {
                vc.viewFileLayout(tc[0], tc[1]);
            }
            if (tt[5].equals("") || tt[5].equals("all")) {
                tt[5] = "";
                String[][] ss = vc.getCorp();
                for (String[] s : ss) {
                    if (s[0] != null) {
                        tt[5] = tt[5] + s[0] + ",";
                    }
                }
                String[] temp = tt[5].split(",");
                tt[5] = "";
                List<String> strList = Arrays.asList(temp);
                Set<String> strSet = new HashSet<>(strList);
                Iterator<String> ite = strSet.iterator();
                for (int i = 0; ite.hasNext(); i++) {
                    tt[5] = tt[5] + ite.next() + ",";
                }
                tt[5] = tt[5].substring(0, tt[5].length() - 1);
            }
            long readtable = System.currentTimeMillis();
            switch (tt[12]) {
                case "1":
                    new mains().main(tt, vc);
                    break;
                case "2":
                    new mains().pedLdblock(tt, vc);
                    break;
                case "3":
                    new mains().pedLDsite(tt, vc);
                    break;
                default:
                    break;
            }
            long endtime = System.currentTimeMillis();
            return 1;
        }

    }

    public int getFirstSNP() {
        return FirstSNP;
    }

}
