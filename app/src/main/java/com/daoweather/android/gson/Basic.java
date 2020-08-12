package com.daoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 2020/8/12
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}