package com.qianfeng.qixw4399.findgame.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.adapter.HeadImgListviewItemAdapter;
import com.qianfeng.qixw4399.findgame.bean.HeaderImageData;
import com.qianfeng.qixw4399.other.utils.ImageLoaderUtil;
import com.qianfeng.qixw4399.other.utils.MyStringRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * 顶部图片点击进入后的Activity
 */
public class HeaderImgActivity extends Activity implements MyStringRequest.MyStringRequestCallback {
    //顶部图片的连接地址
    private String headerImgUrl = "http://cdn.4399sj.com/app/android/v2.1.1/album-info-n-20-startKey--id-";
    private TextView titleTv, updateTimeTv,summaryTv;
    private ImageView imageView;
    private ListView listView;
    private String id;
    private HeadImgListviewItemAdapter adapter;
    private List<HeaderImageData.ResultEntity.GamesEntity> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header_img);

        id = getIntent().getStringExtra("id");

        initView();
        initData();
    }

    /**
     * 初始化组件
     */
    private void initView() {
        titleTv = (TextView) findViewById(R.id.headimg_title_tv);
        updateTimeTv = (TextView) findViewById(R.id.headImg_updateTime_tv);
        imageView = (ImageView) findViewById(R.id.headImg_img_iv);
        summaryTv = (TextView) findViewById(R.id.headImg_summary_tv);
        listView = (ListView) findViewById(R.id.headImg_listView);
    }

    /**
     * 加载数据
     */
    private void initData() {
        if (id != null) {
            headerImgUrl += id + ".html";
            games  = new ArrayList<>();
            adapter = new HeadImgListviewItemAdapter(this,games);
            listView.setAdapter(adapter);
            //下载数据
            MyStringRequest request = new MyStringRequest();
            request.setMyStringRequestCallback(this);
            request.stringPostRequest(headerImgUrl);
        }

    }

    //stringRequest 请求的回调
    @Override
    public void callback(String str) {
        Log.d("imgUrl", "callback:---- "+str);
        Gson gson = new Gson();
        HeaderImageData data = gson.fromJson(str, HeaderImageData.class);
        HeaderImageData.ResultEntity.AlbumEntity album= data.getResult().getAlbum();

        //设置顶部的信息
        titleTv.setText(album.getTitle());
        updateTimeTv.setText(album.getDateline());
        summaryTv.setText(album.getInfo());
        String imageUrl= album.getFace();
        imageUrl = imageUrl.replace("\\","");
        Log.d("imgUrl", "callback: "+imageUrl);
        ImageLoaderUtil.showImgByImageLoad(imageView,imageUrl);

        List<HeaderImageData.ResultEntity.GamesEntity> resultGames = data.getResult().getGames();
        games.addAll(resultGames);
        adapter.notifyDataSetChanged();
    }



}