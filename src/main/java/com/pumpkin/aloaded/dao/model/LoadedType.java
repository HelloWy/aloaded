package com.pumpkin.aloaded.dao.model;

import java.util.List;

import javax.persistence.*;

@Table(name = "loadedtype")
public class LoadedType {
    /**
     * 被装类型id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 被装类型名称
     */
    @Column(name = "loadedTypeName")
    private String loadedtypename;

    /**
     * 被装类型对应的号型
     */
    @Column(name = "loadedSizeId")
    private Integer loadedsizeid;

    /**
     * 状态
     */
    @Column(name = "loadedTypeState")
    private String loadedtypestate;
    
    /**
     * 类别对应的型号
     */
    //忽略字段,添加该注解的字段不会作为表字段使用
    @Transient
    private LoadedSize loadedSize;
    
    /**
     * 类别下的品茗列表
     */
    @Transient
    private List<LoadedName> loadedNames;

    
    /**
     * 获取被装类型id
     *
     * @return id - 被装类型id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置被装类型id
     *
     * @param id 被装类型id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取被装类型名称
     *
     * @return loadedTypeName - 被装类型名称
     */
    public String getLoadedtypename() {
        return loadedtypename;
    }

    /**
     * 设置被装类型名称
     *
     * @param loadedtypename 被装类型名称
     */
    public void setLoadedtypename(String loadedtypename) {
        this.loadedtypename = loadedtypename;
    }

    /**
     * 获取被装类型对应的号型
     *
     * @return loadedSizeId - 被装类型对应的号型
     */
    public Integer getLoadedsizeid() {
        return loadedsizeid;
    }

    /**
     * 设置被装类型对应的号型
     *
     * @param loadedsizeid 被装类型对应的号型
     */
    public void setLoadedsizeid(Integer loadedsizeid) {
        this.loadedsizeid = loadedsizeid;
    }

    /**
     * 获取状态
     *
     * @return loadedTypeState - 状态
     */
    public String getLoadedtypestate() {
        return loadedtypestate;
    }

    /**
     * 设置状态
     *
     * @param loadedtypestate 状态
     */
    public void setLoadedtypestate(String loadedtypestate) {
        this.loadedtypestate = loadedtypestate;
    }

	public LoadedSize getLoadedSize() {
		return loadedSize;
	}

	public void setLoadedSize(LoadedSize loadedSize) {
		this.loadedSize = loadedSize;
	}

	public List<LoadedName> getLoadedNames() {
		return loadedNames;
	}

	public void setLoadedNames(List<LoadedName> loadedNames) {
		this.loadedNames = loadedNames;
	}
}