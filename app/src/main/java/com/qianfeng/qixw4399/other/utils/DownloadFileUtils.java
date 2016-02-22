package com.qianfeng.qixw4399.other.utils;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;

import java.io.File;

/**
 * Created by  qixw
 * on  16-2-22.
 */
public class DownloadFileUtils {
    /**
     * 文件下载
     */
    void httpDowload(String url,String target){
        HttpUtils mHttpUtils = new HttpUtils();
//        String strUrl = "http://apache.fayea.com//httpcomponents/httpclient/binary/httpcomponents-client-4.5.1-bin.zip" ;
        mHttpUtils.download(url, target, new RequestCallBack<File>() {
            @Override
            public void onSuccess (ResponseInfo<File> responseInfo) {

            }

            @Override
            public void onFailure(HttpException error, String msg) {
                LogUtil.d("qfhttpDowload", msg);
            }

            @Override
            public void onLoading(long total, long current, boolean isUploading) {
                super.onLoading(total, current, isUploading);
                LogUtil.d("qfhttpDowload", ((current * 100) / total) + "%\n");
            }
        });
    }
}
