package com.qianfeng.qixw4399.findgame.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.adapter.FindgameListviewItemAdapter;
import com.qianfeng.qixw4399.findgame.bean.FindGame;
import com.qianfeng.qixw4399.other.ui.BaseFragment;
import com.qianfeng.qixw4399.other.ui.GuideActivity;
import com.qianfeng.qixw4399.other.utils.LogUtil;
import com.qianfeng.qixw4399.other.utils.MyApplication;
import com.qianfeng.qixw4399.other.utils.MyStringRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  qixw
 * on  16-2-16.
 */
public class FindGameTJFragment extends BaseFragment implements MyStringRequest.MyStringRequestCallback{
    private ListView listview;
    private ImageView headImage1,headImage2;
    private RadioGroup radioGroup;

    private FindgameListviewItemAdapter listAdapter;
    FindGame.ResultEntity result;
    //整体的url
    private String url= "http://cdn.4399sj.com/app/android/v3.4/game-index.html";

    private String[] imageIds = new String[2];

    //图片点击监听器
    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id){
                case R.id.findgame_tj_head_iv1:
                    headerImageForward(imageIds[0]);
                    break;
                case R.id.findgame_tj_head_iv2:
                    headerImageForward(imageIds[1]);
                    break;
            }
        }
    };

    /**
     * 顶部图片跳转Activity
     */
    private void headerImageForward(String id) {
        Intent intent = new Intent(getActivity(),HeaderImgActivity.class);
        intent.putExtra("id",id);
        startActivity(intent);
    }

    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //TODO 监听如果是不同的ID就进入到不同的Activity中
        }
    };
    @Override
    protected int getLayout() {
        return R.layout.fragment_findgame_tj;
    }

    @Override
    protected void initViews() {
        listview = (ListView) root.findViewById(R.id.findgame_gamecontent_lv);
        headImage1 = (ImageView) root.findViewById(R.id.findgame_tj_head_iv1);
        headImage2 = (ImageView) root.findViewById(R.id.findgame_tj_head_iv2);
        radioGroup = (RadioGroup) root.findViewById(R.id.findgame_tj_gametype_rb);
    }

    @Override
    protected void initEvents() {
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        headImage1.setOnClickListener(onClickListener);
        headImage2.setOnClickListener(onClickListener);
    }

    @Override
    protected void initData() {
        listAdapter = new FindgameListviewItemAdapter(getActivity(),null);
        listview.setAdapter(listAdapter);

        //下载数据
        MyStringRequest request = new MyStringRequest();
        request.setMyStringRequestCallback(this);
        request.stringPostRequest(url);
    }


    /**
     * 图片请求
     * @param url
     * @param view
     * @param width
     * @param height
     */
    private void imageRequest(String url, final View view,int width,int height){
        ImageRequest imageRequest = new ImageRequest(
                url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        BitmapDrawable bd = new BitmapDrawable(response);
                        if(view instanceof RadioButton){
                            RadioButton radioButton = (RadioButton) view;
                            radioButton.setCompoundDrawablesRelativeWithIntrinsicBounds(null,bd,null,null);
                        }
                        if(view instanceof ImageView){
                            ImageView imageview = (ImageView) view;
                            imageview.setImageBitmap(response);
                        }

                    }
                }, width, height, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        LogUtil.d("tag","图片请求失败："+error.toString());
                    }
                });
        MyApplication.requestQueue.add(imageRequest);
    }

    /**
     * 实现请求的回调方法
     * @param response
     */
    @Override
    public void callback(String response) {
        //解析数据
        Gson gson = new Gson();
        FindGame findgame = gson.fromJson(response,FindGame.class);
        FindGame.ResultEntity r = findgame.getResult();
        //展示列表信息
        listAdapter.setResult(r);
        listAdapter.setList(r.getRecGame());
        listAdapter.notifyDataSetChanged();

        List<FindGame.ResultEntity.RecPosterEntity> recPoster = findgame.getResult().getRecPoster();
        //保存顶部两张图片的id
        imageIds[0] = recPoster.get(0).getId();
        imageIds[1] = recPoster.get(1).getId();

        imageRequest(recPoster.get(0).getPoster(),headImage1,300,500);
        imageRequest(recPoster.get(1).getPoster(),headImage2,300,500);

        //设置RaidoGroup
        List<FindGame.ResultEntity.RecBlockEntity> recBlock = findgame.getResult().getRecBlock();
        for(int i=0;i<recBlock.size();i++){
            String imageUrl = recBlock.get(i).getPoster();
            String name = recBlock.get(i).getName();
            RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
            imageRequest(recBlock.get(i).getPoster(),radioButton,88,88);
        }
    }
}
