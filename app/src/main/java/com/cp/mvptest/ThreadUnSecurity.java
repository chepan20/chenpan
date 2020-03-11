package com.cp.mvptest;

public class ThreadUnSecurity {
    static int tickets = 10;

    class SellTickets implements Runnable {

        @Override
        public void run() {
            // 未加同步时产生脏数据
            while (tickets > 0) {
               synchronized (ThreadUnSecurity.class){
                   System.out.println(Thread.currentThread().getName() + "--->售出第：  " + tickets + " 票");
                   tickets--;

                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }


            }

            if (tickets <= 0) {

                System.out.println(Thread.currentThread().getName() + "--->售票结束！");
            }
        }
    }
}
