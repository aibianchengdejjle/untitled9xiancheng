package com.company;

public class mythread2  implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
           // System.out.println(getName()+"---"+i);
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
