package com.sterbensq.myblog.dao;

public class Base_Message {
    public int id;
    public char enable;
    public int blogid;
    public int userid;
    public String content;
    public String publishtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getEnable() {
        return enable;
    }

    public void setEnable(char enable) {
        this.enable = enable;
    }

    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    @Override
    public String toString() {
        return "Base_Message{" +
                "id=" + id +
                ", enable=" + enable +
                ", blogid=" + blogid +
                ", userid=" + userid +
                ", content='" + content + '\'' +
                ", publishtime='" + publishtime + '\'' +
                '}';
    }
}
