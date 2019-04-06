package com.ssm.pojo;

import java.util.Date;

public class Repair {
    private Integer repairId;

    private String repairTitle;

    private Date repairDate;

    private String repairStatus;

    private String repairOffice;

    private String repairDesc;

    private String repairMainhead;

    private String mainheadtel;

    private String repairTel;

    private String repairFacility;

    private String repairFeedback;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public String getRepairTitle() {
        return repairTitle;
    }

    public void setRepairTitle(String repairTitle) {
        this.repairTitle = repairTitle == null ? null : repairTitle.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus == null ? null : repairStatus.trim();
    }

    public String getRepairOffice() {
        return repairOffice;
    }

    public void setRepairOffice(String repairOffice) {
        this.repairOffice = repairOffice == null ? null : repairOffice.trim();
    }

    public String getRepairDesc() {
        return repairDesc;
    }

    public void setRepairDesc(String repairDesc) {
        this.repairDesc = repairDesc == null ? null : repairDesc.trim();
    }

    public String getRepairMainhead() {
        return repairMainhead;
    }

    public void setRepairMainhead(String repairMainhead) {
        this.repairMainhead = repairMainhead == null ? null : repairMainhead.trim();
    }

    public String getMainheadtel() {
        return mainheadtel;
    }

    public void setMainheadtel(String mainheadtel) {
        this.mainheadtel = mainheadtel == null ? null : mainheadtel.trim();
    }

    public String getRepairTel() {
        return repairTel;
    }

    public void setRepairTel(String repairTel) {
        this.repairTel = repairTel == null ? null : repairTel.trim();
    }

    public String getRepairFacility() {
        return repairFacility;
    }

    public void setRepairFacility(String repairFacility) {
        this.repairFacility = repairFacility == null ? null : repairFacility.trim();
    }

    public String getRepairFeedback() {
        return repairFeedback;
    }

    public void setRepairFeedback(String repairFeedback) {
        this.repairFeedback = repairFeedback == null ? null : repairFeedback.trim();
    }
}