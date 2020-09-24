package com.company;
/*
*       乱序的是因为cpu执行的程序具有随机性
*
* */
public class Main {

    public static void main(String[] args) {
        //method();
        //method1();
        //创建线程对象
        ticket  t=new ticket();
        Thread h=new Thread(t);
        h.setName("1窗口");
        Thread h1=new Thread(t);
        h1.setName("2窗口");
        Thread h2=new Thread(t);
        h2.setName("3窗口");
        h.start();
        h1.start();
        h2.start();

    }

    private static void method1() {
        mythread2 m=new mythread2();
        Thread t=new Thread(m);
        t.setName("里斯");
        t.start();
        Thread t1=new Thread(m);
        t1.setName("老万");
        t1.start();
    }

    private static void method() {
        mythread t=new mythread();
        //修改线程名字
        t.setName("张三");
        t.start();
        mythread t1=new mythread();
        t1.setName("李四");
        t1.start();
    }
}
