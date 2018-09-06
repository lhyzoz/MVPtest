package com.lhy.dagger2test.mvpnettest.service.view;

import com.lhy.dagger2test.mvpnettest.service.entity.Book;

/**
 * Created by lhy on 2018/9/5 0005.
 * Description:
 */
public interface BookView extends IBaseView {
    void onSuccess(Book book);

    void onError(String msg);

}
