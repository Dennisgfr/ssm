package com.ssm.pojo;

public class Admin {
    private Integer adminid;

    private String adminName;

    private String adminSex;

    private Integer adminAge;

    private String adminPhone;

    private String adminWx;

    private String adminAddr;

    private String adminJob;

    private String adminCardid;

    private String adminPhoto;

    private String adminMemo;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex == null ? null : adminSex.trim();
    }

    public Integer getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(Integer adminAge) {
        this.adminAge = adminAge;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminWx() {
        return adminWx;
    }

    public void setAdminWx(String adminWx) {
        this.adminWx = adminWx == null ? null : adminWx.trim();
    }

    public String getAdminAddr() {
        return adminAddr;
    }

    public void setAdminAddr(String adminAddr) {
        this.adminAddr = adminAddr == null ? null : adminAddr.trim();
    }

    public String getAdminJob() {
        return adminJob;
    }

    public void setAdminJob(String adminJob) {
        this.adminJob = adminJob == null ? null : adminJob.trim();
    }

    public String getAdminCardid() {
        return adminCardid;
    }

    public void setAdminCardid(String adminCardid) {
        this.adminCardid = adminCardid == null ? null : adminCardid.trim();
    }

    public String getAdminPhoto() {
        return adminPhoto;
    }

    public void setAdminPhoto(String adminPhoto) {
        this.adminPhoto = adminPhoto == null ? null : adminPhoto.trim();
    }

    public String getAdminMemo() {
        return adminMemo;
    }

    public void setAdminMemo(String adminMemo) {
        this.adminMemo = adminMemo == null ? null : adminMemo.trim();
    }
}