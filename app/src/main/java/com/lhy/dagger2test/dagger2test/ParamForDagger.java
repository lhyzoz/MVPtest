package com.lhy.dagger2test.dagger2test;

import javax.inject.Inject;

/**
 * Created by lhy on 2018/8/31 0031.
 * Description:
 */

class ParamForDagger {
    String mParamName=null;
    @Inject
    public ParamForDagger(){
        this.mParamName="ParamName";
    }
}
