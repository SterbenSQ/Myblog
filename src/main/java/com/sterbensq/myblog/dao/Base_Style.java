package com.sterbensq.myblog.dao;

public class Base_Style {
    public Integer id;
    public String stylename;
    public Base_Style fatherstyle;
    public Integer stylelevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public Base_Style getFatherstyle() {
        return fatherstyle;
    }

    public void setFatherstyle(Base_Style fatherstyle) {
        this.fatherstyle = fatherstyle;
    }

    public Integer getStylelevel() {
        return stylelevel;
    }

    public void setStylelevel(Integer stylelevel) {
        this.stylelevel = stylelevel;
    }

    @Override
    public String toString() {
        return "Base_Style{" +
                "id=" + id +
                ", stylename='" + stylename + '\'' +
                ", fatherstyle=" + fatherstyle +
                ", stylelevel=" + stylelevel +
                '}';
    }
}
