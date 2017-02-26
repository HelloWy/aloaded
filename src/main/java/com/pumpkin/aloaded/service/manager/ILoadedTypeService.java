package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.LoadedType;

public interface ILoadedTypeService {

	public List<LoadedType> findLoadedType(LoadedType t , int currPage , int pageSize); 
	public boolean updateOne(LoadedType t);
	public boolean deleteOne(String id);
	public boolean insertOne(LoadedType t);

	public LoadedType findOne(String id);
	
	public LoadedType getTypeSizeById(int typeId);

}