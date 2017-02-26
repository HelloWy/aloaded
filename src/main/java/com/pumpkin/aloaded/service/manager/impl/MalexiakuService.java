package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Malexiaku;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IMalexiakuService;

@Service
public class MalexiakuService extends BaseService<Malexiaku> implements IMalexiakuService {

	public List<Malexiaku> findMalexiaku(Malexiaku t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Malexiaku t) {
		try {
			t.setClothesnum(t.getA165b70()+
					t.getA165b74()+
					t.getA165b80()+
					t.getA165b86()+
					t.getA165b92()+
					t.getA170b104()+
					t.getA170b74()+
					t.getA170b80()+
					t.getA170b86()+
					t.getA170b92()+
					t.getA170b98()+
					t.getA175b104()+
					t.getA175b74()+
					t.getA175b80()+
					t.getA175b86()+
					t.getA175b98()+
					t.getA175b98()+
					t.getA180b104()+
					t.getA180b80()+
					t.getA180b86()+
					t.getA180b92()+
					t.getA180b98()+
					t.getA185b86()+
					t.getA185b92()+
					t.getA185b98()
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
	public boolean insertOne(Malexiaku t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Malexiaku findOne(String id) {

		try {
			Malexiaku t = new Malexiaku();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Malexiaku> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}