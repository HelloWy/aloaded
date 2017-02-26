package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userid;

    private String username;

    private Integer adminid;

    private String adminname;

    private String createtime;

    private String replytime;

    private String clothesname;

    private String size;

    private String changesize;

    private String userphone;

    private String context;

    private String adminphone;

    private String replycontext;

    private String isdo;

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
     * @return adminid
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * @param adminid
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * @return adminname
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * @param adminname
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname;
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
     * @return replytime
     */
    public String getReplytime() {
        return replytime;
    }

    /**
     * @param replytime
     */
    public void setReplytime(String replytime) {
        this.replytime = replytime;
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
     * @return adminphone
     */
    public String getAdminphone() {
        return adminphone;
    }

    /**
     * @param adminphone
     */
    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone;
    }

    /**
     * @return replycontext
     */
    public String getReplycontext() {
        return replycontext;
    }

    /**
     * @param replycontext
     */
    public void setReplycontext(String replycontext) {
        this.replycontext = replycontext;
    }

    /**
     * @return isdo
     */
    public String getIsdo() {
        return isdo;
    }

    /**
     * @param isdo
     */
    public void setIsdo(String isdo) {
        this.isdo = isdo;
    }
}