package com.sterbensq.myblog.dao;

public class Base_Image {
    public Integer id;
    public String imagename;
    public String path;
    public String publishtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    @Override
    public String toString() {
        return "Base_Image{" +
                "id=" + id +
                ", imagename='" + imagename + '\'' +
                ", path='" + path + '\'' +
                ", publishtime='" + publishtime + '\'' +
                '}';
    }
}
