package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Stock;

public interface IStockService {

	public List<Stock> findStock(Stock t , int currPage , int pageSize); 
	public boolean updateOne(Stock t);
	public boolean deleteOne(String id);
	public boolean insertOne(Stock t);

	public Stock findOne(String id);

}