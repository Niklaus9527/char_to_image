package com.hejinonline.chart;

import com.hejinonline.chart.util.ToImageThread;
import org.opencv.core.Core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyayun on 16-7-19.
 */
public class CreateImageMain {
    public static void main(String[] args) {
        //加载opencv库
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        List<Integer> list = new ArrayList<Integer>();

        //需要生成图片的字符
        for (int i = 0x5000; i < 0x7000; i++) {
            if (i % 0x0400 >= 0 && i % 0x0400 < 0x200) {
                list.add(i);
            }
        }

        int count = list.size(); //字符数量
        int index = 0;
        int train_num = 300; //训练数量
        int test_num = 50; //测试数量
        int thread_num = 8; //处理的线程数量

//        String trainpath = System.getProperty("user.dir") + "/data/traindata";
//        String testpath = System.getProperty("user.dir") + "/data/testdata";

        String trainpath = "/home/zhangyayun/image_data/data_" + count + "_" + train_num + "_" + test_num + "/data/traindata";
        String testpath = "/home/zhangyayun/image_data/data_" + count + "_" + train_num + "_" + test_num + "/data/testdata";

        //开始生成
        for (int i = 0; i < thread_num; i++) {
            List<Integer> l = list.subList(index, index + count / thread_num);
            index += count / thread_num;
            ToImageThread t = new ToImageThread(l, trainpath, testpath, train_num, test_num);
            t.start();
        }

    }
}
