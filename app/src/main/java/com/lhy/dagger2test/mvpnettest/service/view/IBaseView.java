package com.lhy.dagger2test.mvpnettest.service.view;

import android.content.Context;

/**
 * Created by lhy on 2018/9/5 0005.
 * Description:
 */
public interface IBaseView {
    void showToast(String msg);

    void showError();

    Context getContext();
}
