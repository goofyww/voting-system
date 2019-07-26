package com.example.gf.pojo;

import java.util.Date;

public class VSubject {
    private Long id;

    private String title;

    private Long totalVotes;

    private Long viewTimes;

    private Date createDate;

    private Date updataDate;

    public VSubject(Long id, String title, Long totalVotes, Long viewTimes, Date createDate, Date updataDate) {
        this.id = id;
        this.title = title;
        this.totalVotes = totalVotes;
        this.viewTimes = viewTimes;
        this.createDate = createDate;
        this.updataDate = updataDate;
    }

    public VSubject() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Long totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Long getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(Long viewTimes) {
        this.viewTimes = viewTimes;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdataDate() {
        return updataDate;
    }

    public void setUpdataDate(Date updataDate) {
        this.updataDate = updataDate;
    }
}