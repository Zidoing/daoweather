package com.daoweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 2020/8/12
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}