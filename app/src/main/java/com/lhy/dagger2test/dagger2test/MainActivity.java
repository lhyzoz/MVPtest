package com.lhy.dagger2test.dagger2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lhy.dagger2test.R;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity" ;
    @Inject
    BeanForDagger mBeanForDagger;

    @Named("TypeA")
    @Inject
    BeanNeedParam beanNeedParamA;

    @Named("TypeB")
    @Inject
    BeanNeedParam beanNeedParamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testDegger();
    }

    public void testDegger(){
        DaggerBeanComponent.create().inject(this);
//        if(mBeanForDagger!=null){
//            Log.d(TAG, "使用Dagger注入变量，mBeanForDagger Name：" + mBeanForDagger.getName());
//        }
        if(beanNeedParamA != null){
            Log.d(TAG, "beanNeedParam Name：" + beanNeedParamA.getName());
        }

        if(beanNeedParamB != null){
            Log.d(TAG, "beanNeedParam Name：" + beanNeedParamB.getName());
        }
    }

}
