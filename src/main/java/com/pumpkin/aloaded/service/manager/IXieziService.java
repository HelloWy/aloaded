package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Xiezi;

public interface IXieziService {

	public List<Xiezi> findXiezi(Xiezi t , int currPage , int pageSize); 
	public boolean updateOne(Xiezi t);
	public boolean deleteOne(String id);
	public boolean insertOne(Xiezi t);

	public Xiezi findOne(String id);
	public List<Xiezi> findAll();

}