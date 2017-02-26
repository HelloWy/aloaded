package com.pumpkin.aloaded.service.manager.impl;

import java.util.List;
import org.springframework.stereotype.Service;import com.pumpkin.aloaded.service.BaseService;
import com.pumpkin.aloaded.dao.model.Maledayi;
import com.github.pagehelper.PageHelper;
import com.pumpkin.aloaded.service.manager.IMaledayiService;

@Service
public class MaledayiService extends BaseService<Maledayi> implements IMaledayiService {

	public List<Maledayi> findMaledayi(Maledayi t , int pageNum , int pageSize) { 
		try {
			PageHelper.startPage(pageNum, pageSize);
			return selectByList(t);
		} catch (Exception e) {
			return null;
		}
	}
	public boolean updateOne(Maledayi t) {
		try {
			t.setClothesnum(t.getA165b100()+
					t.getA165b84c88()+
					t.getA165b92c96()+
					t.getA170b100()+
					t.getA170b104c108()+
					t.getA170b88()+
					t.getA170b92c96()+
					t.getA175b100()+
					t.getA175b104c108()+
					t.getA175b88()+
					t.getA175b92c96()+
					t.getA180b100()+
					t.getA180b104c108()+
					t.getA180b92c96()+
					t.getA185b100()+
					t.getA185b104c108()+
					t.getA185b92c96()
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
	public boolean insertOne(Maledayi t) {

		try {
			insert(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Maledayi findOne(String id) {

		try {
			Maledayi t = new Maledayi();
			t.setId(Integer.parseInt(id));
			return selectByEntity(t);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public List<Maledayi> findAll() {
		// TODO Auto-generated method stub
		return selectByList();
	}
}