package com.lhy.dagger2test.mvptest;

/**
 * Created by lhy on 2018/9/4 0004.
 * Description:
 */

public interface MVPCallback<T> {
    void onSuccess(T data);

    void onFailure(String msg);

    void onError();

    void onComplete();
}
