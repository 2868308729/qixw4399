package com.qianfeng.qixw4399.findgame.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.gson.Gson;
import com.qianfeng.qixw4399.R;
import com.qianfeng.qixw4399.findgame.bean.FindGameDetail;
import com.qianfeng.qixw4399.other.ui.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FindGameDetailJJFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FindGameDetailJJFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FindGameDetailJJFragment extends BaseFragment {
    private String mParam1;
    private String mParam2;
    protected static final String ARG_PARAM1 = "param1";

    private OnFragmentInteractionListener mListener;
    private WebView webView;

    protected void initWebView(String shareUrl){
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);//允许使用js

        //让网页或本地图片自适应屏幕大小
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);

        //设置webviewclient，这样的话，网页就会在app里加载，而不会调用浏览器加载
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        webView.loadUrl(shareUrl);

    }
    public FindGameDetailJJFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment FindGameDetailJJFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FindGameDetailJJFragment newInstance(String param1) {
        Log.d("textStringFragment", "newInstance: "+param1);
        FindGameDetailJJFragment fragment = new FindGameDetailJJFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_find_game_detail_jj;
    }

    @Override
    protected void initViews() {
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
        Log.d("mparam1", "initViews: "+mParam1);
        String shareUrl = mParam1;
        webView = (WebView) root.findViewById(R.id.gameDetail_webView);
        initWebView(shareUrl);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initData() {

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
