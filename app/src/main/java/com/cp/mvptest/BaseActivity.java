package com.cp.mvptest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<P extends  IPresenter> extends AppCompatActivity implements IView{
    protected  P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutid=getLayoutRerouceId();
        setContentView(layoutid);
        presenter=createPresenter();
        if(presenter!=null){
            presenter.attachView(this);
        }
        initData();
    }


    abstract int getLayoutRerouceId();
    abstract P createPresenter();
    abstract void initData();
}
