package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "loadedname")
public class LoadedName {
    /**
     * 被装品茗id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 所属被装类别的id
     */
    @Column(name = "loadedTypeId")
    private Integer loadedtypeid;

    /**
     * 被装品名
     */
    @Column(name = "loadedName")
    private String loadedname;

    /**
     * 状态
     */
    @Column(name = "loadedNameState")
    private String loadednamestate;

    /**
     * 获取被装品茗id
     *
     * @return id - 被装品茗id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置被装品茗id
     *
     * @param id 被装品茗id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取所属被装类别的id
     *
     * @return loadedTypeId - 所属被装类别的id
     */
    public Integer getLoadedtypeid() {
        return loadedtypeid;
    }

    /**
     * 设置所属被装类别的id
     *
     * @param loadedtypeid 所属被装类别的id
     */
    public void setLoadedtypeid(Integer loadedtypeid) {
        this.loadedtypeid = loadedtypeid;
    }

    /**
     * 获取被装品名
     *
     * @return loadedName - 被装品名
     */
    public String getLoadedname() {
        return loadedname;
    }

    /**
     * 设置被装品名
     *
     * @param loadedname 被装品名
     */
    public void setLoadedname(String loadedname) {
        this.loadedname = loadedname;
    }

    /**
     * 获取状态
     *
     * @return loadedNameState - 状态
     */
    public String getLoadednamestate() {
        return loadednamestate;
    }

    /**
     * 设置状态
     *
     * @param loadednamestate 状态
     */
    public void setLoadednamestate(String loadednamestate) {
        this.loadednamestate = loadednamestate;
    }
}