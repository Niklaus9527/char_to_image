package com.hejinonline.chart.util;

import com.hejinonline.chart.CharToImage;

import java.util.List;

/**
 * Created by zhangyayun on 16-7-19.
 */
public class ToImageThread extends Thread {

    private List<Integer> numlist;

    private String trainPath;

    private String testPath;

    private int train_num;

    private int test_num;

    public List getNumlist() {
        return numlist;
    }

    public void setNumlist(List<Integer> numlist) {
        this.numlist = numlist;
    }

    public String getTrainPath() {
        return trainPath;
    }

    public void setTrainPath(String trainPath) {
        this.trainPath = trainPath;
    }

    public String getTestPath() {
        return testPath;
    }

    public void setTestPath(String testPath) {
        this.testPath = testPath;
    }

    public int getTrain_num() {
        return train_num;
    }

    public void setTrain_num(int train_num) {
        this.train_num = train_num;
    }

    public int getTest_num() {
        return test_num;
    }

    public void setTest_num(int test_num) {
        this.test_num = test_num;
    }

    public ToImageThread(List<Integer> list, String trainPath, String testPath, int train_num, int test_num){
        this.numlist = list;
        this.trainPath = trainPath;
        this.testPath = testPath;
        this.train_num = train_num;
        this.test_num = test_num;
    }

    @Override
    public void run() {
        for(int num : numlist) {

            CharToImage cti_train = new CharToImage(Integer.toHexString(num), trainPath, train_num);
            try {
                cti_train.DrawImages();
            } catch (Exception e) {
                e.printStackTrace();
            }

            CharToImage cti_test = new CharToImage(Integer.toHexString(num), testPath, test_num);
            try {
                cti_test.DrawImages();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
