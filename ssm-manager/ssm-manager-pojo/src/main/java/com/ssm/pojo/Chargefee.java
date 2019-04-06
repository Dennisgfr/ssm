package com.ssm.pojo;

import java.util.Date;

public class Chargefee {
    private Integer feeId;

    private String feeCode;

    private String feeType;

    private Long price;

    private Long payment;

    private Long factpayment;

    private Long notpayment;

    private Long remaining;

    private Date currentdate;

    private String handle;

    private Date beforedate;

    public Integer getFeeId() {
        return feeId;
    }

    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode == null ? null : feeCode.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Long getFactpayment() {
        return factpayment;
    }

    public void setFactpayment(Long factpayment) {
        this.factpayment = factpayment;
    }

    public Long getNotpayment() {
        return notpayment;
    }

    public void setNotpayment(Long notpayment) {
        this.notpayment = notpayment;
    }

    public Long getRemaining() {
        return remaining;
    }

    public void setRemaining(Long remaining) {
        this.remaining = remaining;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    public Date getBeforedate() {
        return beforedate;
    }

    public void setBeforedate(Date beforedate) {
        this.beforedate = beforedate;
    }
}