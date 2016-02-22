package com.qianfeng.qixw4399.findgame.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.bean.FindGameDetail;
import com.qianfeng.qixw4399.findgame.ui.GlItem2DetailActivity;
import com.qianfeng.qixw4399.other.utils.ImageLoaderUtil;

public class GamedetaiListitem1Adapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public GamedetaiListitem1Adapter(Context context,List<T> list) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.objects = list;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public T getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.gamedetail_listitem1, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.gameDetailSpLl = (LinearLayout) convertView.findViewById(R.id.gameDetail_sp_ll);
            viewHolder.gameDetailHeaderTv = (TextView) convertView.findViewById(R.id.gameDetail_header_tv);
            viewHolder.gameDetailCountTv = (TextView) convertView.findViewById(R.id.gameDetail_count_tv);
            viewHolder.gameDetailHeaderIv = (ImageView) convertView.findViewById(R.id.gameDetail_header_iv);
            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        FindGameDetail.ResultEntity.NewsEntity.DirListEntity dir = (FindGameDetail.ResultEntity.NewsEntity.DirListEntity) object;
//        holder.gameDetailCountTv.setText(dir.getNum());
        holder.gameDetailHeaderTv.setText(dir.getName());
        ImageLoaderUtil.showImgByImageLoad(holder.gameDetailHeaderIv,dir.getImg());
        holder.gameDetailSpLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GlItem2DetailActivity.class);
                context.startActivity(intent);
            }
        });

    }

    protected class ViewHolder {
        private ImageView gameDetailHeaderIv;
        private LinearLayout gameDetailSpLl;
        private TextView gameDetailHeaderTv;
        private TextView gameDetailCountTv;
    }
}
