package com.qianfeng.qixw4399.findgame.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.LinearLayout;

import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.bean.FindGame;
import com.qianfeng.qixw4399.findgame.bean.HeaderImageData;
import com.qianfeng.qixw4399.findgame.ui.FindGameTJDetailActivity;
import com.qianfeng.qixw4399.other.utils.ImageLoaderUtil;

public class HeadImgListviewItemAdapter<T> extends BaseAdapter {

    private  List<HeaderImageData.ResultEntity.GamesEntity> games;
    private List<T> objects = new ArrayList<T>();

    private Context context;
    private LayoutInflater layoutInflater;

    public HeadImgListviewItemAdapter(Context context, List<HeaderImageData.ResultEntity.GamesEntity> games) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.games = games;
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
            convertView = layoutInflater.inflate(R.layout.findgame_listview_item1, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.findgameLvitemDownBtn = (Button) convertView.findViewById(R.id.findgame_lvitem_down_btn);
            viewHolder.findgameLvitemHeaderIv = (ImageView) convertView.findViewById(R.id.findgame_lvitem_header_iv);
            viewHolder.findgameLvitemNameTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_name_tv);
            viewHolder.findgameLvitemLl = (LinearLayout) convertView.findViewById(R.id.findgame_lvitem_ll);
            viewHolder.findgameLvitemDowncountTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_downcount_tv);
            viewHolder.findgameLvitemSizeTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_size_tv);
            viewHolder.findgameLvitemContentTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_content_tv);
            viewHolder.rr = (RelativeLayout) convertView.findViewById(R.id.findgame_game_rl);

            convertView.setTag(viewHolder);
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T object, ViewHolder holder) {
        //TODO implement
        final HeaderImageData.ResultEntity.GamesEntity games = (HeaderImageData.ResultEntity.GamesEntity) object;
        //TODO implement
        holder.findgameLvitemNameTv.setText(games.getAppname());
        holder.findgameLvitemContentTv.setText(games.getReview());
//        holder.findgameLvitemDowncountTv.setText(rec.getNum_download());
        ImageLoaderUtil.showImgByImageLoad(holder.findgameLvitemHeaderIv, games.getIcopath());
        holder.findgameLvitemSizeTv.setText(String.valueOf(games.getSize()));

        holder.rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FindGameTJDetailActivity.class);
                String id = games.getId();
                intent.putExtra("id",id);
                context.startActivity(intent);
            }
        });
    }

    protected class ViewHolder {
        private Button findgameLvitemDownBtn;
        private ImageView findgameLvitemHeaderIv;
        private TextView findgameLvitemNameTv;
        private LinearLayout findgameLvitemLl;
        private TextView findgameLvitemDowncountTv;
        private TextView findgameLvitemSizeTv;
        private TextView findgameLvitemContentTv;
        private RelativeLayout rr;
    }
}
