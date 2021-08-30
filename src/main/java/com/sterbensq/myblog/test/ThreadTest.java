package com.sterbensq.myblog.test;

import org.springframework.boot.actuate.autoconfigure.metrics.ServiceLevelObjectiveBoundary;

public class ThreadTest implements Runnable {
    private volatile Integer ticketNums=10;
    @Override
    public void run() {
        while (true) {
            if(ticketNums>0) {
                System.out.println(Thread.currentThread().getName() + "拿到第" + ticketNums-- + "张票");
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
//        ThreadTest test=new ThreadTest();
//        new Thread(test,"小明").start();
//        new Thread(test,"黄牛").start();
        int number=1;
        switch (number){
            case 0 :
            case 1:
                System.out.println("zero");
                System.out.println("one");break;
            case 2:
                System.out.println("two");break;
            case 3:
                System.out.println("three");break;
            default:
                System.out.println("other");
        }
    }
}
