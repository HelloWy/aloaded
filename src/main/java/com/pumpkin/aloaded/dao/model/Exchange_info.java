package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "exchange_info")
public class Exchange_info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "student_id")
    private Integer studentId;

    private String clothestype;

    private String clothesname;

    private String clothesnowsize;

    private String clotheschangesize;

    private String clothescode;

    private String clothessize;

    private Integer exchangeisok;

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
     * @return student_id
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
     * @return clothesnowsize
     */
    public String getClothesnowsize() {
        return clothesnowsize;
    }

    /**
     * @param clothesnowsize
     */
    public void setClothesnowsize(String clothesnowsize) {
        this.clothesnowsize = clothesnowsize;
    }

    /**
     * @return clotheschangesize
     */
    public String getClotheschangesize() {
        return clotheschangesize;
    }

    /**
     * @param clotheschangesize
     */
    public void setClotheschangesize(String clotheschangesize) {
        this.clotheschangesize = clotheschangesize;
    }

    /**
     * @return clothescode
     */
    public String getClothescode() {
        return clothescode;
    }

    /**
     * @param clothescode
     */
    public void setClothescode(String clothescode) {
        this.clothescode = clothescode;
    }

    /**
     * @return clothessize
     */
    public String getClothessize() {
        return clothessize;
    }

    /**
     * @param clothessize
     */
    public void setClothessize(String clothessize) {
        this.clothessize = clothessize;
    }

    /**
     * @return exchangeisok
     */
    public Integer getExchangeisok() {
        return exchangeisok;
    }

    /**
     * @param exchangeisok
     */
    public void setExchangeisok(Integer exchangeisok) {
        this.exchangeisok = exchangeisok;
    }
}