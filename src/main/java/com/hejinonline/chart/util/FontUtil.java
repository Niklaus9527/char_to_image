package com.hejinonline.chart.util;

import java.awt.*;

/**
 * Created by zhangyayun on 16-6-20.
 */
public class FontUtil {

    //暂时使用这七个字体,需本地安装 ~/fonts 文件夹中字体
    private static final String[] fonts = {"SIMSUN","方正兰亭宋_GBK","方正细黑一简体","方正细黑一简体","汉仪书宋一简","华文仿宋","华文宋体","华文中宋"};

    /**
     * 获取随机字体(字体大小108-128)
     * @param str
     * @return
     */
    public static Font getRandomFont(String str) {
        Font font;

        do {
            int fontIndex = RandomUtil.getRandomInt(0, fonts.length - 1);
            int fontSize = RandomUtil.getRandomInt(108, 128);
            font = new Font(fonts[fontIndex], Font.PLAIN, fontSize);
        } while (font.canDisplayUpTo(str) == 0);

        return font;
    }

    /**
     * 获取随机字体(自定义字体大小)
     * @param str
     * @param lowSize 字体最小值
     * @param highSize 字体最大值
     * @return
     */
    public static Font getRandomFont(String str, int lowSize, int highSize) {
        Font font;

        do {
            int fontIndex = RandomUtil.getRandomInt(0, fonts.length - 1);
            int fontSize = RandomUtil.getRandomInt(lowSize, highSize);
            font = new Font(fonts[fontIndex], Font.PLAIN, fontSize);
        } while (font.canDisplayUpTo(str) == 0);

        return font;
    }

}
