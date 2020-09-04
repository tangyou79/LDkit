/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.LDblock;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author Mr-LiZhuo
 */
public class WriteHeatMap {


    int[] pos;

    public void CopyJs(String a) {

        String destFilePath = a;

        String srcFilePath = "Front/echarts.min.js";

        File destFile = new File(destFilePath);
        try {
            BufferedInputStream fis = new BufferedInputStream((InputStream) this.getClass().getClassLoader().getResourceAsStream(srcFilePath));
            FileOutputStream fos = new FileOutputStream(destFile);
            byte[] buf = new byte[1024];
            int c = 0;
            while ((c = fis.read(buf)) != -1) {
                fos.write(buf, 0, c);
            }
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteHeatMap(String inpath, String path, String chrname) throws IOException {//LDblock的热图

        //首先处理文件中的NAN情况
        CopyJs(path + "/echarts.min.js");

        String outpath = path + "result.html";

        FileWriter writer = new FileWriter(outpath);

        String title1 = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "	<meta charset=\"UTF-8\">\n"
                + "	<title>chart</title>\n"
                + "	<script src=\"echarts.min.js\"></script>\n"
                + "</head>\n"
                + "<body>\n"
                + "	<div id=\"main\" style=\"\n"
                + "	height: 1000px;\n"
                + "	width: 1000px;\n"
                + "\n"
                + "	/* -webkit-transform: rotate(-45deg); Safari and Chrome */\n"
                + "	/*-moz-transform: rotate(-45deg);    Firefox */\n"
                + "	/* -ms-transform: rotate(-45deg);   IE 9 */\n"
                + "	/* -o-transform: rotate(-45deg);    Opera */\n"
                + "	transform: rotate(45deg) translate(0%,-30%) ;\n"
                + "\n"
                + "	\"></div>\n"
                + "\n"
                + "        <div id=\"mains\" style=\"\n"
                + "        height: 1000px;\n"
                + "        width: 1000px;\n"
                + "\n"
                + "        transform: rotate(90deg) translate(-80%,-26%) scaleY(1.4) ;\n"
                + "\n"
                + "\n"
                + "        \"></div>\n"
                + "\n"
                + "\n"
                + "\n"
                + "        <script type=\"text/javascript\">\n"
                + "        // 基于准备好的dom，初始化echarts实例\n"
                + "        var myChart = echarts.init(document.getElementById('main'));\n"
                + "\n"
                + "        var myCharts = echarts.init(document.getElementById('mains'));\n"
                + "\n"
                + "        var  options = {\n"
                + "              \n"
                + "\n"
                + "                grid: {\n"
                + "                        width:'90%',\n"
                + "                        height:'90%'\n"
                + "                        \n"
                + "                },";
        writer.write(title1);

        String xdat = " xAxis: {\n"
                + "                        type: 'category',\n"
                + "                        show : false, \n"
                + "                        \n"
                + "                        data: [";

        String ydata = " yAxis: {\n"
                + "                        type: 'category',\n"
                + "\n"
                + "                        \n"
                + "                        data: [";

        String pathnan = delNan(inpath);
        double[][] data = re(pathnan);

        for (int a = 0; a < data.length; a++) {

            xdat = xdat + "'" + pos[a] + "',";
            ydata = ydata + "'" + pos[a] + "',";

        }

        xdat = xdat + "]\n"
                + "                },";

        ydata = ydata + "]\n"
                + "                }\n"
                + "\n"
                + "\n"
                + "        }";
        writer.write(xdat);
        writer.write(ydata);

        String title2 = " ;var  option = {\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "        	grid: {\n"
                + "        		width:'90%',\n"
                + "        		height:'90%'\n"
                + "        		\n"
                + "        	},\n"
                + "        	visualMap: {\n"
                + "        		min: 0,\n"
                + "        		max: 1,\n"
                + "        		show:false,\n"
                + "        		calculable: true,\n"
                + "        		orient: 'horizontal',\n"
                + "        		left: 'left',\n"
                + "        		bottom: '15%'\n"
                + "        	},";
        writer.write(title2);

        String xdats = "xAxis: {\n"
                + "        		type: 'category',\n"
                + "                    show : false, \n"
                + "\n"
                + "                    data: [";

        String ydats = " yAxis: {\n"
                + "                  type: 'category',\n"
                + "                  show : false, \n"
                + "                  \n"
                + "                        data: [";
        for (int m = 0; m < data.length; m++) {

            xdats = xdats + "'" + pos[m] + "',";
            ydats = ydats + "'" + pos[m] + "',";

        }
        xdats = xdats + "]\n"
                + "            },";
        ydats = ydats + "]   \n"
                + "                },";
        writer.write(xdats);
        writer.write(ydats);

        String dat = "   series: [\n"
                + "                {\n"
                + "                  name: 'chr:22 Subgroup1',\n"
                + "                  type: 'heatmap',\n"
                + "\n"
                + "\n"
                + "                  data: [";

        dat = data(dat, pathnan);

        dat = dat + "]\n"
                + "          }\n"
                + "\n"
                + "          ]\n"
                + "  };\n"
                + "\n"
                + "\n"
                + "        // 使用刚指定的配置项和数据显示图表。\n"
                + "        myChart.setOption(option);\n"
                + "        myCharts.setOption(options);\n"
                + "</script>\n"
                + "</body>\n"
                + "</html>";
        writer.write(dat);
        writer.close();

    }

    public double[][] re(String path) throws IOException {

        List<List<Float>> data = new ArrayList();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path)));

        List<String> poslist = new ArrayList();
        int line = 0;
        String tempString = null;
        while ((tempString = reader.readLine()) != null) {

            line++;

            List<Float> tempt = new ArrayList();
            if (line != 1) {

                String[] temp = tempString.split("\t");
                poslist.add(temp[0]);
                for (int s = 1; s < temp.length; s++) {
                    tempt.add(Float.valueOf(temp[s]));
                }
                data.add(tempt);
            }
        }

        double[][] da = re(data);

        reader.close();

        pos = new int[poslist.size()];
        for (int as = 0; as < poslist.size(); as++) {
            pos[as] = Integer.parseInt(poslist.get(as));
        }

        return da;
    }

    public String data(String dat, String path) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path)));

        int line = 0;
        String tempString = null;
        while ((tempString = reader.readLine()) != null) {

            if (line > 0) {

                String[] temp = tempString.split("\t");
                for (int s = 1; s < temp.length; s++) {
                    dat = dat + "[" + (line - 1) + "," + s + "," + temp[s] + "],";
                }

            }
            line++;
        }

        reader.close();
        return dat;
    }

    public double[][] re(List<List<Float>> data) {
        double[][] da = new double[data.size()][data.size()];

        /*  for (int i = 0; i < data.size(); i++) {
            for (int h = 0; h < data.get(i).size(); h++) {
                da[i][h] = data.get(i).get(h);
                
            }
            
        }*/
        return da;
    }

    /**
     * @param 处理文件中的NAN情况
     */
    public String delNan(String path) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream(path))));
        List<String[]> noNaN = new ArrayList();

        String tempString = null;
        int line = 0;
        int size = 0;
        while ((tempString = reader.readLine()) != null) {
            line = line + 1;
            if (line > 1) {
                String[] temp = tempString.split("\t");
                int nanlength = 0;
                for (int a = 1; a < temp.length; a++) {
                    if (temp[a].equals("NaN")) {
                        nanlength = nanlength + 1;
                    }
                }
                if (nanlength != temp.length - 1) {
                    size = size + 1;
                    noNaN.add(temp);
                }
            }
        }

        //将noNaN的行列交换
        String[][] tempNaN = new String[line][noNaN.size()];

        for (int b = 0; b < noNaN.size(); b++) {
            for (int c = 0; c < noNaN.get(b).length; c++) {
                tempNaN[c][b] = noNaN.get(b)[c];
            }
        }

        /*    for (int out = 0; out < tempNaN.length;out++) {

            System.out.println(Arrays.toString(tempNaN[out]));

        }*/
        List<String[]> noNaN2 = new ArrayList();
        //  System.out.println(line+"   "+size);
        if ((line - 1) != size) {//如果没有行被删除，那么列也不被删除
            for (int b = 0; b < tempNaN.length; b++) {
                int nanlength = 0;
                for (int c = 0; c < tempNaN[0].length; c++) {
                    if (tempNaN[b][c] == null) {
                        tempNaN[b][c] = "nn";
                    }

                    if (tempNaN[b][c].equals("NaN")) {
                        nanlength = nanlength + 1;
                        break;
                    }
                }
                if (nanlength == 0) {
                    noNaN2.add(tempNaN[b]);
                }
            }
        } else {
            for (int b = 0; b < tempNaN.length; b++) {

                for (int c = 0; c < tempNaN[0].length; c++) {
                    if (tempNaN[b][c] == null) {
                        tempNaN[b][c] = "nn";
                    }

                }

                noNaN2.add(tempNaN[b]);

            }

        }
        //将noNaN的行列交换
        String[][] tempNaNt = new String[line][noNaN2.size()];

        for (int b = 0; b < noNaN2.size(); b++) {
            for (int c = 0; c < noNaN2.get(b).length; c++) {
                tempNaNt[c][b] = noNaN2.get(b)[c];
            }
        }

        FileOutputStream fos = new FileOutputStream(path + ".out");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

        for (int out = 0; out < tempNaNt.length; out++) {
            String temp = "";
            for (int out2 = 0; out2 < tempNaNt[0].length; out2++) {
                if (tempNaNt[out][out2] == null) {

                    writer.close();
                    return path + ".out";
                }

                if (!tempNaNt[out][out2].equals("nn")) {
                    temp = temp + tempNaNt[out][out2] + "\t";
                }

            }
            writer.write(temp + "\n");
            //System.out.print(temp+"\n");
        }
        writer.close();
        return path + ".out";
    }

}
