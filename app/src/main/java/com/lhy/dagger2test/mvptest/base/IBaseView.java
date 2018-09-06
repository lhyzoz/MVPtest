package com.lhy.dagger2test.mvptest.base;

import android.content.Context;

/**
 * Created by lhy on 2018/9/4 0004.
 * Description:
 */

public interface IBaseView {
    void showLoading();

    void hideLoading();

    void showToast(String msg);

    void showError();

    Context getContext();
}
