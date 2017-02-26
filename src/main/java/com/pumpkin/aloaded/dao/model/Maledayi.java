package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "maledayi")
public class Maledayi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a185b104c108;

    private Integer a185b100;

    private Integer a185b92c96;

    private Integer a180b104c108;

    private Integer a180b100;

    private Integer a180b92c96;

    private Integer a175b104c108;

    private Integer a175b100;

    private Integer a175b92c96;

    private Integer a175b88;

    private Integer a170b104c108;

    private Integer a170b100;

    private Integer a170b92c96;

    private Integer a170b88;

    private Integer a165b100;

    private Integer a165b92c96;

    private Integer a165b84c88;

    public Maledayi() {
		super();
	}

	public Maledayi(Integer id, String clothesname, Integer a185b104c108, Integer a185b100,
			Integer a185b92c96, Integer a180b104c108, Integer a180b100, Integer a180b92c96, Integer a175b104c108,
			Integer a175b100, Integer a175b92c96, Integer a175b88, Integer a170b104c108, Integer a170b100,
			Integer a170b92c96, Integer a170b88, Integer a165b100, Integer a165b92c96, Integer a165b84c88) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a185b104c108 = a185b104c108;
		this.a185b100 = a185b100;
		this.a185b92c96 = a185b92c96;
		this.a180b104c108 = a180b104c108;
		this.a180b100 = a180b100;
		this.a180b92c96 = a180b92c96;
		this.a175b104c108 = a175b104c108;
		this.a175b100 = a175b100;
		this.a175b92c96 = a175b92c96;
		this.a175b88 = a175b88;
		this.a170b104c108 = a170b104c108;
		this.a170b100 = a170b100;
		this.a170b92c96 = a170b92c96;
		this.a170b88 = a170b88;
		this.a165b100 = a165b100;
		this.a165b92c96 = a165b92c96;
		this.a165b84c88 = a165b84c88;
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
     * @return a185b104c108
     */
    public Integer getA185b104c108() {
        return a185b104c108;
    }

    /**
     * @param a185b104c108
     */
    public void setA185b104c108(Integer a185b104c108) {
        this.a185b104c108 = a185b104c108;
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
     * @return a185b92c96
     */
    public Integer getA185b92c96() {
        return a185b92c96;
    }

    /**
     * @param a185b92c96
     */
    public void setA185b92c96(Integer a185b92c96) {
        this.a185b92c96 = a185b92c96;
    }

    /**
     * @return a180b104c108
     */
    public Integer getA180b104c108() {
        return a180b104c108;
    }

    /**
     * @param a180b104c108
     */
    public void setA180b104c108(Integer a180b104c108) {
        this.a180b104c108 = a180b104c108;
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
     * @return a180b92c96
     */
    public Integer getA180b92c96() {
        return a180b92c96;
    }

    /**
     * @param a180b92c96
     */
    public void setA180b92c96(Integer a180b92c96) {
        this.a180b92c96 = a180b92c96;
    }

    /**
     * @return a175b104c108
     */
    public Integer getA175b104c108() {
        return a175b104c108;
    }

    /**
     * @param a175b104c108
     */
    public void setA175b104c108(Integer a175b104c108) {
        this.a175b104c108 = a175b104c108;
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
     * @return a175b92c96
     */
    public Integer getA175b92c96() {
        return a175b92c96;
    }

    /**
     * @param a175b92c96
     */
    public void setA175b92c96(Integer a175b92c96) {
        this.a175b92c96 = a175b92c96;
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
     * @return a170b104c108
     */
    public Integer getA170b104c108() {
        return a170b104c108;
    }

    /**
     * @param a170b104c108
     */
    public void setA170b104c108(Integer a170b104c108) {
        this.a170b104c108 = a170b104c108;
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
     * @return a165b84c88
     */
    public Integer getA165b84c88() {
        return a165b84c88;
    }

    /**
     * @param a165b84c88
     */
    public void setA165b84c88(Integer a165b84c88) {
        this.a165b84c88 = a165b84c88;
    }
}