package com.ssm.pojo;

import java.util.Date;

public class Area {
    private Integer areaId;

    private String areaName;

    private Date areaBuildtime;

    private String areaAddr;

    private Float areaSize;

    private String areaMainhead;

    private Integer areaAmount;

    private Float areaParking;

    private Float areaGreen;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Date getAreaBuildtime() {
        return areaBuildtime;
    }

    public void setAreaBuildtime(Date areaBuildtime) {
        this.areaBuildtime = areaBuildtime;
    }

    public String getAreaAddr() {
        return areaAddr;
    }

    public void setAreaAddr(String areaAddr) {
        this.areaAddr = areaAddr == null ? null : areaAddr.trim();
    }

    public Float getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(Float areaSize) {
        this.areaSize = areaSize;
    }

    public String getAreaMainhead() {
        return areaMainhead;
    }

    public void setAreaMainhead(String areaMainhead) {
        this.areaMainhead = areaMainhead == null ? null : areaMainhead.trim();
    }

    public Integer getAreaAmount() {
        return areaAmount;
    }

    public void setAreaAmount(Integer areaAmount) {
        this.areaAmount = areaAmount;
    }

    public Float getAreaParking() {
        return areaParking;
    }

    public void setAreaParking(Float areaParking) {
        this.areaParking = areaParking;
    }

    public Float getAreaGreen() {
        return areaGreen;
    }

    public void setAreaGreen(Float areaGreen) {
        this.areaGreen = areaGreen;
    }
}