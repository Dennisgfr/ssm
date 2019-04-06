package com.ssm.pojo;

import java.util.Date;

public class Parkinfo {
    private Integer parkId;

    private String parkCode;

    private String parkLoc;

    private String carId;

    private String carType;

    private Date parkStime;

    private Date parkEtime;

    private String carColor;

    private String customerCode;

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode == null ? null : parkCode.trim();
    }

    public String getParkLoc() {
        return parkLoc;
    }

    public void setParkLoc(String parkLoc) {
        this.parkLoc = parkLoc == null ? null : parkLoc.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public Date getParkStime() {
        return parkStime;
    }

    public void setParkStime(Date parkStime) {
        this.parkStime = parkStime;
    }

    public Date getParkEtime() {
        return parkEtime;
    }

    public void setParkEtime(Date parkEtime) {
        this.parkEtime = parkEtime;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor == null ? null : carColor.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }
}