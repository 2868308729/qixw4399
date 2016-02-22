package com.qianfeng.qixw4399.findgame.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.bean.GlItem1DetailData;
import com.qianfeng.qixw4399.other.utils.MyStringRequest;

public class GlItem1DetailActivity extends Activity implements MyStringRequest.MyStringRequestCallback {

    private WebView webView;
    private Button download;
    private TextView titleTv,sizeTv,downcountTv,typeTv;
    private ImageView headIv;
    private View.OnClickListener onclickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_detail);

        String url = getIntent().getStringExtra("url");

        webView = (WebView) findViewById(R.id.glitem1Detail_webview);

        initView();
        initEvent();
        doRequest(url);
    }



    private void initView() {
        download = (Button) findViewById(R.id.glitem1Detail_down_btn);
        titleTv = (TextView) findViewById(R.id.glitem1Detail_name_tv);
        sizeTv = (TextView) findViewById(R.id.glitem1Detail_size_tv);
        downcountTv = (TextView) findViewById(R.id.glitem1Detail_downcount_tv);
        typeTv = (TextView) findViewById(R.id.glitem1Detail_type_tv);
        headIv = (ImageView) findViewById(R.id.glitem1Detail_header_iv);
    }

    private void initEvent() {
        download.setOnClickListener(onclickListener);
    }

    private void  doRequest(String url) {
        MyStringRequest request = new MyStringRequest();
        request.setMyStringRequestCallback(this);
        request.stringPostRequest(url);
    }

    protected void initWebView(String shareUrl){
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);//允许使用js

        //让网页或本地图片自适应屏幕大小
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);

        //设置webviewclient，这样的话，网页就会在app里加载，而不会调用浏览器加载
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        webView.loadUrl(shareUrl);
    }

    private void initData( GlItem1DetailData data) {
        GlItem1DetailData.ResultEntity.DetailEntity detail = data.getResult().getDetail();
        titleTv.setText(detail.getTitle());
//        sizeTv.setText(detail.get);
    }

    @Override
    public void callback(String str) {
        if(str != null){
            Gson gson = new Gson();
            GlItem1DetailData data = gson.fromJson(str, GlItem1DetailData.class);
            String shareUrl = data.getResult().getDetail().getShareUrl();
            initWebView(shareUrl);
            initData(data);
        }
    }


}
