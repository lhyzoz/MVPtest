package com.lhy.dagger2test.mvpnettest.service;

import android.content.Context;

import com.google.gson.GsonBuilder;
import com.lhy.dagger2test.mvpnettest.Constant;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lhy on 2018/9/5 0005.
 * Description:
 */
public class RetrofitHelper {
    private Context mContext;

    OkHttpClient client=new OkHttpClient();
    GsonConverterFactory factory=GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance=null;
    private Retrofit mRetrofit=null;

    public static RetrofitHelper getInstance(Context context){
        if(instance == null){
            instance=new RetrofitHelper(context);
        }
        return instance;
    }

    private RetrofitHelper(Context context){
        this.mContext=context;
        init();
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {
        mRetrofit=new Retrofit.Builder()
                .baseUrl(Constant.baseUrl)
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

    }

    public RetrofitService getServer(){
        return mRetrofit.create(RetrofitService.class);
    }

}
