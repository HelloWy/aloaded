package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "loadedsize")
public class LoadedSize {
    /**
     * 被装号型的id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 被装好型的名称
     */
    @Column(name = "loadedSizeName")
    private String loadedsizename;

    @Column(name = "loadedSizeList")
    private String loadedsizelist;

    /**
     * 状态
     */
    @Column(name = "loadedSizeState")
    private String loadedsizestate;

    /**
     * 获取被装号型的id
     *
     * @return id - 被装号型的id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置被装号型的id
     *
     * @param id 被装号型的id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取被装好型的名称
     *
     * @return loadedSizeName - 被装好型的名称
     */
    public String getLoadedsizename() {
        return loadedsizename;
    }

    /**
     * 设置被装好型的名称
     *
     * @param loadedsizename 被装好型的名称
     */
    public void setLoadedsizename(String loadedsizename) {
        this.loadedsizename = loadedsizename;
    }

    /**
     * @return loadedSizeList
     */
    public String getLoadedsizelist() {
        return loadedsizelist;
    }

    /**
     * @param loadedsizelist
     */
    public void setLoadedsizelist(String loadedsizelist) {
        this.loadedsizelist = loadedsizelist;
    }

    /**
     * 获取状态
     *
     * @return loadedSizeState - 状态
     */
    public String getLoadedsizestate() {
        return loadedsizestate;
    }

    /**
     * 设置状态
     *
     * @param loadedsizestate 状态
     */
    public void setLoadedsizestate(String loadedsizestate) {
        this.loadedsizestate = loadedsizestate;
    }
}