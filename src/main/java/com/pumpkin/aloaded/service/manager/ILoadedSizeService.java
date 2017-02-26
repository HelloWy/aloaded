package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.LoadedSize;

public interface ILoadedSizeService {

	public List<LoadedSize> findLoadedSize(LoadedSize t , int currPage , int pageSize); 
	public boolean updateOne(LoadedSize t);
	public boolean deleteOne(String id);
	public boolean insertOne(LoadedSize t);

	public LoadedSize findOne(String id);

}