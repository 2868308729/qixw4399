package com.qianfeng.qixw4399.other.utils;

import android.util.Log;
import android.widget.RadioButton;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.qianfeng.qixw4399.findgame.bean.FindGame;

import java.util.List;

/**
 * Created by  qixw
 * on  16-2-16.
 */
public class MyStringRequest {
    private MyStringRequestCallback callback;

    public  void setMyStringRequestCallback(MyStringRequestCallback callback){
        this.callback = callback;
    }
     public interface MyStringRequestCallback{
        public void callback(String str);
    };
    public  void stringPostRequest(String url){
        com.android.volley.toolbox.StringRequest request = new com.android.volley.toolbox.StringRequest(
                com.android.volley.toolbox.StringRequest.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.callback(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        LogUtil.d("tag","推荐的游戏下载失败");
                    }
                }
        );
        MyApplication.requestQueue.add(request);
    }

}
