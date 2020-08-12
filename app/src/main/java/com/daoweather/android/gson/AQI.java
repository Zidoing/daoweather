package com.daoweather.android.gson;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 2020/8/12
 * Time: 14:56
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }

}