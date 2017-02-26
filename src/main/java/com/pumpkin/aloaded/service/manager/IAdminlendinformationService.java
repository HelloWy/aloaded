package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Adminlendinformation;

public interface IAdminlendinformationService {

	public List<Adminlendinformation> findAdminlendinformation(Adminlendinformation t , int currPage , int pageSize); 
	public boolean updateOne(Adminlendinformation t);
	public boolean deleteOne(String id);
	public boolean insertOne(Adminlendinformation t);

	public Adminlendinformation findOne(String id);

}