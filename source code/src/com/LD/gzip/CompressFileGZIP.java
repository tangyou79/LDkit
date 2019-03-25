package com.LD.gzip;

import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Mr-LiZhuo
 */
public class CompressFileGZIP {

    public void doCompressFile(String inFileName) {
        try {
            String outFileName = inFileName + ".gz";
            GZIPOutputStream out = null;
            try {
                out = new GZIPOutputStream(new FileOutputStream(outFileName));
            } catch (FileNotFoundException e) {
                System.exit(1);
            }

            FileInputStream in = null;
            try {
                in = new FileInputStream(inFileName);
            } catch (FileNotFoundException e) {
                System.exit(1);
            }
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.finish();
            out.close();

        } catch (IOException e) {
            System.exit(1);
        }

    }

}
