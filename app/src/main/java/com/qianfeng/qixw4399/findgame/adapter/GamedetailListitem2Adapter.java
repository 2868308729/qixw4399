package com.qianfeng.qixw4399.findgame.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.bean.FindGameDetail;
import com.qianfeng.qixw4399.findgame.ui.GlItem1DetailActivity;

public class GamedetailListitem2Adapter<T> extends BaseAdapter {

    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public GamedetailListitem2Adapter(Context context,List<T> list) {
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
            convertView = layoutInflater.inflate(R.layout.gamedetail_listitem2, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.gameDetailLl = (LinearLayout) convertView.findViewById(R.id.gameDetail_ll);
            viewHolder.gameDetailTitleTv = (TextView) convertView.findViewById(R.id.gameDetail_title_tv);
            viewHolder.gameDetailAuthorTv = (TextView) convertView.findViewById(R.id.gameDetail_author_tv);
            viewHolder.gameDetailUpdatetimeTv = (TextView) convertView.findViewById(R.id.gameDetail_updatetime_tv);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        final FindGameDetail.ResultEntity.NewsEntity.ListEntity.DataEntity  data= (FindGameDetail.ResultEntity.NewsEntity.ListEntity.DataEntity) object;
        holder.gameDetailAuthorTv.setText(data.getAuthor());
        holder.gameDetailTitleTv.setText(data.getTitle());
        //holder.gameDetailUpdatetimeTv.setText(data.getTemplate());
        holder.gameDetailLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = data.getUrl();
                Intent intent = new Intent(context, GlItem1DetailActivity.class);
                intent.putExtra("url",url);
                context.startActivity(intent);
            }
        });
    }

    protected class ViewHolder {
        private LinearLayout gameDetailLl;
        private TextView gameDetailTitleTv;
        private TextView gameDetailAuthorTv;
        private TextView gameDetailUpdatetimeTv;
    }
}
