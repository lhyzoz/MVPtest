package com.lhy.dagger2test.dagger2test;

/**
 * Created by lhy on 2018/9/3 0003.
 * Description:
 */

class BeanNeedParam {
    private String param;
    public BeanNeedParam(String param){
        this.param=param;
    }

    public String getName(){
        return param;
    }
}
