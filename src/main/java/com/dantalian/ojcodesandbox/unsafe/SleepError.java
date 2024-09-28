package com.dantalian.ojcodesandbox.unsafe;

/**
 * 无限睡眠（阻塞程序执行）
 */
public class SleepError {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 1000;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}