package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "natice")
public class Natice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String title;

    private String announcement;

    private Integer createid;

    private String createname;

    @Column(name = "isActive")
    private String isactive;

    private String createtime;

    private String picurl;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return announcement
     */
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * @param announcement
     */
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    /**
     * @return createid
     */
    public Integer getCreateid() {
        return createid;
    }

    /**
     * @param createid
     */
    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    /**
     * @return createname
     */
    public String getCreatename() {
        return createname;
    }

    /**
     * @param createname
     */
    public void setCreatename(String createname) {
        this.createname = createname;
    }

    /**
     * @return isActive
     */
    public String getIsactive() {
        return isactive;
    }

    /**
     * @param isactive
     */
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    /**
     * @return createtime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return picurl
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * @param picurl
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}