package com.hejinonline.chart;

import org.opencv.core.Core;


/**
 * Created by zhangyayun on 16-6-20.
 */
public class CharToImageTest {
    @org.junit.Test
    public void createImage() throws Exception {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        int image_num = 200;

        String trainPath = System.getProperty("user.dir") + "/data/traindata";
        String testPath = System.getProperty("user.dir") + "/data/testdata";

        for (int num = 0x5000; num < 0x5200; num++) {
            CharToImage cti = new CharToImage(Integer.toHexString(num), trainPath, image_num);
            cti.DrawImages();
            CharToImage cti2 = new CharToImage(Integer.toHexString(num), testPath, image_num);
            cti2.DrawImages();
        }

        // for (int num = 0x5400; num < 0x5600; num++) {
        //     CharToImage cti = new CharToImage(Integer.toHexString(num), trainPath, image_num);
        //     cti.DrawImages();
        //     CharToImage cti2 = new CharToImage(Integer.toHexString(num), testPath, image_num);
        //     cti2.DrawImages();
        // }
        // for (int num = 0x5800; num < 0x5A00; num++) {
        //     CharToImage cti = new CharToImage(Integer.toHexString(num), trainPath, image_num);
        //     cti.DrawImages();
        //     CharToImage cti2 = new CharToImage(Integer.toHexString(num), testPath, image_num);
        //     cti2.DrawImages();
        // }
        // for (int num = 0x5C00; num < 0x5E00; num++) {
        //     CharToImage cti = new CharToImage(Integer.toHexString(num), trainPath, image_num);
        //     cti.DrawImages();
        //     CharToImage cti2 = new CharToImage(Integer.toHexString(num), testPath, image_num);
        //     cti2.DrawImages();
        // }

    }

}