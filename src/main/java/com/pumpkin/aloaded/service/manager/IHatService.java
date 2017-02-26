package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Hat;

public interface IHatService {

	public List<Hat> findHat(Hat t , int currPage , int pageSize); 
	public boolean updateOne(Hat t);
	public boolean deleteOne(String id);
	public boolean insertOne(Hat t);

	public Hat findOne(String id);
	public List<Hat> findAll();

}