package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "femaledayi")
public class Femaledayi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a175b88;

    private Integer a170b92c96;

    private Integer a170b88;

    private Integer a170b80c84;

    private Integer a165b100;

    private Integer a165b92c96;

    private Integer a165b88;

    private Integer a165b80c84;

    private Integer a160b100;

    private Integer a160b92c96;

    private Integer a160b88;

    private Integer a160b80c84;

    private Integer a160b76;

    private Integer a155b92c96;

    private Integer a155b88;

    private Integer a155b80c84;

    private Integer a155b76;

    public Femaledayi() {
		super();
	}

	public Femaledayi(Integer id, String clothesname, Integer a175b88, Integer a170b92c96,
			Integer a170b88, Integer a170b80c84, Integer a165b100, Integer a165b92c96, Integer a165b88,
			Integer a165b80c84, Integer a160b100, Integer a160b92c96, Integer a160b88, Integer a160b80c84,
			Integer a160b76, Integer a155b92c96, Integer a155b88, Integer a155b80c84, Integer a155b76) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a175b88 = a175b88;
		this.a170b92c96 = a170b92c96;
		this.a170b88 = a170b88;
		this.a170b80c84 = a170b80c84;
		this.a165b100 = a165b100;
		this.a165b92c96 = a165b92c96;
		this.a165b88 = a165b88;
		this.a165b80c84 = a165b80c84;
		this.a160b100 = a160b100;
		this.a160b92c96 = a160b92c96;
		this.a160b88 = a160b88;
		this.a160b80c84 = a160b80c84;
		this.a160b76 = a160b76;
		this.a155b92c96 = a155b92c96;
		this.a155b88 = a155b88;
		this.a155b80c84 = a155b80c84;
		this.a155b76 = a155b76;
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
     * @return a175b88
     */
    public Integer getA175b88() {
        return a175b88;
    }

    /**
     * @param a175b88
     */
    public void setA175b88(Integer a175b88) {
        this.a175b88 = a175b88;
    }

    /**
     * @return a170b92c96
     */
    public Integer getA170b92c96() {
        return a170b92c96;
    }

    /**
     * @param a170b92c96
     */
    public void setA170b92c96(Integer a170b92c96) {
        this.a170b92c96 = a170b92c96;
    }

    /**
     * @return a170b88
     */
    public Integer getA170b88() {
        return a170b88;
    }

    /**
     * @param a170b88
     */
    public void setA170b88(Integer a170b88) {
        this.a170b88 = a170b88;
    }

    /**
     * @return a170b80c84
     */
    public Integer getA170b80c84() {
        return a170b80c84;
    }

    /**
     * @param a170b80c84
     */
    public void setA170b80c84(Integer a170b80c84) {
        this.a170b80c84 = a170b80c84;
    }

    /**
     * @return a165b100
     */
    public Integer getA165b100() {
        return a165b100;
    }

    /**
     * @param a165b100
     */
    public void setA165b100(Integer a165b100) {
        this.a165b100 = a165b100;
    }

    /**
     * @return a165b92c96
     */
    public Integer getA165b92c96() {
        return a165b92c96;
    }

    /**
     * @param a165b92c96
     */
    public void setA165b92c96(Integer a165b92c96) {
        this.a165b92c96 = a165b92c96;
    }

    /**
     * @return a165b88
     */
    public Integer getA165b88() {
        return a165b88;
    }

    /**
     * @param a165b88
     */
    public void setA165b88(Integer a165b88) {
        this.a165b88 = a165b88;
    }

    /**
     * @return a165b80c84
     */
    public Integer getA165b80c84() {
        return a165b80c84;
    }

    /**
     * @param a165b80c84
     */
    public void setA165b80c84(Integer a165b80c84) {
        this.a165b80c84 = a165b80c84;
    }

    /**
     * @return a160b100
     */
    public Integer getA160b100() {
        return a160b100;
    }

    /**
     * @param a160b100
     */
    public void setA160b100(Integer a160b100) {
        this.a160b100 = a160b100;
    }

    /**
     * @return a160b92c96
     */
    public Integer getA160b92c96() {
        return a160b92c96;
    }

    /**
     * @param a160b92c96
     */
    public void setA160b92c96(Integer a160b92c96) {
        this.a160b92c96 = a160b92c96;
    }

    /**
     * @return a160b88
     */
    public Integer getA160b88() {
        return a160b88;
    }

    /**
     * @param a160b88
     */
    public void setA160b88(Integer a160b88) {
        this.a160b88 = a160b88;
    }

    /**
     * @return a160b80c84
     */
    public Integer getA160b80c84() {
        return a160b80c84;
    }

    /**
     * @param a160b80c84
     */
    public void setA160b80c84(Integer a160b80c84) {
        this.a160b80c84 = a160b80c84;
    }

    /**
     * @return a160b76
     */
    public Integer getA160b76() {
        return a160b76;
    }

    /**
     * @param a160b76
     */
    public void setA160b76(Integer a160b76) {
        this.a160b76 = a160b76;
    }

    /**
     * @return a155b92c96
     */
    public Integer getA155b92c96() {
        return a155b92c96;
    }

    /**
     * @param a155b92c96
     */
    public void setA155b92c96(Integer a155b92c96) {
        this.a155b92c96 = a155b92c96;
    }

    /**
     * @return a155b88
     */
    public Integer getA155b88() {
        return a155b88;
    }

    /**
     * @param a155b88
     */
    public void setA155b88(Integer a155b88) {
        this.a155b88 = a155b88;
    }

    /**
     * @return a155b80c84
     */
    public Integer getA155b80c84() {
        return a155b80c84;
    }

    /**
     * @param a155b80c84
     */
    public void setA155b80c84(Integer a155b80c84) {
        this.a155b80c84 = a155b80c84;
    }

    /**
     * @return a155b76
     */
    public Integer getA155b76() {
        return a155b76;
    }

    /**
     * @param a155b76
     */
    public void setA155b76(Integer a155b76) {
        this.a155b76 = a155b76;
    }
}