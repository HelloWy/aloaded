package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Maleshangyi;

public interface IMaleshangyiService {

	public List<Maleshangyi> findMaleshangyi(Maleshangyi t , int currPage , int pageSize); 
	public boolean updateOne(Maleshangyi t);
	public boolean deleteOne(String id);
	public boolean insertOne(Maleshangyi t);

	public Maleshangyi findOne(String id);
	public List<Maleshangyi> findAll();

}