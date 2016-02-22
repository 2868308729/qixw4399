package com.qianfeng.qixw4399.findgame.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.adapter.FindGamePageAdapter;
import com.qianfeng.qixw4399.other.ui.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FindGameFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FindGameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FindGameFragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    //my
    private ViewPager viewPager; //viewpager
    private View devideView1,devideView2,devideView3,devideView4,devideView5;//间隔线
    private TextView tj_tv,fl_tv,ph_tv,zj_tv,zx_tv;
    private FindGamePageAdapter pageAdapgter;

    //header text的点击事件
    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id = v.getId();
            int index =0;
            switch (id){
                case R.id.findgame_head_tj_tv:
                    index = 0;
                    break;
                case R.id.findgame_head_fl_tv:
                    index = 1;
                    break;
                case R.id.findgame_head_ph_tv:
                    index = 2;
                    break;
                case R.id.findgame_head_zj_tv:
                    index = 3;
                    break;
                case R.id.findgame_head_zx_tv:
                    index = 4;
                    break;
            }
            viewPager.setCurrentItem(index);
        }
    };

    //viewPager滑动的事件
    private ViewPager.OnPageChangeListener pageChangeListener= new ViewPager.OnPageChangeListener(){

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            switch (position){
                case 0:
                    devideView1.setVisibility(View.VISIBLE);
                    devideView2.setVisibility(View.INVISIBLE);
                    devideView3.setVisibility(View.INVISIBLE);
                    devideView4.setVisibility(View.INVISIBLE);
                    devideView5.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    devideView1.setVisibility(View.INVISIBLE);
                    devideView2.setVisibility(View.VISIBLE);
                    devideView3.setVisibility(View.INVISIBLE);
                    devideView4.setVisibility(View.INVISIBLE);
                    devideView5.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    devideView1.setVisibility(View.INVISIBLE);
                    devideView2.setVisibility(View.INVISIBLE);
                    devideView3.setVisibility(View.VISIBLE);
                    devideView4.setVisibility(View.INVISIBLE);
                    devideView5.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    devideView1.setVisibility(View.INVISIBLE);
                    devideView2.setVisibility(View.INVISIBLE);
                    devideView3.setVisibility(View.INVISIBLE);
                    devideView4.setVisibility(View.VISIBLE);
                    devideView5.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    devideView1.setVisibility(View.INVISIBLE);
                    devideView2.setVisibility(View.INVISIBLE);
                    devideView3.setVisibility(View.INVISIBLE);
                    devideView4.setVisibility(View.INVISIBLE);
                    devideView5.setVisibility(View.VISIBLE);
                    break;
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    @Override
    protected int getLayout() {
        return R.layout.fragment_find_game;
    }
    @Override
    protected void initViews() {
        //初始化组件
        viewPager = (ViewPager) root.findViewById(R.id.findgame_viewPager);
        devideView1 = root.findViewById(R.id.findgame_head_tj_line);
        devideView2 = root.findViewById(R.id.findgame_head_fl_line);
        devideView3 = root.findViewById(R.id.findgame_head_ph_line);
        devideView4 = root.findViewById(R.id.findgame_head_zj_line);
        devideView5 = root.findViewById(R.id.findgame_head_zx_line);
        tj_tv = (TextView) root.findViewById(R.id.findgame_head_tj_tv);
        fl_tv = (TextView) root.findViewById(R.id.findgame_head_fl_tv);
        ph_tv = (TextView) root.findViewById(R.id.findgame_head_ph_tv);
        zj_tv = (TextView) root.findViewById(R.id.findgame_head_zj_tv);
        zx_tv = (TextView) root.findViewById(R.id.findgame_head_zx_tv);

    }
    @Override
    protected void initEvents() {
        //注册Header text的点击事件
        tj_tv.setOnClickListener(onClickListener);
        fl_tv.setOnClickListener(onClickListener);
        ph_tv.setOnClickListener(onClickListener);
        zj_tv.setOnClickListener(onClickListener);
        zx_tv.setOnClickListener(onClickListener);

        //注册viewPager的滑动监听器
        viewPager.setOnPageChangeListener(pageChangeListener);
    }

    @Override
    protected void initData() {
        List<Fragment> list = new ArrayList<>();
        //加入Fragment数据
        FindGameTJFragment findGameListFragment = new FindGameTJFragment();
        FindGameFLFragment findGameFLFragment = new FindGameFLFragment();
        FindGamePHFragment findGamePHFragment = new FindGamePHFragment();
        FindGameZJFragment findGameZJFragment = new FindGameZJFragment();
        FindGameZXFragment findGameZXFragment = new FindGameZXFragment();
        list.add(findGameListFragment);
        list.add(findGameFLFragment);
        list.add(findGamePHFragment);
        list.add(findGameZJFragment);
        list.add(findGameZXFragment);

        //设置适配器
        pageAdapgter = new FindGamePageAdapter(getActivity().getSupportFragmentManager(),list);
        viewPager.setAdapter(pageAdapgter);
    }



    public FindGameFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FindGameFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FindGameFragment newInstance(String param1, String param2) {
        FindGameFragment fragment = new FindGameFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
