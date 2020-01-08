package com.yk.pojo;

import java.io.Serializable;

public class Class implements Serializable{
    private Integer id;

    private String name;

    private String lb;

    private String ks;

    private String ls;

    private String img;

    private String date;

    private String falg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb == null ? null : lb.trim();
    }

    public String getKs() {
        return ks;
    }

    public void setKs(String ks) {
        this.ks = ks == null ? null : ks.trim();
    }

    public String getLs() {
        return ls;
    }

    public void setLs(String ls) {
        this.ls = ls == null ? null : ls.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getFalg() {
        return falg;
    }

    public void setFalg(String falg) {
        this.falg = falg == null ? null : falg.trim();
    }
}