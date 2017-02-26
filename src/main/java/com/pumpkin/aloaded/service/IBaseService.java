package com.pumpkin.aloaded.service;

import java.util.List;

/**
 * 名称： IBaseService<br>
 * 描述： 基础service接口<br>
 * 最近修改时间：2015/8/1 11:25<br>
 * 修改说明：
 *
 * @author wuang
 */
public interface IBaseService<T> {
 
    /**
     * 方法描述：新增所有，无论属性是否为null
     *
     * @param t 实体对象
     * @return
     * @author wuang
     */
    public int insert(T t);

    /**
     * 方法描述：新增，属性为null则不保存
     *
     * @param t 实体对象
     * @return
     * @author wuang
     */
    public int insertSelective(T t);

    /**
     * 方法描述：更新所有，无论属性是否为null
     *
     * @param t 实体对象
     * @return
     * @author wuang
     */
    public int updateByPrimaryKey(T t);

    /**
     * 方法描述：更新，属性为null则不更新
     *
     * @param t 实体对象
     * @return
     * @author wuang
     */
    public int updateByPrimaryKeySelective(T t);

    /**
     * 方法描述：删除，根据id删除
     *
     * @param id 主键
     * @return
     * @author wuang
     */
    public int deleteByPrimaryKey(Object id);

    /**
     * 方法描述：删除，根据条件删除
     *
     * @param t 实体对象
     * @return
     * @author wuang
     */
    public int deleteByEntity(T t);

    /**
     * 方法描述：查询实体对象，根据id查找
     *
     * @param id 主键
     * @return 实体对象
     * @author wuang
     */
    public T selectByPrimaryKey(String id);

    /**
     * 方法描述：查询实体对象，根据条件查找
     *
     * @param t 实体对象
     * @return 实体对象
     * @author wuang
     */
    public T selectByEntity(T t);

    /**
     * 方法描述：查询实体集合
     *
     * @return 实体集合
     * @author wuang
     */
    public List<T> selectByList();

    /**
     * 方法描述：查询实体集合，根据条件查找
     *
     * @param t 实体对象
     * @return 实体集合
     * @author wuang
     */
    public List<T> selectByList(T t);

    /**
     * 方法描述：查询实体集合，根据条件查找多少条记录
     *
     * @param t     实体对象
     * @param limit 条数
     * @return 实体集合
     * @author wuang
     */
    public List<T> selectByLimit(T t, int limit);

}
