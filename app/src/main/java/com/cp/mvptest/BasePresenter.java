package com.cp.mvptest;

public abstract class BasePresenter<V extends IView>implements IPresenter<V> {
    protected V RootView;
    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {
        RootView=null;
    }

    @Override
    public V getView() {
        return RootView;
    }

    @Override
    public void attachView(V view) {
        RootView=view;
    }
}
