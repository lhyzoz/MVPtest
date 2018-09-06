package com.lhy.dagger2test.mvptest.base;

/**
 * Created by lhy on 2018/9/4 0004.
 * Description:
 */

public class BasePresenter<V extends IBaseView> {
    private V mView;

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
