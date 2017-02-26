package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Maledayi;

public interface IMaledayiService {

	public List<Maledayi> findMaledayi(Maledayi t , int currPage , int pageSize); 
	public boolean updateOne(Maledayi t);
	public boolean deleteOne(String id);
	public boolean insertOne(Maledayi t);

	public Maledayi findOne(String id);
	public List<Maledayi> findAll();

}