package com.cp.mvptest;

public class MainModel implements MainCommic.MainModel{
    @Override
    public void getData(MainCommic.Callback callback) {
       callback.showData("chenpan");
    }
}
