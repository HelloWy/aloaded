package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "msgboard")
public class Msgboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userid;

    private String username;

    private String context;

    private String createtime;

    private String userphone;

    private String clothesname;

    private String size;

    private String changesize;

    @Column(name = "isActive")
    private String isactive;

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
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
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
     * @return userphone
     */
    public String getUserphone() {
        return userphone;
    }

    /**
     * @param userphone
     */
    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    /**
     * @return clothesname
     */
    public String getClothesname() {
        return clothesname;
    }

    /**
     * @param clothesname
     */
    public void setClothesname(String clothesname) {
        this.clothesname = clothesname;
    }

    /**
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return changesize
     */
    public String getChangesize() {
        return changesize;
    }

    /**
     * @param changesize
     */
    public void setChangesize(String changesize) {
        this.changesize = changesize;
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
}