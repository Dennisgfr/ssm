package com.ssm.pojo;

import java.util.Date;

public class Facility {
    private Integer facilityId;

    private String facilityName;

    private Integer facilityAmount;

    private String facilityFactory;

    private Date facilityMdate;

    private Date facilityPdate;

    private String facilityCode;

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName == null ? null : facilityName.trim();
    }

    public Integer getFacilityAmount() {
        return facilityAmount;
    }

    public void setFacilityAmount(Integer facilityAmount) {
        this.facilityAmount = facilityAmount;
    }

    public String getFacilityFactory() {
        return facilityFactory;
    }

    public void setFacilityFactory(String facilityFactory) {
        this.facilityFactory = facilityFactory == null ? null : facilityFactory.trim();
    }

    public Date getFacilityMdate() {
        return facilityMdate;
    }

    public void setFacilityMdate(Date facilityMdate) {
        this.facilityMdate = facilityMdate;
    }

    public Date getFacilityPdate() {
        return facilityPdate;
    }

    public void setFacilityPdate(Date facilityPdate) {
        this.facilityPdate = facilityPdate;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode == null ? null : facilityCode.trim();
    }
}