package com.example.gf.pojo;

import java.util.Date;

public class VOption {
    private Long id;

    private Integer optcontent;

    private Long vote;

    private Long sid;

    private Date createDate;

    private Date updataDate;

    public VOption(Long id, Integer optcontent, Long vote, Long sid, Date createDate, Date updataDate) {
        this.id = id;
        this.optcontent = optcontent;
        this.vote = vote;
        this.sid = sid;
        this.createDate = createDate;
        this.updataDate = updataDate;
    }

    public VOption() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOptcontent() {
        return optcontent;
    }

    public void setOptcontent(Integer optcontent) {
        this.optcontent = optcontent;
    }

    public Long getVote() {
        return vote;
    }

    public void setVote(Long vote) {
        this.vote = vote;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
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