package com.pumpkin.aloaded.service.manager;

import java.util.List;
import com.pumpkin.aloaded.dao.model.Femaledayi;

public interface IFemaledayiService {

	public List<Femaledayi> findFemaledayi(Femaledayi t , int currPage , int pageSize); 
	public boolean updateOne(Femaledayi t);
	public boolean deleteOne(String id);
	public boolean insertOne(Femaledayi t);

	public Femaledayi findOne(String id);
	public List<Femaledayi> findAll();

}