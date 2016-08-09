package com.hejinonline.chart.util;

/**
 * Created by zhangyayun on 16-6-20.
 */
public class RandomUtil {

    public static double getRandomDouble(double high) {
        return Math.random() * high;
    }

    /**
     * 获取随机double
     * @param low 最小值(包含)
     * @param high 最大值(不包含)
     * @return
     */
    public static double getRandomDouble(double low, double high) {
        if (high > low) {
            return Math.random() * (high - low) + low;
        }
        return 0;
    }

    /**
     * 获取随机int
     * @param low 最小值(包含)
     * @param high 最大值(包含)
     * @return
     */
    public static int getRandomInt(int low, int high) {
        if (high > low) {
            return (int) Math.floor(Math.random() * (high - low + 1) + low);
        }
        return 0;
    }
}
