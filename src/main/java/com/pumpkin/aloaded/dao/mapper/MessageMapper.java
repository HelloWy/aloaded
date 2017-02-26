package com.pumpkin.aloaded.dao.mapper;

import java.util.List;

import com.pumpkin.aloaded.dao.model.Message;
import tk.mybatis.mapper.common.Mapper;

public interface MessageMapper extends Mapper<Message> {
	/**
	 * 根据创建时间倒叙
	 * @return
	 */
	public List<Message> queryForDescList();
}