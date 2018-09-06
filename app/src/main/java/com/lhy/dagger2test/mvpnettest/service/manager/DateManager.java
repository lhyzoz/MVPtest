package com.lhy.dagger2test.mvpnettest.service.manager;

import android.content.Context;

import com.lhy.dagger2test.mvpnettest.service.RetrofitHelper;
import com.lhy.dagger2test.mvpnettest.service.RetrofitService;
import com.lhy.dagger2test.mvpnettest.service.entity.Book;

import rx.Observable;

/**
 * Created by lhy on 2018/9/6 0006.
 * Description:
 */
public class DateManager {
    private RetrofitService mRetrofitService;
    public DateManager(Context context){
        this.mRetrofitService= RetrofitHelper.getInstance(context).getServer();
    }

    public Observable<Book> getSearchBooks(String name,String tag,int start,int count){
        return mRetrofitService.getSearchBooks(name, tag, start, count);
    }
}
