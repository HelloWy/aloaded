package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Exchange_info;

public interface IExchange_infoService {

	public List<Exchange_info> findExchange_info(Exchange_info t , int currPage , int pageSize); 
	public boolean updateOne(Exchange_info t);
	public boolean deleteOne(String id);
	public boolean insertOne(Exchange_info t);

	public Exchange_info findOne(String id);

}