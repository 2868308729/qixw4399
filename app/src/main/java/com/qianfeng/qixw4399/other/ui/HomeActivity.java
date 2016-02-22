package com.qianfeng.qixw4399.other.ui;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.dynamic.ui.DynamicFragment;
import com.qianfeng.qixw4399.findgame.ui.FindGameFragment;
import com.qianfeng.qixw4399.gamewide.ui.GameWideFragment;

public class HomeActivity extends FragmentActivity implements FindGameFragment.OnFragmentInteractionListener,
        DynamicFragment.OnFragmentInteractionListener,
        GameWideFragment.OnFragmentInteractionListener {
    private RadioGroup radioGroup;//radioGroup
    private FrameLayout frameLayout;//主体内容布局
    private Fragment[] fragments;//主页内容的Fragments，比如找游戏，动态等
    private FragmentManager fragmentManager;//fragment管理者

    private int currentIndex;//当前选中的RadioButton的位置
    private View pressedButton;//上一个选中的RadioButton

    //选中的监听事件
    private RadioGroup.OnCheckedChangeListener checkedListener= new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //获取选中的RadioButton
            RadioButton radioButton = (RadioButton) findViewById(checkedId);
            //如果当前选中的和上一次选中的一样
            if(pressedButton == radioButton){
                return ;
            }
            //保存当前选中的
            pressedButton= radioButton;

            int index = 0;
            //判断选中的Id的位置
            switch(checkedId){
                case R.id.home_radio_findGame:
                    index =0;
                    break;
                case R.id.home_radio_dynamic:
                    index =1;
                    break;
                case R.id.home_radio_gameWide:
                    index =2;
                    break;
                case R.id.home_radio_square:
                    index =3;
                    break;
                case R.id.home_radio_my:
                    break;
            }

            FragmentManager framentManager = getSupportFragmentManager();
            FragmentTransaction tranction = framentManager.beginTransaction();
            tranction.show(fragments[index]);
            tranction.hide(fragments[currentIndex]);
            tranction.commit();
            //记录上一个选中的选项
            currentIndex = index;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        radioGroup = (RadioGroup) findViewById(R.id.home_radiogroup);
        //初始化
        fragments = new Fragment[]{
                FindGameFragment.newInstance(null,null),
                DynamicFragment.newInstance(null,null),
                GameWideFragment.newInstance(null,null)
        };
        //获取Fragment管理员
        fragmentManager = getSupportFragmentManager();
        //开启事物
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //将fragment加入到占位地方
        for (int i = 0; i < fragments.length; i++) {
            Fragment f = fragments[i];
            transaction.add(R.id.home_content_fl,f);
            transaction.hide(f);
        }

        //获取第一个RadioButton
        View child = radioGroup.getChildAt(0);
        //展示第一个
        transaction.show(fragments[0]);
        //提交
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
