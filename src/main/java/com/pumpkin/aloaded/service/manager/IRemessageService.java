package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Remessage;

public interface IRemessageService {

	public List<Remessage> findRemessage(Remessage t , int currPage , int pageSize); 
	public boolean updateOne(Remessage t);
	public boolean deleteOne(String id);
	public boolean insertOne(Remessage t);

	public Remessage findOne(String id);

}