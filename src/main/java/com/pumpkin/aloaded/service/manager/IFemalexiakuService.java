package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Femalexiaku;

public interface IFemalexiakuService {

	public List<Femalexiaku> findFemalexiaku(Femalexiaku t , int currPage , int pageSize); 
	public boolean updateOne(Femalexiaku t);
	public boolean deleteOne(String id);
	public boolean insertOne(Femalexiaku t);

	public Femalexiaku findOne(String id);
	public List<Femalexiaku> findAll();

}