package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Femaleshangyi;

public interface IFemaleshangyiService {

	public List<Femaleshangyi> findFemaleshangyi(Femaleshangyi t , int currPage , int pageSize); 
	public boolean updateOne(Femaleshangyi t);
	public boolean deleteOne(String id);
	public boolean insertOne(Femaleshangyi t);

	public Femaleshangyi findOne(String id);
	public List<Femaleshangyi> findAll();

}