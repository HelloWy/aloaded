package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Malexiaku;

public interface IMalexiakuService {

	public List<Malexiaku> findMalexiaku(Malexiaku t , int currPage , int pageSize); 
	public boolean updateOne(Malexiaku t);
	public boolean deleteOne(String id);
	public boolean insertOne(Malexiaku t);

	public Malexiaku findOne(String id);
	public List<Malexiaku> findAll();

}