package com.qianfeng.qixw4399.other.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

import com.qianfeng.qixw4399.R;

/**
 * Created by  qixw
 * on  16-2-16.
 */
public class ImageLoaderUtil {
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


}
