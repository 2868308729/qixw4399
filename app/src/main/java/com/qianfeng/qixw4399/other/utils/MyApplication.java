package com.qianfeng.qixw4399.other.utils;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by  qixw
 * on  16-2-16.
 */
public class MyApplication extends Application {
    public static  RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = Volley.newRequestQueue(this);
    }
}
