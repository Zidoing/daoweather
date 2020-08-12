package com.daoweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 2020/8/12
 * Time: 13:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}