package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Natice;

public interface INaticeService {

	public List<Natice> findNatice(Natice t , int currPage , int pageSize); 
	public boolean updateOne(Natice t);
	public boolean deleteOne(String id);
	public boolean insertOne(Natice t);
	public int allSize();
	public List<Natice> findAll();
	public Natice findOne(String id);

}