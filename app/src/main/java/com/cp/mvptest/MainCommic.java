package com.cp.mvptest;

public class MainCommic {
    public interface MainModel{
      void  getData(Callback callback);
    }
    public interface MainView extends IView{
       void showData(String s);
    }
    interface Callback{
        void showData(String s);
    }
}
