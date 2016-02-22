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
 * on  16-2-22.
 */
public class NewGame {

    /**
     * code : 100
     * result : {"data":[{"day":1456070400,"games":[{"id":"92432","appname":"欢乐途游斗地主(支持单机)","packag":"com.doudizhu.mainhuanle.m4399","icopath":"http://f1.img4399.com/sj~92432_logo_56ca658f744db.jpg","star":"7","md5_file":"d438e997634c1a9a2a39eb3dba52e312","size":22.67,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"最流行的斗地主玩法，万人PK，赢取奖励。","downurl":"http://sj.img4399.com/game_list/164/com.doudizhu.mainhuanle.m4399/mainhuanle.m4399.v96213.apk","num_download":264655,"gift_show_cli":"0","size_byte":"23771217","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/hllyddzzzaz/ddzzzzaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92645","appname":"暴走老精灵","packag":"com.chillingo.gekiyabarunner.android.gplay","icopath":"http://f1.img4399.com/sj~92645_logo_56c94dac99b4e.jpg","star":"7","md5_file":"e964c6ecb3ba53cfacb229e8fe2cbc3b","size":92.2,"sdk_version":"15","price":"0","need_gplay":"0","emulator":"1","review":"收集袜子，拯救公主，展开大冒险！","downurl":"http://sj.img4399.com/game_list/80/com.chillingo.gekiyabarunner.android.gplay/android.gplay.v96874.apk","num_download":1958,"gift_show_cli":"0","size_byte":"96678707","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bzljlios/bzljlios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92002","appname":"吞食天地:三国演义","packag":"com.sinyuee.kingwar","icopath":"http://f1.img4399.com/sj~92002_logo_56a08dced0ef4.jpg","star":"7","md5_file":"0a11f36947af2ad193d13022a555c48f","size":22.33,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"爆笑对白吐槽三国，多维对战重写三国。","downurl":"http://sj.img4399.com/game_list/120/com.sinyuee.kingwar/sinyuee.kingwar.v96780.apk","num_download":105282,"gift_show_cli":"0","size_byte":"23414702","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/tstdsgyyyaz/tstdddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455984000,"games":[{"id":"92111","appname":"开心超人爱闯关","packag":"com.sijiu.kaixin","icopath":"http://f1.img4399.com/sj~92111_logo_56a6ca2dcff53.jpg","star":"8","md5_file":"0fe382920a828967c79b351be09bda68","size":18.97,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"与开心超人一同消灭敌人，守护美丽的家园！","downurl":"http://sj.img4399.com/game_list/473/com.sijiu.kaixin/sijiu.kaixin.v96831.apk","num_download":321741,"gift_show_cli":"0","size_byte":"19891486","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/kxcracggga/kxcracgggaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"51096","appname":"口袋矿工2","packag":"ca.roofdog.pm2","icopath":"http://f1.img4399.com/sj~51096_logo_56c40bb4a95ad.jpg","star":"7","md5_file":"7b9a3386051c0103d9fabc19dda60865","size":47.07,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"跟超萌矿工进入梦幻地下世界，开始探索吧~","downurl":"http://sj.img4399.com/game_list/312/ca.roofdog.pm2/roofdog.pm2.v96588.apk","num_download":28341,"gift_show_cli":"0","size_byte":"49356472","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/kdkg2az/kdkg2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92366","appname":"天空追逐者","packag":"com.luckykat.skychasers","icopath":"http://f1.img4399.com/sj~92366_logo_56b05fbfd9021.jpg","star":"7","md5_file":"c727cc161a70647d0e77026a61579926","size":30.85,"sdk_version":"15","price":"0","need_gplay":"0","emulator":"1","review":"用你的双手证明你才是真正的天空追逐者。","downurl":"http://sj.img4399.com/game_list/118/com.luckykat.skychasers/luckykat.skychasers.v96826.apk","num_download":8765,"gift_show_cli":"0","size_byte":"32348569","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/tkzzzzaz/tkzzzzzaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455897600,"games":[{"id":"92637","appname":"银河战机:机甲降临","packag":"com.nangua.fighter.m4399","icopath":"http://f1.img4399.com/sj~92637_logo_56c6c703371d0.jpg","star":"7","md5_file":"ec6f3098af99429eb436c56e922cac4f","size":28.05,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"超强机甲，极限躲避，证明你的手速！","downurl":"http://sj.img4399.com/game_list/485/com.nangua.fighter.m4399/fighter.m4399.v96835.apk","num_download":15877,"gift_show_cli":"0","size_byte":"29412556","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/yhzjjjjlllaz/yhzjjjjaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"46129","appname":"强盗赛车逃生","packag":"com.labcave.robberraceescape","icopath":"http://f1.img4399.com/sj~46129_logo_56566b038e231.jpg","star":"7","md5_file":"78d2e8711ff8f88ac568aba3f78269a3","size":30.31,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","review":"滑动屏幕控制轿车的前进，躲避警方追捕。","downurl":"http://sj.img4399.com/game_list/431/com.labcave.robberraceescape/labcave.robberraceescape.v96765.apk","num_download":49939,"gift_show_cli":"0","size_byte":"31782338","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/qdsctsssios/qdsctsssios2.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"89005","appname":"新决战喵星","packag":"cis.forgame.nk","icopath":"http://f1.img4399.com/sj~89005_logo_56c6e829aad56.jpg","star":"7","md5_file":"31467517aeb29a69b24e2f18343ba89d","size":42.3,"sdk_version":"15","price":"0","need_gplay":"0","emulator":"1","review":"决战喵星整装待发，推图模式无现畅玩。","downurl":"http://sj.img4399.com/game_list/480/cis.forgame.nk/forgame.nk.v96847.apk","num_download":39296,"gift_show_cli":"0","size_byte":"44354764","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/jzmxaz/xjzmxxxaz1.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"91073","appname":"像素树小镇","packag":"com.dinocooler.android.pixeltree.release","icopath":"http://f1.img4399.com/sj~91073_logo_56a047d6ddb24.jpg","star":"7","md5_file":"6c3c3e34586244d55e015f7f64ba0867","size":10.27,"sdk_version":"16","price":"0","need_gplay":"0","emulator":"1","review":"经营管理小镇，成为一名优秀的镇长吧！","downurl":"http://sj.img4399.com/game_list/264/com.dinocooler.android.pixeltree.release/pixeltree.release.v96262.apk","num_download":32487,"gift_show_cli":"0","size_byte":"10768875","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xssxzzzaz/xsxzzzaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455811200,"games":[{"id":"88559","appname":"Yo怪兽","packag":"cn.com.yomonster","icopath":"http://f1.img4399.com/sj~88559_logo_56b2f294c9920.jpg","star":"7","md5_file":"2ea3a9271681d67754b87fd3a31e4992","size":34.28,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"3","review":"呆萌小怪华丽来袭，齐心协力大战怪兽猎人。","downurl":"http://sj.img4399.com/game_list/452/cn.com.yomonster/com.yomonster.v96185.apk","num_download":11342,"gift_show_cli":"0","size_byte":"35945185","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/az1014/yogssaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"37835","appname":"合金弹头:防御","packag":"com.snkplaymore.android003","icopath":"http://f1.img4399.com/sj~37835_logo_55470b0bb9b73.jpg","star":"8","md5_file":"7add957ec9ef363cd0ea787611bc921d","size":44.54,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"八神庵加盟合金弹头，联手出击抵抗邪恶。","downurl":"http://sj.img4399.com/game_list/252/com.snkplaymore.android003/snkplaymore.android003.v96339.apk","num_download":221337,"gift_show_cli":"0","size_byte":"46703575","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/hjdtfyaz/hjdtfyaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92447","appname":"宇宙魔怪部队","packag":"com.orangepixel.spacegrunts","icopath":"http://f1.img4399.com/sj~92447_logo_56b455e9074d6.jpg","star":"7","md5_file":"c1ac9647abd365588a6d66d90e762ef2","size":16.23,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"在未知的月球基地上进行冒险，斩杀敌人。","downurl":"http://sj.img4399.com/game_list/316/com.orangepixel.spacegrunts/orangepixel.spacegrunts.v96840.apk","num_download":11031,"gift_show_cli":"0","size_byte":"17018388","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/yzmgbdaz/yzmgbdaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455724800,"games":[{"id":"87449","appname":"星光大冒险","packag":"com.miyigame.starlit","icopath":"http://f1.img4399.com/sj~87449_logo_56c418c11734a.jpg","star":"7","md5_file":"5249f9347257e01d5c2468b44c2a21a6","size":54.98,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"0","review":"新奇可爱的角色，战胜强大无比的boss。","downurl":"http://sj.img4399.com/game_list/448/com.miyigame.starlit/miyigame.starlit.v96603.apk","num_download":152200,"gift_show_cli":"0","size_byte":"57650708","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xgdmxxxios/xgdmxx.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"89511","appname":"捕鱼达人千炮版","packag":"com.pokercity.bydrqp.m4399","icopath":"http://f1.img4399.com/sj~89511_logo_563980856ca6d.jpg","star":"7","md5_file":"0e07c52624ce8e31541e555e1571f9a3","size":26.06,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"经典完美移植，畅享多人在线联网疯狂捕鱼！","downurl":"http://sj.img4399.com/game_list/122/com.pokercity.bydrqp.m4399/bydrqp.m4399.v96548.apk","num_download":155361,"gift_show_cli":"0","size_byte":"27325890","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bydrqpbbaz/bydrqpbbaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92552","appname":"目标锁定","packag":"com.touchten.targetacquired","icopath":"http://f1.img4399.com/sj~92552_logo_56c4180d9705f.jpg","star":"7","md5_file":"52d29efd471ee6a86605c3f2139e6e29","size":54.31,"sdk_version":"15","price":"0","need_gplay":"0","emulator":"0","review":"控制猫咪女警捕获邪恶的机器人老鼠吧！","downurl":"http://sj.img4399.com/game_list/22/com.touchten.targetacquired/touchten.targetacquired.v96601.apk","num_download":4916,"gift_show_cli":"0","size_byte":"56948162","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/mbsddddaz/mbsddddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455638400,"games":[{"id":"92514","appname":"无限射击","packag":"com.intelligame.wxsj.ssjj","icopath":"http://f1.img4399.com/sj~92514_logo_56c2bcaeb557c.jpg","star":"7","md5_file":"1d5f98229a7d23d02f5a5e2a3a9e41e2","size":22.3,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"浴血奋战，用手中的枪械来捍卫人类的尊严！","downurl":"http://sj.img4399.com/game_list/20/com.intelligame.wxsj.ssjj/wxsj.ssjj.v96473.apk","num_download":28226,"gift_show_cli":"0","size_byte":"23383244","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/wxsjjjaz/wxsjjjaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92515","appname":"飞车骑行","packag":"com.butakov.psebay","icopath":"http://f1.img4399.com/sj~92515_logo_56c2cc2cd14e4.jpg","star":"7","md5_file":"f504976c0ad196a8fab8061cc75faa8f","size":31.65,"sdk_version":"16","price":"0","need_gplay":"0","emulator":"2","review":"看世界纷繁复杂，不如骑行到海角天涯！","downurl":"http://sj.img4399.com/game_list/68/com.butakov.psebay/butakov.psebay.v96900.apk","num_download":9333,"gift_show_cli":"0","size_byte":"33187430","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/fcqcccaz/fcqxxxaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92516","appname":"孤狼","packag":"air.com.FDGEntertainment.Lonewolf.gp","icopath":"http://f1.img4399.com/sj~92516_logo_56c2cbf71f740.jpg","star":"7","md5_file":"52b1223fece3784592b7d4857cc06274","size":69.08,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"2","review":"完成每一次的暗杀任务，成为优秀的狙击手！","downurl":"http://sj.img4399.com/game_list/366/air.com.FDGEntertainment.Lonewolf.gp/Lonewolf.gp.v96856.apk","num_download":24793,"gift_show_cli":"0","size_byte":"72435630","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/glios/glios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92534","appname":"究极爆弹","packag":"com.sravenstudios.dynabomb","icopath":"http://f1.img4399.com/sj~92534_logo_56c3edf1912d5.jpg","star":"7","md5_file":"41dce2be8dcbf2d424973a8bfc59b31c","size":34.87,"sdk_version":"11","price":"0","need_gplay":"0","emulator":"1","review":"爆弹英雄，找到闯关钥匙勇敢前进！","downurl":"http://sj.img4399.com/game_list/342/com.sravenstudios.dynabomb/sravenstudios.dynabomb.v96537.apk","num_download":6443,"gift_show_cli":"0","size_byte":"36563845","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/jjbdddaz/jjbdddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87322","appname":"熊出没之疯狂弹射","packag":"com.hgqn.xcmfkds.ssjj","icopath":"http://f1.img4399.com/sj~87322_logo_55ee46fccfce7.jpg","star":"8","md5_file":"3f2224fd47c94dbf32584729460321b4","size":19.33,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"0","review":"拉弓、弹射！帮助熊大、熊二保护家园吧！","downurl":"http://sj.img4399.com/game_list/383/com.hgqn.xcmfkds.ssjj/xcmfkds.ssjj.v96467.apk","num_download":546389,"gift_show_cli":"0","size_byte":"20268974","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xcmzfktssaz/xcmzfktssaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455552000,"games":[{"id":"88376","appname":"雷霆EX星际大战","packag":"com.xplane.game.mars.ssjj","icopath":"http://f1.img4399.com/sj~88376_logo_56160a5f220d6.jpg","star":"7","md5_file":"f93bae5c2528f887c77a0fbf3b7bb5a6","size":27.5,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"开启大暴走模式击败敌军，让弹幕更加酷炫！","downurl":"http://sj.img4399.com/game_list/192/com.xplane.game.mars.ssjj/mars.ssjj.v96188.apk","num_download":94269,"gift_show_cli":"0","size_byte":"28835840","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/ltexxjdzzaz/ltexxjdzzaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"31795","appname":"泰拉瑞亚中文版","packag":"com.and.games505.TerrariaPaid","icopath":"http://f1.img4399.com/sj~31795_logo_56c026102fdca.jpg","star":"8","md5_file":"4e378acb46bec5f45cb0539de1208a76","size":50.32,"sdk_version":"15","price":"0","need_gplay":"0","emulator":"1","review":"在各区域进行探索，挑战敌人不断强大自己。","downurl":"http://sj.img4399.com/game_list/360/com.and.games505.TerrariaPaid/games505.TerrariaPaid.v96474.apk","num_download":6740322,"gift_show_cli":"0","size_byte":"52764344","ppk_list":[{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160216/sjb/tailaruiyaaV1.2.11585.ppk","size":102010452,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160216/sjb/tailaruiyaaV1.2.11585.ppk","size":102010452,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160216/sjb/tailaruiyaaV1.2.11585.ppk","size":102010452,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160216/sjb/tailaruiyaaV1.2.11585.ppk","size":102010452,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160216/sjb/tailaruiyaaV1.2.11585.ppk","size":102010452,"md5_file":""}],"hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/tlryaz/tlryaz2.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92506","appname":"Evo探险","packag":"com.stampedegames.evoexplores","icopath":"http://f1.img4399.com/sj~92506_logo_56c28b078e936.jpg","star":"7","md5_file":"8042dc71780ae42eb853e3ca41b55903","size":39.67,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"纪念碑谷风星际探险！解开星球秘密吧！","downurl":"http://sj.img4399.com/game_list/42/com.stampedegames.evoexplores/stampedegames.evoexplores.v96505.apk","num_download":14816,"gift_show_cli":"0","size_byte":"41597009","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/evotxxxaz/evotxxaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455465600,"games":[{"id":"89717","appname":"三国英雄传奇(单机版)","packag":"com.bjfq.sanguomengjiangzhaoyunzhuan.egame","icopath":"http://f1.img4399.com/sj~89717_logo_56c6ce7476dc0.jpg","star":"7","md5_file":"8a1573d5098104cd1c30fd3f887fd2bf","size":13.37,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"梦回三国，体验独特组合连续技战斗系统！","downurl":"http://sj.img4399.com/game_list/448/com.bjfq.sanguomengjiangzhaoyunzhuan.egame/sanguomengjiangzhaoyunzhuan.egame.v96843.apk","num_download":77882,"gift_show_cli":"0","size_byte":"14019461","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/1112az/sgyxcqqaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92464","appname":"绳索英雄3","packag":"com.mgc.rope.hero.three","icopath":"http://f1.img4399.com/sj~92464_logo_56bff902da7e2.jpg","star":"7","md5_file":"5df5304388e00a6e9f71e7a3a2d25b79","size":30.73,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","review":"与绳索英雄一起再次承担拯救世界的任务！","downurl":"http://sj.img4399.com/game_list/376/com.mgc.rope.hero.three/hero.three.v96281.apk","num_download":70566,"gift_show_cli":"0","size_byte":"32222740","ppk_list":[{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160214/sjb/shengsuoyingxiong3.ppk","size":98566144,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160214/sjb/shengsuoyingxiong3.ppk","size":98566144,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160214/sjb/shengsuoyingxiong3.ppk","size":98566144,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160214/sjb/shengsuoyingxiong3.ppk","size":98566144,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160214/sjb/shengsuoyingxiong3.ppk","size":98566144,"md5_file":""}],"hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/ssyxx3az/ssyxxxaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92374","appname":"春巫汉化版","packag":"com.kiwiwalks.witchspring_lan_en_st","icopath":"http://f1.img4399.com/sj~92374_logo_56b0764379ecd.jpg","star":"7","md5_file":"317addc3bc829de973c128b496b1b3d3","size":66.37,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"扮演萌萌哒女巫，在100天中训练自己吧！","downurl":"http://sj.img4399.com/game_list/205/com.kiwiwalks.witchspring_lan_en_st/kiwiwalks.witchspring_lan_en_st.v96203.apk","num_download":15859,"gift_show_cli":"0","size_byte":"69593989","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/cwwwaz/cwwwwaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455379200,"games":[{"id":"91132","appname":"迷失的矿工","packag":"com.fsilva.marcelo.lostminer","icopath":"http://f1.img4399.com/sj~91132_logo_5673d168ddefd.jpg","star":"8","md5_file":"186e66d1b0efd1081a045455e1c5ad5c","size":6.91,"sdk_version":"11","price":"0","need_gplay":"0","emulator":"1","review":"化身主角，在这个未知的世界里冒险吧！","downurl":"http://sj.img4399.com/game_list/45/com.fsilva.marcelo.lostminer/marcelo.lostminer.v94865.apk","num_download":341703,"gift_show_cli":"0","size_byte":"7245660","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/msdkggggaz/msdkgggaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92283","appname":"弹跳理论2","packag":"com.appdore.rt2","icopath":"http://f1.img4399.com/sj~92283_logo_56aaf5d6aae66.jpg","star":"7","md5_file":"f95fea807580740abf9f3f24ddc25075","size":10.2,"sdk_version":"11","price":"0","need_gplay":"0","emulator":"1","review":"为小球设计路线，收集全部的正方形！","downurl":"http://sj.img4399.com/game_list/492/com.appdore.rt2/appdore.rt2.v95686.apk","num_download":8771,"gift_show_cli":"0","size_byte":"10695475","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/ttll2az/ttll2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"26626","appname":"大头足球","packag":"com.dnddream.headsoccer.android","icopath":"http://f1.img4399.com/sj~rAJHN7CuJKFRG.jpg","star":"7","md5_file":"55bf394eb05dd34e8e5a26ed9018887a","size":35.71,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"虚拟按键控制人物与AI单挑，看谁进的球多。","downurl":"http://sj.img4399.com/game_list/62/com.dnddream.headsoccer.android/headsoccer.android.v95090.apk","num_download":182205,"gift_show_cli":"0","size_byte":"37444648","ppk_list":[{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160124/sjb/datouzuqiuV5.0.4.ppk","size":88563981,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160124/sjb/datouzuqiuV5.0.4.ppk","size":88563981,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160124/sjb/datouzuqiuV5.0.4.ppk","size":88563981,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160124/sjb/datouzuqiuV5.0.4.ppk","size":88563981,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160124/sjb/datouzuqiuV5.0.4.ppk","size":88563981,"md5_file":""}],"hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/dtzqaz/dtzq.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92465","appname":"阿尔托的冒险","packag":"com.noodlecake.altosadventure","icopath":"http://f1.img4399.com/sj~92465_logo_56bffd1abd47b.jpg","star":"7","md5_file":"e95228a16bc4490d148fe0224ffb16a0","size":46.49,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"在刺激的场景中进行滑雪探险，挑战高分。","downurl":"http://sj.img4399.com/game_list/180/com.noodlecake.altosadventure/noodlecake.altosadventure.v96284.apk","num_download":14841,"gift_show_cli":"0","size_byte":"48748298","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/aetdmxxxaz/aetdmxxxaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455292800,"games":[{"id":"90447","appname":"猪猪侠百变飞车","packag":"com.feamber.racing4","icopath":"http://f1.img4399.com/sj~90447_logo_56ada059bc0e5.jpg","star":"8","md5_file":"503e542b560dbac722e42146ad0e667b","size":38.11,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"冠军联赛一触即发！和猪猪侠一同驰骋赛道！","downurl":"http://sj.img4399.com/game_list/87/com.feamber.racing4/feamber.racing4.v95820.apk","num_download":489904,"gift_show_cli":"0","size_byte":"39961231","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/zzxbbfcccaz/zzxbbfcccaz11.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"45005","appname":"开心酷跑(觉醒版)","packag":"com.ck.runcool","icopath":"http://f1.img4399.com/sj~45005_logo_56b19d3208bac.jpg","star":"8","md5_file":"3c09ddb9928901f48e3312a16094b9d8","size":43.24,"sdk_version":"7","price":"0","need_gplay":"0","emulator":"1","review":"在快节奏的跑酷中与超级大反派展开战斗。","downurl":"http://sj.img4399.com/game_list/116/com.ck.runcool/ck.runcool.v96080.apk","num_download":1340291,"gift_show_cli":"0","size_byte":"45340426","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/kxpkaz/kxpkazios-small.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"83834","appname":"消灭水管工","packag":"air.com.keybol.plumber","icopath":"http://f1.img4399.com/sj~83834_logo_56ab15db55a7c.jpg","star":"7","md5_file":"c4ac4d5b5fcd126d8f5fcf541aeebc60","size":40.56,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"布置各种陷阱、控制小怪，杀死马里奥！","downurl":"http://sj.img4399.com/game_list/195/air.com.keybol.plumber/keybol.plumber.v95722.apk","num_download":97333,"gift_show_cli":"0","size_byte":"42530242","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xmsggaz/xmsgggggaz2.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"90185","appname":"无双战姬","packag":"com.zwmobi.wszj.HqShoot","icopath":"http://f1.img4399.com/sj~90185_logo_56960121c209e.jpg","star":"7","md5_file":"51c38e9248ba65040d8fe91ed55b1159","size":38.35,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"3","review":"打造个性战姬，让弹幕来得更猛烈些吧！","downurl":"http://sj.img4399.com/game_list/414/com.zwmobi.wszj.HqShoot/wszj.HqShoot.v96092.apk","num_download":52526,"gift_show_cli":"0","size_byte":"40212889","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/wszjjaz/wszjjaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455206400,"games":[{"id":"43287","appname":"手指终结者2016","packag":"com.ipeaksoft.handleKiller","icopath":"http://f1.img4399.com/sj~43287_logo_56b0751b4a34e.jpg","star":"8","md5_file":"88c68b8b1949bc8daa6fa8dc1840b85c","size":21.55,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"超多坑爹的反应力小游戏等着你，快来挑战！","downurl":"http://sj.img4399.com/game_list/460/com.ipeaksoft.handleKiller/ipeaksoft.handleKiller.v96021.apk","num_download":261408,"gift_show_cli":"0","size_byte":"22596812","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/szzjzzios/szzjzzios4.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"85093","appname":"像素车OL","packag":"com.blockycars.online","icopath":"http://f1.img4399.com/sj~85093_logo_56b04a052fe0d.jpg","star":"7","md5_file":"b80406966495ec2913c75f78084558fd","size":20.24,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"改装你的像素战车，与好友一起并肩作战！","downurl":"http://sj.img4399.com/game_list/45/com.blockycars.online/blockycars.online.v96693.apk","num_download":331776,"gift_show_cli":"0","size_byte":"21223178","ppk_list":[{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160218/sjb/xiangsucheOLV3.8.1.ppk","size":89169687,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160218/sjb/xiangsucheOLV3.8.1.ppk","size":89169687,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160218/sjb/xiangsucheOLV3.8.1.ppk","size":89169687,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160218/sjb/xiangsucheOLV3.8.1.ppk","size":89169687,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160218/sjb/xiangsucheOLV3.8.1.ppk","size":89169687,"md5_file":""}],"hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/0814ios/xsccc.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"91308","appname":"3D都市狂飙","packag":"com.shgm.urace.tf","icopath":"http://f1.img4399.com/sj~91308_logo_568498d8de402.jpg","star":"7","md5_file":"66f0d81a223fb556382e19deac356adc","size":36.73,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"最真实的碰撞体验，彻底激发你的脑神经！","downurl":"http://sj.img4399.com/game_list/393/com.shgm.urace.tf/urace.tf.v95477.apk","num_download":50796,"gift_show_cli":"0","size_byte":"38514196","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/3ddskbbbaz/3ddskbbbaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455120000,"games":[{"id":"48486","appname":"奔跑吧兄弟:跑男来了","packag":"com.idreamsky.runningman","icopath":"http://f1.img4399.com/sj~48486_logo_555ee234b32b2.jpg","star":"8","md5_file":"46f0e6b92adf36eb59beed0ec1ec55d8","size":44.28,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"多种模式无限趣味，跟晨哥小贤一起玩跑男~","downurl":"http://sj.img4399.com/game_list/59/com.idreamsky.runningman/idreamsky.runningman.v96053.apk","num_download":1959364,"gift_show_cli":"0","size_byte":"46430945","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bpbxdpnaz/bpbxdpnaz1.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"82983","appname":"完美投篮2","packag":"com.miniclip.dudeperfect","icopath":"http://f1.img4399.com/sj~82983_logo_55714d1788174.jpg","star":"7","md5_file":"e7c3509494eb6f027d59d5096477b114","size":44.25,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"调节角度和力道，来一场最精准的投篮。","downurl":"http://sj.img4399.com/game_list/74/com.miniclip.dudeperfect/miniclip.dudeperfect.v95569.apk","num_download":59505,"gift_show_cli":"0","size_byte":"46399488","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/wmtll2az/wmtll2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"44546","appname":"口袋英雄","packag":"com.droidhang.ph","icopath":"http://f1.img4399.com/sj~44546_logo_565eac8361388.jpg","star":"8","md5_file":"1b5ecd5060760fc2fc99241eba551940","size":28.05,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"3","review":"组织大军来讨伐盘踞在坎梅洛王城的恶魔吧！","downurl":"http://sj.img4399.com/game_list/121/com.droidhang.ph/droidhang.ph.v95809.apk","num_download":779349,"gift_show_cli":"0","size_byte":"29412556","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/kdyxaz/kdyxrykpaz-small.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"84951","appname":"蹦蹦兔塔防(动漫授权)","packag":"com.jumo.bbrabbit.a4399","icopath":"http://f1.img4399.com/sj~84951_logo_5604c2a05931f.jpg","star":"8","md5_file":"80948abfa273343d8ec4695bb5a12b05","size":17.67,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"0","review":"击败敌人保护萌萌兔，更有机甲战士来相助！","downurl":"http://sj.img4399.com/game_list/96/com.jumo.bbrabbit.a4399/bbrabbit.a4399.v95623.apk","num_download":1123419,"gift_show_cli":"0","size_byte":"18528337","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bbttffaz/bbttffaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1455033600,"games":[{"id":"87597","appname":"开心酷跑2(高清版)","packag":"com.trans.runcool2","icopath":"http://f1.img4399.com/sj~87597_logo_56b04a6c8be2c.jpg","star":"8","md5_file":"180b0e6bfcbdeb7c6ed63c80baa1c717","size":40.02,"sdk_version":"7","price":"0","need_gplay":"0","emulator":"1","review":"更加刺激！百人同屏竞技再掀跑酷旋风！","downurl":"http://sj.img4399.com/game_list/104/com.trans.runcool2/trans.runcool2.v95963.apk","num_download":516084,"gift_show_cli":"0","size_byte":"41964011","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/kxkp2az/kxkp2az.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"35804","appname":"僵尸前线3D","packag":"com.feelingtouch.sniperzombie","icopath":"http://f1.img4399.com/sj~35804_logo_56ab2c791bcf8.jpg","star":"8","md5_file":"b06d6c90e346a7b2d248707c3f6cf62c","size":35.94,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"突破重围消灭所有敌人，拯救被困的人们。","downurl":"http://sj.img4399.com/game_list/92/com.feelingtouch.sniperzombie/feelingtouch.sniperzombie.v95752.apk","num_download":551861,"gift_show_cli":"0","size_byte":"37685821","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/jsqx3Daz/jsqx3Daz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87756","appname":"瘟疫公司","packag":"com.easymobi.plagueinc","icopath":"http://f1.img4399.com/sj~87756_logo_56ac515f1ce43.jpg","star":"8","md5_file":"767c8677672d42857d0de7c8bbb0575f","size":28.44,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"反其道而行，通过制造病毒了解病毒的危害！","downurl":"http://sj.img4399.com/game_list/24/com.easymobi.plagueinc/easymobi.plagueinc.v95798.apk","num_download":843009,"gift_show_cli":"0","size_byte":"29821501","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/wygsaz/wygsaz1.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"91915","appname":"爆走四驱:车队争霸","packag":"com.monsterinc.mini4wd","icopath":"http://f1.img4399.com/sj~91915_logo_569dd8aa14fae.jpg","star":"7","md5_file":"8ed799ea5124779046020d7e15a9fae9","size":23.86,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"体验最刺激的四驱车游戏，和好友PK！","downurl":"http://sj.img4399.com/game_list/307/com.monsterinc.mini4wd/monsterinc.mini4wd.v94603.apk","num_download":52807,"gift_show_cli":"0","size_byte":"25019023","ppk_list":[{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160119/sjb/baozousiqu.ppk","size":110100480,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160119/sjb/baozousiqu.ppk","size":110100480,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160119/sjb/baozousiqu.ppk","size":110100480,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160119/sjb/baozousiqu.ppk","size":110100480,"md5_file":""},{"type":"0","url":"http://upfiles.3304399.net/ppk_list/20160119/sjb/baozousiqu.ppk","size":110100480,"md5_file":""}],"hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bzsqcdzbaz/bzsqqaz2.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454947200,"games":[{"id":"92116","appname":"小小枪战2(混乱大枪战手机版)","packag":"mian.fm.cs2.online.ssjj","icopath":"http://f1.img4399.com/sj~92116_logo_56a6cac5cf957.jpg","star":"8","md5_file":"6f99e368520cab44d510a2226c73d202","size":56.62,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"小小枪战经典再续，在小小平台上争做枪王。","downurl":"http://sj.img4399.com/game_list/244/mian.fm.cs2.online.ssjj/online.ssjj.v96142.apk","num_download":403526,"gift_show_cli":"0","size_byte":"59370373","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xxqzzzaz/xxqzzzaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87079","appname":"密室逃脱2","packag":"air.com.martian.RoomEscape2.ex","icopath":"http://f1.img4399.com/sj~87079_logo_55e65d88c12b7.jpg","star":"7","md5_file":"5ded93d9133b4defec66daab0d2b6728","size":32.93,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"开动脑筋解开谜题，打开密室门逃脱吧。","downurl":"http://sj.img4399.com/game_list/105/air.com.martian.RoomEscape2.ex/RoomEscape2.ex.v95843.apk","num_download":265751,"gift_show_cli":"0","size_byte":"34529607","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/mstt2az/mstt2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87369","appname":"吃豆人弹跳","packag":"eu.bandainamcoent.pacmanbounce","icopath":"http://f1.img4399.com/sj~87369_logo_56273bd8b89d8.jpg","star":"7","md5_file":"c2b8f53265d45f274fa73e640f5f13de","size":50.55,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"帮助吃豆人收集星星并获得每一关的钥匙。","downurl":"http://sj.img4399.com/game_list/192/eu.bandainamcoent.pacmanbounce/bandainamcoent.pacmanbounce.v94793.apk","num_download":29627,"gift_show_cli":"0","size_byte":"53005516","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/1002ios/cdrttt.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"40983","appname":"3D终极狂飙4","packag":"com.xiaoao.car3d4","icopath":"http://f1.img4399.com/sj~40983_logo_56b00e5d18a4f.jpg","star":"8","md5_file":"f9fd9da2cb79a777c237816e4dd12ab8","size":21.83,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"0","review":"炫酷跑车，惊险刺激，引擎轰鸣，释放激情。","downurl":"http://sj.img4399.com/game_list/304/com.xiaoao.car3d4/xiaoao.car3d4.v95927.apk","num_download":995508,"gift_show_cli":"0","size_byte":"22890414","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/3Dzjkb4az/3Dzjkb4az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454860800,"games":[{"id":"75198","appname":"大兵突击(黄金升级版)","packag":"com.skymobi.dabingtuji","icopath":"http://f1.img4399.com/sj~75198_logo_5609072ce4a02.jpg","star":"8","md5_file":"e3adde7609b8df0c378568e302d9d2d7","size":45.23,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"3","review":"炫酷武器，多种技能，助你轻松打爆敌人。","downurl":"http://sj.img4399.com/game_list/416/com.skymobi.dabingtuji/skymobi.dabingtuji.v96017.apk","num_download":475088,"gift_show_cli":"0","size_byte":"47427092","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/dbtjjaz/dbtjjaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"40243","appname":"爱养成2","packag":"cn.actcap.ayc2","icopath":"http://f1.img4399.com/sj~40243_logo_56b3fb9d4b49c.jpg","star":"8","md5_file":"6ea8125035850e5c374f8fe79948a32d","size":129.91,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"小鲜肉降临，全新奇妙结局等你来解开。","downurl":"http://sj.img4399.com/game_list/324/cn.actcap.ayc2/actcap.ayc2.v96020.apk","num_download":498183,"gift_show_cli":"0","size_byte":"136220508","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/aycc2az/aycc2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"85335","appname":"3D狂野飞车:最高通缉","packag":"com.gameley.racercop.a4399","icopath":"http://f1.img4399.com/sj~85335_logo_55dc179da3ea1.jpg","star":"7","md5_file":"920dc5dbc78bd94ec3f13c4e4eda4112","size":15.27,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"打造个性赛车，代入紧张剧情极速狂飙！","downurl":"http://sj.img4399.com/game_list/428/com.gameley.racercop.a4399/racercop.a4399.v96005.apk","num_download":560336,"gift_show_cli":"0","size_byte":"16011755","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/0724swaz/3dkyfczgtjjaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"34599","appname":"坦克战境","packag":"com.gamesofa.tank.android","icopath":"http://f1.img4399.com/sj~34599_logo_5580e4c153da1.jpg","star":"7","md5_file":"0063812dc1a8b6c1d1988b0c1ebd6d88","size":30.04,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","review":"联网与对手切磋坦克技艺，驰骋沙场。","downurl":"http://sj.img4399.com/game_list/124/com.gamesofa.tank.android/tank.android.v96118.apk","num_download":183915,"gift_show_cli":"0","size_byte":"31499223","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/tkzjjaz/tkzjjaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454774400,"games":[{"id":"87851","appname":"全民钓鱼","packag":"com.ty.fishing.sisanjiujiu","icopath":"http://f1.img4399.com/sj~87851_logo_569f46d70f8e5.jpg","star":"7","md5_file":"832c1b605eaf750e355118c0ba736267","size":76.01,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"拿起吊杆（手机）到知名钓场驯服鱼群吧！","downurl":"http://sj.img4399.com/game_list/314/com.ty.fishing.sisanjiujiu/fishing.sisanjiujiu.v96067.apk","num_download":399561,"gift_show_cli":"0","size_byte":"79702261","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/qmdyyaz/qmdyyaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"90129","appname":"TF火线狂潮","packag":"com.crazypandas.walkingdead8848tf.telecom.channel4399","icopath":"http://f1.img4399.com/sj~90129_logo_56aeb9d9c55c3.jpg","star":"7","md5_file":"8aee8ea3fb3ee697a114f35ac0405d08","size":21.14,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"3","review":"开枪吧！恐怖分子来袭，海量关卡等你挑战！","downurl":"http://sj.img4399.com/game_list/313/com.crazypandas.walkingdead8848tf.telecom.channel4399/telecom.channel4399.v95844.apk","num_download":110157,"gift_show_cli":"0","size_byte":"22166896","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/tfhxkccaz/tfhxsjjaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"83367","appname":"剑圣无双(末日回响)","packag":"com.bladehero.cdws.egame.ftnn","icopath":"http://f1.img4399.com/sj~83367_logo_56b2bda21b7e5.jpg","star":"7","md5_file":"a85f1ab8f3c98bf91ecb7ba9b15de865","size":31.14,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"传世英雄等你召唤，击杀亡灵刻不容缓。","downurl":"http://sj.img4399.com/game_list/70/com.bladehero.cdws.egame.ftnn/egame.ftnn.v96165.apk","num_download":390646,"gift_show_cli":"0","size_byte":"32652656","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/jswssaz/jswssaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"82842","appname":"城堡史诗战斗","packag":"com.blackhammer.castlecrafter","icopath":"http://f1.img4399.com/sj~82842_logo_556d55204d9d0.jpg","star":"7","md5_file":"ddc0f7b233986af9081956fff7f4bf3d","size":28.15,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"化身为英勇骑士，加入到这场城堡战斗中吧！","downurl":"http://sj.img4399.com/game_list/217/com.blackhammer.castlecrafter/blackhammer.castlecrafter.v86877.apk","num_download":459662,"gift_show_cli":"0","size_byte":"29517414","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/cbsszddios/cbsszddios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454688000,"games":[{"id":"49697","appname":"熊出没2","packag":"com.joym.xiongchumo2.xyx4399","icopath":"http://f1.img4399.com/sj~49697_logo_56ab087a5544d.jpg","star":"8","md5_file":"213f0e16f6d5a66475151fe0761131c4","size":51.48,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"三大逗趣主角齐登场，体验最前卫的跑酷。","downurl":"http://sj.img4399.com/game_list/284/com.joym.xiongchumo2.xyx4399/xiongchumo2.xyx4399.v95698.apk","num_download":1782416,"gift_show_cli":"0","size_byte":"53980692","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xcm2az/xcm2az.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"90628","appname":"3D暴力摩托2","packag":"com.xiaoao.moto3d2.m4399","icopath":"http://f1.img4399.com/sj~90628_logo_565ea7bacf4c1.jpg","star":"7","md5_file":"272e93ed854107c338c87fc8255eb178","size":23.6,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"速度竞赛惊险刺激，各大场景自由比拼。","downurl":"http://sj.img4399.com/game_list/140/com.xiaoao.moto3d2.m4399/moto3d2.m4399.v96236.apk","num_download":46901,"gift_show_cli":"0","size_byte":"24746393","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/3dblmtkybccaz/3dblmttaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92201","appname":"生化野兽","packag":"com.BattleOn.BioBeasts","icopath":"http://f1.img4399.com/sj~92201_logo_56c137778e909.jpg","star":"7","md5_file":"b7359010dfe357928f40f62fd7b3e171","size":57.34,"sdk_version":"11","price":"0","need_gplay":"0","emulator":"1","review":"逃出实验室，打败前来的机械守卫！","downurl":"http://sj.img4399.com/game_list/184/com.BattleOn.BioBeasts/BattleOn.BioBeasts.v96332.apk","num_download":17196,"gift_show_cli":"0","size_byte":"60125347","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/shysios/shysios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454601600,"games":[{"id":"92412","appname":"室友一起宅","packag":"com.weizhi.bigbrotherchina","icopath":"http://f1.img4399.com/sj~92412_logo_56b2b627864a7.jpg","star":"8","md5_file":"ecf7e7fefdb73dab754e2c823d7442be","size":29.05,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"躲避舍友的阻挠，去夺回你的冠军奖杯吧！","downurl":"http://sj.img4399.com/game_list/138/com.weizhi.bigbrotherchina/weizhi.bigbrotherchina.v96158.apk","num_download":17212,"gift_show_cli":"0","size_byte":"30461132","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/syzyqqqaz/666666666.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"51791","appname":"天天狙击2","packag":"com.cookfl.leuu.ssjj","icopath":"http://f1.img4399.com/sj~51791_logo_56839897062bf.jpg","star":"8","md5_file":"eee1e5c04553c25a2eba54a667f85ff7","size":18.54,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"挑战生化战场，横扫僵尸，拯救世界！","downurl":"http://sj.img4399.com/game_list/299/com.cookfl.leuu.ssjj/leuu.ssjj.v96636.apk","num_download":532892,"gift_show_cli":"0","size_byte":"19440599","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/ttjjj2az/ttjjj2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"91863","appname":"火柴人复仇:暗影出击","packag":"com.zonmob.RunningShadow.StickmanRevenge","icopath":"http://f1.img4399.com/sj~91863_logo_56b1ba1258e1b.jpg","star":"7","md5_file":"492f5cf9955fcd3c6b8a7ab33e3c8cc5","size":29.39,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"选择不同的火柴人角色，来一场劲爽跑酷！","downurl":"http://sj.img4399.com/game_list/84/com.zonmob.RunningShadow.StickmanRevenge/RunningShadow.StickmanRevenge.v96228.apk","num_download":23736,"gift_show_cli":"0","size_byte":"30817648","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/hcrfcaycjaz/hcrfccayyaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454515200,"games":[{"id":"92057","appname":"人在塔在传奇","packag":"cn.xr99.rztz.m4399","icopath":"http://f1.img4399.com/sj~92057_logo_56a1d8e2af198.jpg","star":"7","md5_file":"094280902cadbcee52a8ad2caa028085","size":34.17,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"组织你的英雄势力来对抗敌人，守护联盟！","downurl":"http://sj.img4399.com/game_list/12/cn.xr99.rztz.m4399/rztz.m4399.v96131.apk","num_download":35138,"gift_show_cli":"0","size_byte":"35829841","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/rztzaz/rztzz22.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87348","appname":"剑灵无双Ⅱ","packag":"com.yygame.jlws2","icopath":"http://f1.img4399.com/sj~87348_logo_56b2b10e5e764.jpg","star":"8","md5_file":"fa37c1cf57f5e3229ae7437449986b82","size":40.63,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"3","review":"双角色纯滑动激爽格斗手游，单机也炫酷！","downurl":"http://sj.img4399.com/game_list/136/com.yygame.jlws2/yygame.jlws2.v96156.apk","num_download":985693,"gift_show_cli":"0","size_byte":"42603642","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/jlws2az/jlws2az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"91371","appname":"造梦西游4手机版","packag":"org.cocos2dx.zmxy.m4399","icopath":"http://f1.img4399.com/sj~91371_logo_5681e4b5a01d0.jpg","star":"10","md5_file":"70f32505fb0444ac309f14183f8f3107","size":144.75,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"取经小队再次启程，无双必杀斩妖除魔。","downurl":"http://sj.img4399.com/game_list/200/org.cocos2dx.zmxy.m4399/zmxy.m4399.v96751.apk","num_download":1756082,"gift_show_cli":"0","size_byte":"151781376","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/zmxy4az/zmxyyy4az.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"88383","appname":"撞头赛车","packag":"com.dodreams.driveahead","icopath":"http://f1.img4399.com/sj~88383_logo_56c16b11cf73f.jpg","star":"7","md5_file":"83a63c2994b9935a870cc24d30798776","size":51.37,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"用尽一切方法伤害对方头部，获得胜利！","downurl":"http://sj.img4399.com/game_list/474/com.dodreams.driveahead/dodreams.driveahead.v96368.apk","num_download":677106,"gift_show_cli":"0","size_byte":"53865349","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/ztsccccios/ztsccccios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"90184","appname":"反恐特战队","packag":"com.xkrj.fktzd.ssjj","icopath":"http://f1.img4399.com/sj~90184_logo_564e7d1a92eab.jpg","star":"7","md5_file":"825e793c0f36c792f4712eda15238294","size":27.09,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"在枪林弹雨中击退敌人，主角命运你来主宰！","downurl":"http://sj.img4399.com/game_list/264/com.xkrj.fktzd.ssjj/fktzd.ssjj.v95462.apk","num_download":162511,"gift_show_cli":"0","size_byte":"28405923","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/fktzddaz/fktzddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454428800,"games":[{"id":"92344","appname":"星际狙击","packag":"com.wanpishu.raiderft","icopath":"http://f1.img4399.com/sj~92344_logo_56aed361d2bdb.jpg","star":"7","md5_file":"f8d296d0fc42301123b546b01c1e58cc","size":8.1,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"超战机大暴走，用子弹征服宇宙十二星座。","downurl":"http://sj.img4399.com/game_list/60/com.wanpishu.raiderft/wanpishu.raiderft.v96010.apk","num_download":18601,"gift_show_cli":"0","size_byte":"8493465","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xjjjjaz/xjjjjaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92375","appname":"割绳子:魔法","packag":"com.zeptolab.ctrm.free.NonCMCC","icopath":"http://f1.img4399.com/sj~92375_logo_56b082c6576ba.jpg","star":"8","md5_file":"27692e29dbfca2a89b21b98f22defff7","size":37.26,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","review":"经典游戏重磅回归，魔法将绽放全新魅力！","downurl":"http://sj.img4399.com/game_list/346/com.zeptolab.ctrm.free.NonCMCC/free.NonCMCC.v96028.apk","num_download":254725,"gift_show_cli":"0","size_byte":"39069941","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/gszmffaz/gszzmf.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92337","appname":"战争之王:分裂","packag":"com.feelingtouch.swat2016.telecom.x4399","icopath":"http://f1.img4399.com/sj~92337_logo_56aef1f27f45f.jpg","star":"7","md5_file":"2ac1569b2a8bf8b2ceb746b277cba9c6","size":30.8,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"冲锋陷阵的精英士兵！屹立不倒的战争之王！","downurl":"http://sj.img4399.com/game_list/326/com.feelingtouch.swat2016.telecom.x4399/telecom.x4399.v95848.apk","num_download":12820,"gift_show_cli":"0","size_byte":"32296140","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/zzzwwflaz/zzzwwwaaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454342400,"games":[{"id":"92342","appname":"X战线","packag":"com.dodosmart.xfront.m4399","icopath":"http://f1.img4399.com/sj~92342_logo_56aecc363fdfa.jpg","star":"8","md5_file":"27d38aab45cb3604d001a18fad8cb789","size":106.17,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"扮演生物机器人，击退外星侵略者拯救地球。","downurl":"http://sj.img4399.com/game_list/123/com.dodosmart.xfront.m4399/xfront.m4399.v95873.apk","num_download":13108,"gift_show_cli":"0","size_byte":"111327313","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xzxxxaz/xzxxxaz1.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"42424","appname":"鬼剑传奇","packag":"com.syt.ghostsword","icopath":"http://f1.img4399.com/sj~42424_logo_56a3145551af0.jpg","star":"7","md5_file":"8fc840ce9912cf4eb81c6040b5a9a6b3","size":13.33,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"一路斩杀所遇怪物，挑战更强大的BOSS。","downurl":"http://sj.img4399.com/game_list/280/com.syt.ghostsword/syt.ghostsword.v95045.apk","num_download":75008,"gift_show_cli":"0","size_byte":"13977518","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/gjcqqqaz/gjcqqqaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"48443","appname":"像素魂斗罗2","packag":"com.orangepixel.gunslugs2","icopath":"http://f1.img4399.com/sj~48443_logo_54d312be11e64.jpg","star":"8","md5_file":"a92059d786513821aad92a6dd98e42ac","size":16.02,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"阻止黑暗军团与外星人的计划，拯救星球。","downurl":"http://sj.img4399.com/game_list/484/com.orangepixel.gunslugs2/orangepixel.gunslugs2.v96702.apk","num_download":219212,"gift_show_cli":"0","size_byte":"16798187","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/0116ios/xshdlll222.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454256000,"games":[{"id":"89354","appname":"熊出没之3D赛车","packag":"com.forgame.BearRacing3D.cg","icopath":"http://f1.img4399.com/sj~89354_logo_56aebfbc05303.jpg","star":"8","md5_file":"803d1f1a8bdab9083933bd6d963061df","size":29.93,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"重现电影场景，跟小熊熊一起急速飞驰~","downurl":"http://sj.img4399.com/game_list/92/com.forgame.BearRacing3D.cg/BearRacing3D.cg.v95815.apk","num_download":401977,"gift_show_cli":"0","size_byte":"31383879","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xcmz3dsccaz/xcmz3dsccccaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92263","appname":"深海奇缘消消乐","packag":"cn.ultralisk.gameapp.game00","icopath":"http://f1.img4399.com/sj~92263_logo_56a9ffafc4bbf.jpg","star":"7","md5_file":"2a473eb96380ed31501baf7e90b7cfed","size":38.56,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"Boss挑战赛激烈比拼，玩家对战直指巅峰！","downurl":"http://sj.img4399.com/game_list/116/cn.ultralisk.gameapp.game00/gameapp.game00.v95605.apk","num_download":9954,"gift_show_cli":"0","size_byte":"40433090","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/shqyxxlllaz/shqyxxlllaz1.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92246","appname":"乐高忍者:天际飞行","packag":"com.lego.ninjago.skybound","icopath":"http://f1.img4399.com/sj~92246_logo_56a993841ab7a.jpg","star":"8","md5_file":"47f9d80b2928f97904bc03ab5fcae9d0","size":91.54,"sdk_version":"16","price":"0","need_gplay":"0","emulator":"3","review":"和乐高忍者一起天际飞行，勇往直前！","downurl":"http://sj.img4399.com/game_list/392/com.lego.ninjago.skybound/ninjago.skybound.v95552.apk","num_download":51352,"gift_show_cli":"0","size_byte":"95986647","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/lgrztjfxios/lgrztjfxios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"88172","appname":"巴啦啦小魔仙之奇迹舞步","packag":"com.imohoo.Parkour","icopath":"http://f1.img4399.com/sj~88172_logo_56a9db59d654f.jpg","star":"8","md5_file":"3652997041b2adc499498a0d663dcaf0","size":37.86,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"化身小魔仙，体验梦幻正义的奔跑吧。","downurl":"http://sj.img4399.com/game_list/472/com.imohoo.Parkour/imohoo.Parkour.v95609.apk","num_download":210687,"gift_show_cli":"0","size_byte":"39699087","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/01101ios/qjwb.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"49763","appname":"帝国时代:燃烧的远征","packag":"com.syt.infinitycrusade","icopath":"http://f1.img4399.com/sj~49763_logo_56ab2a9fe8761.jpg","star":"8","md5_file":"2819b3dc291ffa65c6ea506ec0fddea7","size":20.66,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"帝国的号角已吹响，率领军团踏平天下吧！","downurl":"http://sj.img4399.com/game_list/408/com.syt.infinitycrusade/syt.infinitycrusade.v95753.apk","num_download":491423,"gift_show_cli":"0","size_byte":"21663580","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/dgsdaz1/dgsdaz1.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454169600,"games":[{"id":"92086","appname":"拯救小师妹","packag":"com.threefire.happlyHammer.yx4399","icopath":"http://f1.img4399.com/sj~92086_logo_56a5ce72a96a4.jpg","star":"7","md5_file":"24d7c47f78eba67cb5c7fceb58aa2eee","size":50.86,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"发挥聪明才智，拯救青梅竹马的小师妹。","downurl":"http://sj.img4399.com/game_list/361/com.threefire.happlyHammer.yx4399/happlyHammer.yx4399.v95082.apk","num_download":11365,"gift_show_cli":"0","size_byte":"53330575","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/zjxsmmmaz/zjxsmmmaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92293","appname":"部落围城","packag":"com.ibirdgame.Watchtower.ssjj","icopath":"http://f1.img4399.com/sj~92293_logo_56ab1819348e9.jpg","star":"7","md5_file":"855e4f74817f09982dab09ca45a24e1d","size":37.3,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"作为人类最后的希望，你绝不能对僵尸手软。","downurl":"http://sj.img4399.com/game_list/71/com.ibirdgame.Watchtower.ssjj/Watchtower.ssjj.v95724.apk","num_download":11845,"gift_show_cli":"0","size_byte":"39111884","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/blwcccaz/blwcccaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87717","appname":"石器冒险岛","packag":"com.bldgame.stone","icopath":"http://f1.img4399.com/sj~87717_logo_5699b58edbdc4.jpg","star":"7","md5_file":"dee35914d3afd27d3098ad40de77dec4","size":60.14,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"三消+战斗！遥远的神秘之岛等你来征服！","downurl":"http://sj.img4399.com/game_list/300/com.bldgame.stone/bldgame.stone.v95952.apk","num_download":24342,"gift_show_cli":"0","size_byte":"63061360","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/0919az/shmxddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1454083200,"games":[{"id":"92266","appname":"DuangDuang兔","packag":"com.you2game.duangduangtu.ssjj","icopath":"http://f1.img4399.com/sj~92266_logo_56a9dbeea6473.jpg","star":"8","md5_file":"923ba35aa55a7e7b6d6c0d0868a30cc1","size":13.02,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"让可爱的小兔子在跳跃中谱写美妙的乐章！","downurl":"http://sj.img4399.com/game_list/352/com.you2game.duangduangtu.ssjj/duangduangtu.ssjj.v95610.apk","num_download":21463,"gift_show_cli":"0","size_byte":"13652459","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/duangdtttaz/111111.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92256","appname":"全明星机战","packag":"com.qmxjz","icopath":"http://f1.img4399.com/sj~92256_logo_56a9f63423f3d.jpg","star":"7","md5_file":"41bcb5d49d2ab35f9d8606d1e6e84491","size":21.26,"sdk_version":"11","price":"0","need_gplay":"0","emulator":"1","review":"明星专属战机任你挑选，战争一触即发！","downurl":"http://sj.img4399.com/game_list/260/com.qmxjz/com.qmxjz.v95595.apk","num_download":7207,"gift_show_cli":"0","size_byte":"22292725","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/qmxzjjjaz/qmxjzzzaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92218","appname":"熊小米泡泡大战","packag":"com.xiongxm.dy","icopath":"http://f1.img4399.com/sj~92218_logo_56a879a8a5f46.jpg","star":"7","md5_file":"737afc0d7457f1dee7388fa149e9da9d","size":22.6,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"与熊小米和它的朋友们一同踏上冒险之旅。","downurl":"http://sj.img4399.com/game_list/361/com.xiongxm.dy/xiongxm.dy.v95473.apk","num_download":6210,"gift_show_cli":"0","size_byte":"23697817","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xxmppdzzaz/xxmppdzzaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92262","appname":"功夫酷跑","packag":"com.daqu.gfparkour.yx4399","icopath":"http://f1.img4399.com/sj~92262_logo_56a9f2f00a8b7.jpg","star":"7","md5_file":"fcd912ee0893e8366a65187ab58ee60b","size":32.23,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"与熊猫大师一起共闯江湖，尽情奔跑吧！","downurl":"http://sj.img4399.com/game_list/146/com.daqu.gfparkour.yx4399/gfparkour.yx4399.v95603.apk","num_download":12265,"gift_show_cli":"0","size_byte":"33795604","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/gfkpppaz/gfkppppaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92294","appname":"滚动的天空","packag":"com.turbochilli.rollingsky","icopath":"http://f1.img4399.com/sj~92294_logo_56ab18eb9b3b5.jpg","star":"7","md5_file":"959e6eb5ee193233b879ef0ecb7742e8","size":39.08,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"在丰富多彩的世界完成刺激的挑战任务吧！","downurl":"http://sj.img4399.com/game_list/165/com.turbochilli.rollingsky/turbochilli.rollingsky.v95725.apk","num_download":27906,"gift_show_cli":"0","size_byte":"40978350","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/gddtkkkaz/gddtkkkaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1453996800,"games":[{"id":"92260","appname":"虐杀原型revive","packag":"com.shgm.shoot.m","icopath":"http://f1.img4399.com/sj~92260_logo_56a9f9dfa4a36.jpg","star":"7","md5_file":"b4aa715cfad68a5c6cbad33a63356a36","size":36.89,"sdk_version":"10","price":"0","need_gplay":"0","emulator":"1","review":"真枪战，不装X，用暴力将敌人化为灰烬！","downurl":"http://sj.img4399.com/game_list/45/com.shgm.shoot.m/shoot.m.v95601.apk","num_download":41571,"gift_show_cli":"0","size_byte":"38681968","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/nxyxxxaz/nsyxxxaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"87347","appname":"古川三国志","packag":"com.gcgame.sanguo","icopath":"http://f1.img4399.com/sj~87347_logo_5643ee014ab70.jpg","star":"7","md5_file":"bc494869a7b2bd008766d1b3c505d630","size":32.35,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"0","review":"告别无脑卡牌，感受指尖微操的畅快体验！","downurl":"http://sj.img4399.com/game_list/328/com.gcgame.sanguo/gcgame.sanguo.v95636.apk","num_download":75824,"gift_show_cli":"0","size_byte":"33921433","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/0911ios/gcsgz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92259","appname":"闪亮的爸爸","packag":"com.appleseed.CharmingDaddy.a4399","icopath":"http://f1.img4399.com/sj~92259_logo_56a9f985edc07.jpg","star":"7","md5_file":"69c7704da2772c9d6ec9069318256d73","size":25.46,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"与明星爸爸以及明星宝贝一起战斗和冒险吧！","downurl":"http://sj.img4399.com/game_list/140/com.appleseed.CharmingDaddy.a4399/CharmingDaddy.a4399.v95600.apk","num_download":6949,"gift_show_cli":"0","size_byte":"26696744","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/sldbbbaz/sldbbbbaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92269","appname":"奔跑吧葫芦兄弟","packag":"com.youmeng.huluwa.ssjj","icopath":"http://f1.img4399.com/sj~92269_logo_56a9f4733c5b6.jpg","star":"7","md5_file":"d87a398a9a9f25f0d95693f71b60d960","size":24.7,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"7大专属技能，葫芦娃助你开启跑酷之旅！","downurl":"http://sj.img4399.com/game_list/288/com.youmeng.huluwa.ssjj/huluwa.ssjj.v95614.apk","num_download":33954,"gift_show_cli":"0","size_byte":"25899827","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bpbhlxdddaz/bpbhlxddddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]},{"day":1453910400,"games":[{"id":"92221","appname":"呆萌小怪物","packag":"com.Lwan.BestFiends.m4399","icopath":"http://f1.img4399.com/sj~92221_logo_56b01a1976bab.jpg","star":"8","md5_file":"3be679e6450eeed8d7e3d467fc1586b5","size":66.68,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"打造战无不胜的队伍，征服米努西亚！","downurl":"http://sj.img4399.com/game_list/312/com.Lwan.BestFiends.m4399/BestFiends.m4399.v96237.apk","num_download":19800,"gift_show_cli":"0","size_byte":"69919047","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/dmxgwwaz/dmxgwwaz.mp4","specialRec":1,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"91617","appname":"爆枪突击","packag":"com.duobao.baoqiang","icopath":"http://f1.img4399.com/sj~91617_logo_568e1ca2756bd.jpg","star":"7","md5_file":"21cf83f1a2e7ad69cada6e6d64afbc14","size":83.08,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"无体力限制真枪战，一起来畅快击杀僵尸！","downurl":"http://sj.img4399.com/game_list/217/com.duobao.baoqiang/duobao.baoqiang.v96810.apk","num_download":193475,"gift_show_cli":"0","size_byte":"87115694","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bqtjaz/bqtjaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92222","appname":"指上弹兵","packag":"com.tk.yyw.zstb.m4399","icopath":"http://f1.img4399.com/sj~92222_logo_56a87b579f489.jpg","star":"7","md5_file":"288107c2acd4c95438268284d89466bc","size":169.07,"sdk_version":"14","price":"0","need_gplay":"0","emulator":"1","review":"穿越回到三国体验畅快淋漓的肉弹撞击吧！","downurl":"http://sj.img4399.com/game_list/211/com.tk.yyw.zstb.m4399/zstb.m4399.v95480.apk","num_download":3667,"gift_show_cli":"0","size_byte":"177282744","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/zstbbbaz/zstbbbaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92233","appname":"星战机甲","packag":"com.moyoo.powersuit","icopath":"http://f1.img4399.com/sj~92233_logo_56a988fb996de.jpg","star":"7","md5_file":"2ce0efa07ab3f42417f8565b420189cd","size":42.61,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"无尽圣战，不止不休！用热血收复家园！","downurl":"http://sj.img4399.com/game_list/215/com.moyoo.powersuit/moyoo.powersuit.v95498.apk","num_download":17363,"gift_show_cli":"0","size_byte":"44679823","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/xzjjjaz/xzjjjaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"46977","appname":"城市飞车","packag":"com.racergame.cityracing3d","icopath":"http://f1.img4399.com/sj~46977_logo_567bbd278c6d1.jpg","star":"8","md5_file":"9c3033bdd87875928b0aacd35918c95c","size":41.05,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"3","review":"疯狂赛车正式开始，快来战胜所有的对手！","downurl":"http://sj.img4399.com/game_list/36/com.racergame.cityracing3d/racergame.cityracing3d.v95472.apk","num_download":815756,"gift_show_cli":"0","size_byte":"43044044","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/csfcaz/csfcaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]}],"gallary":[{"title":"","img":"http://f1.img4399.com/ma~39_20160214102634_56bfe5da2eea6.jpeg","ext":{"id":86098},"type":6},{"title":"","img":"http://f1.img4399.com/ma~39_20160214102716_56bfe604b33db.jpeg","ext":{"id":91445},"type":6},{"title":"","img":"http://f1.img4399.com/ma~39_20160214105750_56bfed2edbee4.jpeg","ext":{"id":92163},"type":6}],"links":[{"type":3,"name":"全部新游","icon":"http://f1.img4399.com/ma~30_20150915173552_55f7e678b36eb.png"},{"type":1,"name":"新游活动","icon":"http://f03.img4399.com/ma~30_20141212141519_548a87f75d34c.png"},{"type":2,"name":"新游开测","icon":"http://f01.img4399.com/ma~30_20141212141524_548a87fc65f3d.png"}]}
     * message :
     */

    private int code;
    private ResultEntity result;
    private String message;

    public static NewGame objectFromData(String str) {

        return new Gson().fromJson(str, NewGame.class);
    }

    public static NewGame objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), NewGame.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<NewGame> arrayNewGameFromData(String str) {

        Type listType = new TypeToken<ArrayList<NewGame>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<NewGame> arrayNewGameFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<NewGame>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

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
         * day : 1456070400
         * games : [{"id":"92432","appname":"欢乐途游斗地主(支持单机)","packag":"com.doudizhu.mainhuanle.m4399","icopath":"http://f1.img4399.com/sj~92432_logo_56ca658f744db.jpg","star":"7","md5_file":"d438e997634c1a9a2a39eb3dba52e312","size":22.67,"sdk_version":"8","price":"0","need_gplay":"0","emulator":"1","review":"最流行的斗地主玩法，万人PK，赢取奖励。","downurl":"http://sj.img4399.com/game_list/164/com.doudizhu.mainhuanle.m4399/mainhuanle.m4399.v96213.apk","num_download":264655,"gift_show_cli":"0","size_byte":"23771217","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/hllyddzzzaz/ddzzzzaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92645","appname":"暴走老精灵","packag":"com.chillingo.gekiyabarunner.android.gplay","icopath":"http://f1.img4399.com/sj~92645_logo_56c94dac99b4e.jpg","star":"7","md5_file":"e964c6ecb3ba53cfacb229e8fe2cbc3b","size":92.2,"sdk_version":"15","price":"0","need_gplay":"0","emulator":"1","review":"收集袜子，拯救公主，展开大冒险！","downurl":"http://sj.img4399.com/game_list/80/com.chillingo.gekiyabarunner.android.gplay/android.gplay.v96874.apk","num_download":1958,"gift_show_cli":"0","size_byte":"96678707","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/bzljlios/bzljlios.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"},{"id":"92002","appname":"吞食天地:三国演义","packag":"com.sinyuee.kingwar","icopath":"http://f1.img4399.com/sj~92002_logo_56a08dced0ef4.jpg","star":"7","md5_file":"0a11f36947af2ad193d13022a555c48f","size":22.33,"sdk_version":"9","price":"0","need_gplay":"0","emulator":"1","review":"爆笑对白吐槽三国，多维对战重写三国。","downurl":"http://sj.img4399.com/game_list/120/com.sinyuee.kingwar/sinyuee.kingwar.v96780.apk","num_download":105282,"gift_show_cli":"0","size_byte":"23414702","hasGift":0,"icon_tag":0,"video_url":"http://sj.video.5054399.com/sjyx/tstdsgyyyaz/tstdddaz.mp4","specialRec":0,"statFlag":"position%3D25%26tid%3D0%26idx%3D0%26pos%3D"}]
         */

        private List<DataEntity> data;
        /**
         * title :
         * img : http://f1.img4399.com/ma~39_20160214102634_56bfe5da2eea6.jpeg
         * ext : {"id":86098}
         * type : 6
         */

        private List<GallaryEntity> gallary;
        /**
         * type : 3
         * name : 全部新游
         * icon : http://f1.img4399.com/ma~30_20150915173552_55f7e678b36eb.png
         */

        private List<LinksEntity> links;

        public static ResultEntity objectFromData(String str) {

            return new Gson().fromJson(str, ResultEntity.class);
        }

        public static ResultEntity objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResultEntity.class);
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

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public void setData(List<DataEntity> data) {
            this.data = data;
        }

        public void setGallary(List<GallaryEntity> gallary) {
            this.gallary = gallary;
        }

        public void setLinks(List<LinksEntity> links) {
            this.links = links;
        }

        public List<DataEntity> getData() {
            return data;
        }

        public List<GallaryEntity> getGallary() {
            return gallary;
        }

        public List<LinksEntity> getLinks() {
            return links;
        }

        public static class DataEntity {
            private int day;
            /**
             * id : 92432
             * appname : 欢乐途游斗地主(支持单机)
             * packag : com.doudizhu.mainhuanle.m4399
             * icopath : http://f1.img4399.com/sj~92432_logo_56ca658f744db.jpg
             * star : 7
             * md5_file : d438e997634c1a9a2a39eb3dba52e312
             * size : 22.67
             * sdk_version : 8
             * price : 0
             * need_gplay : 0
             * emulator : 1
             * review : 最流行的斗地主玩法，万人PK，赢取奖励。
             * downurl : http://sj.img4399.com/game_list/164/com.doudizhu.mainhuanle.m4399/mainhuanle.m4399.v96213.apk
             * num_download : 264655
             * gift_show_cli : 0
             * size_byte : 23771217
             * hasGift : 0
             * icon_tag : 0
             * video_url : http://sj.video.5054399.com/sjyx/hllyddzzzaz/ddzzzzaz.mp4
             * specialRec : 0
             * statFlag : position%3D25%26tid%3D0%26idx%3D0%26pos%3D
             */

            private List<GamesEntity> games;

            public static DataEntity objectFromData(String str) {

                return new Gson().fromJson(str, DataEntity.class);
            }

            public static DataEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), DataEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<DataEntity> arrayDataEntityFromData(String str) {

                Type listType = new TypeToken<ArrayList<DataEntity>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<DataEntity> arrayDataEntityFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<DataEntity>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public void setDay(int day) {
                this.day = day;
            }

            public void setGames(List<GamesEntity> games) {
                this.games = games;
            }

            public int getDay() {
                return day;
            }

            public List<GamesEntity> getGames() {
                return games;
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
                private String review;
                private String downurl;
                private int num_download;
                private String gift_show_cli;
                private String size_byte;
                private int hasGift;
                private int icon_tag;
                private String video_url;
                private int specialRec;
                private String statFlag;

                public static GamesEntity objectFromData(String str) {

                    return new Gson().fromJson(str, GamesEntity.class);
                }

                public static GamesEntity objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), GamesEntity.class);
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

                        return new Gson().fromJson(jsonObject.getString(str), listType);

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

                public void setVideo_url(String video_url) {
                    this.video_url = video_url;
                }

                public void setSpecialRec(int specialRec) {
                    this.specialRec = specialRec;
                }

                public void setStatFlag(String statFlag) {
                    this.statFlag = statFlag;
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

                public String getVideo_url() {
                    return video_url;
                }

                public int getSpecialRec() {
                    return specialRec;
                }

                public String getStatFlag() {
                    return statFlag;
                }
            }
        }

        public static class GallaryEntity {
            private String title;
            private String img;
            /**
             * id : 86098
             */

            private ExtEntity ext;
            private int type;

            public static GallaryEntity objectFromData(String str) {

                return new Gson().fromJson(str, GallaryEntity.class);
            }

            public static GallaryEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), GallaryEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<GallaryEntity> arrayGallaryEntityFromData(String str) {

                Type listType = new TypeToken<ArrayList<GallaryEntity>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<GallaryEntity> arrayGallaryEntityFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<GallaryEntity>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public void setExt(ExtEntity ext) {
                this.ext = ext;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public String getImg() {
                return img;
            }

            public ExtEntity getExt() {
                return ext;
            }

            public int getType() {
                return type;
            }

            public static class ExtEntity {
                private int id;

                public static ExtEntity objectFromData(String str) {

                    return new Gson().fromJson(str, ExtEntity.class);
                }

                public static ExtEntity objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), ExtEntity.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<ExtEntity> arrayExtEntityFromData(String str) {

                    Type listType = new TypeToken<ArrayList<ExtEntity>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<ExtEntity> arrayExtEntityFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<ExtEntity>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getId() {
                    return id;
                }
            }
        }

        public static class LinksEntity {
            private int type;
            private String name;
            private String icon;

            public static LinksEntity objectFromData(String str) {

                return new Gson().fromJson(str, LinksEntity.class);
            }

            public static LinksEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), LinksEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<LinksEntity> arrayLinksEntityFromData(String str) {

                Type listType = new TypeToken<ArrayList<LinksEntity>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<LinksEntity> arrayLinksEntityFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<LinksEntity>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public void setType(int type) {
                this.type = type;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getType() {
                return type;
            }

            public String getName() {
                return name;
            }

            public String getIcon() {
                return icon;
            }
        }
    }
}
