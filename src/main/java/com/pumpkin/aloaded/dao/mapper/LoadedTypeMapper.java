package com.pumpkin.aloaded.dao.mapper;

import com.pumpkin.aloaded.dao.model.LoadedType;
import tk.mybatis.mapper.common.Mapper;

public interface LoadedTypeMapper extends Mapper<LoadedType> {
	/**
	 * 根据被装类型的id联合查询其对应的被装型号
	 * 一对一
	 * @return
	 */
	public LoadedType getLoadedSize(int typeId);
}