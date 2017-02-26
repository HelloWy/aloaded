package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer clothescode;

    private String clothesname;

    private String clothestype;

    private Integer clothesnum;

    private String clothessex;

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
     * @return clothescode
     */
    public Integer getClothescode() {
        return clothescode;
    }

    /**
     * @param clothescode
     */
    public void setClothescode(Integer clothescode) {
        this.clothescode = clothescode;
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
     * @return clothestype
     */
    public String getClothestype() {
        return clothestype;
    }

    /**
     * @param clothestype
     */
    public void setClothestype(String clothestype) {
        this.clothestype = clothestype;
    }

    /**
     * @return clothesnum
     */
    public Integer getClothesnum() {
        return clothesnum;
    }

    /**
     * @param clothesnum
     */
    public void setClothesnum(Integer clothesnum) {
        this.clothesnum = clothesnum;
    }

    /**
     * @return clothessex
     */
    public String getClothessex() {
        return clothessex;
    }

    /**
     * @param clothessex
     */
    public void setClothessex(String clothessex) {
        this.clothessex = clothessex;
    }
}