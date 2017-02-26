package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Femalexiaku;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IFemalexiakuService;

@Service
public class FemalexiakuService extends BaseService<Femalexiaku> implements IFemalexiakuService {

	public List<Femalexiaku> findFemalexiaku(Femalexiaku t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Femalexiaku t) {
		try {
			t.setClothesnum(t.getA155b60()+
					t.getA155b64()+
					t.getA155b68()+
					t.getA155b78()+
					t.getA155b83()+
					t.getA160b60()+
					t.getA160b64()+
					t.getA160b68()+
					t.getA160b73()+
					t.getA160b78()+
					t.getA160b83()+
					t.getA160b88()+
					t.getA165b64()+
					t.getA165b68()+
					t.getA165b73()+
					t.getA165b78()+
					t.getA165b83()+
					t.getA165b88()+
					t.getA170b64()+
					t.getA170b68()+
					t.getA170b73()+
					t.getA170b78()+
					t.getA175b83()+
					t.getA175b93()
			);
			updateByPrimaryKey(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteOne(String id) {
		try {
			deleteByPrimaryKey(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean insertOne(Femalexiaku t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Femalexiaku findOne(String id) {

		try {
			Femalexiaku t = new Femalexiaku();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Femalexiaku> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}