package com.lhy.dagger2test.dagger2test;

import javax.inject.Inject;

/**
 * Created by lhy on 2018/8/31 0031.
 * Description:
 */

public class BeanForDagger {
    private String name=null;


    @Inject
    public BeanForDagger(ParamForDagger param){
        this.name=param.mParamName;
    }

    public String getName(){
        return name;
    }

}
