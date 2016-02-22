package com.qianfeng.qixw4399.findgame.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.qianfeng.qixw4399.R;

public class GlItem2DetailActivity extends Activity {
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_item2_detail);

        listview = (ListView) findViewById(R.id.glitem2Detail_listview);
    }
}
