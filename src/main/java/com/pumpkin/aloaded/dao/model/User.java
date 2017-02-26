package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String identyid;

    private String password;

    private String realname;

    private Integer isaccess;

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
     * @return identyid
     */
    public String getIdentyid() {
        return identyid;
    }

    /**
     * @param identyid
     */
    public void setIdentyid(String identyid) {
        this.identyid = identyid;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return isaccess
     */
    public Integer getIsaccess() {
        return isaccess;
    }

    /**
     * @param isaccess
     */
    public void setIsaccess(Integer isaccess) {
        this.isaccess = isaccess;
    }
}