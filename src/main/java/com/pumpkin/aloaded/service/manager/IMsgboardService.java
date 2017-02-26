package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Msgboard;

public interface IMsgboardService {

	public List<Msgboard> findMsgboard(Msgboard t , int currPage , int pageSize); 
	public boolean updateOne(Msgboard t);
	public boolean deleteOne(String id);
	public boolean insertOne(Msgboard t);
	public int allSize();
	public List<Msgboard> findAll();
	public Msgboard findOne(String id);

}