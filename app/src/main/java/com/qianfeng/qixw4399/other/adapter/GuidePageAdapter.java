package com.qianfeng.qixw4399.other.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by  qixw
 * on  16-2-15.
 * 引导页的适配器
 */
public class GuidePageAdapter extends PagerAdapter {
    private List<ImageView> list;

    public GuidePageAdapter(List<ImageView> list) {
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //将view加入到container
        ImageView imageView = list.get(position);
        container.addView(imageView);
       return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }
}
