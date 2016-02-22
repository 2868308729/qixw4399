package com.qianfeng.qixw4399.findgame.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.adapter.FindGameDetailPageAdapter;
import com.qianfeng.qixw4399.findgame.bean.FindGame;
import com.qianfeng.qixw4399.findgame.bean.FindGameDetail;
import com.qianfeng.qixw4399.other.utils.MyStringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FindGameTJDetailActivity extends FragmentActivity implements MyStringRequest.MyStringRequestCallback,
        FindGameDetailGLFragment.OnFragmentInteractionListener,
        FindGameDetailJJFragment.OnFragmentInteractionListener,FindGameDetailPhFragment.OnFragmentInteractionListener {
    private String detailUrl ="http://cdn.4399sj.com/app/android/v3.0/game-info-id-";

    private TextView jjTv,glTv,phTv;
    private View line1,line2,line3;
    private ViewPager viewPager;
    private FindGameDetailPageAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_game_tjdetail);
        String id = getIntent().getStringExtra("id");
        detailUrl += id+".html";
        initViews();
        initEvents();
        initData();
    }

    //点击事件监听器
    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id = v.getId();
            int index = 0;
            switch (id){
                case R.id.headImg_detail_jj_tv:
                    index = 0;
                    line1.setVisibility(View.VISIBLE);
                    line2.setVisibility(View.INVISIBLE);
                    line3.setVisibility(View.INVISIBLE);
                    break;
                case R.id.headImg_detail_gl_tv:
                    index =1;
                    line1.setVisibility(View.INVISIBLE);
                    line2.setVisibility(View.VISIBLE);
                    line3.setVisibility(View.INVISIBLE);
                    break;
                case R.id.headImg_detail_ph_tv:
                    index =2;
                    line1.setVisibility(View.INVISIBLE);
                    line2.setVisibility(View.INVISIBLE);
                    line3.setVisibility(View.VISIBLE);
                    break;
            }
            viewPager.setCurrentItem(index);

        }
    };


    //Viewpager改变监听器
    private ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }
        @Override
        public void onPageSelected(int position) {
            switch (position){
                case 0:
                    line1.setVisibility(View.VISIBLE);
                    line2.setVisibility(View.INVISIBLE);
                    line3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    line1.setVisibility(View.INVISIBLE);
                    line2.setVisibility(View.VISIBLE);
                    line3.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    line1.setVisibility(View.INVISIBLE);
                    line2.setVisibility(View.INVISIBLE);
                    line3.setVisibility(View.VISIBLE);
                    break;
            }
        }
        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    protected void initViews() {

        jjTv = (TextView) findViewById(R.id.headImg_detail_jj_tv);
        glTv = (TextView) findViewById(R.id.headImg_detail_gl_tv);
        phTv = (TextView) findViewById(R.id.headImg_detail_ph_tv);
        line1 = findViewById(R.id.headImg_detail_line1);
        line2 = findViewById(R.id.headImg_detail_line2);
        line3 = findViewById(R.id.headImg_detail_line3);

        viewPager = (ViewPager) findViewById(R.id.headImg_detail_viewPager);
    }

    protected void initEvents() {
        jjTv.setOnClickListener(onClickListener);
        glTv.setOnClickListener(onClickListener);
        phTv.setOnClickListener(onClickListener);
        viewPager.setOnPageChangeListener(onPageChangeListener);
    }

    private FindGameDetailJJFragment jjFragment;
    private FindGameDetailGLFragment glFragment;
    private FindGameDetailPhFragment phFragment;

    protected void initData() {
        MyStringRequest request = new MyStringRequest();
        request.setMyStringRequestCallback(this);
        request.stringPostRequest(detailUrl);
    }

    @Override
    public void callback(String str) {
        Log.d("textString", "callback: "+str);
        //解析攻略
        Gson gson = new Gson();
//        FindGameDetail detail = gson.fromJson(str,FindGameDetail.class);
//        FindGameDetail.ResultEntity.NewsEntity news = detail.getResult().getNews();
        String glJson = null;
        String shareUrl = null;
        try {
            JSONObject object = new JSONObject(str);
            JSONObject result = object.getJSONObject("result");
            JSONObject strNews = result.getJSONObject("news");
            JSONObject shareTpl = result.getJSONObject("shareTpl");
            shareUrl =  shareTpl.getString("shareUrl");
            glJson = strNews.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //初始化Fragment
        jjFragment =  FindGameDetailJJFragment.newInstance(shareUrl);
        glFragment =  FindGameDetailGLFragment.newInstance(glJson);
        phFragment =  new FindGameDetailPhFragment();

        //添加Fragment
        List<Fragment> list = new ArrayList<>();
        list.add(jjFragment);
        list.add(glFragment);
        list.add(phFragment);
        //管理Fragment
        FragmentManager manager = getSupportFragmentManager();
        adapter = new FindGameDetailPageAdapter(manager,list);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
