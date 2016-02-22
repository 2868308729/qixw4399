package com.qianfeng.qixw4399.other.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.qianfeng.qixw4399.R;

/**
 * Created by  qixw
 * on  16-2-15.
 * 基类Activity<抽象工厂模式>
 */
public abstract  class BaseActivity extends Activity {
    private ImageView searchBttnIv,textBtnIv,notifyIv,downloadIv;
    private LinearLayout baseContent;


    private View.OnClickListener clickListener;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_base);
        //初始化组件
        searchBttnIv = (ImageView) findViewById(R.id.base_search_button);
        textBtnIv = (ImageView) findViewById(R.id.base_search_text);
        notifyIv = (ImageView) findViewById(R.id.base_notify);
        downloadIv = (ImageView) findViewById(R.id.base_download);

        baseContent = (LinearLayout) findViewById(R.id.base_content);
        //将子类的布局加入到该布局中
        getLayoutInflater().inflate(getLayout(),baseContent);
        initViews();
        initEvents();
        initData();

        //默认的监听器
        initDefaultEvents();
    }

    /**
     * 实现默认的事件
     */
    protected  void initDefaultEvents(){
        clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),HomeActivity.class);
                startActivity(intent);
            }
        };
        searchBttnIv.setOnClickListener(clickListener);
        textBtnIv.setOnClickListener(clickListener);
    }
    /**
     * 获取布局
     * @return
     */
    protected abstract  int getLayout();
    /**
     * 初始化视图
     */
    protected  abstract void initViews();

    /**
     * 初始化事件
     */
    protected  abstract  void initEvents();

    /**
     * 初始化数据
     */
    protected  abstract  void initData();

}
