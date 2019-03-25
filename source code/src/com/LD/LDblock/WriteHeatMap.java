package com.LD.LDblock;

import org.te33.WM;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import org.tc33.jheatchart.HeatChart;

/**
 *
 * @author Mr-LiZhuo
 */
public class WriteHeatMap {

    public WriteHeatMap() {
    }

    int[] pos;

    public void WriteHeatMap(String[][] dataa, String path) {
        double[][] data = re(dataa);
        HeatChart chart = new HeatChart(data);
        chart.setHighValueColour(Color.red);
        chart.setLowValueColour(Color.white);
        String[] dx = new String[dataa[0].length - 1];
        for (int a = 0; a < dataa[0].length - 1; a++) {
            dx[a] = dataa[0][a + 1];
        }
        String[] dy = new String[dataa.length - 1];
        for (int a = 0; a < dataa.length - 1; a++) {
            dy[a] = dataa[a + 1][0];
        }
        chart.setXValues(dx);
        chart.setYValues(dy);
        try {
            chart.saveToFile(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(WriteHeatMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double[][] re(String[][] data) {
        double[][] da = new double[data.length - 1][data[0].length];
        for (double[] da1 : da) {
            da1[da[0].length - 1] = -1;
        }
        for (int i = 0; i < data.length - 1; i++) {
            for (int h = 0; h < data[0].length - 1; h++) {
                if (data[i + 1][h + 1] == null) {
                    da[i][h] = -1;
                } else {
                    da[i][h] = Double.parseDouble(data[i + 1][h + 1]);
                }
            }
        }
        return da;
    }

    public void WriteHeatMap(float[][] dataa, String path, Integer[] ppos, String chrname) {
        double[][] data = re(dataa);
        WM chart = new WM(data);
        chart.setTitle("Chr: " + chrname);
        chart.setHighValueColour(Color.red);
        chart.setLowValueColour(Color.white);
        String[] dx = new String[dataa[0].length];
        for (int a = 0; a < dataa[0].length; a++) {
            dx[a] = Integer.toString(ppos[a]);
        }
        String[] dy = new String[dataa.length];
        for (int a = 0; a < dataa.length; a++) {
            dy[a] = Integer.toString(ppos[a]);
        }
        chart.setXValues(dx);
        chart.setYValues(dy);
        try {
            chart.saveToFile(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(WriteHeatMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double[][] re(List<List<Float>> data) {
        double[][] da = new double[data.size()][data.size()];
        for (int i = 0; i < data.size(); i++) {
            for (int h = 0; h < data.get(i).size(); h++) {
                da[i][h] = data.get(i).get(h);
            }
        }
        return da;
    }

    public void WriteHeatMap(List<List<Float>> dataa, String path, Integer[] ppos, String chrname) {
        double[][] data = re(dataa);
        WM chart = new WM(data);
        chart.setTitle("Chr: " + chrname);
        chart.setHighValueColour(Color.red);
        chart.setLowValueColour(Color.white);
        String[] dx = new String[dataa.size()];
        for (int a = 0; a < dataa.size(); a++) {
            dx[a] = Integer.toString(ppos[a]);
        }
        chart.setXValues(dx);
        try {
            chart.saveToFile(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(WriteHeatMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double[][] re(float[][] data) {
        double[][] da = new double[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int h = 0; h < data[0].length; h++) {
                if (data[i][h] == 0f) {
                    da[i][h] = 0;
                } else {
                    da[i][h] = data[i][h];
                }
            }
        }
        return da;
    }

    public void WriteHeatMap(String inpath, String path, String chrname) throws IOException {
        double[][] data = re(inpath);
        WM chart = new WM(data);
        chart.setTitle("Chr: " + chrname);
        chart.setHighValueColour(Color.red);
        chart.setLowValueColour(Color.white);
        String[] dx = new String[data.length];
        for (int a = 0; a < data.length; a++) {
            dx[a] = Integer.toString(pos[a]);
        }
        chart.setXValues(dx);
        try {
            chart.saveToFile(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(WriteHeatMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        new File(inpath).delete();
    }

    public double[][] re(String path) throws IOException {

        List<List<Float>> data = new ArrayList();

        double[][] da;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream(path))))) {
            int line = 0;
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                line++;

                if (line == 1) {
                    String[] temp = tempString.split("\t");
                    pos = new int[temp.length - 1];
                    for (int a = 1; a < temp.length; a++) {
                        pos[a - 1] = Integer.parseInt(temp[a]);
                    }
                }
                List<Float> tempt = new ArrayList();
                if (line != 1) {

                    String[] temp = tempString.split("\t");
                    for (int s = 1; s < temp.length; s++) {
                        tempt.add(Float.valueOf(temp[s]));
                    }
                    data.add(tempt);
                }
            }
            da = re(data);
        }
        return da;
    }
}
