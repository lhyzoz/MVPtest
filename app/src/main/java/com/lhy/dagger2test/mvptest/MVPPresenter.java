package com.lhy.dagger2test.mvptest;

import com.lhy.dagger2test.mvptest.base.BasePresenter;

/**
 * Created by lhy on 2018/9/4 0004.
 * Description:
 */

public class MVPPresenter extends BasePresenter<MVPView>{

    public void getDate(String params){
        if (!isViewAttached()){
            return;
        }
        getView().showLoading();
        MVPModel.getNetData(params, new MVPCallback<String>() {
            @Override
            public void onSuccess(String data) {
                if(isViewAttached()){
                    getView().showData(data);
                }
            }

            @Override
            public void onFailure(String msg) {
                getView().showToast(msg);
            }

            @Override
            public void onError() {
                getView().showError();
            }

            @Override
            public void onComplete() {
               if (isViewAttached()){
                   getView().hideLoading();
               }
            }
        });
    }
}
