package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "malexiaku")
public class Malexiaku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a185b98;

    private Integer a185b92;

    private Integer a185b86;

    private Integer a180b104;

    private Integer a180b98;

    private Integer a180b92;

    private Integer a180b86;

    private Integer a180b80;

    private Integer a175b104;

    private Integer a175b98;

    private Integer a175b92;

    private Integer a175b86;

    private Integer a175b80;

    private Integer a175b74;

    private Integer a170b104;

    private Integer a170b98;

    private Integer a170b92;

    private Integer a170b86;

    private Integer a170b80;

    private Integer a170b74;

    private Integer a165b92;

    private Integer a165b86;

    private Integer a165b80;

    private Integer a165b74;

    private Integer a165b70;

    public Malexiaku() {
		super();
	}

	public Malexiaku(Integer id, String clothesname, Integer a185b98, Integer a185b92,
			Integer a185b86, Integer a180b104, Integer a180b98, Integer a180b92, Integer a180b86, Integer a180b80,
			Integer a175b104, Integer a175b98, Integer a175b92, Integer a175b86, Integer a175b80, Integer a175b74,
			Integer a170b104, Integer a170b98, Integer a170b92, Integer a170b86, Integer a170b80, Integer a170b74,
			Integer a165b92, Integer a165b86, Integer a165b80, Integer a165b74, Integer a165b70) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a185b98 = a185b98;
		this.a185b92 = a185b92;
		this.a185b86 = a185b86;
		this.a180b104 = a180b104;
		this.a180b98 = a180b98;
		this.a180b92 = a180b92;
		this.a180b86 = a180b86;
		this.a180b80 = a180b80;
		this.a175b104 = a175b104;
		this.a175b98 = a175b98;
		this.a175b92 = a175b92;
		this.a175b86 = a175b86;
		this.a175b80 = a175b80;
		this.a175b74 = a175b74;
		this.a170b104 = a170b104;
		this.a170b98 = a170b98;
		this.a170b92 = a170b92;
		this.a170b86 = a170b86;
		this.a170b80 = a170b80;
		this.a170b74 = a170b74;
		this.a165b92 = a165b92;
		this.a165b86 = a165b86;
		this.a165b80 = a165b80;
		this.a165b74 = a165b74;
		this.a165b70 = a165b70;
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
     * @return a185b98
     */
    public Integer getA185b98() {
        return a185b98;
    }

    /**
     * @param a185b98
     */
    public void setA185b98(Integer a185b98) {
        this.a185b98 = a185b98;
    }

    /**
     * @return a185b92
     */
    public Integer getA185b92() {
        return a185b92;
    }

    /**
     * @param a185b92
     */
    public void setA185b92(Integer a185b92) {
        this.a185b92 = a185b92;
    }

    /**
     * @return a185b86
     */
    public Integer getA185b86() {
        return a185b86;
    }

    /**
     * @param a185b86
     */
    public void setA185b86(Integer a185b86) {
        this.a185b86 = a185b86;
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
     * @return a180b98
     */
    public Integer getA180b98() {
        return a180b98;
    }

    /**
     * @param a180b98
     */
    public void setA180b98(Integer a180b98) {
        this.a180b98 = a180b98;
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
     * @return a180b86
     */
    public Integer getA180b86() {
        return a180b86;
    }

    /**
     * @param a180b86
     */
    public void setA180b86(Integer a180b86) {
        this.a180b86 = a180b86;
    }

    /**
     * @return a180b80
     */
    public Integer getA180b80() {
        return a180b80;
    }

    /**
     * @param a180b80
     */
    public void setA180b80(Integer a180b80) {
        this.a180b80 = a180b80;
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
     * @return a175b98
     */
    public Integer getA175b98() {
        return a175b98;
    }

    /**
     * @param a175b98
     */
    public void setA175b98(Integer a175b98) {
        this.a175b98 = a175b98;
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
     * @return a175b86
     */
    public Integer getA175b86() {
        return a175b86;
    }

    /**
     * @param a175b86
     */
    public void setA175b86(Integer a175b86) {
        this.a175b86 = a175b86;
    }

    /**
     * @return a175b80
     */
    public Integer getA175b80() {
        return a175b80;
    }

    /**
     * @param a175b80
     */
    public void setA175b80(Integer a175b80) {
        this.a175b80 = a175b80;
    }

    /**
     * @return a175b74
     */
    public Integer getA175b74() {
        return a175b74;
    }

    /**
     * @param a175b74
     */
    public void setA175b74(Integer a175b74) {
        this.a175b74 = a175b74;
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
     * @return a170b98
     */
    public Integer getA170b98() {
        return a170b98;
    }

    /**
     * @param a170b98
     */
    public void setA170b98(Integer a170b98) {
        this.a170b98 = a170b98;
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
     * @return a170b86
     */
    public Integer getA170b86() {
        return a170b86;
    }

    /**
     * @param a170b86
     */
    public void setA170b86(Integer a170b86) {
        this.a170b86 = a170b86;
    }

    /**
     * @return a170b80
     */
    public Integer getA170b80() {
        return a170b80;
    }

    /**
     * @param a170b80
     */
    public void setA170b80(Integer a170b80) {
        this.a170b80 = a170b80;
    }

    /**
     * @return a170b74
     */
    public Integer getA170b74() {
        return a170b74;
    }

    /**
     * @param a170b74
     */
    public void setA170b74(Integer a170b74) {
        this.a170b74 = a170b74;
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
     * @return a165b86
     */
    public Integer getA165b86() {
        return a165b86;
    }

    /**
     * @param a165b86
     */
    public void setA165b86(Integer a165b86) {
        this.a165b86 = a165b86;
    }

    /**
     * @return a165b80
     */
    public Integer getA165b80() {
        return a165b80;
    }

    /**
     * @param a165b80
     */
    public void setA165b80(Integer a165b80) {
        this.a165b80 = a165b80;
    }

    /**
     * @return a165b74
     */
    public Integer getA165b74() {
        return a165b74;
    }

    /**
     * @param a165b74
     */
    public void setA165b74(Integer a165b74) {
        this.a165b74 = a165b74;
    }

    /**
     * @return a165b70
     */
    public Integer getA165b70() {
        return a165b70;
    }

    /**
     * @param a165b70
     */
    public void setA165b70(Integer a165b70) {
        this.a165b70 = a165b70;
    }
}