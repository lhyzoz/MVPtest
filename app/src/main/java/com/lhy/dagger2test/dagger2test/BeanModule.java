package com.lhy.dagger2test.dagger2test;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lhy on 2018/9/3 0003.
 * Description:
 */
@Module
public class BeanModule {
    @Named("TypeA")
    @Provides
    public BeanNeedParam provideBeanA(){
        BeanNeedParam bean=new BeanNeedParam("stringA");
        return bean;
    }

    @Named("TypeB")
    @Provides
    public BeanNeedParam provideBeanB(){
        BeanNeedParam bean=new BeanNeedParam("stringB");

        return bean;
    }

}
