package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "femalexiaku")
public class Femalexiaku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a175b93;

    private Integer a175b83;

    private Integer a170b78;

    private Integer a170b73;

    private Integer a170b68;

    private Integer a170b64;

    private Integer a165b88;

    private Integer a165b83;

    private Integer a165b78;

    private Integer a165b73;

    private Integer a165b68;

    private Integer a165b64;

    private Integer a160b88;

    private Integer a160b83;

    private Integer a160b78;

    private Integer a160b73;

    private Integer a160b68;

    private Integer a160b64;

    private Integer a160b60;

    private Integer a155b83;

    private Integer a155b78;

    private Integer a155b68;

    private Integer a155b64;

    private Integer a155b60;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public Femalexiaku() {
		super();
	}

	public Femalexiaku(Integer id, String clothesname, Integer a175b93, Integer a175b83,
			Integer a170b78, Integer a170b73, Integer a170b68, Integer a170b64, Integer a165b88, Integer a165b83,
			Integer a165b78, Integer a165b73, Integer a165b68, Integer a165b64, Integer a160b88, Integer a160b83,
			Integer a160b78, Integer a160b73, Integer a160b68, Integer a160b64, Integer a160b60, Integer a155b83,
			Integer a155b78, Integer a155b68, Integer a155b64, Integer a155b60) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a175b93 = a175b93;
		this.a175b83 = a175b83;
		this.a170b78 = a170b78;
		this.a170b73 = a170b73;
		this.a170b68 = a170b68;
		this.a170b64 = a170b64;
		this.a165b88 = a165b88;
		this.a165b83 = a165b83;
		this.a165b78 = a165b78;
		this.a165b73 = a165b73;
		this.a165b68 = a165b68;
		this.a165b64 = a165b64;
		this.a160b88 = a160b88;
		this.a160b83 = a160b83;
		this.a160b78 = a160b78;
		this.a160b73 = a160b73;
		this.a160b68 = a160b68;
		this.a160b64 = a160b64;
		this.a160b60 = a160b60;
		this.a155b83 = a155b83;
		this.a155b78 = a155b78;
		this.a155b68 = a155b68;
		this.a155b64 = a155b64;
		this.a155b60 = a155b60;
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
     * @return a175b93
     */
    public Integer getA175b93() {
        return a175b93;
    }

    /**
     * @param a175b93
     */
    public void setA175b93(Integer a175b93) {
        this.a175b93 = a175b93;
    }

    /**
     * @return a175b83
     */
    public Integer getA175b83() {
        return a175b83;
    }

    /**
     * @param a175b83
     */
    public void setA175b83(Integer a175b83) {
        this.a175b83 = a175b83;
    }

    /**
     * @return a170b78
     */
    public Integer getA170b78() {
        return a170b78;
    }

    /**
     * @param a170b78
     */
    public void setA170b78(Integer a170b78) {
        this.a170b78 = a170b78;
    }

    /**
     * @return a170b73
     */
    public Integer getA170b73() {
        return a170b73;
    }

    /**
     * @param a170b73
     */
    public void setA170b73(Integer a170b73) {
        this.a170b73 = a170b73;
    }

    /**
     * @return a170b68
     */
    public Integer getA170b68() {
        return a170b68;
    }

    /**
     * @param a170b68
     */
    public void setA170b68(Integer a170b68) {
        this.a170b68 = a170b68;
    }

    /**
     * @return a170b64
     */
    public Integer getA170b64() {
        return a170b64;
    }

    /**
     * @param a170b64
     */
    public void setA170b64(Integer a170b64) {
        this.a170b64 = a170b64;
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
     * @return a165b83
     */
    public Integer getA165b83() {
        return a165b83;
    }

    /**
     * @param a165b83
     */
    public void setA165b83(Integer a165b83) {
        this.a165b83 = a165b83;
    }

    /**
     * @return a165b78
     */
    public Integer getA165b78() {
        return a165b78;
    }

    /**
     * @param a165b78
     */
    public void setA165b78(Integer a165b78) {
        this.a165b78 = a165b78;
    }

    /**
     * @return a165b73
     */
    public Integer getA165b73() {
        return a165b73;
    }

    /**
     * @param a165b73
     */
    public void setA165b73(Integer a165b73) {
        this.a165b73 = a165b73;
    }

    /**
     * @return a165b68
     */
    public Integer getA165b68() {
        return a165b68;
    }

    /**
     * @param a165b68
     */
    public void setA165b68(Integer a165b68) {
        this.a165b68 = a165b68;
    }

    /**
     * @return a165b64
     */
    public Integer getA165b64() {
        return a165b64;
    }

    /**
     * @param a165b64
     */
    public void setA165b64(Integer a165b64) {
        this.a165b64 = a165b64;
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
     * @return a160b83
     */
    public Integer getA160b83() {
        return a160b83;
    }

    /**
     * @param a160b83
     */
    public void setA160b83(Integer a160b83) {
        this.a160b83 = a160b83;
    }

    /**
     * @return a160b78
     */
    public Integer getA160b78() {
        return a160b78;
    }

    /**
     * @param a160b78
     */
    public void setA160b78(Integer a160b78) {
        this.a160b78 = a160b78;
    }

    /**
     * @return a160b73
     */
    public Integer getA160b73() {
        return a160b73;
    }

    /**
     * @param a160b73
     */
    public void setA160b73(Integer a160b73) {
        this.a160b73 = a160b73;
    }

    /**
     * @return a160b68
     */
    public Integer getA160b68() {
        return a160b68;
    }

    /**
     * @param a160b68
     */
    public void setA160b68(Integer a160b68) {
        this.a160b68 = a160b68;
    }

    /**
     * @return a160b64
     */
    public Integer getA160b64() {
        return a160b64;
    }

    /**
     * @param a160b64
     */
    public void setA160b64(Integer a160b64) {
        this.a160b64 = a160b64;
    }

    /**
     * @return a160b60
     */
    public Integer getA160b60() {
        return a160b60;
    }

    /**
     * @param a160b60
     */
    public void setA160b60(Integer a160b60) {
        this.a160b60 = a160b60;
    }

    /**
     * @return a155b83
     */
    public Integer getA155b83() {
        return a155b83;
    }

    /**
     * @param a155b83
     */
    public void setA155b83(Integer a155b83) {
        this.a155b83 = a155b83;
    }

    /**
     * @return a155b78
     */
    public Integer getA155b78() {
        return a155b78;
    }

    /**
     * @param a155b78
     */
    public void setA155b78(Integer a155b78) {
        this.a155b78 = a155b78;
    }

    /**
     * @return a155b68
     */
    public Integer getA155b68() {
        return a155b68;
    }

    /**
     * @param a155b68
     */
    public void setA155b68(Integer a155b68) {
        this.a155b68 = a155b68;
    }

    /**
     * @return a155b64
     */
    public Integer getA155b64() {
        return a155b64;
    }

    /**
     * @param a155b64
     */
    public void setA155b64(Integer a155b64) {
        this.a155b64 = a155b64;
    }

    /**
     * @return a155b60
     */
    public Integer getA155b60() {
        return a155b60;
    }

    /**
     * @param a155b60
     */
    public void setA155b60(Integer a155b60) {
        this.a155b60 = a155b60;
    }
}