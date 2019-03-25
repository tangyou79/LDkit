/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LD.Chart;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Mr-LiZhuo
 */
public class writeChart {

    public void writeChart(String chrom, String[] R, int size, Map<String, float[][]> res, Map<Integer, String> subpopnames) {
        String[] chr = chrom.split(",");
        int sizes = res.get(chr[0]).length;
        if (R[7].equals("no") || R[7].equals("No")) {
            for (String chr1 : chr) {
                float[][] data = res.get(chr1);
                CategoryDataset dataset = createDataset(data, subpopnames);
                float min = min(data);
                JFreeChart freeChart = createChart(dataset, chr1, min, sizes);
                saveAsFile(freeChart, R[1] + "/" + R[3] + "-chr-" + chr1 + ".png", 1024, 800);
            }
        }
        CategoryDataset dataset = createDataset(subpopnames, chrom, res);
        float min = min(chrom, res);
        JFreeChart freeChart = createChart(dataset, "All", min, sizes);
        saveAsFile(freeChart, R[1] + "/" + R[3] + "-All" + ".png", 1024, 800);
    }

    public static void saveAsFile(JFreeChart chart, String outputPath,
            int weight, int height) {
        FileOutputStream out = null;
        try {
            File outFile = new File(outputPath);
            if (!outFile.getParentFile().exists()) {
                outFile.getParentFile().mkdirs();
            }
            out = new FileOutputStream(outputPath);
            ChartUtilities.writeChartAsPNG(out, chart, weight, height);
            out.flush();
        } catch (IOException e) {
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static JFreeChart createChart(CategoryDataset categoryDataset, String chrom, float min, int sizes) {
        JFreeChart jfreechart = ChartFactory.createLineChart("LD decay \n chromosome: " + chrom,
                "Distance(Kb)",
                "r²",
                categoryDataset,
                PlotOrientation.VERTICAL, true,
                true,
                false);
        CategoryPlot plot = (CategoryPlot) jfreechart.getPlot();
        plot.setBackgroundAlpha(0f);
        plot.setForegroundAlpha(0.5f);
        LineAndShapeRenderer lasp = (LineAndShapeRenderer) plot.getRenderer();
        lasp.setStroke(new BasicStroke(2f));
        lasp.setItemLabelsVisible(true);
        lasp.setBaseItemLabelsVisible(true);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setLowerBound(min);
        CategoryAxis domainAxis = (CategoryAxis) plot.getDomainAxis();
        domainAxis.setTickMarksVisible(true);
        domainAxis.setTickLabelsVisible(true);
        domainAxis.setMaximumCategoryLabelWidthRatio(1000);
        for (int i = 0; i < sizes; i++) {
            if (i % (sizes / 1000) == 0) {
                domainAxis.setTickLabelPaint(String.format("%d", i), Color.black);
            } else {
                domainAxis.setTickLabelPaint(String.format("%d", i), new Color(0, 0, 0, 0));
            }
        }
        domainAxis.setTickLabelPaint(String.valueOf(0.1), Color.black);
        return jfreechart;
    }

    public static CategoryDataset createDataset(float[][] date, Map<Integer, String> subpopnames) {
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        for (int sa = 0; sa < date[0].length; sa++) {
            for (int s = 0; s < date.length / 10; s++) {
                categoryDataset.addValue(date[s * 10][sa], subpopnames.get(sa), String.format("%d", s));
            }
        }
        return categoryDataset;
    }

    public static CategoryDataset createDataset(Map<Integer, String> subpopnames, String chrom, Map<String, float[][]> res) {
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        String[] chr = chrom.split(",");
        for (String chr1 : chr) {
            for (int sa = 0; sa < res.get(chr1)[0].length; sa++) {
                for (int s = 0; s < res.get(chr1).length / 100; s++) {
                    categoryDataset.addValue(res.get(chr1)[s * 100][sa], "chr: " + chr1 + "\t " + subpopnames.get(sa), String.format("%d", s));
                }
            }
        }
        return categoryDataset;
    }

    public static float min(float[][] a) {
        float min = a[0][0];
        for (int sa = 0; sa < a[0].length; sa++) {
            for (float[] a1 : a) {
                if (min > a1[sa]) {
                    min = a1[sa];
                }
            }
        }
        BigDecimal bd = new BigDecimal((double) min);
        bd = bd.setScale(2, 1);
        float f1 = bd.floatValue();
        return f1;
    }

    public static float min(String chrom, Map<String, float[][]> res) {
        String[] chr = chrom.split(",");
        float min = 1;
        for (String chr1 : chr) {
            for (int sa = 0; sa < res.get(chr1)[0].length; sa++) {
                for (float[] get : res.get(chr1)) {
                    if (get[sa] != Float.NaN) {
                        if (min > get[sa]) {
                            min = get[sa];
                        }
                    }
                }
            }
        }
        BigDecimal bd = new BigDecimal((double) min);
        bd = bd.setScale(2, 1);
        float f1 = bd.floatValue();
        return f1;
    }
}
