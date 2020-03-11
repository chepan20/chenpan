package com.cp.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity<MainPresenter> implements MainCommic.MainView{


    @Override
    int getLayoutRerouceId() {
        return R.layout.activity_main;
    }

    @Override
    MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    void initData() {
        presenter.getData();
        ThreadUnSecurity.SellTickets sell = new ThreadUnSecurity().new SellTickets();

        Thread thread1 = new Thread(sell, "1号窗口");
        Thread thread2 = new Thread(sell, "2号窗口");
        Thread thread3 = new Thread(sell, "3号窗口");
        Thread thread4 = new Thread(sell, "4号窗口");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }


    @Override
    public void showData(String s) {

    }
}
