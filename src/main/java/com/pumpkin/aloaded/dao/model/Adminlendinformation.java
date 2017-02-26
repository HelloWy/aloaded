package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "adminlendinformation")
public class Adminlendinformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

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