package com.cp.mvptest;

public interface IPresenter<V extends IView> {
void onStart();
void onDestroy();
void attachView(V view);
V getView();

}
