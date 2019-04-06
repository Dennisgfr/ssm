package com.ssm.pojo;

public class AreaWithBLOBs extends Area {
    private String areaInfo;

    private String areaMemo;

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    public String getAreaMemo() {
        return areaMemo;
    }

    public void setAreaMemo(String areaMemo) {
        this.areaMemo = areaMemo == null ? null : areaMemo.trim();
    }
}