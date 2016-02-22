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
import com.qianfeng.qixw4399.findgame.ui.FindGameTJDetailActivity;
import com.qianfeng.qixw4399.findgame.ui.HeaderImgActivity;
import com.qianfeng.qixw4399.other.utils.ImageLoaderUtil;

public class FindgameListviewItemAdapter<T> extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private FindGame.ResultEntity result;
    private List<T> object;
    private int count;
    private int index;

    public FindgameListviewItemAdapter(Context context,FindGame.ResultEntity result){
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.result = result;
        if(result == null){
            object = new ArrayList<>();
        }
        count = 0;
    }

    @Override
    public int getCount() {
        return object.size();
    }

    @Override
    public T getItem(int position) {
        return object.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private View view1;
    private View view2;
    private ViewHolder viewHolder1;
    private ViewHolder viewHolder2;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //复用对象
        if(convertView == null){
            if(count ==0 || count % 4 !=0){
                viewHolder1 = new ViewHolder();
                if(view1 != null){
                    convertView = view1;
                }
                convertView = layoutInflater.inflate(R.layout.findgame_listview_item1, null);
                view1 = convertView;
                viewHolder1.findgameLvitemDownBtn = (Button) convertView.findViewById(R.id.findgame_lvitem_down_btn);
                viewHolder1.findgameLvitemHeaderIv = (ImageView) convertView.findViewById(R.id.findgame_lvitem_header_iv);
                viewHolder1.findgameLvitemNameTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_name_tv);
                viewHolder1.findgameLvitemLl = (LinearLayout) convertView.findViewById(R.id.findgame_lvitem_ll);
                viewHolder1.findgameLvitemDowncountTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_downcount_tv);
                viewHolder1.findgameLvitemSizeTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_size_tv);
                viewHolder1.findgameLvitemContentTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_content_tv);
                viewHolder1.rr = (RelativeLayout) convertView.findViewById(R.id.findgame_game_rl);
                convertView.setTag(viewHolder1);
            }else{
                viewHolder2 = new ViewHolder();
                if(view2!=null){
                    convertView = view2;
                }
                convertView =  layoutInflater.inflate(R.layout.findgame_listview_item2, null);
                view2 = convertView;
                viewHolder2.contentIv = (ImageView) convertView.findViewById(R.id.findgame_lvitem_content_iv);
                viewHolder2.summaryTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_summary_tv);
                viewHolder2.titleTv = (TextView) convertView.findViewById(R.id.findgame_lvitem_title_tv);
                viewHolder2.typeBtn = (Button) convertView.findViewById(R.id.findgame_lvitem_type_btn);
                viewHolder2.ll = (LinearLayout) convertView.findViewById(R.id.findgame_lvitem_ll);
                convertView.setTag(viewHolder2);

            }
        }
        initializeViews((T)getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(T t, ViewHolder holder) {
        //item1
        if(count % 4 ==0 && count !=0){
            index =0;
            List<FindGame.ResultEntity.AdListEntity> adList = result.getAdList();
            holder.typeBtn.setText("新游");
            holder.titleTv.setText(adList.get(index).getTitle());
            holder.summaryTv.setText(adList.get(index).getDesc());
            ImageLoaderUtil.showImgByImageLoad(holder.contentIv,adList.get(index).getImg());

            holder.ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    String id = adList.get(index).
                    Intent intent = new Intent(context, FindGameTJDetailActivity.class);
                }
            });
            index++;
        }
        //item2
        else{
            final FindGame.ResultEntity.RecGameEntity rec = (FindGame.ResultEntity.RecGameEntity) t;
            //TODO implement
            holder.findgameLvitemNameTv.setText(rec.getName());
            holder.findgameLvitemContentTv.setText(rec.getReview());
            //holder.findgameLvitemDowncountTv.setText(rec.getNum_download());
            ImageLoaderUtil.showImgByImageLoad(holder.findgameLvitemHeaderIv, rec.getIcopath());
            holder.findgameLvitemSizeTv.setText(String.valueOf(rec.getSize()));

            //点击进入详情页面
            holder.rr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String id = rec.getId();
                    Intent intent = new Intent(context,FindGameTJDetailActivity.class);
                    intent.putExtra("id",id);
                    context.startActivity(intent);
                }
            });
        }
        count++;
    }
    protected class ViewHolder {
        //第一类组件
        private Button findgameLvitemDownBtn;
        private ImageView findgameLvitemHeaderIv;
        private TextView findgameLvitemNameTv;
        private LinearLayout findgameLvitemLl;
        private TextView findgameLvitemDowncountTv;
        private TextView findgameLvitemSizeTv;
        private TextView findgameLvitemContentTv;

        //第二类组件
        private Button typeBtn;
        private TextView titleTv,summaryTv;
        private ImageView contentIv;

        private RelativeLayout rr;
        private LinearLayout ll;
    }

    public void setList(List<T> list){
        object = list;
    }
    public void setResult(FindGame.ResultEntity result){
        this.result = result;
    }
}
