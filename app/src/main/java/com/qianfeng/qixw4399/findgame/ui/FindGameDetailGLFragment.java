package com.qianfeng.qixw4399.findgame.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.adapter.GamedetaiListitem1Adapter;
import com.qianfeng.qixw4399.findgame.adapter.GamedetailListitem2Adapter;
import com.qianfeng.qixw4399.findgame.bean.FindGameDetail;
import com.qianfeng.qixw4399.other.ui.BaseFragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FindGameDetailGLFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FindGameDetailGLFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FindGameDetailGLFragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    protected static final String ARG_PARAM1 = "param1";

    private ListView listView1;
    private ListView listView2;
    private List<FindGameDetail.ResultEntity.NewsEntity.DirListEntity> dirList;
    private List<FindGameDetail.ResultEntity.NewsEntity.ListEntity.DataEntity> dataList;
    private GamedetaiListitem1Adapter<FindGameDetail.ResultEntity.NewsEntity.DirListEntity> adapter1;
    private GamedetailListitem2Adapter<FindGameDetail.ResultEntity.NewsEntity.ListEntity.DataEntity> adapter2;

    private Button button;
    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            String id = "";
            Intent intent = new Intent();
            intent.putExtra("id",id);
            startActivity(intent);
        }
    };

    private OnFragmentInteractionListener mListener;

    public FindGameDetailGLFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.

     * @return A new instance of fragment FindGameDetailGLFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FindGameDetailGLFragment newInstance(String param1) {
        FindGameDetailGLFragment fragment = new FindGameDetailGLFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    //解析Json
    private void fromToJson(String mParam1) {
        Log.d("mParam1", "fromToJson: "+mParam1);

        dirList = new ArrayList<>();
        dataList = new ArrayList<>();
        adapter1 = new GamedetaiListitem1Adapter<>(getActivity(),dirList);
        adapter2 = new GamedetailListitem2Adapter<>(getActivity(),dataList);
        listView1.setAdapter(adapter1);
        listView2.setAdapter(adapter2);

        try {
            JSONObject object = new JSONObject(mParam1);
            JSONObject list = object.getJSONObject("list");
            JSONArray dataArr = list.getJSONArray("data");
            if(dataArr !=null){
                List<FindGameDetail.ResultEntity.NewsEntity.ListEntity.DataEntity> dataEntities = FindGameDetail.ResultEntity.NewsEntity.ListEntity.DataEntity.arrayDataEntityFromData(dataArr.toString());
                dataList.addAll(dataEntities);
                adapter2.notifyDataSetChanged();
            }

            JSONArray dirArr = object.getJSONArray("dir_list");
            if(dirList != null){
                List<FindGameDetail.ResultEntity.NewsEntity.DirListEntity> dirListEntities = FindGameDetail.ResultEntity.NewsEntity.DirListEntity.arrayDirListEntityFromData(dirArr.toString());
                dirList.addAll(dirListEntities);
                adapter1.notifyDataSetChanged();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected int getLayout() {
        return R.layout.fragment_find_game_detail_gl;
    }

    @Override
    protected void initViews() {
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
        this.listView1 = (ListView) root.findViewById(R.id.gameDetail_gl_listView1);
        this.listView2 = (ListView) root.findViewById(R.id.gameDetail_gl_listView2);
        this.button = (Button) root.findViewById(R.id.gameDetail_gl_btn);
    }

    @Override
    protected void initEvents() {
        button.setOnClickListener(onClickListener);

    }

    @Override
    protected void initData() {
        //解析Json
        fromToJson(mParam1);
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
