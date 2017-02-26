package com.pumpkin.aloaded.dao.mapper;

import java.util.List;

import com.pumpkin.aloaded.dao.model.Clothes_information;
import tk.mybatis.mapper.common.Mapper;

public interface Clothes_informationMapper extends Mapper<Clothes_information> {
	List<String> selectTeam();

}