package com.LD.LDecay;

import org.te33.WF;

/**
 *
 * @author Mr-LiZhuo
 */
public class PearsonsCorrelation {

    public PearsonsCorrelation() {
        super();
    }

    public final float correlation(final float[] xArray, final float[] yArray) {
        WF regression = new WF();
        int xArraysize = xArray.length;
        for (int i = 0; i < xArraysize; i++) {
            if (xArray[i] != 3 && yArray[i] != 3) {
                regression.addData(xArray[i], yArray[i]);
            }
        }
        return regression.getR();
    }
}
