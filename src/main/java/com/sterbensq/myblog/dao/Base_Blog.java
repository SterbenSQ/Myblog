package com.sterbensq.myblog.dao;

public class Base_Blog {
    public int id;
    public String content;
    public String publishtime;
    public String classify;
    public String browsetimes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getBrowsetimes() {
        return browsetimes;
    }

    public void setBrowsetimes(String browsetimes) {
        this.browsetimes = browsetimes;
    }

    @Override
    public String toString() {
        return "Base_Blog{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", publishtime='" + publishtime + '\'' +
                ", classify='" + classify + '\'' +
                ", browsetimes='" + browsetimes + '\'' +
                '}';
    }
}
