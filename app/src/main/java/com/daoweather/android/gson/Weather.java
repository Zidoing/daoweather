package com.daoweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 2020/8/12
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List <Forecast> forecastList;
}