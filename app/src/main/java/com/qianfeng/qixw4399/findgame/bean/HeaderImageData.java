package com.qianfeng.qixw4399.findgame.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  qixw
 * on  16-2-18.
 */
public class HeaderImageData {


    /**
     * code : 100
     * result : {"album":{"id":"316","title":"全世界都在说中国话","dateline":"1455724800","face":"http://f1.img4399.com/ma~219_20160218142538_56c563e2891f7.jpeg","video_url":"","info":"全世界都在说中国话，汉化游戏，让你用得舒心玩得放心！"},"games":[{"id":"92471","appname":"崩溃大陆汉化版","packag":"com.bscotch.crashlandshh","icopath":"http://f1.img4399.com/sj~92471_logo_56c03fdfd6ffd.jpg","star":"8","md5_file":"a2fce834f609ea9f92e432bbf037ca31","size":54.7,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1455440456","review":"崩溃的大陆！等你来收服小怪成为王者！","downurl":"http://sj.img4399.com/game_list/400/com.bscotch.crashlandshh/bscotch.crashlandshh.v96314.apk","num_download":194030,"gift_show_cli":"0","size_byte":"57357107","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D1%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/bkdlhhbbbaz/bkdlllaz.mp4"},{"id":"50005","appname":"生存战争汉化版","packag":"com.candyrufusgames.survivalcrafthh","icopath":"http://f1.img4399.com/sj~50005_logo_54e022424649a.jpg","star":"7","md5_file":"ff0f8f5746aa83e7fe14ae6dc7af79d4","size":21.77,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","dateline":"1423981327","review":"施展你的勇气与智慧，在荒岛上生存下去。","downurl":"http://sj.img4399.com/game_list/344/com.candyrufusgames.survivalcrafthh/candyrufusgames.survivalcrafthh.v65295.apk","num_download":3823182,"gift_show_cli":"0","size_byte":"22827499","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D2%26pos%3D","video_url":""},{"id":"92374","appname":"春巫汉化版","packag":"com.kiwiwalks.witchspring_lan_en_st","icopath":"http://f1.img4399.com/sj~92374_logo_56b0764379ecd.jpg","star":"7","md5_file":"317addc3bc829de973c128b496b1b3d3","size":66.37,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1454578389","review":"扮演萌萌哒女巫，在100天中训练自己吧！","downurl":"http://sj.img4399.com/game_list/205/com.kiwiwalks.witchspring_lan_en_st/kiwiwalks.witchspring_lan_en_st.v96203.apk","num_download":11352,"gift_show_cli":"0","size_byte":"69593989","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D3%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/cwwwaz/cwwwwaz.mp4"},{"id":"50815","appname":"大自然物语汉化版","packag":"net.kairosoft.android.daishizen_jahh","icopath":"http://f1.img4399.com/sj~50815_logo_55024c2227ef0.jpg","star":"8","md5_file":"faf77de791fb3d73e6d147ac84e341ac","size":23.56,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","dateline":"1426229800","review":"打造完美生态自然旅游景点，享受其中的乐趣。","downurl":"http://sj.img4399.com/game_list/413/net.kairosoft.android.daishizen_jahh/android.daishizen_jahh.v66870.apk","num_download":341837,"gift_show_cli":"0","size_byte":"24704450","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D4%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/dzrdwyaz/dzrdwyaz.mp4"},{"id":"92508","appname":"口袋妖怪黑暗升起2汉化版","packag":"com.lucky2u.koudaiyaoguai_heianshengqi2hhb_4399.cn","icopath":"http://f1.img4399.com/sj~92508_logo_56c2982d9ce62.jpg","star":"8","md5_file":"6993f0a847de6fb1d6f44787bc037bfc","size":7.81,"sdk_version":"3","price":"0","need_gplay":"0","emulator":"1","dateline":"1455593877","review":"带着你的口袋妖怪一起展开冒险吧！","downurl":"http://sj.img4399.com/game_list/390/com.lucky2u.koudaiyaoguai_heianshengqi2hhb_4399.cn/koudaiyaoguai_heianshengqi2hhb_4399.cn.v96461.apk","num_download":24065,"gift_show_cli":"0","size_byte":"8189378","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D5%26pos%3D","video_url":""},{"id":"92509","appname":"盆景城市铁道","packag":"net.kairosoft.android.densha_ja.pj","icopath":"http://f1.img4399.com/sj~92509_logo_56c29da6cc351.jpg","star":"7","md5_file":"a1f6876d5bb5d8445dfc295605e33c95","size":26.84,"sdk_version":"16","price":"0","need_gplay":"0","emulator":"1","dateline":"1455602620","review":"成为铁道管理员，管理经营自己的铁道！","downurl":"http://sj.img4399.com/game_list/289/net.kairosoft.android.densha_ja.pj/densha_ja.pj.v96462.apk","num_download":7872,"gift_show_cli":"0","size_byte":"28143779","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D6%26pos%3D","video_url":""},{"id":"86773","appname":"像素生存者汉化版","packag":"com.ARU.PixelIsland","icopath":"http://f1.img4399.com/sj~86773_logo_55f7c1e6c84a6.jpg","star":"6","md5_file":"41ad6fcaf70305b5545530ba3dca4a80","size":23.88,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1443079735","review":"与敌人战斗，收集各种资源，生存下去吧！","downurl":"http://sj.img4399.com/game_list/357/com.ARU.PixelIsland/ARU.PixelIsland.v84335.apk","num_download":105573,"gift_show_cli":"0","size_byte":"25039994","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D7%26pos%3D","video_url":""},{"id":"92461","appname":"深海少女汉化版","packag":"com.tabom.projectseagirljp_st","icopath":"http://f1.img4399.com/sj~92461_logo_56bfe7345d818.jpg","star":"6","md5_file":"85e35652f5d6dcf552643da508d91d2d","size":44.24,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1455418866","review":"在水族馆冒险，解开层层惊奇的谜团吧！","downurl":"http://sj.img4399.com/game_list/440/com.tabom.projectseagirljp_st/tabom.projectseagirljp_st.v96268.apk","num_download":3535,"gift_show_cli":"0","size_byte":"46389002","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D8%26pos%3D","video_url":""},{"id":"92317","appname":"地狱塔:入侵汉化版","packag":"kr.co.mediawork.helltowerJpn_st","icopath":"http://f1.img4399.com/sj~92317_logo_56ac69b468fcb.jpg","star":"7","md5_file":"1e4f0a460494a1316de8575d8b05773b","size":20.52,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1454139909","review":"找不到工作的勇者，只好去打大魔王啦！","downurl":"http://sj.img4399.com/game_list/451/kr.co.mediawork.helltowerJpn_st/mediawork.helltowerJpn_st.v95806.apk","num_download":3677,"gift_show_cli":"0","size_byte":"21516779","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D9%26pos%3D","video_url":""},{"id":"91731","appname":"一个人的捉迷藏汉化版","packag":"tokyo.seec.hitorikakurenbo_st","icopath":"http://f1.img4399.com/sj~91731_logo_5694c325e71d6.jpg","star":"6","md5_file":"ab59d3a09035e42e9a350ce3ff8af4c3","size":56.91,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","dateline":"1452591265","review":"从恐怖的游戏中逃脱，你可以做到吗？","downurl":"http://sj.img4399.com/game_list/52/tokyo.seec.hitorikakurenbo_st/seec.hitorikakurenbo_st.v94068.apk","num_download":3655,"gift_show_cli":"0","size_byte":"59674460","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D10%26pos%3D","video_url":""},{"id":"24995","appname":"冠军足球物语2汉化版","packag":"net.kairosoft.android.soccer2_ja","icopath":"http://f1.img4399.com/sj~rbdRBGiuQ61Yq.jpg","star":"7","md5_file":"156f1b4e9147ae086fbab0d1b48a828c","size":6.93,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","dateline":"1367118607","review":"体验像素游戏的魅力，做最棒的足球经理。","downurl":"http://sj.img4399.com/game_list/net.kairosoft.android.soccer2_ja/android.soccer2_ja_8.apk","num_download":72939,"gift_show_cli":"0","size_byte":"7266631","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D11%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/gjzqwy2az/gjzqwy2az.mp4"},{"id":"92162","appname":"牛郎店的危险世界汉化版","packag":"tokyo.seec.bottakurihost_st","icopath":"http://f1.img4399.com/sj~92162_logo_56a727cc7d8ed.jpg","star":"6","md5_file":"1cf7958e3cea20dfcf03501084dde9dd","size":45.74,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","dateline":"1453801307","review":"经营你的牛郎店，走上人生的巅峰吧！","downurl":"http://sj.img4399.com/game_list/228/tokyo.seec.bottakurihost_st/seec.bottakurihost_st.v95331.apk","num_download":8925,"gift_show_cli":"0","size_byte":"47961866","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D12%26pos%3D","video_url":""}],"pagecount":1,"page":1,"more":0,"startKey":0}
     * message :
     */

    private int code;
    /**
     * album : {"id":"316","title":"全世界都在说中国话","dateline":"1455724800","face":"http://f1.img4399.com/ma~219_20160218142538_56c563e2891f7.jpeg","video_url":"","info":"全世界都在说中国话，汉化游戏，让你用得舒心玩得放心！"}
     * games : [{"id":"92471","appname":"崩溃大陆汉化版","packag":"com.bscotch.crashlandshh","icopath":"http://f1.img4399.com/sj~92471_logo_56c03fdfd6ffd.jpg","star":"8","md5_file":"a2fce834f609ea9f92e432bbf037ca31","size":54.7,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1455440456","review":"崩溃的大陆！等你来收服小怪成为王者！","downurl":"http://sj.img4399.com/game_list/400/com.bscotch.crashlandshh/bscotch.crashlandshh.v96314.apk","num_download":194030,"gift_show_cli":"0","size_byte":"57357107","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D1%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/bkdlhhbbbaz/bkdlllaz.mp4"},{"id":"50005","appname":"生存战争汉化版","packag":"com.candyrufusgames.survivalcrafthh","icopath":"http://f1.img4399.com/sj~50005_logo_54e022424649a.jpg","star":"7","md5_file":"ff0f8f5746aa83e7fe14ae6dc7af79d4","size":21.77,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","dateline":"1423981327","review":"施展你的勇气与智慧，在荒岛上生存下去。","downurl":"http://sj.img4399.com/game_list/344/com.candyrufusgames.survivalcrafthh/candyrufusgames.survivalcrafthh.v65295.apk","num_download":3823182,"gift_show_cli":"0","size_byte":"22827499","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D2%26pos%3D","video_url":""},{"id":"92374","appname":"春巫汉化版","packag":"com.kiwiwalks.witchspring_lan_en_st","icopath":"http://f1.img4399.com/sj~92374_logo_56b0764379ecd.jpg","star":"7","md5_file":"317addc3bc829de973c128b496b1b3d3","size":66.37,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1454578389","review":"扮演萌萌哒女巫，在100天中训练自己吧！","downurl":"http://sj.img4399.com/game_list/205/com.kiwiwalks.witchspring_lan_en_st/kiwiwalks.witchspring_lan_en_st.v96203.apk","num_download":11352,"gift_show_cli":"0","size_byte":"69593989","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D3%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/cwwwaz/cwwwwaz.mp4"},{"id":"50815","appname":"大自然物语汉化版","packag":"net.kairosoft.android.daishizen_jahh","icopath":"http://f1.img4399.com/sj~50815_logo_55024c2227ef0.jpg","star":"8","md5_file":"faf77de791fb3d73e6d147ac84e341ac","size":23.56,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","dateline":"1426229800","review":"打造完美生态自然旅游景点，享受其中的乐趣。","downurl":"http://sj.img4399.com/game_list/413/net.kairosoft.android.daishizen_jahh/android.daishizen_jahh.v66870.apk","num_download":341837,"gift_show_cli":"0","size_byte":"24704450","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D4%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/dzrdwyaz/dzrdwyaz.mp4"},{"id":"92508","appname":"口袋妖怪黑暗升起2汉化版","packag":"com.lucky2u.koudaiyaoguai_heianshengqi2hhb_4399.cn","icopath":"http://f1.img4399.com/sj~92508_logo_56c2982d9ce62.jpg","star":"8","md5_file":"6993f0a847de6fb1d6f44787bc037bfc","size":7.81,"sdk_version":"3","price":"0","need_gplay":"0","emulator":"1","dateline":"1455593877","review":"带着你的口袋妖怪一起展开冒险吧！","downurl":"http://sj.img4399.com/game_list/390/com.lucky2u.koudaiyaoguai_heianshengqi2hhb_4399.cn/koudaiyaoguai_heianshengqi2hhb_4399.cn.v96461.apk","num_download":24065,"gift_show_cli":"0","size_byte":"8189378","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D5%26pos%3D","video_url":""},{"id":"92509","appname":"盆景城市铁道","packag":"net.kairosoft.android.densha_ja.pj","icopath":"http://f1.img4399.com/sj~92509_logo_56c29da6cc351.jpg","star":"7","md5_file":"a1f6876d5bb5d8445dfc295605e33c95","size":26.84,"sdk_version":"16","price":"0","need_gplay":"0","emulator":"1","dateline":"1455602620","review":"成为铁道管理员，管理经营自己的铁道！","downurl":"http://sj.img4399.com/game_list/289/net.kairosoft.android.densha_ja.pj/densha_ja.pj.v96462.apk","num_download":7872,"gift_show_cli":"0","size_byte":"28143779","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D6%26pos%3D","video_url":""},{"id":"86773","appname":"像素生存者汉化版","packag":"com.ARU.PixelIsland","icopath":"http://f1.img4399.com/sj~86773_logo_55f7c1e6c84a6.jpg","star":"6","md5_file":"41ad6fcaf70305b5545530ba3dca4a80","size":23.88,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1443079735","review":"与敌人战斗，收集各种资源，生存下去吧！","downurl":"http://sj.img4399.com/game_list/357/com.ARU.PixelIsland/ARU.PixelIsland.v84335.apk","num_download":105573,"gift_show_cli":"0","size_byte":"25039994","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D7%26pos%3D","video_url":""},{"id":"92461","appname":"深海少女汉化版","packag":"com.tabom.projectseagirljp_st","icopath":"http://f1.img4399.com/sj~92461_logo_56bfe7345d818.jpg","star":"6","md5_file":"85e35652f5d6dcf552643da508d91d2d","size":44.24,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1455418866","review":"在水族馆冒险，解开层层惊奇的谜团吧！","downurl":"http://sj.img4399.com/game_list/440/com.tabom.projectseagirljp_st/tabom.projectseagirljp_st.v96268.apk","num_download":3535,"gift_show_cli":"0","size_byte":"46389002","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D8%26pos%3D","video_url":""},{"id":"92317","appname":"地狱塔:入侵汉化版","packag":"kr.co.mediawork.helltowerJpn_st","icopath":"http://f1.img4399.com/sj~92317_logo_56ac69b468fcb.jpg","star":"7","md5_file":"1e4f0a460494a1316de8575d8b05773b","size":20.52,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","dateline":"1454139909","review":"找不到工作的勇者，只好去打大魔王啦！","downurl":"http://sj.img4399.com/game_list/451/kr.co.mediawork.helltowerJpn_st/mediawork.helltowerJpn_st.v95806.apk","num_download":3677,"gift_show_cli":"0","size_byte":"21516779","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D9%26pos%3D","video_url":""},{"id":"91731","appname":"一个人的捉迷藏汉化版","packag":"tokyo.seec.hitorikakurenbo_st","icopath":"http://f1.img4399.com/sj~91731_logo_5694c325e71d6.jpg","star":"6","md5_file":"ab59d3a09035e42e9a350ce3ff8af4c3","size":56.91,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","dateline":"1452591265","review":"从恐怖的游戏中逃脱，你可以做到吗？","downurl":"http://sj.img4399.com/game_list/52/tokyo.seec.hitorikakurenbo_st/seec.hitorikakurenbo_st.v94068.apk","num_download":3655,"gift_show_cli":"0","size_byte":"59674460","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D10%26pos%3D","video_url":""},{"id":"24995","appname":"冠军足球物语2汉化版","packag":"net.kairosoft.android.soccer2_ja","icopath":"http://f1.img4399.com/sj~rbdRBGiuQ61Yq.jpg","star":"7","md5_file":"156f1b4e9147ae086fbab0d1b48a828c","size":6.93,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","dateline":"1367118607","review":"体验像素游戏的魅力，做最棒的足球经理。","downurl":"http://sj.img4399.com/game_list/net.kairosoft.android.soccer2_ja/android.soccer2_ja_8.apk","num_download":72939,"gift_show_cli":"0","size_byte":"7266631","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D11%26pos%3D","video_url":"http://sj.video.5054399.com/sjyx/gjzqwy2az/gjzqwy2az.mp4"},{"id":"92162","appname":"牛郎店的危险世界汉化版","packag":"tokyo.seec.bottakurihost_st","icopath":"http://f1.img4399.com/sj~92162_logo_56a727cc7d8ed.jpg","star":"6","md5_file":"1cf7958e3cea20dfcf03501084dde9dd","size":45.74,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","dateline":"1453801307","review":"经营你的牛郎店，走上人生的巅峰吧！","downurl":"http://sj.img4399.com/game_list/228/tokyo.seec.bottakurihost_st/seec.bottakurihost_st.v95331.apk","num_download":8925,"gift_show_cli":"0","size_byte":"47961866","hasGift":0,"icon_tag":0,"is_new":0,"statFlag":"position%3D4%26tid%3D316%26idx%3D12%26pos%3D","video_url":""}]
     * pagecount : 1
     * page : 1
     * more : 0
     * startKey : 0
     */

    private ResultEntity result;
    private String message;

    public static HeaderImageData objectFromData(String str) {

        return new Gson().fromJson(str, HeaderImageData.class);
    }

    public static HeaderImageData objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(key), HeaderImageData.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HeaderImageData> arrayHeaderImageDataFromData(String str) {

        Type listType = new TypeToken<ArrayList<HeaderImageData>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HeaderImageData> arrayHeaderImageDataFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HeaderImageData>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(key), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public ResultEntity getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public static class ResultEntity {
        /**
         * id : 316
         * title : 全世界都在说中国话
         * dateline : 1455724800
         * face : http://f1.img4399.com/ma~219_20160218142538_56c563e2891f7.jpeg
         * video_url :
         * info : 全世界都在说中国话，汉化游戏，让你用得舒心玩得放心！
         */

        private AlbumEntity album;
        private int pagecount;
        private int page;
        private int more;
        private int startKey;
        /**
         * id : 92471
         * appname : 崩溃大陆汉化版
         * packag : com.bscotch.crashlandshh
         * icopath : http://f1.img4399.com/sj~92471_logo_56c03fdfd6ffd.jpg
         * star : 8
         * md5_file : a2fce834f609ea9f92e432bbf037ca31
         * size : 54.7
         * sdk_version : 9
         * price : 0
         * need_gplay : 0
         * emulator : 1
         * dateline : 1455440456
         * review : 崩溃的大陆！等你来收服小怪成为王者！
         * downurl : http://sj.img4399.com/game_list/400/com.bscotch.crashlandshh/bscotch.crashlandshh.v96314.apk
         * num_download : 194030
         * gift_show_cli : 0
         * size_byte : 57357107
         * hasGift : 0
         * icon_tag : 0
         * is_new : 0
         * statFlag : position%3D4%26tid%3D316%26idx%3D1%26pos%3D
         * video_url : http://sj.video.5054399.com/sjyx/bkdlhhbbbaz/bkdlllaz.mp4
         */

        private List<GamesEntity> games;

        public static ResultEntity objectFromData(String str) {

            return new Gson().fromJson(str, ResultEntity.class);
        }

        public static ResultEntity objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(key), ResultEntity.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResultEntity> arrayResultEntityFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultEntity>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResultEntity> arrayResultEntityFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResultEntity>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(key), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public void setAlbum(AlbumEntity album) {
            this.album = album;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public void setMore(int more) {
            this.more = more;
        }

        public void setStartKey(int startKey) {
            this.startKey = startKey;
        }

        public void setGames(List<GamesEntity> games) {
            this.games = games;
        }

        public AlbumEntity getAlbum() {
            return album;
        }

        public int getPagecount() {
            return pagecount;
        }

        public int getPage() {
            return page;
        }

        public int getMore() {
            return more;
        }

        public int getStartKey() {
            return startKey;
        }

        public List<GamesEntity> getGames() {
            return games;
        }

        public static class AlbumEntity {
            private String id;
            private String title;
            private String dateline;
            private String face;
            private String video_url;
            private String info;

            public static AlbumEntity objectFromData(String str) {

                return new Gson().fromJson(str, AlbumEntity.class);
            }

            public static AlbumEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(key), AlbumEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<AlbumEntity> arrayAlbumEntityFromData(String str) {

                Type listType = new TypeToken<ArrayList<AlbumEntity>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<AlbumEntity> arrayAlbumEntityFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<AlbumEntity>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(key), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setDateline(String dateline) {
                this.dateline = dateline;
            }

            public void setFace(String face) {
                this.face = face;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getDateline() {
                return dateline;
            }

            public String getFace() {
                return face;
            }

            public String getVideo_url() {
                return video_url;
            }

            public String getInfo() {
                return info;
            }
        }

        public static class GamesEntity {
            private String id;
            private String appname;
            private String packag;
            private String icopath;
            private String star;
            private String md5_file;
            private double size;
            private String sdk_version;
            private String price;
            private String need_gplay;
            private String emulator;
            private String dateline;
            private String review;
            private String downurl;
            private int num_download;
            private String gift_show_cli;
            private String size_byte;
            private int hasGift;
            private int icon_tag;
            private int is_new;
            private String statFlag;
            private String video_url;

            public static GamesEntity objectFromData(String str) {

                return new Gson().fromJson(str, GamesEntity.class);
            }

            public static GamesEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(key), GamesEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<GamesEntity> arrayGamesEntityFromData(String str) {

                Type listType = new TypeToken<ArrayList<GamesEntity>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<GamesEntity> arrayGamesEntityFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<GamesEntity>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(key), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public void setId(String id) {
                this.id = id;
            }

            public void setAppname(String appname) {
                this.appname = appname;
            }

            public void setPackag(String packag) {
                this.packag = packag;
            }

            public void setIcopath(String icopath) {
                this.icopath = icopath;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public void setMd5_file(String md5_file) {
                this.md5_file = md5_file;
            }

            public void setSize(double size) {
                this.size = size;
            }

            public void setSdk_version(String sdk_version) {
                this.sdk_version = sdk_version;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public void setNeed_gplay(String need_gplay) {
                this.need_gplay = need_gplay;
            }

            public void setEmulator(String emulator) {
                this.emulator = emulator;
            }

            public void setDateline(String dateline) {
                this.dateline = dateline;
            }

            public void setReview(String review) {
                this.review = review;
            }

            public void setDownurl(String downurl) {
                this.downurl = downurl;
            }

            public void setNum_download(int num_download) {
                this.num_download = num_download;
            }

            public void setGift_show_cli(String gift_show_cli) {
                this.gift_show_cli = gift_show_cli;
            }

            public void setSize_byte(String size_byte) {
                this.size_byte = size_byte;
            }

            public void setHasGift(int hasGift) {
                this.hasGift = hasGift;
            }

            public void setIcon_tag(int icon_tag) {
                this.icon_tag = icon_tag;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public void setStatFlag(String statFlag) {
                this.statFlag = statFlag;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public String getId() {
                return id;
            }

            public String getAppname() {
                return appname;
            }

            public String getPackag() {
                return packag;
            }

            public String getIcopath() {
                return icopath;
            }

            public String getStar() {
                return star;
            }

            public String getMd5_file() {
                return md5_file;
            }

            public double getSize() {
                return size;
            }

            public String getSdk_version() {
                return sdk_version;
            }

            public String getPrice() {
                return price;
            }

            public String getNeed_gplay() {
                return need_gplay;
            }

            public String getEmulator() {
                return emulator;
            }

            public String getDateline() {
                return dateline;
            }

            public String getReview() {
                return review;
            }

            public String getDownurl() {
                return downurl;
            }

            public int getNum_download() {
                return num_download;
            }

            public String getGift_show_cli() {
                return gift_show_cli;
            }

            public String getSize_byte() {
                return size_byte;
            }

            public int getHasGift() {
                return hasGift;
            }

            public int getIcon_tag() {
                return icon_tag;
            }

            public int getIs_new() {
                return is_new;
            }

            public String getStatFlag() {
                return statFlag;
            }

            public String getVideo_url() {
                return video_url;
            }
        }
    }
}
