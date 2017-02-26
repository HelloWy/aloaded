package com.pumpkin.aloaded.service.manager;

import java.util.List;

import com.pumpkin.aloaded.dao.model.Clothes_information;

public interface IClothes_informationService {
	public List<Clothes_information> findAll(Clothes_information clothes_information ,int currPage ,int pageSize);
	public int insertThrends();
	public List<String> findTeam();
	public Clothes_information findOne(String id);
	public boolean updateOne(Clothes_information clothes_information);
	public boolean insertOne(Clothes_information clothes_information);
	public String insertExcel(String path);
	public boolean deleteOne(Clothes_information clothes_information);
}
