package com.company;
/*
*       synchronized意味着安全性高，不过效率低
*
* */
public  class ticket implements  Runnable {
    int tickets = 100;
    Object obj=new Object();
    public ticket() {
    }

    public void run() {
        while(true) {
            synchronized(this.obj) {
                if (this.tickets > 0) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException var3) {
                        var3.printStackTrace();
                    }

                }
            }System.out.println(Thread.currentThread().getName() + ":" + this.tickets--);
        }
    }
}

