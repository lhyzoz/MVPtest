package com.lhy.dagger2test.mvpnettest.service.presenter;

import com.lhy.dagger2test.mvpnettest.service.view.IBaseView;

/**
 * Created by lhy on 2018/9/5 0005.
 * Description:
 */
public class BasePresenter<V extends IBaseView> {
    private V mView;

    public void onCreat(){

    }

    public void onStart(){

    }

    public void onStop(){

    }
    public void attachView(V view){
        this.mView=view;
    }

    public void detachView(V view){
        this.mView=null;
    }

    public boolean isViewAttached(){
        return mView!=null;
    }

    public V getView(){
        return mView;
    }
}
