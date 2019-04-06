package com.ssm.pojo;

import java.util.Date;

public class Building {
    private Integer buildingId;

    private String buildingName;

    private Date buildingDatetime;

    private Integer buildingLayer;

    private Float buidlingArea;

    private String buildingCode;

    private String buildingMemo;

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public Date getBuildingDatetime() {
        return buildingDatetime;
    }

    public void setBuildingDatetime(Date buildingDatetime) {
        this.buildingDatetime = buildingDatetime;
    }

    public Integer getBuildingLayer() {
        return buildingLayer;
    }

    public void setBuildingLayer(Integer buildingLayer) {
        this.buildingLayer = buildingLayer;
    }

    public Float getBuidlingArea() {
        return buidlingArea;
    }

    public void setBuidlingArea(Float buidlingArea) {
        this.buidlingArea = buidlingArea;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode == null ? null : buildingCode.trim();
    }

    public String getBuildingMemo() {
        return buildingMemo;
    }

    public void setBuildingMemo(String buildingMemo) {
        this.buildingMemo = buildingMemo == null ? null : buildingMemo.trim();
    }
}