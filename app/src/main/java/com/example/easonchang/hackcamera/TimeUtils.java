package com.example.easonchang.hackcamera;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by EasonChang on 2018/5/31.
 */

public class TimeUtils {
    public static  String getNowTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = formatter.format(new Date());
        return time.substring(10,time.length());
    }
}
