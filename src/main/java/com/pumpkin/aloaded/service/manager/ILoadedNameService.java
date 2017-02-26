package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.LoadedName;

public interface ILoadedNameService {

	public List<LoadedName> findLoadedName(LoadedName t , int currPage , int pageSize); 
	public boolean updateOne(LoadedName t);
	public boolean deleteOne(String id);
	public boolean insertOne(LoadedName t);

	public LoadedName findOne(String id);

}