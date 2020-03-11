package com.cp.mvptest;

public class MainPresenter extends BasePresenter<MainCommic.MainView> {
   private MainModel mainModel;

    public MainPresenter() {
        this.mainModel = new MainModel();
    }

    public void getData(){
      mainModel.getData(new MainCommic.Callback() {
          @Override
          public void showData(String s) {
               RootView.showData(s);
          }
      });

   }
}
