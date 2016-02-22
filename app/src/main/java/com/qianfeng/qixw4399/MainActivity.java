package com.qianfeng.qixw4399;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qianfeng.qixw4399.other.ui.GuideActivity;
import com.qianfeng.qixw4399.other.ui.HomeActivity;
import com.qianfeng.qixw4399.other.utils.Qixw4399Constant;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //判断是否进入引导页
        if(!isFirstUsed()){
            Intent intent =  new Intent(this, GuideActivity.class);
            startActivity(intent);
            //跳转引导页后直接返回到当前的页面
            this.finish();
        }
        //进入主页面
        else{
            Intent intent =  new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }

    /**
     * 判断是否第一次进入应用
     * @return
     */
    private boolean isFirstUsed(){
        SharedPreferences sharedPreferences = getSharedPreferences(Qixw4399Constant.FIRSTUSED, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(Qixw4399Constant.PREFERENCE_FLAG_USED,false);
    }
}
