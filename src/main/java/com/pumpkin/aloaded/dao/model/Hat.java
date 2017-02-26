package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "hat")
public class Hat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a53;

    private Integer a54;

    private Integer a55;

    private Integer a56;

    private Integer a57;

    private Integer a58;

    private Integer a59;

    private Integer a60;

    public Hat() {
		super();
	}

	public Hat(Integer id, String clothesname, Integer a53, Integer a54, Integer a55, Integer a56,
			Integer a57, Integer a58, Integer a59, Integer a60) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a53 = a53;
		this.a54 = a54;
		this.a55 = a55;
		this.a56 = a56;
		this.a57 = a57;
		this.a58 = a58;
		this.a59 = a59;
		this.a60 = a60;
	}

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
     * @return a53
     */
    public Integer getA53() {
        return a53;
    }

    /**
     * @param a53
     */
    public void setA53(Integer a53) {
        this.a53 = a53;
    }

    /**
     * @return a54
     */
    public Integer getA54() {
        return a54;
    }

    /**
     * @param a54
     */
    public void setA54(Integer a54) {
        this.a54 = a54;
    }

    /**
     * @return a55
     */
    public Integer getA55() {
        return a55;
    }

    /**
     * @param a55
     */
    public void setA55(Integer a55) {
        this.a55 = a55;
    }

    /**
     * @return a56
     */
    public Integer getA56() {
        return a56;
    }

    /**
     * @param a56
     */
    public void setA56(Integer a56) {
        this.a56 = a56;
    }

    /**
     * @return a57
     */
    public Integer getA57() {
        return a57;
    }

    /**
     * @param a57
     */
    public void setA57(Integer a57) {
        this.a57 = a57;
    }

    /**
     * @return a58
     */
    public Integer getA58() {
        return a58;
    }

    /**
     * @param a58
     */
    public void setA58(Integer a58) {
        this.a58 = a58;
    }

    /**
     * @return a59
     */
    public Integer getA59() {
        return a59;
    }

    /**
     * @param a59
     */
    public void setA59(Integer a59) {
        this.a59 = a59;
    }

    /**
     * @return a60
     */
    public Integer getA60() {
        return a60;
    }

    /**
     * @param a60
     */
    public void setA60(Integer a60) {
        this.a60 = a60;
    }
}