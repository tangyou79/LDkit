package com.LD.Front.Use;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Mr-LiZhuo
 */

public class Loadfont {

    public Font loadFont(float fontSize) {
        Font definedFont = null;
        String path = "com/LD/Front/Front/tahoma.ttf";
        if (definedFont == null) {
            InputStream is = null;
            BufferedInputStream bis = null;
            try {
                is = (InputStream) this.getClass().getClassLoader().getResourceAsStream(path);
                bis = new BufferedInputStream(is);
                definedFont = Font.createFont(Font.TRUETYPE_FONT, bis);
                definedFont = definedFont.deriveFont(fontSize);
                definedFont = definedFont.deriveFont(Font.BOLD);
            } catch (FontFormatException | IOException e) {
            } finally {
                try {
                    if (null != bis) {
                        bis.close();
                    }
                    if (null != is) {
                        is.close();
                    }
                } catch (IOException e) {
                }
            }
        }
        return definedFont;
    }
}
