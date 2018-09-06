package com.lhy.dagger2test.dagger2test;

import dagger.Component;

/**
 * Created by lhy on 2018/8/31 0031.
 * Description:
 */
@Component(modules = BeanModule.class)
public interface BeanComponent {
    void inject(MainActivity activity);
}
