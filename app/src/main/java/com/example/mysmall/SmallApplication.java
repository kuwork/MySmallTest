package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

public class SmallApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * 1. Small框架初始化
         */
        Small.preSetUp(this);
        Small.setBaseUri("http://example.com/");// 浏览器跳转url
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {

            }
        });
    }
}