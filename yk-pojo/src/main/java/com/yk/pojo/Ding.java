package com.yk.pojo;

import java.io.Serializable;
import java.util.Date;

public class Ding implements Serializable{
    private Integer cid;

    private Integer id;

    private String jin;

    private String name;

    private Date date;

    private String falg;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJin() {
        return jin;
    }

    public void setJin(String jin) {
        this.jin = jin == null ? null : jin.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFalg() {
        return falg;
    }

    public void setFalg(String falg) {
        this.falg = falg == null ? null : falg.trim();
    }
}