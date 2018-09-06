package com.lhy.dagger2test.mvptest;


import android.os.Handler;

/**
 * Created by lhy on 2018/9/4 0004.
 * Description:
 */

public class MVPModel {
    public static void getNetData(final String param, final MVPCallback callback){
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                switch (param){
                    case "normal":
                        callback.onSuccess("根据参数"+param+"的请求网络数据成功");
                        break;
                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;
                    case "error":
                        callback.onError();
                        break;
                }
                callback.onComplete();
            }
        },2000);
    }
}
