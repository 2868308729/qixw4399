package com.qianfeng.qixw4399.other.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.qianfeng.qixw4399.R;

/**
 * Created by  qixw
 * on  16-2-16.
 */
public class ImageLoaderUtil {

    private ImageLoaderUtilCallBack callBack;
    private ImageLoaderUtil(){}
    public ImageLoaderUtil getInstance(){
        return new ImageLoaderUtil();
    }
    interface  ImageLoaderUtilCallBack{
        public void callBack(Bitmap bitmap);
    }
    public void setImageLoaderUtilCallBack(ImageLoaderUtilCallBack callBack){
        this.callBack = callBack;
    }
    /**
     * 加载图片
     * @param imageView
     * @param url
     */
    public static  void showImgByImageLoad(ImageView imageView, String url) {
        int iMaxMem = (int) Runtime.getRuntime().maxMemory();
        final LruCache<String,Bitmap> lruCache = new LruCache<String,Bitmap>(iMaxMem/8){
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getByteCount();
            }
        };
        com.android.volley.toolbox.ImageLoader imageLoader = new com.android.volley.toolbox.ImageLoader(MyApplication.requestQueue, new com.android.volley.toolbox.ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                return lruCache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                lruCache.put(url,bitmap);
            }
        });
        com.android.volley.toolbox.ImageLoader.ImageListener listener = com.android.volley.toolbox.ImageLoader.getImageListener(imageView,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher);
        imageLoader.get(url, listener);
    }

    /**
     * 图片请求
     * @param url
     * @param view
     * @param width
     * @param height
     */
    private void imageRequest(String url, final View view, int width, int height){
        ImageRequest imageRequest = new ImageRequest(
                url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                       callBack.callBack(response);
                    }
                }, width, height, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        LogUtil.d("tag","图片请求失败："+error.toString());
                    }
                });
        MyApplication.requestQueue.add(imageRequest);
    }


}
