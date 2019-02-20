package com.liuchuanzheng.qrcodedemo;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * @author 刘传政
 * @date 2019/2/20 0020 13:36
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
