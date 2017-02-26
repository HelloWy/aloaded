package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "maleshangyi")
public class Maleshangyi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a185b104;

    private Integer a185b100;

    private Integer a185b96;

    private Integer a180b108;

    private Integer a180b104;

    private Integer a180b100;

    private Integer a180b96;

    private Integer a180b92;

    private Integer a175b108;

    private Integer a175b104;

    private Integer a175b100;

    private Integer a175b96;

    private Integer a175b92;

    private Integer a170b108;

    private Integer a170b104;

    private Integer a170b100;

    private Integer a170b96;

    private Integer a170b92;

    private Integer a170b88;

    private Integer a165b100;

    private Integer a165b96;

    private Integer a165b92;

    private Integer a165b88;

    private Integer a165b84;

    public Maleshangyi() {
		super();
	}

	public Maleshangyi(Integer id, String clothesname, Integer a185b104, Integer a185b100,
			Integer a185b96, Integer a180b108, Integer a180b104, Integer a180b100, Integer a180b96, Integer a180b92,
			Integer a175b108, Integer a175b104, Integer a175b100, Integer a175b96, Integer a175b92, Integer a170b108,
			Integer a170b104, Integer a170b100, Integer a170b96, Integer a170b92, Integer a170b88, Integer a165b100,
			Integer a165b96, Integer a165b92, Integer a165b88, Integer a165b84) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a185b104 = a185b104;
		this.a185b100 = a185b100;
		this.a185b96 = a185b96;
		this.a180b108 = a180b108;
		this.a180b104 = a180b104;
		this.a180b100 = a180b100;
		this.a180b96 = a180b96;
		this.a180b92 = a180b92;
		this.a175b108 = a175b108;
		this.a175b104 = a175b104;
		this.a175b100 = a175b100;
		this.a175b96 = a175b96;
		this.a175b92 = a175b92;
		this.a170b108 = a170b108;
		this.a170b104 = a170b104;
		this.a170b100 = a170b100;
		this.a170b96 = a170b96;
		this.a170b92 = a170b92;
		this.a170b88 = a170b88;
		this.a165b100 = a165b100;
		this.a165b96 = a165b96;
		this.a165b92 = a165b92;
		this.a165b88 = a165b88;
		this.a165b84 = a165b84;
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
     * @return a185b104
     */
    public Integer getA185b104() {
        return a185b104;
    }

    /**
     * @param a185b104
     */
    public void setA185b104(Integer a185b104) {
        this.a185b104 = a185b104;
    }

    /**
     * @return a185b100
     */
    public Integer getA185b100() {
        return a185b100;
    }

    /**
     * @param a185b100
     */
    public void setA185b100(Integer a185b100) {
        this.a185b100 = a185b100;
    }

    /**
     * @return a185b96
     */
    public Integer getA185b96() {
        return a185b96;
    }

    /**
     * @param a185b96
     */
    public void setA185b96(Integer a185b96) {
        this.a185b96 = a185b96;
    }

    /**
     * @return a180b108
     */
    public Integer getA180b108() {
        return a180b108;
    }

    /**
     * @param a180b108
     */
    public void setA180b108(Integer a180b108) {
        this.a180b108 = a180b108;
    }

    /**
     * @return a180b104
     */
    public Integer getA180b104() {
        return a180b104;
    }

    /**
     * @param a180b104
     */
    public void setA180b104(Integer a180b104) {
        this.a180b104 = a180b104;
    }

    /**
     * @return a180b100
     */
    public Integer getA180b100() {
        return a180b100;
    }

    /**
     * @param a180b100
     */
    public void setA180b100(Integer a180b100) {
        this.a180b100 = a180b100;
    }

    /**
     * @return a180b96
     */
    public Integer getA180b96() {
        return a180b96;
    }

    /**
     * @param a180b96
     */
    public void setA180b96(Integer a180b96) {
        this.a180b96 = a180b96;
    }

    /**
     * @return a180b92
     */
    public Integer getA180b92() {
        return a180b92;
    }

    /**
     * @param a180b92
     */
    public void setA180b92(Integer a180b92) {
        this.a180b92 = a180b92;
    }

    /**
     * @return a175b108
     */
    public Integer getA175b108() {
        return a175b108;
    }

    /**
     * @param a175b108
     */
    public void setA175b108(Integer a175b108) {
        this.a175b108 = a175b108;
    }

    /**
     * @return a175b104
     */
    public Integer getA175b104() {
        return a175b104;
    }

    /**
     * @param a175b104
     */
    public void setA175b104(Integer a175b104) {
        this.a175b104 = a175b104;
    }

    /**
     * @return a175b100
     */
    public Integer getA175b100() {
        return a175b100;
    }

    /**
     * @param a175b100
     */
    public void setA175b100(Integer a175b100) {
        this.a175b100 = a175b100;
    }

    /**
     * @return a175b96
     */
    public Integer getA175b96() {
        return a175b96;
    }

    /**
     * @param a175b96
     */
    public void setA175b96(Integer a175b96) {
        this.a175b96 = a175b96;
    }

    /**
     * @return a175b92
     */
    public Integer getA175b92() {
        return a175b92;
    }

    /**
     * @param a175b92
     */
    public void setA175b92(Integer a175b92) {
        this.a175b92 = a175b92;
    }

    /**
     * @return a170b108
     */
    public Integer getA170b108() {
        return a170b108;
    }

    /**
     * @param a170b108
     */
    public void setA170b108(Integer a170b108) {
        this.a170b108 = a170b108;
    }

    /**
     * @return a170b104
     */
    public Integer getA170b104() {
        return a170b104;
    }

    /**
     * @param a170b104
     */
    public void setA170b104(Integer a170b104) {
        this.a170b104 = a170b104;
    }

    /**
     * @return a170b100
     */
    public Integer getA170b100() {
        return a170b100;
    }

    /**
     * @param a170b100
     */
    public void setA170b100(Integer a170b100) {
        this.a170b100 = a170b100;
    }

    /**
     * @return a170b96
     */
    public Integer getA170b96() {
        return a170b96;
    }

    /**
     * @param a170b96
     */
    public void setA170b96(Integer a170b96) {
        this.a170b96 = a170b96;
    }

    /**
     * @return a170b92
     */
    public Integer getA170b92() {
        return a170b92;
    }

    /**
     * @param a170b92
     */
    public void setA170b92(Integer a170b92) {
        this.a170b92 = a170b92;
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
     * @return a165b96
     */
    public Integer getA165b96() {
        return a165b96;
    }

    /**
     * @param a165b96
     */
    public void setA165b96(Integer a165b96) {
        this.a165b96 = a165b96;
    }

    /**
     * @return a165b92
     */
    public Integer getA165b92() {
        return a165b92;
    }

    /**
     * @param a165b92
     */
    public void setA165b92(Integer a165b92) {
        this.a165b92 = a165b92;
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
     * @return a165b84
     */
    public Integer getA165b84() {
        return a165b84;
    }

    /**
     * @param a165b84
     */
    public void setA165b84(Integer a165b84) {
        this.a165b84 = a165b84;
    }
}