package com.cnmar.benxiao_mvp.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.RadioButton;

import com.cnmar.benxiao.widget.BottomView;
import com.cnmar.benxiao.widget.HeadView;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Administrator on 2016/9/6.
 */
public class UniversalHelper {
    public static final long Refresh_Lasting_Time = 400;//刷新进度条显示的时长
    public static final long Max_Num_Per_Page = 10;//每页最多显示的条数

    public static String getToken(String url) {
        String token = url.replaceAll("http://192.168.1.112:8092/", "");
        if (token.indexOf("/") == 0) {
            token = token.substring(1, token.length());
        }
        if (token.indexOf("/") != -1) {
            token = token.substring(0, token.indexOf("/"));
        }
        if (token.indexOf("?") != -1) {
            token = token.substring(0, token.indexOf("?"));
        }
        try {
            token = md5Encode(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }

    public static String md5Encode(String inStr) throws Exception {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    /**
     * 处理刷新的初始化
     */
    public static void initRefresh(Context context, TwinklingRefreshLayout refreshLayout) {
//        设置刷新头部
        HeadView headerView = new HeadView(context);
        refreshLayout.setHeaderView(headerView);
//        设置刷新尾部
        BottomView loadingView = new BottomView(context);
        refreshLayout.setBottomView(loadingView);
        refreshLayout.setOverScrollRefreshShow(false);//不允许越界时显示刷新控件
//        refreshLayout.setAutoLoadMore(true);//在底部越界的时候自动切换到加载更多模式
    }

    /**
     * 从Date中得到字符串数据
     */
    public static String getDateString(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dateString = sdf.format(date);
        return dateString;
    }

    /**
     * 设置单选按钮的图标
     */
    public static void setRadioGroupIcon(Context context, RadioButton[] rbs, int[] ids) {
        List<Drawable> drawables=new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            drawables.add(context.getResources().getDrawable(ids[i]));
            drawables.get(i).setBounds(0, 15, 70, 85);//第一0是距左边距离，第二15是距上边距离，长宽为70
            //                动态设置单选按钮文本上下左右的图片
            rbs[i].setCompoundDrawables(null, drawables.get(i), null, null);//只放上边
        }
    }
}
