package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Maleshangyi;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IMaleshangyiService;

@Service
public class MaleshangyiService extends BaseService<Maleshangyi> implements IMaleshangyiService {

	public List<Maleshangyi> findMaleshangyi(Maleshangyi t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Maleshangyi t) {
		try {
			t.setClothesnum(t.getA165b100()+
					t.getA165b84()+
					t.getA165b88()+
					t.getA165b92()+
					t.getA165b96()+
					t.getA170b100()+
					t.getA170b104()+
					t.getA170b108()+
					t.getA170b88()+
					t.getA170b92()+
					t.getA170b96()+
					t.getA175b100()+
					t.getA175b104()+
					t.getA175b108()+
					t.getA175b92()+
					t.getA175b96()+
					t.getA180b100()+
					t.getA180b104()+
					t.getA180b108()+
					t.getA180b92()+
					t.getA180b96()+
					t.getA185b100()+
					t.getA185b104()+
					t.getA185b96()
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
	public boolean insertOne(Maleshangyi t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Maleshangyi findOne(String id) {

		try {
			Maleshangyi t = new Maleshangyi();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Maleshangyi> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}