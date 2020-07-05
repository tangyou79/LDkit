/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Chart;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 *
 * @author Mr-LiZhuo
 * @param srcFilePath：源路径，既JAR包中的资源文件，路径相对于CLASSPATH
 * @param destFilePath：目标路径，磁盘上的任意路径，绝对路径（一般为用户选择的文件夹路径）
 */
public class writeChart {

    public void CopyJs(String a) {

        String destFilePath = a;

        String srcFilePath = "LD/Front/Front/echarts.min.js";

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

    public void write(String[] chr, String[] R, Map<String, float[][]> res, Map<Integer, String> subpopnames) throws IOException {

        CopyJs(R[4] + "/echarts.min.js");

        String type = "1";
        if (type.equals("1")) {
            type = "r²";
        } else if (type.equals("2")) {
            type = "D";
        } else {
            type = " ";
        }

        int sizes = res.get(chr[0]).length;

        String path = R[4] + "/" + R[3] + "-All" + ".html";

        FileWriter writer = new FileWriter(path);
        String le = "0";
        if ((chr.length + res.get(chr[0])[0].length) > 6) {
            le = "18";
        }
        String tit1 = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "	<meta charset=\"UTF-8\">\n"
                + "	<title>LDkit Chart</title>\n"
                + "	<script src=\"echarts.min.js\"></script>\n"
                + "</head>\n"
                + "<body>\n"
                + "	<div id=\"main\" style=\"height: 600px; width: 1000px;\"></div>\n"
                + "\n"
                + "	<script type=\"text/javascript\">\n"
                + "        // 基于准备好的dom，初始化echarts实例\n"
                + "        var myChart = echarts.init(document.getElementById('main'));\n"
                + "\n"
                + "        // 指定图表的配置项和数据\n"
                + "        var  option = {\n"
                + "        	title: {\n"
                + "        		text: 'LD decay',\n"
                + "        		left:430\n"
                + "        	},\n"
                + "        	tooltip: {\n"
                + "        		trigger: 'axis'\n"
                + "        	},\n"
                + "        	legend: {\n"
                + "\n"
                + "        		icon:'roundRect',\n"
                + "        		type: 'scroll',\n"
                + " 				orient: 'vertical',\n"
                + "    		    right: 0,\n"
                + "     		    top: 50,\n"
                + "     		    bottom: 20,\n"
                + "        		\n"
                + "        	},\n"
                + "        	grid: {\n"
                + "        		left: '3%',\n"
                + "        		right: '" + le + "%',\n"
                + "        		bottom: '12%',\n"
                + "\n"
                + "        		containLabel: true\n"
                + "        	},\n"
                + "\n"
                + "        	toolbox: {\n"
                + "        		feature: {\n"
                + "        			name:'保存',\n"
                + "        			saveAsImage: {}\n"
                + "        		}\n"
                + "        	},\n"
                + "        	xAxis: {\n"
                + "        		type: 'category',\n"
                + "        		name:'Distance (bp)',\n"
                + "        		nameLocation :'middle',\n"
                + "        		nameGap :30,\n"
                + "        		nameTextStyle:{\n"
                + "        			fontSize :15\n"
                + "        		},\n"
                + "\n"
                + "        		boundaryGap: false,";
        writer.write(tit1);
        String xt = "data: [";
        for (int i = 0; i < sizes; i++) {
            xt = xt + "'" + i + "'" + ",";
        }
        xt = xt + "]\n"
                + "        	},";

        writer.write(xt);

        String tit2 = "	yAxis: {\n"
                + "        		type: 'value',\n"
                + "        		name:'"+type+"',\n"
                + "        		nameLocation :'middle',\n"
                + "        		nameGap :30,\n"
                + "        	    splitLine:{\n"
                + "        	    	 show:false\n"
                + "        	    },\n"
                + "        		nameTextStyle:{\n"
                + "        			fontSize :20\n"
                + "        		}\n"
                + "        	},\n"
                + "        	dataZoom: [{\n"
                + "        		type: 'inside',\n"
                + "        		start: 0,\n"
                + "        		end: 10\n"
                + "        	}, {\n"
                + "        		start: 0,\n"
                + "        		end: 10,\n"
                + "        		handleIcon: 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',\n"
                + "        		handleSize: '80%',\n"
                + "        		handleStyle: {\n"
                + "        			color: '#fff',\n"
                + "        			shadowBlur: 3,\n"
                + "        			shadowColor: 'rgba(0, 0, 0, 0.6)',\n"
                + "        			shadowOffsetX: 2,\n"
                + "        			shadowOffsetY: 2\n"
                + "        		}\n"
                + "        	}],\n";

        writer.write(tit2);
        String tit4 = "series:[\n";
        writer.write(tit4);
        for (String chr1 : chr) {

            for (int sa = 0; sa < res.get(chr1)[0].length; sa++) {
                String src = "";
                src = src
                        + "        	,{\n"
                        + "        		name: 'chr: " + chr1 + "  " + subpopnames.get(sa)
                        + "',\n"
                        + "        		type: 'line',\n"
                        + "        		sampling: 'max',\n"
                        + "        		smooth:true,\n"
                        + "            //stack: '总量',\n"
                        + "            lineStyle:{\n"
                        + "            	width:3\n"
                        + "            },\n"
                        + "            itemStyle:{\n"
                        + "            	opacity : 0,\n"
                        + "            },\n"
                        + "            data: [";
                for (int s = 0; s < res.get(chr1).length; s++) {

                    src = src + res.get(chr1)[s][sa] + ",";

                }
                src = src + "]\n"
                        + "        },";
                writer.write(src);
            }
        }

        String tit3 = " ]\n"
                + "      };\n"
                + "\n"
                + "\n"
                + "        // 使用刚指定的配置项和数据显示图表。\n"
                + "        myChart.setOption(option);\n"
                + "    </script>\n"
                + "</body>\n"
                + "</html>";
        writer.write(tit3);
        writer.close();

    }

}
