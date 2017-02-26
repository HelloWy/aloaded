package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "xiezi")
public class Xiezi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clothesname;

    private Integer clothesnum;

    private Integer a240;

    private Integer a245;

    private Integer a250;

    private Integer a255;

    private Integer a260;

    private Integer a265;

    private Integer a270;

    private Integer a275;

    private Integer a280;

    private Integer a285;

    private Integer a290;

    public Xiezi(){
    	super();
    }
    
    public Xiezi(Integer id, String clothesname, Integer a240, Integer a245, Integer a250, Integer a255, Integer a260,
			Integer a265, Integer a270, Integer a275, Integer a280, Integer a285, Integer a290) {
		super();
		this.id = id;
		this.clothesname = clothesname;
		this.a240 = a240;
		this.a245 = a245;
		this.a250 = a250;
		this.a255 = a255;
		this.a260 = a260;
		this.a265 = a265;
		this.a270 = a270;
		this.a275 = a275;
		this.a280 = a280;
		this.a285 = a285;
		this.a290 = a290;
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
     * @return a240
     */
    public Integer getA240() {
        return a240;
    }

    /**
     * @param a240
     */
    public void setA240(Integer a240) {
        this.a240 = a240;
    }

    /**
     * @return a245
     */
    public Integer getA245() {
        return a245;
    }

    /**
     * @param a245
     */
    public void setA245(Integer a245) {
        this.a245 = a245;
    }

    /**
     * @return a250
     */
    public Integer getA250() {
        return a250;
    }

    /**
     * @param a250
     */
    public void setA250(Integer a250) {
        this.a250 = a250;
    }

    /**
     * @return a255
     */
    public Integer getA255() {
        return a255;
    }

    /**
     * @param a255
     */
    public void setA255(Integer a255) {
        this.a255 = a255;
    }

    /**
     * @return a260
     */
    public Integer getA260() {
        return a260;
    }

    /**
     * @param a260
     */
    public void setA260(Integer a260) {
        this.a260 = a260;
    }

    /**
     * @return a265
     */
    public Integer getA265() {
        return a265;
    }

    /**
     * @param a265
     */
    public void setA265(Integer a265) {
        this.a265 = a265;
    }

    /**
     * @return a270
     */
    public Integer getA270() {
        return a270;
    }

    /**
     * @param a270
     */
    public void setA270(Integer a270) {
        this.a270 = a270;
    }

    /**
     * @return a275
     */
    public Integer getA275() {
        return a275;
    }

    /**
     * @param a275
     */
    public void setA275(Integer a275) {
        this.a275 = a275;
    }

    /**
     * @return a280
     */
    public Integer getA280() {
        return a280;
    }

    /**
     * @param a280
     */
    public void setA280(Integer a280) {
        this.a280 = a280;
    }

    /**
     * @return a285
     */
    public Integer getA285() {
        return a285;
    }

    /**
     * @param a285
     */
    public void setA285(Integer a285) {
        this.a285 = a285;
    }

    /**
     * @return a290
     */
    public Integer getA290() {
        return a290;
    }

    /**
     * @param a290
     */
    public void setA290(Integer a290) {
        this.a290 = a290;
    }
}