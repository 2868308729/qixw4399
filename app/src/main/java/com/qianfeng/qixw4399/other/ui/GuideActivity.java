package com.qianfeng.qixw4399.other.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.qianfeng.qixw4399.MainActivity;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.other.adapter.GuidePageAdapter;
import com.qianfeng.qixw4399.other.utils.Qixw4399Constant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  qixw
 * on  16-2-15.
 * 引导页Activity
 */
public class GuideActivity extends Activity {
    private ViewPager guideContent; //引导页的ViewPager
    private GuidePageAdapter adapter;//引导页适配器
    private Button guideButton;//立即进入

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        guideContent  = (ViewPager) findViewById(R.id.guide_content_vp);
        guideButton = (Button) findViewById(R.id.guide_button);
        //准备引导页的图片数据
        final int[] images = new int[]{
                R.drawable.m4399_png_navigation_new_logo_01,
                R.drawable.m4399_png_navigation_new_logo_02,
                R.drawable.m4399_png_navigation_new_logo_03
        };
        final List<ImageView> list = new ArrayList<ImageView>();
        for (int i = 0; i <images.length ; i++) {
            ImageView iv =new ImageView(this);
            iv.setImageResource(images[i]);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            list.add(iv);
        }
        adapter = new GuidePageAdapter(list);
        //设置Viewpage的监听器
        guideContent.setAdapter(adapter);

        //设置viewpager的滑动监听器
        guideContent.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                //如果当前滑动的页面的位置是最后一个图片就显示按钮
                if((images.length - 1) == position){
                    guideButton.setVisibility(View.VISIBLE);
                }else{
                    guideButton.setVisibility(View.INVISIBLE);
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    //引导页结束点击事件
    public void finishGuide(View view){
        SharedPreferences share = getSharedPreferences(Qixw4399Constant.FIRSTUSED, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = share.edit();
        edit.putBoolean(Qixw4399Constant.PREFERENCE_FLAG_USED,true);
        edit.commit();
        //转到主页
        Intent intent = new Intent(GuideActivity.this,MainActivity.class);
        startActivity(intent);
    }




}
