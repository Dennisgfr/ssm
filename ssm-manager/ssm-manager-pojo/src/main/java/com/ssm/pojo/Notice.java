package com.ssm.pojo;

import java.util.Date;

public class Notice {
    private Integer noticeId;

    private String noticeTitle;

    private Date noticeDate;

    private String noticePerson;

    private String noticeText;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getNoticePerson() {
        return noticePerson;
    }

    public void setNoticePerson(String noticePerson) {
        this.noticePerson = noticePerson == null ? null : noticePerson.trim();
    }

    public String getNoticeText() {
        return noticeText;
    }

    public void setNoticeText(String noticeText) {
        this.noticeText = noticeText == null ? null : noticeText.trim();
    }
}